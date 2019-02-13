package com.seaman;

import java.lang.reflect.InvocationTargetException;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-02-13 10:24
 * 功能描述:
 * 修改历史:
 */
public interface IInterceptor {
    boolean before();

    void after();

    Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException;

    void afterReturning() ;

    void afterThrowing ();

    boolean useAround() ;
}
