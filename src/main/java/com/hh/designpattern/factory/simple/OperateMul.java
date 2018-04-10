package com.hh.designpattern.factory.simple;

/**
 * @className: OperateMul
 * @package: com.hh.designpattern.factory.simple
 * @describe: 乘法类
 * @auther: huanghai
 * @date: 2018/4/10 0010
 * @time: 上午 11:14
 **/
public class OperateMul extends Operation {

    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }

}
