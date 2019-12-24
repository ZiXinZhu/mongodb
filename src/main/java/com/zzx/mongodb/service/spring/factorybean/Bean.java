package com.zzx.mongodb.service.spring.factorybean;

public class Bean implements IBeanInterface {
    @Override
    public String service() {
        return "bean factory demo";
    }
}
