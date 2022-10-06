package kr.jun.weather.API.DataSet;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.DecimalFormat;

import kr.jun.weather.API.Common.DefineAPI;

public class GetTempData {

    AppCompatActivity aGetTempData;
    RequestQueue rQueue;
    DecimalFormat decimalFormat;

    public GetTempData(AppCompatActivity appCompatActivity){
        aGetTempData = appCompatActivity;
        rQueue = Volley.newRequestQueue(aGetTempData);
        decimalFormat = new DecimalFormat(".#");


    }

    public void getCountrySeoulTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Seoul&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sSeoulTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("서울 : " + DefineAPI.ins().sSeoulTemp);
                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryBusanTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Busan&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sBusanTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("부산 : " + DefineAPI.ins().sBusanTemp);
                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryBeijingTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Beijing&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sBeijingTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("베이징 : " + DefineAPI.ins().sBeijingTemp);


                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryShanghaiTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Shanghai&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sShanhaiTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("상하이 : " + DefineAPI.ins().sShanhaiTemp);

                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryLondonTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=London&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sLondonTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("런던 : " + DefineAPI.ins().sLondonTemp);

                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryLiverpoolTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Liverpool&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sLiverpoolTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("리버풀 : " + DefineAPI.ins().sLiverpoolTemp);

                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryParisTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Paris&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sParisTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("파리 : " + DefineAPI.ins().sParisTemp);
                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryAvignonTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Avignon&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sAvignonTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("아비뇽 : " + DefineAPI.ins().sAvignonTemp);
                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryTokyoTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Tokyo&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sTokyoTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("도쿄 : " + DefineAPI.ins().sTokyoTemp);

                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryOsakaTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Osaka&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sOsakaTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("오사카 : " + DefineAPI.ins().sOsakaTemp);
                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryVeneziaTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Venezia&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sVeneziaTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("베네치아 : " + DefineAPI.ins().sVeneziaTemp);

                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryMilanTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Milan&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sMilanTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("밀란 : " + DefineAPI.ins().sMilanTemp);

                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountrySydneyTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Sydney&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sSydneyTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("시드니 : " + DefineAPI.ins().sSydneyTemp);

                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryVancouverTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Vancouver&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sVancouverTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("벤쿠버 : " + DefineAPI.ins().sVancouverTemp);
                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountrySingaporeTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Singapore&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sSingaporeTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("싱가포르 : " + DefineAPI.ins().sSingaporeTemp);

                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryBudapestTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Budapest&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sBudapestTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("부다페스트 : " + DefineAPI.ins().sBudapestTemp);

                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountrySzegedTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Szeged&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sSzegedTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("세게드 : " + DefineAPI.ins().sSzegedTemp);

                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryNewYorkTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=New York&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sNewYorkTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("뉴욕 : " + DefineAPI.ins().sNewYorkTemp);

                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountrySanFranciscoTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=San Francisco&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sSanFranciscoTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("샌프란시스코 : " + DefineAPI.ins().sSanFranciscoTemp);

                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryLasVegasTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Las Vegas&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sLasVegasTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("라스베가스 : " + DefineAPI.ins().sLasVegasTemp);

                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
    public void getCountryLosAngelesTemperature(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://api.openweathermap.org/data/2.5/weather?q=Los Angeles&appid=7cfb4fc270729b8d9380bdb2e7737d9a", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    DefineAPI.ins().sLosAngelesTemp = decimalFormat.format(Double.parseDouble(response.getJSONObject("main").get("temp").toString()) - 273.15);
                    System.out.println("로스엔젤레스 : " + DefineAPI.ins().sLosAngelesTemp);

                    /**
                     * API 값 저장
                     */






                    /**
                     * 디버그
                     */


                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());

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
