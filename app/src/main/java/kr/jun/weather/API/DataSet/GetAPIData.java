package kr.jun.weather.API.DataSet;

import android.app.Activity;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.DecimalFormat;

import javax.crypto.spec.DESedeKeySpec;

import kr.jun.weather.API.Common.DefineAPI;
import kr.jun.weather.API.Common.DefineAPIKor;
import kr.jun.weather.API.Common.DefineAPIKorTemp;


public class GetAPIData {

    AppCompatActivity aGetAPIData;
    RequestQueue rQueue;
    DecimalFormat decimalFormat;

    public GetAPIData(AppCompatActivity appCompatActivity){
        aGetAPIData = appCompatActivity;
        rQueue = Volley.newRequestQueue(aGetAPIData);
        decimalFormat = new DecimalFormat(".#");

    }

    public void getData() {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(DefineAPI.ins().sURL, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println("DefineAPI.ins().sURL : " + DefineAPI.ins().sURL);
                //System.out.println("DefineAPIKorTemp.ins().sUrl : " + DefineAPIKorTemp.ins().sURL);
                try{
                    System.out.println("Result : " + response.toString());


                    /**
                     * API 값 저장
                     */

                    //!< 최고 온도 가져오기
                    //DefineAPIKorTemp.ins().sHighestTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp_max").toString()) - 273.15);

                    //!< 최저 온도 가져오기
                    //DefineAPIKorTemp.ins().sLowestTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("current").get("temp").toString()) - 273.15);

                    //!< 습도
                    DefineAPI.ins().sHumidity = response.getJSONObject("current").get("humidity").toString();


                    //!< 풍속
                    DefineAPI.ins().sWindSpeed = response.getJSONObject("current").get("wind_speed").toString();

                    //!< 현재 온도
                    DefineAPI.ins().sNowTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("current").get("temp").toString()) - 273.15);

                    //!< 체감 온도
                    DefineAPI.ins().sSensoryTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("current").get("feels_like").toString()) - 273.15);

                    DefineAPI.ins().sGetPressure = response.getJSONObject("current").get("pressure").toString();

                    DefineAPI.ins().sWindSpeed = response.getJSONObject("current").get("wind_speed").toString();

                    //!< 날씨 아이디
                    //DefineAPI.ins().sGetWeatherIcon = Integer.parseInt(response.getJSONArray("weather").getJSONObject(0).get("id").toString());

                    //!< 날씨 아이콘
                    //DefineAPI.ins().sGetWeatherIconNum = response.getJSONArray("weather").getJSONObject(0).get("icon").toString();
                    //DefineAPI.ins().sHourlyTemp = response.getJSONObject("current").get("dt").toString();

                    //시간 갖고 오는 데이터
                    DefineAPI.ins().sGetHourlyTemp = Integer.parseInt(response.getJSONArray("hourly").getJSONObject(0).get("dt").toString());

                    DefineAPI.ins().sGetSecondHourlyTemp = Integer.parseInt(response.getJSONArray("hourly").getJSONObject(1).get("dt").toString());

                    DefineAPI.ins().sGetThirdHourlyTemp = Integer.parseInt(response.getJSONArray("hourly").getJSONObject(2).get("dt").toString());

                    DefineAPI.ins().sGetFourthHourlyTemp = Integer.parseInt(response.getJSONArray("hourly").getJSONObject(3).get("dt").toString());

                    DefineAPI.ins().sGetFifthHourlyTemp = Integer.parseInt(response.getJSONArray("hourly").getJSONObject(4).get("dt").toString());



                    //시간 당 온도 갖고오기
                    DefineAPI.ins().sGetHourlyTemperature = decimalFormat.format(Double.parseDouble(response.getJSONArray("hourly").getJSONObject(0).get("temp").toString())-273.15);

                    DefineAPI.ins().sGetSecondHourlyTemperature = decimalFormat.format(Double.parseDouble(response.getJSONArray("hourly").getJSONObject(1).get("temp").toString())-273.15);

                    DefineAPI.ins().sGetThirdHourlyTemperature = decimalFormat.format(Double.parseDouble(response.getJSONArray("hourly").getJSONObject(2).get("temp").toString())-273.15);

                    DefineAPI.ins().sGetFourthHourlyTemperature = decimalFormat.format(Double.parseDouble(response.getJSONArray("hourly").getJSONObject(3).get("temp").toString())-273.15);

                    DefineAPI.ins().sGetFifthHourlyTemperature = decimalFormat.format(Double.parseDouble(response.getJSONArray("hourly").getJSONObject(4).get("temp").toString())-273.15);

                    //System.out.println("f : " + response.getJSONArray("hourly").toString());
                    //DefineAPI.ins().sGetHourlyTempId = Integer.parseInt(response.getJSONArray("hourly").getJSONObject(0).getJSONArray("weather").getJSONObject(0).get("id").toString());

                    //시간 당 날씨 아이디 가져오기
                    DefineAPI.ins().sGetHourlyTempId = Integer.parseInt(response.getJSONArray("hourly").getJSONObject(0).getJSONArray("weather").getJSONObject(0).get("id").toString());

                    DefineAPI.ins().sGetSecondHourlyTempId = Integer.parseInt(response.getJSONArray("hourly").getJSONObject(1).getJSONArray("weather").getJSONObject(0).get("id").toString());

                    DefineAPI.ins().sGetThirdHourlyTempId = Integer.parseInt(response.getJSONArray("hourly").getJSONObject(2).getJSONArray("weather").getJSONObject(0).get("id").toString());

                    DefineAPI.ins().sGetFourthHourlyTempId = Integer.parseInt(response.getJSONArray("hourly").getJSONObject(2).getJSONArray("weather").getJSONObject(0).get("id").toString());

                    DefineAPI.ins().sGetFifthHourlyTempId = Integer.parseInt(response.getJSONArray("hourly").getJSONObject(2).getJSONArray("weather").getJSONObject(0).get("id").toString());


                    System.out.println("1시간 후 날씨 : " + DefineAPI.ins().sGetHourlyTempId);
                    System.out.println("2시간 후 날씨 : " + DefineAPI.ins().sGetSecondHourlyTempId);
                    System.out.println("3시간 후 날씨 : " + DefineAPI.ins().sGetThirdHourlyTempId);
                    System.out.println("4시간 후 날씨 : " + DefineAPI.ins().sGetFourthHourlyTempId);
                    System.out.println("5시간 후 날씨 : " + DefineAPI.ins().sGetFifthHourlyTempId);


                    System.out.println("아이콘 : " + DefineAPI.ins().sGetWeatherIconNum);
                    //System.out.println("DT 시간 : "+ DefineAPI.ins().sHourlyTemp);
                    System.out.println("1시간 후 시간 :"+ DefineAPI.ins().sGetHourlyTemp);
                    System.out.println("2시간 후 시간 :"+ DefineAPI.ins().sGetSecondHourlyTemp);
                    System.out.println("3시간 후 시간 :"+ DefineAPI.ins().sGetThirdHourlyTemp);
                    System.out.println("4시간 후 시간 :"+ DefineAPI.ins().sGetFourthHourlyTemp);
                    System.out.println("5시간 후 시간 :"+ DefineAPI.ins().sGetFifthHourlyTemp);

                    System.out.println("1시간 후 온도 :"+ DefineAPI.ins().sGetHourlyTemperature);
                    System.out.println("2시간 후 온도 :"+ DefineAPI.ins().sGetSecondHourlyTemperature);
                    System.out.println("3시간 후 온도 :"+ DefineAPI.ins().sGetThirdHourlyTemperature);
                    System.out.println("4시간 후 온도 :"+ DefineAPI.ins().sGetFourthHourlyTemperature);
                    System.out.println("5시간 후 온도 :"+ DefineAPI.ins().sGetFifthHourlyTemperature);





                    /**
                     * 디버그
                     */
//                    System.out.println("최고온도 : " + DefineAPIKorTemp.ins().sHighestTemp);
//                    System.out.println("최저온도 : " + DefineAPIKorTemp.ins().sLowestTemp);
                    System.out.println("습도 : " + DefineAPI.ins().sHumidity);
//                    System.out.println("현재온도 : " + DefineAPI.ins().sNowTemp);
                    System.out.println("풍속 : " + DefineAPI.ins().sWindSpeed);
                    System.out.println("체감온도 : " + DefineAPI.ins().sSensoryTemp);
                    System.out.println("기압 : " + DefineAPI.ins().sGetPressure);
//                    System.out.println("Weather ID : " + DefineAPI.ins().sGetWeatherIcon);

                    DefineAPI.ins().bCheckAPI = true;
                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());
                    DefineAPI.ins().bCheckAPI = false;
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                DefineAPI.ins().bCheckAPI = false;
            }
        });
        rQueue.add(jsonObjectRequest);
    }

    public void getDataKorTemp() {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(DefineAPIKorTemp.ins().sURL, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println("DefineAPIKorTemp.ins().sUrl : " + DefineAPIKorTemp.ins().sURL);
                try{
                    System.out.println("Result : " + response.toString());


                    /**
                     * API 값 저장
                     */

                    //!< 최고 온도 가져오기
                    DefineAPIKorTemp.ins().sHighestTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp_max").toString()) - 273.15);

                    //!< 최저 온도 가져오기
                    DefineAPIKorTemp.ins().sLowestTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp_min").toString()) - 273.15);
//                    //!< 습도
//                    DefineAPI.ins().sHumidity = response.getJSONObject("current").get("humidity").toString();
//
//                    //!< 풍속
//                    DefineAPI.ins().sWindSpeed = response.getJSONObject("current").get("wind_speed").toString();
//
//                    //!< 현재 온도
//                    DefineAPI.ins().sNowTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("current").get("temp").toString()) - 273.15);
//
//                    //!< 체감 온도
                    //DefineAPI.ins().sSensoryTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("current").get("feels_like").toString()) - 273.15);

                    //!< 날씨 아이디
                    //DefineAPI.ins().sGetWeatherIcon = Integer.parseInt(response.getJSONArray("weather").getJSONObject(0).get("id").toString());


                    //DefineAPI.ins().sGetHourlyTemp = Integer.parseInt(response.getJSONArray("hourly").getJSONObject(0).get("dt").toString());

                    //!< 날씨 아이콘
                    //DefineAPI.ins().sGetWeatherIconNum = response.getJSONArray("weather").getJSONObject(0).get("icon").toString();
                    DefineAPI.ins().sGetWeatherIcon = Integer.parseInt(response.getJSONArray("weather").getJSONObject(0).get("id").toString());

                    //DefineAPI.ins().sGetHourlyTempId = Integer.parseInt(response.getJSONArray("hourly").getJSONObject(0).getJSONArray("weather").getJSONObject(0).get("id").toString());
                    System.out.println("DefineAPI.ins().sGetHourlyTempId : " + DefineAPI.ins().sGetHourlyTempId);
                    //System.out.println("아이콘 : " + DefineAPI.ins().sGetWeatherIconNum);




                    /**
                     * 디버그
                     */
                    System.out.println("최고온도 : " + DefineAPIKorTemp.ins().sHighestTemp);
                    System.out.println("최저온도 : " + DefineAPIKorTemp.ins().sLowestTemp);
                    System.out.println("아이콘 : " + DefineAPI.ins().sHourlyTemp);
                    //System.out.println("습도 : " + DefineAPI.ins().sHumidity);
                    //System.out.println("현재온도 : " + DefineAPI.ins().sNowTemp);
                    //System.out.println("풍속 : " + DefineAPI.ins().sWindSpeed);
                   //System.out.println("체감온도 : " + DefineAPI.ins().sSensoryTemp);
                    System.out.println("날씨 ID :" + DefineAPI.ins().sGetWeatherIcon);
                    //System.out.println("1시간 후 시간 :" + DefineAPI.ins().sGetHourlyTemp);

                    DefineAPI.ins().bCheckAPI = true;
                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());
                    DefineAPI.ins().bCheckAPI = false;
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                DefineAPI.ins().bCheckAPI = false;
            }
        });
        rQueue.add(jsonObjectRequest);
    }

}
