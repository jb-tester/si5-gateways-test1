package com.mytests.spring.springintegration5.gateways.test1;

import org.springframework.messaging.handler.annotation.Payload;

import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/18/2018.
 * Project: si5-gateways-test1
 * *******************************
 */
public interface XMLGatewayService1 {

    void method1(String str1, String str2, List<String> strlist);


    void method2(int arg);

    void method3(int[] params);

}
