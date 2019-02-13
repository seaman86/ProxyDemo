package com.seaman;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-02-13 10:20
 * 功能描述:
 * 修改历史:
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
