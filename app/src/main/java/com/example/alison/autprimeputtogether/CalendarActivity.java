package com.example.alison.autprimeputtogether;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CalendarActivity extends AppCompatActivity {
    WebView calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendar = findViewById(R.id.calendarWebview);
        WebSettings webSetup = calendar.getSettings();
        webSetup.setJavaScriptEnabled(true);
        calendar.loadUrl("https://blackboard.aut.ac.nz/webapps/calendar/viewPersonal");
        calendar.setWebViewClient(new WebViewClient());
    }
    public class myWebClient extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon){
            super.onPageStarted(view,url,favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    public void onBackPressed() {
        if(calendar.canGoBack()){
            calendar.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
