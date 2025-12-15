package com.codingshuttle.aopApp.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

//@Before("execution(* com.codingshuttle.aopApp.services.impl.ShipmentServiceImpl.*(..))")
//    public void beforeShipmentServiceMethods(JoinPoint joinPoint){
//    log.info("Method Before call:{}",joinPoint.getSignature());
//}

//@Before("execution(* orderPackage(..))") // Any Method which has any return type and and any no of arguments

//@Before("execution(* com.codingshuttle.aopApp.services.impl.*.orderPackage(..)")// Inside any imp find orderPackage




    @Before("execution(* com.codingshuttle.aopApp.services.impl.*.*(..))")// Any method inside serviceImpl
public void beforeOrderPackage(JoinPoint joinPoint){
    log.info("Before  called from LoggingAspect kind,{}",joinPoint.getKind());
}

}
