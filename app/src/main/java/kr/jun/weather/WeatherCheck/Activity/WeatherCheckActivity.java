package kr.jun.weather.WeatherCheck.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import kr.jun.weather.API.Thread.ViewThread;
import kr.jun.weather.R;
import kr.jun.weather.WeatherCheck.WeatherCheckView.WeatherMainView;

public class WeatherCheckActivity extends AppCompatActivity {

    WeatherMainView cWeatherMainView;
    ViewThread cViewThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_check);
        cWeatherMainView = new WeatherMainView(this);


        cViewThread = new ViewThread(this);
        cViewThread.start();
    }
}