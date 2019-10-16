package com.example.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private  Car car ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * We want dagger to create our car instance
         * */

        CarComponent component = DaggerCarComponent.create();
        car = component.getCar();
         car.drive();

    }

}
