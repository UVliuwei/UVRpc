package com.uv.api;

/*
 * @author uv
 * @date 2018/10/12 8:56
 * 为了方便，这里就不把接口打成jar包调用了，从server端直接拿来用，保持和Server端一样的包路径即可
 */
public interface UserService {

    String sayHello(String name);

}
