package com.hh.designpattern.factory.simple;

/**
 * @className: OperateDiv
 * @package: com.hh.designpattern.factory.simple
 * @describe: 除法类
 * @auther: huanghai
 * @date: 2018/4/10 0010
 * @time: 上午 11:15
 **/
public class OperateDiv extends Operation {

    @Override
    public double getResult() {
        if (getNumberB() == 0) {
            throw new RuntimeException("divided by 0");
        }
        return getNumberA() / getNumberB();
    }

}
