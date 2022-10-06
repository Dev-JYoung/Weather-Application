package kr.jun.weather.Main.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import kr.jun.weather.API.Thread.APIThread;
import kr.jun.weather.API.Thread.ViewThread;
import kr.jun.weather.Main.View.MainView;
import kr.jun.weather.R;

public class MainActivity extends AppCompatActivity {

    MainView cMainView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        cMainView = new MainView(this);

        APIThread cAPIThread;
        cAPIThread = new APIThread(this);
        cAPIThread.start();



    }



}