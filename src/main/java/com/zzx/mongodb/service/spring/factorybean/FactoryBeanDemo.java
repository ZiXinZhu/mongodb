package com.zzx.mongodb.service.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanDemo implements FactoryBean<IBeanInterface> {
    @Override
    public IBeanInterface getObject() throws Exception {
        return new Bean();
    }

    @Override
    public Class<?> getObjectType() {
        return Bean.class;
    }
}
