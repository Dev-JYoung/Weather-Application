package kr.jun.weather.API.Common;

public class DefineAPI {
    public String sURL = "https://api.openweathermap.org/data/2.5/onecall?lat=37.58543746713825&lon=126.96715746642603&exclude=daily&appid=f496a390481925c41ab6a8bde074ec8e";

    //!< 베이징 API
    public String sChinaBeijing = "http://api.openweathermap.org/data/2.5/weather?q=Beijing&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 상하이 API
    public String sChinaShanghai = "http://api.openweathermap.org/data/2.5/weather?q=Shanghai&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 서울 API
    public String sKorSeoul = "http://api.openweathermap.org/data/2.5/weather?q=Seoul&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 부산 API
    public String sKorBusan = "http://api.openweathermap.org/data/2.5/weather?q=Busan&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 런던 API
    public String sGbLondon= "http://api.openweathermap.org/data/2.5/weather?q=London&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 리버풀 API
    public String sGbLiverpool = "http://api.openweathermap.org/data/2.5/weather?q=Liverpool&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 프랑스 API
    public String sFrParis = "http://api.openweathermap.org/data/2.5/weather?q=Paris&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 에비뇽 API
    public String sFrAvignon = "http://api.openweathermap.org/data/2.5/weather?q=Avignon&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 도쿄 API
    public String sJpTokyo = "http://api.openweathermap.org/data/2.5/weather?q=Tokyo&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 오사카 API
    public String sJpOsaka = "http://api.openweathermap.org/data/2.5/weather?q=Osaka&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 베네치아 API
    public String sItVenezia = "http://api.openweathermap.org/data/2.5/weather?q=Venezia&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 밀란 API
    public String sItMilan = "http://api.openweathermap.org/data/2.5/weather?q=Milan&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 시드니 API
    public String sCaSydney = "http://api.openweathermap.org/data/2.5/weather?q=Sydney&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 벤쿠버 API
    public String sCaVancouver = "http://api.openweathermap.org/data/2.5/weather?q=Vancouver&appid=7cfb4fc270729b8d9380bdb2e7737d9a\n";

    //!< 싱가포르 API
    public String sSgSingapore = "http://api.openweathermap.org/data/2.5/weather?q=Singapore&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 부다페스트 API
    public String sHgBudapest = " http://api.openweathermap.org/data/2.5/weather?q=Budapest&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 세게드 API
    public String sHgSzeged = "http://api.openweathermap.org/data/2.5/weather?q=Szeged&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 뉴욕 API
    public String sUsNewYork = "http://api.openweathermap.org/data/2.5/weather?q=New York&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 샌프란시스코 API
    public String sUsSanFansico = "http://api.openweathermap.org/data/2.5/weather?q=San Francisco&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 라스베가스 API
    public String sUsLasVegas = "http://api.openweathermap.org/data/2.5/weather?q=Las Vegas&appid=7cfb4fc270729b8d9380bdb2e7737d9a";

    //!< 로스엔젤레스 API
    public String sUsLosAngeles = "http://api.openweathermap.org/data/2.5/weather?q=Los Angeles&appid=7cfb4fc270729b8d9380bdb2e7737d9a";





    /**
     * 
     */
    public String sHumidity = "";           //!< 습도
    public String sNowTemp = "";              //!< 현재 온도
    public String sWindSpeed = "";     //!< 현재 풍속
    public String sSensoryTemp  = ""; //!< 체감온도
    public int sGetWeatherIcon; //!< 날씨 아이디
    public int sGetSecondWeatherIcon;
    public String sGetWeatherIconNum; //!< 날씨 사진 아이콘
    public String sSaveCountryName=""; //!< 선택한 나라 저장
    public String sHourlyTemp=""; //!< 선택한 나라 저장
    public String sSaveCountryTime=""; //!< 선택한 나라 시간 저장


    /**
     * 국가별 온도
     */
    public String sSeoulTemp = "";
    public String sBusanTemp = "";
    public String sBeijingTemp = "";
    public String sShanhaiTemp = "";
    public String sLondonTemp = "";
    public String sLiverpoolTemp = "";
    public String sParisTemp = "";
    public String sAvignonTemp = "";
    public String sTokyoTemp = "";
    public String sOsakaTemp = "";
    public String sVeneziaTemp = "";
    public String sMilanTemp = "";
    public String sSydneyTemp = "";
    public String sVancouverTemp = "";
    public String sSingaporeTemp = "";
    public String sBudapestTemp = "";
    public String sSzegedTemp = "";
    public String sNewYorkTemp = "";
    public String sSanFranciscoTemp = "";
    public String sLosAngelesTemp = "";
    public String sLasVegasTemp = "";

    //시간 당 dt 갖고 오기
    public int sGetHourlyTemp;
    public int sGetSecondHourlyTemp;
    public int sGetThirdHourlyTemp;
    public int sGetFourthHourlyTemp;
    public int sGetFifthHourlyTemp;

    //미래 날씨 데이터 갖고 오기
    public String sGetHourlyTemperature;
    public String sGetSecondHourlyTemperature;
    public String sGetThirdHourlyTemperature;
    public String sGetFourthHourlyTemperature;
    public String sGetFifthHourlyTemperature;

    //미래 날씨 아이콘 갖고 오기
    public int sGetHourlyTempId;
    public int sGetSecondHourlyTempId;
    public int sGetThirdHourlyTempId;
    public int sGetFourthHourlyTempId;
    public int sGetFifthHourlyTempId;

    public String sGetTime1;
    public String sGetTime2;
    public String sGetTime3;
    public String sGetTime4;
    public String sGetTime5;

    public String sGetPressure;



    public boolean bCheckAPI = true;

    /**
     * @author
     * @since	2014 - 08 - 05
     * @param	instance Singleton Pattern
     */
    private static DefineAPI instance;
    public static DefineAPI ins() {
        if (instance == null) {
            instance = new DefineAPI();
        }

        return instance;

    }
}
