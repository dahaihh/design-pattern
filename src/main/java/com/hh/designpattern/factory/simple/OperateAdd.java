package com.hh.designpattern.factory.simple;

/**
 * @className: OperateAdd
 * @package: com.hh.designpattern.factory.simple
 * @describe: 加法类
 * @auther: huanghai
 * @date: 2018/4/10 0010
 * @time: 上午 11:05
 **/
public class OperateAdd extends Operation {

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
