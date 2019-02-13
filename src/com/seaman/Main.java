package com.seaman;

public class Main {

    public static void main(String[] args) {

        IHelloService helloService = new HelloService();

        IHelloService proxy = (IHelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());

        proxy.sayHello("mmp");

        System.out.println("\n############## name is null ! #############\n");
        proxy.sayHello(null);
    }
}
