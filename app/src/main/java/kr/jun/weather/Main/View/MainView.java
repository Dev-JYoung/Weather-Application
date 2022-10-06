package kr.jun.weather.Main.View;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import kr.jun.weather.API.Common.DefineAPI;
import kr.jun.weather.Main.Activity.MainActivity;
import kr.jun.weather.Main.View.ListViewBookmark.ListViewAdapterBookMark;
import kr.jun.weather.R;
import kr.jun.weather.Search.Activity.SearchActivity;
import kr.jun.weather.WeatherCheck.Activity.WeatherCheckActivity;

public class MainView {
    AppCompatActivity aMainView;

    //!< 나라추가 버튼
    Button btnAddCountry;

    //<! 리스트뷰 연결
//    ListView listViewBookMark;
//    ListViewAdapterBookMark cListViewAdapterBookMark;
    

    public MainView(AppCompatActivity appCompatActivity) {
        aMainView = appCompatActivity;
        setButton();
        //setListView();
    }

    public void setButton() {
        //!< 나라 추가버튼 ID 연결
        btnAddCountry = (Button)aMainView.findViewById(R.id.btnAddCountry);
        
        //!< 나라 추가버튼
        btnAddCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("나라 추가버튼 눌림");
                Intent intent = new Intent(view.getContext(), SearchActivity.class);
                aMainView.startActivity(intent);
                aMainView.finish();
                System.out.println("엑티비티 변경 완료");
            }
        });
    }

//    public void setListView() {
//        //!< 리스트뷰 연결
//        listViewBookMark = (ListView)aMainView.findViewById(R.id.listview1);
//        cListViewAdapterBookMark = new ListViewAdapterBookMark();
//        listViewBookMark.setAdapter(cListViewAdapterBookMark);
//
////        for(int i = 0; i < DefineAPI.ins().sSaveCountryName.length(); i++){
////
////            cListViewAdapterBookMark.addItem(DefineAPI.ins().sSaveCountryName,DefineAPI.ins().sSaveCountryTime);
////
////        }
//    }
}
