package com.example.alison.autprimeputtogether;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LogoutActivity extends AppCompatActivity {
    WebView logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        logout = findViewById(R.id.logoutWebview);
        WebSettings webSetup = logout.getSettings();
        webSetup.setJavaScriptEnabled(true);
        logout.loadUrl("https://blackboard.aut.ac.nz/webapps/login/?action=relogin");
        logout.setWebViewClient(new WebViewClient());
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
        if(logout.canGoBack()){
            logout.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
