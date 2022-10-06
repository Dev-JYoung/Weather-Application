package kr.jun.weather.Main.View.ListViewBookmark;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import kr.jun.weather.R;

public class ListViewAdapterBookMark extends BaseAdapter {

    public ArrayList<ListViewItemBookMark> listViewItems = new ArrayList<>();

    @Override
    public int getCount() {
        return listViewItems.size();
    }

    @Override
    public Object getItem(int i) {
        return listViewItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final int pos = i;
        final Context context = viewGroup.getContext();

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listviewitem_bookmark, viewGroup, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        TextView titleTextView = (TextView) view.findViewById(R.id.tvCountryName) ;
        TextView descTextView = (TextView) view.findViewById(R.id.tvTime) ;

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        ListViewItemBookMark listViewItem = listViewItems.get(i);

        // 아이템 내 각 위젯에 데이터 반영
        titleTextView.setText(listViewItem.getCountryName());
        descTextView.setText(listViewItem.getTime());

        return view;
    }

    public void addItem(String countryName, String time) {
        ListViewItemBookMark item = new ListViewItemBookMark();

        item.setCountryName(countryName);
        item.setTime(time);

        listViewItems.add(item);
    }
}
