package com.stephen.persionnal.designmode.strategymode;

/**
 * 具体策略类
 */
public class TrainTravel implements TravelStrategy {
    @Override
    public void travelStyle() {
        System.out.println("乘坐火车");
    }
}
