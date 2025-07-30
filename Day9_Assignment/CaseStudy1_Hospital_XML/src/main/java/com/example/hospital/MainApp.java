package com.example.hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HospitalService hospitalService = (HospitalService) context.getBean("hospitalService");
        hospitalService.manageHospital();
    }
}
