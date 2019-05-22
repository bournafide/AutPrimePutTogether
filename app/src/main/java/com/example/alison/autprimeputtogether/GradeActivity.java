package com.example.alison.autprimeputtogether;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GradeActivity extends AppCompatActivity {
    WebView gradeWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);

        gradeWebView = findViewById(R.id.gradeWebViewId);
        WebSettings webSetup = gradeWebView.getSettings();
        webSetup.setJavaScriptEnabled(true);
        gradeWebView.loadUrl("https://blackboard.aut.ac.nz/webapps/bb-social-learning-bb_bb60/execute/mybb?cmd=display&toolId=MyGradesOnMyBb_____MyGradesTool&extraParams=override_stream=mygrades");
        gradeWebView.setWebViewClient(new WebViewClient());
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
        if(gradeWebView.canGoBack()){
            gradeWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
