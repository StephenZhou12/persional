package com.stephen.persionnal.designmode.strategymode;

/**
 * 环境类实现
 */
public class Traveler {
    TravelStrategy travelStrategy;
    public void setTravelStrategy(TravelStrategy travelStrategy){
        this.travelStrategy = travelStrategy;
    }
    public void travelStyle(){
        travelStrategy.travelStyle();
    }

    public static void main(String[] args) {
        Traveler traveler = new Traveler();
        //设置策略
        traveler.setTravelStrategy(new TrainTravel());
        traveler.travelStyle();
    }
}
