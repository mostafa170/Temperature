package com.example.android.temperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createWeatherMessage(99,"cairo");
    }
    private String createWeatherMessage(int temperature,String city)
    {
        String message="Welcome to san "+city+" where the temperature is "+temperature+" F";
        return message;
    }
}
