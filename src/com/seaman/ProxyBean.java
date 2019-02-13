package com.seaman;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ��Ȩ��    �Ϻ�������Ϣ�Ƽ����޹�˾
 * ������:   wangqiuhua
 * ����ʱ��:  2019-02-13 10:40
 * ��������:
 * �޸���ʷ:
 */
public class ProxyBean implements InvocationHandler {
    private Object target = null;

    private IInterceptor interceptor = null;

    public static Object getProxyBean(Object target, IInterceptor interceptor) {
        ProxyBean proxyBean = new ProxyBean();
        proxyBean.target = target;
        proxyBean.interceptor = interceptor;

        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                proxyBean);

        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        boolean exceptionFlag = false;

        Invocation invocation = new Invocation(target, method, args);
        Object retObj = null;
        try {
            if (this.interceptor.before()) {
                retObj = this.interceptor.around(invocation);
            } else {
                retObj = method.invoke(target, args);
            }
        } catch (Exception ex) {
            exceptionFlag = true;
        }

        this.interceptor.after();

        if (exceptionFlag) {
            this.interceptor.afterThrowing();
        } else {
            this.interceptor.afterReturning();
            return retObj;
        }
        return null;
    }
}
