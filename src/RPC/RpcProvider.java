/**
 * @(#)RpcProvider.java, 2021-03-18.
 *
 * Copyright 2021 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package RPC;

/**
 * RpcProvider
 *
 * @author jiaxiangyu
 * @since 2021/03/18
 */
public class RpcProvider {
    public static void main(String[] args) {
        HelloService service = new HelloServiceImpl();
        //RPC框架将服务暴出来，供客户端消费
        //RpcFramework.export(service,1234);
    }
}