package com.seaman;

/**
 * ��Ȩ��    �Ϻ�������Ϣ�Ƽ����޹�˾
 * ������:   wangqiuhua
 * ����ʱ��:  2019-02-13 10:20
 * ��������:
 * �޸���ʷ:
 */
public class HelloService implements IHelloService {
    @Override
    public void sayHello(String name) {

        if (name == null || name.trim() == "") {
            throw new RuntimeException("parameter is null ! ! ");
        }

        System.out.println("hello," + name);
    }
}
