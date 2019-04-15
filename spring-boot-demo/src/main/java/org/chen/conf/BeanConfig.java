package org.chen.conf;

import org.chen.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author Administrator
 * @create 2019-04-14 0:39
 */
public class BeanConfig {



    @Bean()
    @Scope("")
    public PersonService s(){
        return new PersonService();
    }

}