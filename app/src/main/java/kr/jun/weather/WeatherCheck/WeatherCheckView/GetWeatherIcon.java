package kr.jun.weather.WeatherCheck.WeatherCheckView;

import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import kr.jun.weather.API.Common.DefineAPI;
import kr.jun.weather.R;

public class GetWeatherIcon {

    AppCompatActivity aGetWeatherIcon;
    ImageView imImageView, imImageView1, imImageView2, imImageView3, imImageView4, imImageView5;

    public GetWeatherIcon(AppCompatActivity appCompatActivity) {
        aGetWeatherIcon = appCompatActivity;
        imImageView = (ImageView) aGetWeatherIcon.findViewById(R.id.igvWeatherIcon);
        imImageView1 = (ImageView) aGetWeatherIcon.findViewById(R.id.igvLittleIcon1);
        imImageView2 = (ImageView) aGetWeatherIcon.findViewById(R.id.igvLittleIcon2);
        imImageView3 = (ImageView) aGetWeatherIcon.findViewById(R.id.igvLittleIcon3);
        imImageView4 = (ImageView) aGetWeatherIcon.findViewById(R.id.igvLittleIcon4);
        imImageView5 = (ImageView) aGetWeatherIcon.findViewById(R.id.igvLittleIcon5);

    }

    public void GetIconById() {
        System.out.println("우워어어엉 : " + DefineAPI.ins().sGetWeatherIcon);

        //imImageView.setBackground(ContextCompat.getDrawable(aGetWeatherIcon, R.drawable.img_cloud));
        // 200 ~ 232 천둥
        if (DefineAPI.ins().sGetWeatherIcon == 200) {
            imImageView.setImageResource(R.drawable.img_thunder);
        } else if (DefineAPI.ins().sGetWeatherIcon == 201) {
            imImageView.setImageResource(R.drawable.img_thunder);
        } else if (DefineAPI.ins().sGetWeatherIcon == 202) {
            imImageView.setImageResource(R.drawable.img_thunder);
        } else if (DefineAPI.ins().sGetWeatherIcon == 210) {
            imImageView.setImageResource(R.drawable.img_thunder);
        } else if (DefineAPI.ins().sGetWeatherIcon == 211) {
            imImageView.setImageResource(R.drawable.img_thunder);
        } else if (DefineAPI.ins().sGetWeatherIcon == 212) {
            imImageView.setImageResource(R.drawable.img_thunder);
        } else if (DefineAPI.ins().sGetWeatherIcon == 221) {
            imImageView.setImageResource(R.drawable.img_thunder);
        } else if (DefineAPI.ins().sGetWeatherIcon == 230) {
            imImageView.setImageResource(R.drawable.img_thunder);
        } else if (DefineAPI.ins().sGetWeatherIcon == 231) {
            imImageView.setImageResource(R.drawable.img_thunder);
        } else if (DefineAPI.ins().sGetWeatherIcon == 232) {
            imImageView.setImageResource(R.drawable.img_thunder);
            //300 ~ 321 비
        } else if (DefineAPI.ins().sGetWeatherIcon == 300) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 301) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 302) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 310) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 311) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 312) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 313) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 314) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 321) {
            imImageView.setImageResource(R.drawable.img_rain);
            //500 ~ 531 비 + 눈
        } else if (DefineAPI.ins().sGetWeatherIcon == 500) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 501) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 502) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 503) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 504) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 511) {
            imImageView.setImageResource(R.drawable.img_snow);
        } else if (DefineAPI.ins().sGetWeatherIcon == 520) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 521) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 522) {
            imImageView.setImageResource(R.drawable.img_rain);
        } else if (DefineAPI.ins().sGetWeatherIcon == 531) {
            imImageView.setImageResource(R.drawable.img_rain);
            // 600 ~ 622 눈
        } else if (DefineAPI.ins().sGetWeatherIcon == 600) {
            imImageView.setImageResource(R.drawable.img_snow);
        } else if (DefineAPI.ins().sGetWeatherIcon == 601) {
            imImageView.setImageResource(R.drawable.img_snow);
        } else if (DefineAPI.ins().sGetWeatherIcon == 602) {
            imImageView.setImageResource(R.drawable.img_snow);
        } else if (DefineAPI.ins().sGetWeatherIcon == 611) {
            imImageView.setImageResource(R.drawable.img_snow);
        } else if (DefineAPI.ins().sGetWeatherIcon == 612) {
            imImageView.setImageResource(R.drawable.img_snow);
        } else if (DefineAPI.ins().sGetWeatherIcon == 613) {
            imImageView.setImageResource(R.drawable.img_snow);
        } else if (DefineAPI.ins().sGetWeatherIcon == 615) {
            imImageView.setImageResource(R.drawable.img_snow);
        } else if (DefineAPI.ins().sGetWeatherIcon == 616) {
            imImageView.setImageResource(R.drawable.img_snow);
        } else if (DefineAPI.ins().sGetWeatherIcon == 620) {
            imImageView.setImageResource(R.drawable.img_snow);
        } else if (DefineAPI.ins().sGetWeatherIcon == 621) {
            imImageView.setImageResource(R.drawable.img_snow);
        } else if (DefineAPI.ins().sGetWeatherIcon == 622) {
            imImageView.setImageResource(R.drawable.img_snow);
            //700 ~ 781 대기 상태
        } else if (DefineAPI.ins().sGetWeatherIcon == 701) {
            imImageView.setImageResource(R.drawable.img_dust);
        } else if (DefineAPI.ins().sGetWeatherIcon == 711) {
            imImageView.setImageResource(R.drawable.img_dust);
        } else if (DefineAPI.ins().sGetWeatherIcon == 721) {
            imImageView.setImageResource(R.drawable.img_dust);
        } else if (DefineAPI.ins().sGetWeatherIcon == 731) {
            imImageView.setImageResource(R.drawable.img_dust);
        } else if (DefineAPI.ins().sGetWeatherIcon == 741) {
            imImageView.setImageResource(R.drawable.img_dust);
        } else if (DefineAPI.ins().sGetWeatherIcon == 751) {
            imImageView.setImageResource(R.drawable.img_dust);
        } else if (DefineAPI.ins().sGetWeatherIcon == 761) {
            imImageView.setImageResource(R.drawable.img_dust);
        } else if (DefineAPI.ins().sGetWeatherIcon == 762) {
            imImageView.setImageResource(R.drawable.img_dust);
        } else if (DefineAPI.ins().sGetWeatherIcon == 771) {
            imImageView.setImageResource(R.drawable.img_dust);
        } else if (DefineAPI.ins().sGetWeatherIcon == 781) {
            imImageView.setImageResource(R.drawable.img_dust);
            //800 맑음
        } else if (DefineAPI.ins().sGetWeatherIcon == 800) {
            imImageView.setImageResource(R.drawable.img_thunder_sun);
            //801 ~ 804 구름
        } else if (DefineAPI.ins().sGetWeatherIcon == 801) {
            imImageView.setImageResource(R.drawable.img_cloud);
        } else if (DefineAPI.ins().sGetWeatherIcon == 802) {
            imImageView.setImageResource(R.drawable.img_cloud);
        } else if (DefineAPI.ins().sGetWeatherIcon == 803) {
            imImageView.setImageResource(R.drawable.img_cloud);
        } else if (DefineAPI.ins().sGetWeatherIcon == 804) {
            imImageView.setImageResource(R.drawable.img_cloud);
        }

        //imImageView.setImageDrawable(R.drawable.btn_menu);

        System.out.println("우엉 : " + DefineAPI.ins().sGetWeatherIcon);
    }

    public void GetHourlyIconId() {

        if(DefineAPI.ins().sGetHourlyTempId == 200){
            imImageView1.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetHourlyTempId == 201){
            imImageView1.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetHourlyTempId == 202){
            imImageView1.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetHourlyTempId == 210){
            imImageView1.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetHourlyTempId == 211){
            imImageView1.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetHourlyTempId == 212){
            imImageView1.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetHourlyTempId == 221){
            imImageView1.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetHourlyTempId == 230){
            imImageView1.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetHourlyTempId == 231){
            imImageView1.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetHourlyTempId == 232){
            imImageView1.setImageResource(R.drawable.img_thunder);
            //300 ~ 321 비
        }else if(DefineAPI.ins().sGetHourlyTempId == 300){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 301){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 302){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 310){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 311){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 312){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 313){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 314){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 321){
            imImageView1.setImageResource(R.drawable.img_rain);
            //500 ~ 531 비 + 눈
        }else if(DefineAPI.ins().sGetHourlyTempId == 500){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 501){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 502){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 503){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 504){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 511){
            imImageView1.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetHourlyTempId == 520){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 521){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 522){
            imImageView1.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetHourlyTempId == 531){
            imImageView1.setImageResource(R.drawable.img_rain);
            // 600 ~ 622 눈
        }else if(DefineAPI.ins().sGetHourlyTempId == 600){
            imImageView1.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetHourlyTempId == 601){
            imImageView1.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetHourlyTempId == 602){
            imImageView1.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetHourlyTempId == 611){
            imImageView1.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetHourlyTempId == 612){
            imImageView1.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetHourlyTempId == 613){
            imImageView1.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetHourlyTempId == 615){
            imImageView1.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetHourlyTempId == 616){
            imImageView1.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetHourlyTempId == 620){
            imImageView1.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetHourlyTempId == 621){
            imImageView1.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetHourlyTempId == 622){
            imImageView1.setImageResource(R.drawable.img_snow);
            //700 ~ 781 대기 상태
        }else if(DefineAPI.ins().sGetHourlyTempId == 701){
            imImageView1.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetHourlyTempId == 711){
            imImageView1.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetHourlyTempId == 721){
            imImageView1.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetHourlyTempId == 731){
            imImageView1.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetHourlyTempId == 741){
            imImageView1.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetHourlyTempId == 751){
            imImageView1.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetHourlyTempId == 761){
            imImageView1.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetHourlyTempId == 762){
            imImageView1.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetHourlyTempId == 771){
            imImageView1.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetHourlyTempId == 781){
            imImageView1.setImageResource(R.drawable.img_dust);
            //800 맑음
        }else if(DefineAPI.ins().sGetHourlyTempId == 800){
            imImageView1.setImageResource(R.drawable.img_thunder_sun);
            //801 ~ 804 구름
        }else if(DefineAPI.ins().sGetHourlyTempId == 801){
            imImageView1.setImageResource(R.drawable.img_cloud);
        }else if(DefineAPI.ins().sGetHourlyTempId == 802){
            imImageView1.setImageResource(R.drawable.img_cloud);
        }else if(DefineAPI.ins().sGetHourlyTempId == 803){
            imImageView1.setImageResource(R.drawable.img_cloud);
        }else if(DefineAPI.ins().sGetHourlyTempId == 804){
            imImageView1.setImageResource(R.drawable.img_cloud);
        }
    }
    public void GetSecondHourlyIcon(){
        if(DefineAPI.ins().sGetSecondHourlyTempId == 200){
            imImageView2.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 201){
            imImageView2.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 202){
            imImageView2.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 210){
            imImageView2.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 211){
            imImageView2.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 212){
            imImageView2.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 221){
            imImageView2.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 230){
            imImageView2.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 231){
            imImageView2.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 232){
            imImageView2.setImageResource(R.drawable.img_thunder);
            //300 ~ 321 비
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 300){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 301){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 302){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 310){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 311){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 312){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 313){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 314){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 321){
            imImageView2.setImageResource(R.drawable.img_rain);
            //500 ~ 531 비 + 눈
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 500){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 501){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 502){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 503){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 504){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 511){
            imImageView2.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 520){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 521){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 522){
            imImageView2.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 531){
            imImageView2.setImageResource(R.drawable.img_rain);
            // 600 ~ 622 눈
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 600){
            imImageView2.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 601){
            imImageView2.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 602){
            imImageView2.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 611){
            imImageView2.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 612){
            imImageView2.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 613){
            imImageView2.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 615){
            imImageView2.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 616){
            imImageView2.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 620){
            imImageView2.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 621){
            imImageView2.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 622){
            imImageView2.setImageResource(R.drawable.img_snow);
            //700 ~ 781 대기 상태
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 701){
            imImageView2.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 711){
            imImageView2.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 721){
            imImageView2.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 731){
            imImageView2.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 741){
            imImageView2.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 751){
            imImageView2.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 761){
            imImageView2.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 762){
            imImageView2.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 771){
            imImageView2.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 781){
            imImageView2.setImageResource(R.drawable.img_dust);
            //800 맑음
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 800){
            imImageView2.setImageResource(R.drawable.img_thunder_sun);
            //801 ~ 804 구름
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 801){
            imImageView2.setImageResource(R.drawable.img_cloud);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 802){
            imImageView2.setImageResource(R.drawable.img_cloud);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 803){
            imImageView2.setImageResource(R.drawable.img_cloud);
        }else if(DefineAPI.ins().sGetSecondHourlyTempId == 804){
            imImageView2.setImageResource(R.drawable.img_cloud);
        }
    }
    public void GetThirdHourlyIcon(){
        if(DefineAPI.ins().sGetThirdHourlyTempId == 200){
            imImageView3.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 201){
            imImageView3.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 202){
            imImageView3.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 210){
            imImageView3.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 211){
            imImageView3.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 212){
            imImageView3.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 221){
            imImageView3.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 230){
            imImageView3.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 231){
            imImageView3.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 232){
            imImageView3.setImageResource(R.drawable.img_thunder);
            //300 ~ 321 비
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 300){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 301){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 302){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 310){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 311){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 312){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 313){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 314){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 321){
            imImageView3.setImageResource(R.drawable.img_rain);
            //500 ~ 531 비 + 눈
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 500){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 501){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 502){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 503){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 504){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 511){
            imImageView3.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 520){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 521){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 522){
            imImageView3.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 531){
            imImageView3.setImageResource(R.drawable.img_rain);
            // 600 ~ 622 눈
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 600){
            imImageView3.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 601){
            imImageView3.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 602){
            imImageView3.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 611){
            imImageView3.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 612){
            imImageView3.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 613){
            imImageView3.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 615){
            imImageView3.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 616){
            imImageView3.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 620){
            imImageView3.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 621){
            imImageView3.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 622){
            imImageView3.setImageResource(R.drawable.img_snow);
            //700 ~ 781 대기 상태
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 701){
            imImageView3.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 711){
            imImageView3.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 721){
            imImageView3.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 731){
            imImageView3.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 741){
            imImageView3.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 751){
            imImageView3.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 761){
            imImageView3.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 762){
            imImageView3.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 771){
            imImageView3.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 781){
            imImageView3.setImageResource(R.drawable.img_dust);
            //800 맑음
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 800){
            imImageView3.setImageResource(R.drawable.img_thunder_sun);
            //801 ~ 804 구름
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 801){
            imImageView3.setImageResource(R.drawable.img_cloud);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 802){
            imImageView3.setImageResource(R.drawable.img_cloud);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 803){
            imImageView3.setImageResource(R.drawable.img_cloud);
        }else if(DefineAPI.ins().sGetThirdHourlyTempId == 804){
            imImageView3.setImageResource(R.drawable.img_cloud);
        }
    }
    public void GetFourthHourlyIcon(){
        if(DefineAPI.ins().sGetFourthHourlyTempId == 200){
            imImageView4.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 201){
            imImageView4.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 202){
            imImageView4.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 210){
            imImageView4.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 211){
            imImageView4.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 212){
            imImageView4.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 221){
            imImageView4.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 230){
            imImageView4.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 231){
            imImageView4.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 232){
            imImageView4.setImageResource(R.drawable.img_thunder);
            //300 ~ 321 비
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 300){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 301){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 302){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 310){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 311){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 312){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 313){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 314){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 321){
            imImageView4.setImageResource(R.drawable.img_rain);
            //500 ~ 531 비 + 눈
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 500){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 501){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 502){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 503){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 504){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 511){
            imImageView4.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 520){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 521){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 522){
            imImageView4.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 531){
            imImageView4.setImageResource(R.drawable.img_rain);
            // 600 ~ 622 눈
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 600){
            imImageView4.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 601){
            imImageView4.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 602){
            imImageView4.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 611){
            imImageView4.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 612){
            imImageView4.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 613){
            imImageView4.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 615){
            imImageView4.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 616){
            imImageView4.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 620){
            imImageView4.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 621){
            imImageView4.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 622){
            imImageView4.setImageResource(R.drawable.img_snow);
            //700 ~ 781 대기 상태
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 701){
            imImageView4.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 711){
            imImageView4.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 721){
            imImageView4.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 731){
            imImageView4.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 741){
            imImageView4.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 751){
            imImageView4.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 761){
            imImageView4.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 762){
            imImageView4.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 771){
            imImageView4.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 781){
            imImageView4.setImageResource(R.drawable.img_dust);
            //800 맑음
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 800){
            imImageView4.setImageResource(R.drawable.img_thunder_sun);
            //801 ~ 804 구름
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 801){
            imImageView4.setImageResource(R.drawable.img_cloud);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 802){
            imImageView4.setImageResource(R.drawable.img_cloud);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 803){
            imImageView4.setImageResource(R.drawable.img_cloud);
        }else if(DefineAPI.ins().sGetFourthHourlyTempId == 804){
            imImageView4.setImageResource(R.drawable.img_cloud);
        }
    }
    public void GetFifthHourlyIcon(){
        if(DefineAPI.ins().sGetFifthHourlyTempId == 200){
            imImageView5.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 201){
            imImageView5.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 202){
            imImageView5.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 210){
            imImageView5.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 211){
            imImageView5.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 212){
            imImageView5.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 221){
            imImageView5.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 230){
            imImageView5.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 231){
            imImageView5.setImageResource(R.drawable.img_thunder);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 232){
            imImageView5.setImageResource(R.drawable.img_thunder);
            //300 ~ 321 비
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 300){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 301){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 302){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 310){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 311){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 312){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 313){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 314){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 321){
            imImageView5.setImageResource(R.drawable.img_rain);
            //500 ~ 531 비 + 눈
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 500){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 501){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 502){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 503){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 504){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 511){
            imImageView5.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 520){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 521){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 522){
            imImageView5.setImageResource(R.drawable.img_rain);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 531){
            imImageView5.setImageResource(R.drawable.img_rain);
            // 600 ~ 622 눈
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 600){
            imImageView5.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 601){
            imImageView5.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 602){
            imImageView5.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 611){
            imImageView5.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 612){
            imImageView5.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 613){
            imImageView5.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 615){
            imImageView5.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 616){
            imImageView5.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 620){
            imImageView5.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 621){
            imImageView5.setImageResource(R.drawable.img_snow);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 622){
            imImageView5.setImageResource(R.drawable.img_snow);
            //700 ~ 781 대기 상태
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 701){
            imImageView5.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 711){
            imImageView5.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 721){
            imImageView5.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 731){
            imImageView5.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 741){
            imImageView5.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 751){
            imImageView5.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 761){
            imImageView5.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 762){
            imImageView5.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 771){
            imImageView5.setImageResource(R.drawable.img_dust);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 781){
            imImageView5.setImageResource(R.drawable.img_dust);
            //800 맑음
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 800){
            imImageView5.setImageResource(R.drawable.img_thunder_sun);
            //801 ~ 804 구름
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 801){
            imImageView5.setImageResource(R.drawable.img_cloud);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 802){
            imImageView5.setImageResource(R.drawable.img_cloud);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 803){
            imImageView5.setImageResource(R.drawable.img_cloud);
        }else if(DefineAPI.ins().sGetFifthHourlyTempId == 804){
            imImageView5.setImageResource(R.drawable.img_cloud);
        }
    }
}
