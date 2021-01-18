package com.stephen.persionnal.designmode.strategymode;

/**
 * 具体策略类
 */
public class HighTrainTravel implements TravelStrategy {
    @Override
    public void travelStyle() {
        System.out.println("乘坐高铁");
    }
}
