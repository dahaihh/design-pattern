package com.hh.designpattern.factory.simple;

/**
 * @className: Operation
 * @package: com.hh.designpattern.factory.simple
 * @describe: 抽象操作类
 * @auther: huanghai
 * @date: 2018/4/10 0010
 * @time: 上午 11:06
 **/
public abstract class Operation {

    private double numberA;
    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract double getResult();

}
