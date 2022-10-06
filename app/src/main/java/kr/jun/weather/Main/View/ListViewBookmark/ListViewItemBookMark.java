package kr.jun.weather.Main.View.ListViewBookmark;

public class ListViewItemBookMark {
    private String sCountryName = ""; //제목 변수
    private String sTime = "" ; //내용 변수

    public ListViewItemBookMark() {

    }

    public void setCountryName(String title) { //리스트뷰에서 제목 설정
        sCountryName = title ;
    }
    public void setTime(String desc) { //리스트뷰에서 내용 설정
        sTime = desc ;
    }

    public String getCountryName() {
        return this.sCountryName ; //제목변수를 변환
    }
    public String getTime() {
        return this.sTime ; //내용 변수를 변환
    }

}
