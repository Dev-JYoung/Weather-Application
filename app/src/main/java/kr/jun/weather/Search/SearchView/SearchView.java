package kr.jun.weather.Search.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

import kr.jun.weather.R;
import kr.jun.weather.Search.SearchView.ListViewSearch.SearchAdapter;
import kr.jun.weather.WeatherCheck.Activity.WeatherCheckActivity;

public class SearchView extends AppCompatActivity {

    ListView listview = null ;
    long now = System.currentTimeMillis();

    Date date = new Date(now);

    ImageButton imgBtn;

    SimpleDateFormat dateFormat2 = new SimpleDateFormat("k:mm");

    String getTime = dateFormat2.format(date);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchAdapter adapter;

        imgBtn.findViewById(R.id.imgbtn_plus);

        adapter = new SearchAdapter() ;

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchView.this, WeatherCheckActivity.class);
                startActivity(intent);
                finish();
            }
        });

        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        adapter.addItem("서울특별시 종로구 청운효자동",getTime);
        adapter.addItem("서울특별시 종로구 사직동",getTime);
        adapter.addItem("서울특별시 종로구 삼청동",getTime);
        adapter.addItem("서울특별시 종로구 부암동",getTime);
        adapter.addItem("서울특별시 종로구 평창동",getTime);
        adapter.addItem("서울특별시 종로구 무악동",getTime);
        adapter.addItem("서울특별시 종로구 교남동",getTime);
        adapter.addItem("서울특별시 종로구 가회동",getTime);
        adapter.addItem("서울특별시 종로구 종로 1동",getTime);
        adapter.addItem("서울특별시 종로구 종로 2동",getTime);
        adapter.addItem("서울특별시 종로구 종로 3동",getTime);
        adapter.addItem("서울특별시 종로구 종로 4동",getTime);
        adapter.addItem("서울특별시 종로구 종로 5동",getTime);
        adapter.addItem("서울특별시 종로구 종로 6동",getTime);
        adapter.addItem("서울특별시 종로구 이화동",getTime);
        adapter.addItem("서울특별시 종로구 혜화동",getTime);
        adapter.addItem("서울특별시 종로구 창신 1동",getTime);
        adapter.addItem("서울특별시 종로구 창신 2동",getTime);
        adapter.addItem("서울특별시 종로구 창신 3동",getTime);
        adapter.addItem("서울특별시 종로구 숭인 1동",getTime);
        adapter.addItem("서울특별시 종로구 숭인 2동",getTime);

        //서울특별시 중구
        adapter.addItem("서울특별시 중구 소공동",getTime);
        adapter.addItem("서울특별시 중구 회현동",getTime);
        adapter.addItem("서울특별시 중구 명동",getTime);
        adapter.addItem("서울특별시 중구 필동",getTime);
        adapter.addItem("서울특별시 중구 장충동",getTime);
        adapter.addItem("서울특별시 중구 광희동",getTime);
        adapter.addItem("서울특별시 중구 을지로동",getTime);
        adapter.addItem("서울특별시 중구 신당동",getTime);
        adapter.addItem("서울특별시 중구 다산동",getTime);
        adapter.addItem("서울특별시 중구 약수동",getTime);
        adapter.addItem("서울특별시 중구 청구동",getTime);
        adapter.addItem("서울특별시 중구 신당 제5동",getTime);
        adapter.addItem("서울특별시 중구 동화동",getTime);
        adapter.addItem("서울특별시 중구 황학동",getTime);
        adapter.addItem("서울특별시 중구 중림동",getTime);

        //서울특별시 용산구
        adapter.addItem("서울특별시 용산구 후암동",getTime);
        adapter.addItem("서울특별시 용산구 용산2가동",getTime);
        adapter.addItem("서울특별시 용산구 남영동",getTime);
        adapter.addItem("서울특별시 용산구 청파동",getTime);
        adapter.addItem("서울특별시 용산구 원효로 1동",getTime);
        adapter.addItem("서울특별시 용산구 원효로 2동",getTime);
        adapter.addItem("서울특별시 용산구 효창동",getTime);
        adapter.addItem("서울특별시 용산구 용문동",getTime);
        adapter.addItem("서울특별시 용산구 한강로동",getTime);
        adapter.addItem("서울특별시 용산구 이촌 1동",getTime);
        adapter.addItem("서울특별시 용산구 이촌 2동",getTime);
        adapter.addItem("서울특별시 용산구 이태원 1동",getTime);
        adapter.addItem("서울특별시 용산구 이태원 2동",getTime);
        adapter.addItem("서울특별시 용산구 한남동",getTime);
        adapter.addItem("서울특별시 용산구 서빙고동",getTime);
        adapter.addItem("서울특별시 용산구 보광동",getTime);

        //서울특별시 성동구
        adapter.addItem("서울특별시 성동구 왕십리제2동",getTime);
        adapter.addItem("서울특별시 성동구 왕십리도선동",getTime);
        adapter.addItem("서울특별시 성동구 마장동",getTime);
        adapter.addItem("서울특별시 성동구 사근동",getTime);
        adapter.addItem("서울특별시 성동구 행당제 1동",getTime);
        adapter.addItem("서울특별시 성동구 행당제 2동",getTime);
        adapter.addItem("서울특별시 성동구 응봉동",getTime);
        adapter.addItem("서울특별시 성동구 금호 1가동",getTime);
        adapter.addItem("서울특별시 성동구 금호 2,3가동",getTime);
        adapter.addItem("서울특별시 성동구 금호 4가동",getTime);
        adapter.addItem("서울특별시 성동구 성수 1가1동",getTime);
        adapter.addItem("서울특별시 성동구 성수 1가2동",getTime);
        adapter.addItem("서울특별시 성동구 성수 2가1동",getTime);
        adapter.addItem("서울특별시 성동구 성수 2가3동",getTime);
        adapter.addItem("서울특별시 성동구 송정동",getTime);
        adapter.addItem("서울특별시 성동구 용답동",getTime);
        adapter.addItem("서울특별시 성동구 옥수동",getTime);

        //서울특별시 광진구
        adapter.addItem("서울특별시 광진구 중곡제1동",getTime);
        adapter.addItem("서울특별시 광진구 중곡제2동",getTime);
        adapter.addItem("서울특별시 광진구 중곡제3동",getTime);
        adapter.addItem("서울특별시 광진구 중곡제4동",getTime);
        adapter.addItem("서울특별시 광진구 능동",getTime);
        adapter.addItem("서울특별시 광진구 구의제1동",getTime);
        adapter.addItem("서울특별시 광진구 구의제2동",getTime);
        adapter.addItem("서울특별시 광진구 구의제3동",getTime);
        adapter.addItem("서울특별시 광진구 광장동",getTime);
        adapter.addItem("서울특별시 광진구 자양제1동",getTime);
        adapter.addItem("서울특별시 광진구 자양제2동",getTime);
        adapter.addItem("서울특별시 광진구 자양제3동",getTime);
        adapter.addItem("서울특별시 광진구 자양제4동",getTime);
        adapter.addItem("서울특별시 광진구 화양동",getTime);
        adapter.addItem("서울특별시 광진구 군자동",getTime);

        //서울특별시 동대문구
        adapter.addItem("서울특별시 동대문구 용신동",getTime);
        adapter.addItem("서울특별시 동대문구 제기동",getTime);
        adapter.addItem("서울특별시 동대문구 전농제1동",getTime);
        adapter.addItem("서울특별시 동대문구 전농제2동",getTime);
        adapter.addItem("서울특별시 동대문구 답십리제 1동",getTime);
        adapter.addItem("서울특별시 동대문구 답십리제 2동",getTime);
        adapter.addItem("서울특별시 동대문구 장안제 1동",getTime);
        adapter.addItem("서울특별시 동대문구 장안제 2동",getTime);
        adapter.addItem("서울특별시 동대문구 청량리동",getTime);
        adapter.addItem("서울특별시 동대문구 회기동",getTime);
        adapter.addItem("서울특별시 동대문구 휘경제1동",getTime);
        adapter.addItem("서울특별시 동대문구 휘경제2동",getTime);
        adapter.addItem("서울특별시 동대문구 이문제 1동",getTime);
        adapter.addItem("서울특별시 동대문구 이문제 2동",getTime);

        //서울특별시 중랑구
        adapter.addItem("서울특별시 중랑구 면목본동",getTime);
        adapter.addItem("서울특별시 중랑구 면목2동",getTime);
        adapter.addItem("서울특별시 중랑구 면목3.8동",getTime);
        adapter.addItem("서울특별시 중랑구 면목4동",getTime);
        adapter.addItem("서울특별시 중랑구 면목5동",getTime);
        adapter.addItem("서울특별시 중랑구 면목7동",getTime);
        adapter.addItem("서울특별시 중랑구 상봉1동",getTime);
        adapter.addItem("서울특별시 중랑구 상봉2동",getTime);
        adapter.addItem("서울특별시 중랑구 중화1동",getTime);
        adapter.addItem("서울특별시 중랑구 중화2동",getTime);
        adapter.addItem("서울특별시 중랑구 묵제1동",getTime);
        adapter.addItem("서울특별시 중랑구 망우본동",getTime);
        adapter.addItem("서울특별시 중랑구 망우3동",getTime);
        adapter.addItem("서울특별시 중랑구 신내1동",getTime);
        adapter.addItem("서울특별시 중랑구 신내2동",getTime);

        //서울특별시 성북구
        adapter.addItem("서울특별시 성북구 성북동",getTime);
        adapter.addItem("서울특별시 성북구 삼선동",getTime);
        adapter.addItem("서울특별시 성북구 동선동",getTime);
        adapter.addItem("서울특별시 성북구 돈암1동",getTime);
        adapter.addItem("서울특별시 성북구 돈암2동",getTime);
        adapter.addItem("서울특별시 성북구 안암동",getTime);
        adapter.addItem("서울특별시 성북구 보문동",getTime);
        adapter.addItem("서울특별시 성북구 정릉1동",getTime);
        adapter.addItem("서울특별시 성북구 정릉2동",getTime);
        adapter.addItem("서울특별시 성북구 정릉3동",getTime);
        adapter.addItem("서울특별시 성북구 정릉4동",getTime);
        adapter.addItem("서울특별시 성북구 길음1동",getTime);
        adapter.addItem("서울특별시 성북구 길음2동",getTime);
        adapter.addItem("서울특별시 성북구 종암동",getTime);
        adapter.addItem("서울특별시 성북구 월곡1동",getTime);
        adapter.addItem("서울특별시 성북구 월곡2동",getTime);
        adapter.addItem("서울특별시 성북구 장위1동",getTime);
        adapter.addItem("서울특별시 성북구 장위2동",getTime);
        adapter.addItem("서울특별시 성북구 장위3동",getTime);
        adapter.addItem("서울특별시 성북구 석관동",getTime);

        //서울특별시 강북구
        adapter.addItem("서울특별시 강북구 삼양동",getTime);
        adapter.addItem("서울특별시 강북구 미아동",getTime);
        adapter.addItem("서울특별시 강북구 송중동",getTime);
        adapter.addItem("서울특별시 강북구 송천동",getTime);
        adapter.addItem("서울특별시 강북구 삼각산동",getTime);
        adapter.addItem("서울특별시 강북구 번1동",getTime);
        adapter.addItem("서울특별시 강북구 번2동",getTime);
        adapter.addItem("서울특별시 강북구 번3동",getTime);
        adapter.addItem("서울특별시 강북구 수유1동",getTime);
        adapter.addItem("서울특별시 강북구 수유2동",getTime);
        adapter.addItem("서울특별시 강북구 수유3동",getTime);
        adapter.addItem("서울특별시 강북구 우이동",getTime);
        adapter.addItem("서울특별시 강북구 인수동",getTime);
        adapter.addItem("서울특별시 도봉구 쌍문1동",getTime);
        adapter.addItem("서울특별시 도봉구 쌍문2동",getTime);
        adapter.addItem("서울특별시 도봉구 쌍문3동",getTime);
        adapter.addItem("서울특별시 도봉구 쌍문4동",getTime);
        adapter.addItem("서울특별시 도봉구 방학1동",getTime);
        adapter.addItem("서울특별시 도봉구 방학2동",getTime);
        adapter.addItem("서울특별시 도봉구 방학3동",getTime);
        adapter.addItem("서울특별시 도봉구 창1동",getTime);
        adapter.addItem("서울특별시 도봉구 창2동",getTime);
        adapter.addItem("서울특별시 도봉구 창3동",getTime);
        adapter.addItem("서울특별시 도봉구 창4동",getTime);
        adapter.addItem("서울특별시 도봉구 창5동",getTime);
        adapter.addItem("서울특별시 도봉구 도봉1동",getTime);
        adapter.addItem("서울특별시 도봉구 도봉2동",getTime);
        adapter.addItem("서울특별시 노원구 월계1동",getTime);
        adapter.addItem("서울특별시 노원구 월계2동",getTime);
        adapter.addItem("서울특별시 노원구 월계3동",getTime);
        adapter.addItem("서울특별시 노원구 공릉1동",getTime);
        adapter.addItem("서울특별시 노원구 공릉2동",getTime);
        adapter.addItem("서울특별시 노원구 하계1동",getTime);
        adapter.addItem("서울특별시 노원구 하계2동",getTime);
        adapter.addItem("서울특별시 노원구 중계본동",getTime);
        adapter.addItem("서울특별시 노원구 중계1동",getTime);
        adapter.addItem("서울특별시 노원구 중계2.3동",getTime);
        adapter.addItem("서울특별시 노원구 중계4동",getTime);
        adapter.addItem("서울특별시 노원구 상계1동",getTime);
        adapter.addItem("서울특별시 노원구 상계2동",getTime);
        adapter.addItem("서울특별시 노원구 상계3.4동",getTime);
        adapter.addItem("서울특별시 노원구 상계5동",getTime);
        adapter.addItem("서울특별시 노원구 상계6.7동",getTime);
        adapter.addItem("서울특별시 노원구 상계8동",getTime);
        adapter.addItem("서울특별시 노원구 상계9동",getTime);
        adapter.addItem("서울특별시 노원구 상계10동",getTime);
        adapter.addItem("서울특별시 은평구 녹번동",getTime);
        adapter.addItem("서울특별시 은평구 불광1동",getTime);
        adapter.addItem("서울특별시 은평구 불광2동",getTime);
        adapter.addItem("서울특별시 은평구 갈현1동",getTime);
        adapter.addItem("서울특별시 은평구 갈현2동",getTime);
        adapter.addItem("서울특별시 은평구 구산동",getTime);
        adapter.addItem("서울특별시 은평구 대조동",getTime);
        adapter.addItem("서울특별시 은평구 응암1동",getTime);
        adapter.addItem("서울특별시 은평구 응암2동",getTime);
        adapter.addItem("서울특별시 은평구 응암3동",getTime);
        adapter.addItem("서울특별시 은평구 역촌동",getTime);
        adapter.addItem("서울특별시 은평구 신사1동",getTime);
        adapter.addItem("서울특별시 은평구 신사2동",getTime);
        adapter.addItem("서울특별시 은평구 증산동",getTime);
        adapter.addItem("서울특별시 은평구 수색동",getTime);
        adapter.addItem("서울특별시 은평구 진관동",getTime);
        adapter.addItem("서울특별시 서대문구 충현동",getTime);
        adapter.addItem("서울특별시 서대문구 천연동",getTime);
        adapter.addItem("서울특별시 서대문구 북아현동",getTime);
        adapter.addItem("서울특별시 서대문구 신촌동",getTime);
        adapter.addItem("서울특별시 서대문구 연희동",getTime);
        adapter.addItem("서울특별시 서대문구 홍제1동",getTime);
        adapter.addItem("서울특별시 서대문구 홍제2동",getTime);
        adapter.addItem("서울특별시 서대문구 홍제3동",getTime);
        adapter.addItem("서울특별시 서대문구 홍은1동",getTime);
        adapter.addItem("서울특별시 서대문구 홍은2동",getTime);
        adapter.addItem("서울특별시 서대문구 남가좌1동",getTime);
        adapter.addItem("서울특별시 서대문구 남가좌2동",getTime);
        adapter.addItem("서울특별시 서대문구 북가좌1동",getTime);
        adapter.addItem("서울특별시 서대문구 북가좌2동",getTime);

        //서울특별시 마포구
        adapter.addItem("서울특별시 마포구 공덕동",getTime);
        adapter.addItem("서울특별시 마포구 아현동",getTime);
        adapter.addItem("서울특별시 마포구 도화동",getTime);
        adapter.addItem("서울특별시 마포구 용강동",getTime);
        adapter.addItem("서울특별시 마포구 대흥동",getTime);
        adapter.addItem("서울특별시 마포구 염리동",getTime);
        adapter.addItem("서울특별시 마포구 신수동",getTime);
        adapter.addItem("서울특별시 마포구 서강동",getTime);
        adapter.addItem("서울특별시 마포구 서교동",getTime);
        adapter.addItem("서울특별시 마포구 합정동",getTime);
        adapter.addItem("서울특별시 마포구 망원1동",getTime);
        adapter.addItem("서울특별시 마포구 망원2동",getTime);
        adapter.addItem("서울특별시 마포구 연남동",getTime);
        adapter.addItem("서울특별시 마포구 성산1동",getTime);
        adapter.addItem("서울특별시 마포구 성산2동",getTime);
        adapter.addItem("서울특별시 마포구 상암동",getTime);

        //서울특별시 상암동
        adapter.addItem("서울특별시 양천구 목1동",getTime);
        adapter.addItem("서울특별시 양천구 목2동",getTime);
        adapter.addItem("서울특별시 양천구 목3동",getTime);
        adapter.addItem("서울특별시 양천구 목4동",getTime);
        adapter.addItem("서울특별시 양천구 목5동",getTime);
        adapter.addItem("서울특별시 양천구 신월1동",getTime);
        adapter.addItem("서울특별시 양천구 신월2동",getTime);
        adapter.addItem("서울특별시 양천구 신월3동",getTime);
        adapter.addItem("서울특별시 양천구 신월4동",getTime);
        adapter.addItem("서울특별시 양천구 신월5동",getTime);
        adapter.addItem("서울특별시 양천구 신월6동",getTime);
        adapter.addItem("서울특별시 양천구 신월7동",getTime);
        adapter.addItem("서울특별시 양천구 신정1동",getTime);
        adapter.addItem("서울특별시 양천구 신정2동",getTime);
        adapter.addItem("서울특별시 양천구 신정31동",getTime);
        adapter.addItem("서울특별시 양천구 신정4동",getTime);
        adapter.addItem("서울특별시 양천구 신정5동",getTime);
        adapter.addItem("서울특별시 양천구 신정6동",getTime);
        adapter.addItem("서울특별시 양천구 신정7동",getTime);

        //서울특별시 강서구
        adapter.addItem("서울특별시 강서구 염창동",getTime);
        adapter.addItem("서울특별시 강서구 등촌1동",getTime);
        adapter.addItem("서울특별시 강서구 등촌2동",getTime);
        adapter.addItem("서울특별시 강서구 등촌3동",getTime);
        adapter.addItem("서울특별시 강서구 화곡본동",getTime);
        adapter.addItem("서울특별시 강서구 화곡1동 ",getTime);
        adapter.addItem("서울특별시 강서구 화곡2동 ",getTime);
        adapter.addItem("서울특별시 강서구 화곡3동 ",getTime);
        adapter.addItem("서울특별시 강서구 화곡4동 ",getTime);
        adapter.addItem("서울특별시 강서구 화곡6동 ",getTime);
        adapter.addItem("서울특별시 강서구 화곡8동 ",getTime);
        adapter.addItem("서울특별시 강서구 우장산동",getTime);
        adapter.addItem("서울특별시 강서구 가양1동",getTime);
        adapter.addItem("서울특별시 강서구 가양2동",getTime);
        adapter.addItem("서울특별시 강서구 가양3동",getTime);
        adapter.addItem("서울특별시 강서구 발산1동",getTime);
        adapter.addItem("서울특별시 강서구 공항동",getTime);
        adapter.addItem("서울특별시 강서구 방화1동",getTime);
        adapter.addItem("서울특별시 강서구 방화2동",getTime);
        adapter.addItem("서울특별시 강서구 방화3동",getTime);

        //서울특별시 구로구
        adapter.addItem("서울특별시 구로구 신도림동",getTime);
        adapter.addItem("서울특별시 구로구 구로1동",getTime);
        adapter.addItem("서울특별시 구로구 구로2동",getTime);
        adapter.addItem("서울특별시 구로구 구로3동",getTime);
        adapter.addItem("서울특별시 구로구 구로4동",getTime);
        adapter.addItem("서울특별시 구로구 구로5동",getTime);
        adapter.addItem("서울특별시 구로구 가리봉동",getTime);
        adapter.addItem("서울특별시 구로구 고척1동",getTime);
        adapter.addItem("서울특별시 구로구 고척2동",getTime);
        adapter.addItem("서울특별시 구로구 고척3동",getTime);
        adapter.addItem("서울특별시 구로구 개봉1동",getTime);
        adapter.addItem("서울특별시 구로구 개봉2동",getTime);
        adapter.addItem("서울특별시 구로구 개봉3동",getTime);
        adapter.addItem("서울특별시 구로구 오류1동",getTime);
        adapter.addItem("서울특별시 구로구 오류2동",getTime);
        adapter.addItem("서울특별시 구로구 항동",getTime);
        adapter.addItem("서울특별시 구로구 수궁동",getTime);

        //서울특별시 금천구
        adapter.addItem("서울특별시 금천구 가산동",getTime);
        adapter.addItem("서울특별시 금천구 독산1동",getTime);
        adapter.addItem("서울특별시 금천구 독산2동",getTime);
        adapter.addItem("서울특별시 금천구 독산3동",getTime);
        adapter.addItem("서울특별시 금천구 독산4동",getTime);
        adapter.addItem("서울특별시 금천구 시흥1동",getTime);
        adapter.addItem("서울특별시 금천구 시흥2동",getTime);
        adapter.addItem("서울특별시 금천구 시흥3동",getTime);
        adapter.addItem("서울특별시 금천구 시흥4동",getTime);
        adapter.addItem("서울특별시 금천구 시흥5동",getTime);

        //서울특별시 영등포구
        adapter.addItem("서울특별시 영등포구 영등포본동",getTime);
        adapter.addItem("서울특별시 영등포구 영등포동",getTime);
        adapter.addItem("서울특별시 영등포구 여의동",getTime);
        adapter.addItem("서울특별시 영등포구 당산1동",getTime);
        adapter.addItem("서울특별시 영등포구 당산2동",getTime);
        adapter.addItem("서울특별시 영등포구 문래동",getTime);
        adapter.addItem("서울특별시 영등포구 양평1동",getTime);
        adapter.addItem("서울특별시 영등포구 양평2동",getTime);
        adapter.addItem("서울특별시 영등포구 신길1동",getTime);
        adapter.addItem("서울특별시 영등포구 신길3동",getTime);
        adapter.addItem("서울특별시 영등포구 신길4동",getTime);
        adapter.addItem("서울특별시 영등포구 신길5동",getTime);
        adapter.addItem("서울특별시 영등포구 신길6동",getTime);
        adapter.addItem("서울특별시 영등포구 신길7동",getTime);
        adapter.addItem("서울특별시 영등포구 대림1동",getTime);
        adapter.addItem("서울특별시 영등포구 대림2동",getTime);
        adapter.addItem("서울특별시 영등포구 대림3동",getTime);
        adapter.addItem("서울특별시 영등포구 도림동",getTime);

        //서울특별시 동작구
        adapter.addItem("서울특별시 동작구 상동1동",getTime);
        adapter.addItem("서울특별시 동작구 상동2동",getTime);
        adapter.addItem("서울특별시 동작구 상동3동",getTime);
        adapter.addItem("서울특별시 동작구 상동4동",getTime);
        adapter.addItem("서울특별시 동작구 흑석동",getTime);
        adapter.addItem("서울특별시 동작구 사당1동",getTime);
        adapter.addItem("서울특별시 동작구 사당2동",getTime);
        adapter.addItem("서울특별시 동작구 사당3동",getTime);
        adapter.addItem("서울특별시 동작구 사당4동",getTime);
        adapter.addItem("서울특별시 동작구 사당5동",getTime);
        adapter.addItem("서울특별시 동작구 대방동",getTime);
        adapter.addItem("서울특별시 동작구 신대방1동",getTime);
        adapter.addItem("서울특별시 동작구 신대방2동",getTime);

        //서울특별시 관악구
        adapter.addItem("서울특별시 관악구 보라매동",getTime);
        adapter.addItem("서울특별시 관악구 청림동",getTime);
        adapter.addItem("서울특별시 관악구 행운동",getTime);
        adapter.addItem("서울특별시 관악구 낙성대동",getTime);
        adapter.addItem("서울특별시 관악구 중앙동",getTime);
        adapter.addItem("서울특별시 관악구 인헌동",getTime);
        adapter.addItem("서울특별시 관악구 남현동",getTime);
        adapter.addItem("서울특별시 관악구 서원동",getTime);
        adapter.addItem("서울특별시 관악구 신원동",getTime);
        adapter.addItem("서울특별시 관악구 서림동",getTime);
        adapter.addItem("서울특별시 관악구 신사동",getTime);
        adapter.addItem("서울특별시 관악구 신림동",getTime);
        adapter.addItem("서울특별시 관악구 난향동",getTime);
        adapter.addItem("서울특별시 관악구 조원동",getTime);
        adapter.addItem("서울특별시 관악구 대학동",getTime);
        adapter.addItem("서울특별시 관악구 성현동",getTime);
        adapter.addItem("서울특별시 관악구 청룡동",getTime);
        adapter.addItem("서울특별시 관악구 난곡동",getTime);
        adapter.addItem("서울특별시 관악구 삼성동",getTime);
        adapter.addItem("서울특별시 관악구 미성동",getTime);

        //서울특별시 서초구
        adapter.addItem("서울특별시 서초구 서초1동",getTime);
        adapter.addItem("서울특별시 서초구 서초2동",getTime);
        adapter.addItem("서울특별시 서초구 서초3동",getTime);
        adapter.addItem("서울특별시 서초구 서초4동",getTime);
        adapter.addItem("서울특별시 서초구 잠원동",getTime);
        adapter.addItem("서울특별시 서초구 반포본동",getTime);
        adapter.addItem("서울특별시 서초구 반포1동",getTime);
        adapter.addItem("서울특별시 서초구 반포2동",getTime);
        adapter.addItem("서울특별시 서초구 반포3동",getTime);
        adapter.addItem("서울특별시 서초구 반포4동",getTime);
        adapter.addItem("서울특별시 서초구 방배본동",getTime);
        adapter.addItem("서울특별시 서초구 방배1동",getTime);
        adapter.addItem("서울특별시 서초구 방배2동",getTime);
        adapter.addItem("서울특별시 서초구 방배3동",getTime);
        adapter.addItem("서울특별시 서초구 방배4동",getTime);
        adapter.addItem("서울특별시 서초구 양재1동",getTime);
        adapter.addItem("서울특별시 서초구 양재2동",getTime);
        adapter.addItem("서울특별시 서초구 내곡동",getTime);

        //서울특별시 강남구
        adapter.addItem("서울특별시 강남구 신사동",getTime);
        adapter.addItem("서울특별시 강남구 논현1동",getTime);
        adapter.addItem("서울특별시 강남구 논현2동",getTime);
        adapter.addItem("서울특별시 강남구 압구정동",getTime);
        adapter.addItem("서울특별시 강남구 청담동",getTime);
        adapter.addItem("서울특별시 강남구 삼성1동",getTime);
        adapter.addItem("서울특별시 강남구 삼성2동",getTime);
        adapter.addItem("서울특별시 강남구 대치1동",getTime);
        adapter.addItem("서울특별시 강남구 대치2동",getTime);
        adapter.addItem("서울특별시 강남구 대치4동",getTime);
        adapter.addItem("서울특별시 강남구 역삼1동",getTime);
        adapter.addItem("서울특별시 강남구 역삼2동",getTime);
        adapter.addItem("서울특별시 강남구 도곡1동",getTime);
        adapter.addItem("서울특별시 강남구 도곡2동",getTime);
        adapter.addItem("서울특별시 강남구 개포1동",getTime);
        adapter.addItem("서울특별시 강남구 개포2동",getTime);
        adapter.addItem("서울특별시 강남구 개포4동",getTime);
        adapter.addItem("서울특별시 강남구 세곡동",getTime);
        adapter.addItem("서울특별시 강남구 일원본동",getTime);
        adapter.addItem("서울특별시 강남구 일원1동",getTime);
        adapter.addItem("서울특별시 강남구 일원2동",getTime);
        adapter.addItem("서울특별시 강남구 수서동",getTime);

        //서울특별시 송파구
        adapter.addItem("서울특별시 송파구 풍납1동",getTime);
        adapter.addItem("서울특별시 송파구 풍납2동",getTime);
        adapter.addItem("서울특별시 송파구 거여1동",getTime);
        adapter.addItem("서울특별시 송파구 거여2동",getTime);
        adapter.addItem("서울특별시 송파구 마천1동",getTime);
        adapter.addItem("서울특별시 송파구 마천2동",getTime);
        adapter.addItem("서울특별시 송파구 방이1동",getTime);
        adapter.addItem("서울특별시 송파구 방이2동",getTime);
        adapter.addItem("서울특별시 송파구 오륜동",getTime);
        adapter.addItem("서울특별시 송파구 오금동",getTime);
        adapter.addItem("서울특별시 송파구 송파1동",getTime);
        adapter.addItem("서울특별시 송파구 송파2동",getTime);
        adapter.addItem("서울특별시 송파구 석촌동",getTime);
        adapter.addItem("서울특별시 송파구 삼전동",getTime);
        adapter.addItem("서울특별시 송파구 가락본동",getTime);
        adapter.addItem("서울특별시 송파구 가락1동",getTime);
        adapter.addItem("서울특별시 송파구 가락2동",getTime);
        adapter.addItem("서울특별시 송파구 문정1동",getTime);
        adapter.addItem("서울특별시 송파구 문정2동",getTime);
        adapter.addItem("서울특별시 송파구 장지동",getTime);
        adapter.addItem("서울특별시 송파구 위레동",getTime);
        adapter.addItem("서울특별시 송파구 잠실본동",getTime);
        adapter.addItem("서울특별시 송파구 잠실2동",getTime);
        adapter.addItem("서울특별시 송파구 잠실3동",getTime);
        adapter.addItem("서울특별시 송파구 잠실4동",getTime);
        adapter.addItem("서울특별시 송파구 잠실6동",getTime);
        adapter.addItem("서울특별시 송파구 잠실7동",getTime);

        //서울특별시 강동구
        adapter.addItem("서울특별시 강동구 강일동",getTime);
        adapter.addItem("서울특별시 강동구 상일동",getTime);
        adapter.addItem("서울특별시 강동구 명일1동",getTime);
        adapter.addItem("서울특별시 강동구 명일2동",getTime);
        adapter.addItem("서울특별시 강동구 고덕1동",getTime);
        adapter.addItem("서울특별시 강동구 고덕2동",getTime);
        adapter.addItem("서울특별시 강동구 암사1동",getTime);
        adapter.addItem("서울특별시 강동구 암사2동",getTime);
        adapter.addItem("서울특별시 강동구 암사3동",getTime);
        adapter.addItem("서울특별시 강동구 천호1동",getTime);
        adapter.addItem("서울특별시 강동구 천호2동",getTime);
        adapter.addItem("서울특별시 강동구 천호3동",getTime);
        adapter.addItem("서울특별시 강동구 성내1동",getTime);
        adapter.addItem("서울특별시 강동구 성내2동",getTime);
        adapter.addItem("서울특별시 강동구 성내3동",getTime);
        adapter.addItem("서울특별시 강동구 길동",getTime);
        adapter.addItem("서울특별시 강동구 둔촌1동",getTime);
        adapter.addItem("서울특별시 강동구 둔촌2동",getTime);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("리스트뷰 클릭 완료 : " + adapter.listViewItemList.get(position).getAddr());
            }
        });

        EditText editTextFilter = (EditText)findViewById(R.id.SearchCity);
        editTextFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable edit) {
                String filterText = edit.toString() ;
                if (filterText.length() > 0) {
                    listview.setFilterText(filterText) ;
                } else {
                    listview.clearTextFilter() ;
                }
            }
        });
    }
}
