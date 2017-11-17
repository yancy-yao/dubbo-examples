package com.yancy;

import com.yancy.spi.HelloInterface;

import java.util.ServiceLoader;

/**
 * Created by yancy on 2017/10/31.
 */
public class SpiMain {

    public static void main(String[] args) {
        ServiceLoader<HelloInterface> loaders = ServiceLoader.load(HelloInterface.class);
        for (HelloInterface in : loaders) {
            in.sayHello();
        }
    }
}
