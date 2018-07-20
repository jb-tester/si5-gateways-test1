package com.mytests.spring.springintegration5.gateways.test1;

import org.springframework.messaging.handler.annotation.Payload;

import java.util.Date;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/18/2018.
 * Project: si5-gateways-test1
 * *******************************
 */
public interface XMLGatewayService3 {
    @Payload("#gatewayMethod.name+#args[0] + #args[1] + '!'")
    void method5(String a, String b);


    void method6(@Payload("returnFoo()") UtilsBean s);

    void method7(@Payload("toUpperCase()") String s);

    void method8(@Payload("@utilsBean.convert(#this)") String s);
}
