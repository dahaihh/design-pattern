package com.hh.designpattern.factory.simple;

/**
 * @className: OperateSub
 * @package: com.hh.designpattern.factory.simple
 * @describe: 减法类
 * @auther: huanghai
 * @date: 2018/4/10 0010
 * @time: 上午 11:13
 **/
public class OperateSub extends Operation{

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }

}
