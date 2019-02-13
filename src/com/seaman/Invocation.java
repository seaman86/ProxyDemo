package com.seaman;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-02-13 10:28
 * 功能描述:
 * 修改历史:
 */
public class Invocation {
    private Object[] params;
    private Method method;
    private Object target;

    public Invocation (Object target,Method method, Object[] params){
        this.target = target;
        this.method = method;
        this.params = params;
    }

    public Object proceed() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target, params);
    }

}
