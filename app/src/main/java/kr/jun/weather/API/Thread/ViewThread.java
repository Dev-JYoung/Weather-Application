package kr.jun.weather.API.Thread;

import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import kr.jun.weather.API.DataSet.GetAPIData;
import kr.jun.weather.API.DataSet.GetTempData;
import kr.jun.weather.WeatherCheck.WeatherCheckView.GetWeatherIcon;


public class ViewThread extends Thread{
    AppCompatActivity aViewThread;
    Handler handler;
    GetWeatherIcon cGetWeatherIcon;
    //ImageView imageView;

    public ViewThread(AppCompatActivity appCompatActivity /*, ImageView imageView*/) {
        aViewThread = appCompatActivity;
        handler = new Handler();
        cGetWeatherIcon = new GetWeatherIcon(aViewThread);
        //this.imageView = imageView;


    }


    @Override
    public void run() {
        super.run();
        while(true) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("뷰 쓰레드 진입");
                            cGetWeatherIcon.GetIconById();
                            cGetWeatherIcon.GetHourlyIconId();
                            cGetWeatherIcon.GetSecondHourlyIcon();
                            cGetWeatherIcon.GetThirdHourlyIcon();
                            cGetWeatherIcon.GetFourthHourlyIcon();
                            cGetWeatherIcon.GetFifthHourlyIcon();

                    }catch (OutOfMemoryError e) {
                        System.out.println("Memory leak");
                    }catch (Exception e) {

                    }
                }
            });

            try {

                /**
                 * Thread 시간 예외처리
                 * 값이 들어오지 않을경우 1초마다 호출
                 * 값을 전부 받아오면 10분단위로 타이머 변경
                 */

                Thread.sleep(1000);



            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
