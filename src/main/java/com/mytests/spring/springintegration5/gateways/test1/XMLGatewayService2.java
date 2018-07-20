package com.mytests.spring.springintegration5.gateways.test1;

import org.springframework.integration.annotation.Gateway;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/18/2018.
 * Project: si5-gateways-test1
 * *******************************
 */

public interface XMLGatewayService2 {

    @Gateway(payloadExpression = "#args[0]", requestChannel = "reqChannel4",
            requestTimeoutExpression = "#args[1]", replyTimeoutExpression = "#args[2]")
    public void method4(String message, long reqTimeout, long repTimeout);
}
