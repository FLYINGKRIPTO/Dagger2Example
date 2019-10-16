package com.example.dagger2example;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";
    Engine engine;
    Wheels wheels;

    /** USING INJECT ==> NOW dagger knows this is where it needs to instantiate the Car Object
     * This is called Constructor Injection
     *
     **/
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        Log.d(TAG, "drive: driving......");
    }
}

