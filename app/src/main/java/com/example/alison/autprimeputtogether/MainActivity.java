package com.example.alison.autprimeputtogether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView simpleWebView = findViewById(R.id.loginWebView);
        simpleWebView.setWebViewClient(new MyWebViewClient());

        String url = "https://blackboard.aut.ac.nz/webapps/login/?action=relogin";
        simpleWebView.getSettings().setJavaScriptEnabled(true);
        simpleWebView.loadUrl(url); // load the url on the web view
    }
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            Toast.makeText(MainActivity.this, url, Toast.LENGTH_LONG).show();
            // load the url
            view.setVisibility(View.INVISIBLE);

            //once user logs in with url successfully, redirect them to the home page of this app
            Intent homeIntent = new Intent(MainActivity.this, HomepageActivity.class);
            startActivity(homeIntent);
            return true;
        }
    }
}
