package kr.jun.weather.API.Thread;

import android.app.Activity;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import kr.jun.weather.API.Common.DefineAPI;
import kr.jun.weather.API.DataSet.GetAPIData;
import kr.jun.weather.API.DataSet.GetTempData;


public class APIThread extends Thread{
    AppCompatActivity aAPIThread;
    Handler handler;
    GetAPIData cGetAPIData;
    GetTempData cGetTempData;
    //ImageView imageView;

    public APIThread(AppCompatActivity appCompatActivity /*, ImageView imageView*/) {
        aAPIThread = appCompatActivity;
        handler = new Handler();
        cGetAPIData = new GetAPIData(aAPIThread);
        cGetTempData = new GetTempData(aAPIThread);
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
                        System.out.println("쓰레드 진입");
                        cGetAPIData.getData();
                        cGetAPIData.getDataKorTemp();

//                        cGetTempData.getCountryAvignonTemperature();
//                        cGetTempData.getCountryBeijingTemperature();
//                        cGetTempData.getCountryBudapestTemperature();
//                        cGetTempData.getCountryBusanTemperature();
//                        cGetTempData.getCountryLasVegasTemperature();
//                        cGetTempData.getCountryLiverpoolTemperature();
//                        cGetTempData.getCountryLondonTemperature();
//                        cGetTempData.getCountryLosAngelesTemperature();
//                        cGetTempData.getCountryMilanTemperature();
//                        cGetTempData.getCountryNewYorkTemperature();
//                        cGetTempData.getCountryTokyoTemperature();
//                        cGetTempData.getCountryOsakaTemperature();
//                        cGetTempData.getCountryParisTemperature();
//                        cGetTempData.getCountrySeoulTemperature();
//                        cGetTempData.getCountryBusanTemperature();
//                        cGetTempData.getCountryVeneziaTemperature();
//                        cGetTempData.getCountryVancouverTemperature();
//                        cGetTempData.getCountrySzegedTemperature();
//                        cGetTempData.getCountrySingaporeTemperature();
//                        cGetTempData.getCountrySydneyTemperature();
//                        cGetTempData.getCountryShanghaiTemperature();
//                        cGetTempData.getCountrySanFranciscoTemperature();

                        //Picasso.get().load("http://openweathermap.org/img/w/" + DefineAPI.ins().sGetWeatherIconNum + ".png").into(imageView);

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
                if(!DefineAPI.ins().sSanFranciscoTemp.equals("")) {
                    Thread.sleep(1000);
                }
                else {
                    Thread.sleep(100000);
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
