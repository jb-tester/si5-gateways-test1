package com.mytests.spring.springintegration5.gateways.test1;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/18/2018.
 * Project: si5-gateways-test1
 * *******************************
 */
public class UtilsBean {

    private int timeout;

    public String calc(Integer... params) {
        Integer rez=0;
        for (Integer param : params) {
            rez = rez+param;
        }
        return String.valueOf(rez);
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getTimeout() {
        return timeout;
    }

    public String convert(String str){
        return "the string "+str+" converted";

    }

    public String returnFoo(){
        return "foo!!!";
    }
}
