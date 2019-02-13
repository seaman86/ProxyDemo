package com.seaman;

import java.lang.reflect.InvocationTargetException;

/**
 * ��Ȩ��    �Ϻ�������Ϣ�Ƽ����޹�˾
 * ������:   wangqiuhua
 * ����ʱ��:  2019-02-13 10:24
 * ��������:
 * �޸���ʷ:
 */
public interface IInterceptor {
    boolean before();

    void after();

    Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException;

    void afterReturning() ;

    void afterThrowing ();

    boolean useAround() ;
}
