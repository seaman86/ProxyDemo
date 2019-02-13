package com.seaman;

import java.lang.reflect.InvocationTargetException;

/**
 * ��Ȩ��    �Ϻ�������Ϣ�Ƽ����޹�˾
 * ������:   wangqiuhua
 * ����ʱ��:  2019-02-13 10:33
 * ��������:
 * �޸���ʷ:
 */
public class MyInterceptor implements IInterceptor {
    @Override
    public boolean before() {
        System.out.println("before ......");
        return true;
    }

    @Override
    public void after() {
        System.out.println("after ......");
    }

    @Override
    public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("around before ......");
        Object object = invocation.proceed();

        System.out.println("around after ......");

        return object;
    }

    @Override
    public void afterReturning() {
        System.out.println("afterReturning ......");
    }

    @Override
    public void afterThrowing() {
        System.out.println("afterThrowing ......");
    }

    @Override
    public boolean useAround() {
        return true;
    }
}
