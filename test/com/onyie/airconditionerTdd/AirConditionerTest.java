package com.onyie.airconditionerTdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AirConditionerTest {
    AirConditioner myAirConditioner;

    @BeforeEach
    void setUp() {
        myAirConditioner = new AirConditioner("Haier", 17);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void airConditionerShouldBeAbleToGetName() {
        assertEquals("Haier", myAirConditioner.getName());
    }
    @Test
    void airConditionerShouldBeAbleToChangeName(){
        System.out.println(myAirConditioner.getName());
        myAirConditioner.setName("David");
        assertEquals("David", myAirConditioner.getName());
    }
    @Test
    void airConditionerShouldBeAbleToGetTemperature(){
        assertEquals(17, myAirConditioner.getTemperature());
    }

    @Test
    void airConditionerShouldBeAbleToIncreaseTemperature(){
        myAirConditioner.increaseTemperature();
        assertEquals(18, myAirConditioner.getTemperature());

        myAirConditioner.increaseTemperature();
        assertEquals(19, myAirConditioner.getTemperature());
    }

    @Test
    void airConditionerShouldBeAbleToDecreaseTemperature(){
        myAirConditioner.decreaseTemperature();
        assertEquals(16,myAirConditioner.getTemperature() );

        myAirConditioner.decreaseTemperature();
        assertEquals(16,myAirConditioner.getTemperature() );
    }


}