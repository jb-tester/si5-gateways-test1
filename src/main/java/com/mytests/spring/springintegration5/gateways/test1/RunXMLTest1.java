package com.mytests.spring.springintegration5.gateways.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.messaging.Message;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/18/2018.
 * Project: si5-gateways-test1
 * *******************************
 */
public class RunXMLTest1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-configuration.xml");
        Date today = ctx.getBean("today", Date.class);
        XMLGatewayService1 xmlGatewayService1 = ctx.getBean("xml_gateway1", XMLGatewayService1.class);
        List <String> mylist = new ArrayList <>();
        mylist.add("str3");
        mylist.add("str4");
        xmlGatewayService1.method1("str1", "str2", mylist);
        xmlGatewayService1.method2(100);
        xmlGatewayService1.method3(new int[]{1, 2, 3});
        QueueChannel ch1 = ctx.getBean("reqChannel1", QueueChannel.class);
        Message<?> mess1 = ch1.receive(0);
        System.out.println("mess1.getPayload() = " + mess1.getPayload());
        QueueChannel ch2 = ctx.getBean("reqChannel2", QueueChannel.class);
        Message<?> mess2 = ch2.receive(0);
        System.out.println("mess2.getPayload() = " + mess2.getPayload());
        System.out.println("mess2.getHeaders().get(\"calledMethod\") = " + mess2.getHeaders().get("calledMethod"));
        QueueChannel ch3 = ctx.getBean("reqChannel3", QueueChannel.class);
        Message<?> mess3 = ch3.receive(0);
        System.out.println("mess3.getPayload() = " + mess3.getPayload());

        XMLGatewayService3 xmlGatewayService3 = ctx.getBean("xml_gateway3", XMLGatewayService3.class);
        xmlGatewayService3.method5("str1", "str2");
        xmlGatewayService3.method6(new UtilsBean());
        xmlGatewayService3.method7("str5");
        xmlGatewayService3.method8("str6");

        QueueChannel ch5 = ctx.getBean("reqChannel5", QueueChannel.class);
        Message<?> mess5 = ch5.receive(0);
        System.out.println("mess5.getPayload() = " + mess5.getPayload());
        QueueChannel ch6 = ctx.getBean("reqChannel6", QueueChannel.class);
        Message<?> mess6 = ch6.receive(0);
        System.out.println("mess6.getPayload() = " + mess6.getPayload());
        QueueChannel ch7 = ctx.getBean("reqChannel7", QueueChannel.class);
        Message<?> mess7 = ch7.receive(0);
        System.out.println("mess7.getPayload() = " + mess7.getPayload());
        QueueChannel ch8 = ctx.getBean("reqChannel8", QueueChannel.class);
        Message<?> mess8 = ch8.receive(0);
        System.out.println("mess8.getPayload() = " + mess8.getPayload());
    }
}
