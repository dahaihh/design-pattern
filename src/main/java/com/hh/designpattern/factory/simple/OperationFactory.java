package com.hh.designpattern.factory.simple;

/**
 * @className: OperationFactory
 * @package: com.hh.designpattern.factory.simple
 * @describe: 操作工厂类
 * @auther: huanghai
 * @date: 2018/4/10 0010
 * @time: 上午 11:19
 **/
public class OperationFactory {

    public static Operation createOperation(char operator) {
        switch (operator) {
            case '+':
                return new OperateAdd();
            case '-':
                return new OperateSub();
            case '*':
                return new OperateMul();
            case '/':
                return new OperateDiv();
            default:
                throw new RuntimeException("unsupported operation");
        }
    }

}
