package com.onyie.airconditionerTdd;

public class AirConditioner {
    public String name;
    private int temp;
    private static int quantity;

    public AirConditioner(String name, int temp){
        this.name = name;
        this.temp = temp;
    }



    public void setTemp(int myTemp){
        temp = myTemp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemperature() {
        return temp;
    }

    public void increaseTemperature() {
        temp = ++temp;
    }

    public void decreaseTemperature() {
        temp = --temp;
    }


}
