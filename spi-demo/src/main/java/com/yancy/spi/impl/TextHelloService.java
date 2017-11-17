package com.yancy.spi.impl;

import com.yancy.spi.HelloInterface;

/**
 * Created by yancy on 2017/10/31.
 */
public class TextHelloService  implements HelloInterface{

    @Override
    public void sayHello() {
        System.out.println("text hello.");
    }
}
