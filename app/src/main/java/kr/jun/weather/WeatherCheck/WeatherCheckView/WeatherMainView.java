package kr.jun.weather.WeatherCheck.WeatherCheckView;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import kr.jun.weather.API.Common.DefineAPI;
import kr.jun.weather.API.Common.DefineAPIKor;
import kr.jun.weather.API.Common.DefineAPIKorTemp;
import kr.jun.weather.FileIOStream.FileIOStreamCheckDir;
import kr.jun.weather.FileIOStream.FileIOStreamCheckFile;
import kr.jun.weather.FileIOStream.FileIOStreamRead;
import kr.jun.weather.FileIOStream.FileIOStreamWrite;
import kr.jun.weather.Main.Activity.MainActivity;
import kr.jun.weather.R;
import kr.jun.weather.Search.Activity.SearchActivity;

public class WeatherMainView {

    //<! String 변수 설정
    public String sCountryName;
    public String sCountryDate;
    public String sCountryTitleSet;
    public String sCountryDateSet;

    //<! 세계시간 설정
    TimeZone tz;
    Date date = new Date();
    DateFormat df = new SimpleDateFormat("M월 d일 aa hh:mm");


    //!< 엑티비티 설정
    AppCompatActivity aWeatherMainView;

    long now = System.currentTimeMillis();

    Date mdate = new Date(now);

    SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
    String getTime = simpleDate.format(mdate);

    long unixSeconds = 1372339860;
    long time1, time2, time3,time4,time5;

    Date datetime = new java.util.Date(unixSeconds*1000L);

    SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH");

    //!< 버튼 설정
    Button btnSaveInfo, btnCloseWindow, btnUpdateWindow;
    ImageButton btnMovetoList;
    TextView tvHighTemp, tvnowTime, tvNowCity, tvNowTemp, tvHighLowTemp, tvLittleTemp1, tvLittleTemp2, tvLittleTemp3, tvLittleTemp4,tvLittleTemp5, tvLittleTime1, tvLittleTime2, tvLittleTime3, tvLittleTime4, tvLittleTime5,tvSecondBoxTemp,tvSecondBoxHpa,tvSecondBoxHumidity,tvSecondBoxWindSpeed;

    //<! 파일 입출력 설정
    FileIOStreamCheckDir cFileIOStreamCheckDir;
    FileIOStreamCheckFile cFileIOStreamCheckFile;
    FileIOStreamWrite cFileIOStreamWrite;
    FileIOStreamRead cFileIOStreamRead;

    public WeatherMainView(AppCompatActivity appCompatActivity) {

        aWeatherMainView = appCompatActivity;
        cFileIOStreamCheckDir = new FileIOStreamCheckDir(aWeatherMainView);
        cFileIOStreamCheckFile = new FileIOStreamCheckFile(aWeatherMainView);
        cFileIOStreamWrite = new FileIOStreamWrite(aWeatherMainView);
        cFileIOStreamRead = new FileIOStreamRead(aWeatherMainView);

        setWeatherInfo();
        //CountryTimeCheck();
        setImageButton();

    }

    public void setImageButton() {
        btnMovetoList = (ImageButton) aWeatherMainView.findViewById(R.id.btnMovetoList);
        btnMovetoList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("눌림 버튼 ㅇㅇ");
            }
        });
    }

    public void setWeatherInfo() {

        tvnowTime = (TextView)aWeatherMainView.findViewById(R.id.tvSetDate);
        tvnowTime.setText(getTime);

        tvNowCity = (TextView)aWeatherMainView.findViewById(R.id.tvCityNameSet);
        System.out.println("위승민 바보 : " + DefineAPI.ins().sSaveCountryName);
        tvNowCity.setText(DefineAPI.ins().sSaveCountryName);


        tvNowTemp = (TextView)aWeatherMainView.findViewById(R.id.tvNowTempSet );
        tvNowTemp.setText(DefineAPI.ins().sNowTemp+"°C");

        tvHighLowTemp = (TextView)aWeatherMainView.findViewById(R.id.tvHighLowTemp);
        tvHighLowTemp.setText("최고 "+ DefineAPIKorTemp.ins().sHighestTemp+"°C "+ " 최저 "+ DefineAPIKorTemp.ins().sLowestTemp+"°C");

        tvLittleTemp1 = (TextView)aWeatherMainView.findViewById(R.id.tvLittleTemp1);
        tvLittleTemp1.setText(DefineAPI.ins().sGetHourlyTemperature+"°C");

        tvLittleTemp2 = (TextView)aWeatherMainView.findViewById(R.id.tvLittleTemp2);
        tvLittleTemp2.setText(DefineAPI.ins().sGetSecondHourlyTemperature+"°C");

        tvLittleTemp3 = (TextView)aWeatherMainView.findViewById(R.id.tvLittleTemp3);
        tvLittleTemp3.setText(DefineAPI.ins().sGetThirdHourlyTemperature+"°C");

        tvLittleTemp4 = (TextView)aWeatherMainView.findViewById(R.id.tvLittleTemp4);
        tvLittleTemp4.setText(DefineAPI.ins().sGetFourthHourlyTemperature+"°C");

        tvLittleTemp5 = (TextView)aWeatherMainView.findViewById(R.id.tvLittleTemp5);
        tvLittleTemp5.setText(DefineAPI.ins().sGetFifthHourlyTemperature+"°C");

        time1 = DefineAPI.ins().sGetHourlyTemp;
        time2 = DefineAPI.ins().sGetSecondHourlyTemp;
        time3 = DefineAPI.ins().sGetThirdHourlyTemp;
        time4 = DefineAPI.ins().sGetFourthHourlyTemp;
        time5 = DefineAPI.ins().sGetFifthHourlyTemp;

        Date datetime1 = new java.util.Date(time1*1000L);
        Date datetime2 = new java.util.Date(time2*1000L);
        Date datetime3 = new java.util.Date(time3*1000L);
        Date datetime4 = new java.util.Date(time4*1000L);
        Date datetime5 = new java.util.Date(time5*1000L);

        String formattedDate1 = sdf.format(datetime1);
        DefineAPI.ins().sGetTime1 = formattedDate1;
        System.out.println("formattedDate1 :" + DefineAPI.ins().sGetTime1);

        String formattedDate2 = sdf.format(datetime2);
        DefineAPI.ins().sGetTime2 = formattedDate2;
        System.out.println("formattedDate2 :" +formattedDate2);

        String formattedDate3 = sdf.format(datetime3);
        DefineAPI.ins().sGetTime3 = formattedDate3;
        System.out.println("formattedDate3 :" +formattedDate3);

        String formattedDate4 = sdf.format(datetime4);
        DefineAPI.ins().sGetTime4 = formattedDate4;
        System.out.println("formattedDate4 :" +formattedDate4);

        String formattedDate5 = sdf.format(datetime5);
        DefineAPI.ins().sGetTime5 = formattedDate5;
        System.out.println("formattedDate5 :" +formattedDate5);

        tvLittleTime1 = (TextView)aWeatherMainView.findViewById(R.id.tvLittleTime1);
        tvLittleTime1.setText(DefineAPI.ins().sGetTime1+"시");

        tvLittleTime2 = (TextView)aWeatherMainView.findViewById(R.id.tvLittleTime2);
        tvLittleTime2.setText(DefineAPI.ins().sGetTime2+"시");

        tvLittleTime3 = (TextView)aWeatherMainView.findViewById(R.id.tvLittleTime3);
        tvLittleTime3.setText(DefineAPI.ins().sGetTime3+"시");

        tvLittleTime4 = (TextView)aWeatherMainView.findViewById(R.id.tvLittleTime4);
        tvLittleTime4.setText(DefineAPI.ins().sGetTime4+"시");

        tvLittleTime5 = (TextView)aWeatherMainView.findViewById(R.id.tvLittleTime5);
        tvLittleTime5.setText(DefineAPI.ins().sGetTime5+"시");

        tvSecondBoxTemp = (TextView)aWeatherMainView.findViewById(R.id.tvSecondBoxTemp);
        tvSecondBoxTemp.setText(DefineAPI.ins().sSensoryTemp+"°C");

        tvSecondBoxHpa = (TextView)aWeatherMainView.findViewById(R.id.tvSecondBoxHpa);
        tvSecondBoxHpa.setText(DefineAPI.ins().sGetPressure+"hPa");

        tvSecondBoxHumidity = (TextView)aWeatherMainView.findViewById(R.id.tvSecondBoxHumidity);
        tvSecondBoxHumidity.setText(DefineAPI.ins().sHumidity+"%");

        tvSecondBoxWindSpeed = (TextView)aWeatherMainView.findViewById(R.id.tvSecondBoxWindSpeed);
        tvSecondBoxWindSpeed.setText(DefineAPI.ins().sWindSpeed+"m/s");



        /*<! ----------------------------------------------------------  버튼 설정*/
//        btnSaveInfo = (Button) aWeatherMainView.findViewById(R.id.SaveWindow);
        //btnCloseWindow = (Button) aWeatherMainView.findViewById(R.id.CloseWindow);
        //btnUpdateWindow = (Button) aWeatherMainView.findViewById(R.id.RefreshWindow);

        /*<! ---------------------------------------------------------- 텍스트뷰 설정*/
        //tvBodyFeel = (TextView) aWeatherMainView.findViewById(R.id.Bodyfeel);
        //tvHumidity = (TextView) aWeatherMainView.findViewById(R.id.Humidity);
        //tvWindSpeed = (TextView) aWeatherMainView.findViewById(R.id.WindSpeed);
        //tvNowTemp = (TextView) aWeatherMainView.findViewById(R.id.NowTemp);
        tvHighTemp = (TextView) aWeatherMainView.findViewById(R.id.tvHighLowTemp);
        //tvLowestTemp = (TextView)aWeatherMainView.findViewById(R.id.LowTemp);
        //유닉스 시간 설정

//        sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT+9"));
//        String formattedDate = sdf.format(datetime);
//        System.out.println("formattedDate :"+formattedDate);
        //!< 버튼을 누르면 정보가 저장됨
//        btnSaveInfo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.println("정보 저장 완료");
//
//                //<! sCountryName 안에 나라이름을 넣는 싱글톤변수를 넣는다
//                sCountryName = DefineAPI.ins().sSaveCountryName;
//
//                //<! sCountryDate 안에 나라 시간을 넣는 싱글톤 변수
//                sCountryDate = DefineAPI.ins().sSaveCountryTime;
//
//                //<! sSaveData 라는 변수에 나라 이름과 날짜 추가
//                String sSaveData = sCountryName + "#" + sCountryDate;
//                System.out.println("저장된 데이터 : " + sSaveData);
//
//                //<! sCountryTitleSet 이라는 변수와 sCountryDateSet 라는 변수에 sCountryName 과 sCountryDate 라는 값을 집어넣는다
//                sCountryTitleSet = sCountryName;
//                sCountryDateSet = sCountryDate;
//
//                //<! 파일을 저장하는 if문
//                if(sCountryTitleSet.length() > 0 && sCountryDateSet.length() >0){
//
//                    cFileIOStreamCheckFile.checkFile(sCountryTitleSet,sSaveData);
//                    cFileIOStreamWrite.writeData(sCountryTitleSet, sSaveData);
//                    System.out.println("저장된 파일 입출력 데이터 : " + cFileIOStreamRead.readData(sCountryTitleSet));
//
//                }
//                Intent intent = new Intent(aWeatherMainView.getApplicationContext(),MainActivity.class);
//                aWeatherMainView.startActivity(intent);
//                aWeatherMainView.finish();
//            }
//        });

//        //<! 버튼 누를 때 마다 업데이트 되도록
//        btnUpdateWindow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        aWeatherMainView.runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
//                                //!< Weather 엑티비티 안에 들어갈 정보 설정
//                                tvHighTemp.setText("최고온도 :" + DefineAPIKorTemp.ins().sHighestTemp + "최저온도 :" + DefineAPIKorTemp.ins().sLowestTemp);
//                                //tvLowestTemp.setText("최저온도 :" + DefineAPIKorTemp.ins().sLowestTemp);
//                                tvBodyFeel.setText("체감온도 :" + DefineAPI.ins().sSensoryTemp);
//                                tvNowTemp.setText("현재온도 :" + DefineAPI.ins().sNowTemp);
//                                tvHumidity.setText("습도 :" + DefineAPI.ins().sHumidity+"%");
//                                tvWindSpeed.setText("풍속 :" + DefineAPI.ins().sWindSpeed +"km/h");
//                            }
//                        });
//                    }
//                }).start();
//            }
//        });
//
//        // 닫기버튼
//        btnCloseWindow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.println("엑티비티 변경 완료");
//                Intent intent = new Intent(view.getContext(), SearchActivity.class);
//                aWeatherMainView.startActivity(intent);
//                aWeatherMainView.finish();
//
//            }
//        });
//    }

        }
    }
