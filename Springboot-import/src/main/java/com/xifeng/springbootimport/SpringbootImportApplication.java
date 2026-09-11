package com.xifeng.springbootimport;

import Commonconfig.CommonImportSelector;
import IDcard.IDcard;
import country.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(CommonImportSelector.class)
public class SpringbootImportApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(SpringbootImportApplication.class, args);
//        System.out.println(context.getBean("country"));
        System.out.println(context.getBean(Country.class));
        System.out.println(context.getBean(IDcard.class));

    }

}
