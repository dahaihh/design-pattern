package com.hh.designpattern.factory.simple;

/**
 * @className: Calculator
 * @package: com.hh.designpattern.factory.simple
 * @describe: 计算测试类
 * @auther: huanghai
 * @date: 2018/4/10 0010
 * @time: 上午 11:24
 **/
public class Calculator {

    public static void main(String[] args) {
        char operator = '*';
        Operation operation = OperationFactory.createOperation(operator);
        operation.setNumberA(1.2d);
        operation.setNumberB(3.4d);
        System.out.println(operation.getResult());
    }

}
