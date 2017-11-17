package com.yancy.spi.impl;

import com.yancy.spi.HelloInterface;

/**
 * Created by yancy on 2017/10/31.
 */
public class ImageHelloService implements HelloInterface {

    @Override
    public void sayHello() {
        System.out.println("image hello.");
    }
}
