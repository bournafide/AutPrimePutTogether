package com.example.alison.autprimeputtogether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomepageActivity extends AppCompatActivity {
    private Button courseBtn, gradeBtn, mapBtn, noteBtn, emailBtn, calendarBtn, logoutBtn;
    //https://blackboard.aut.ac.nz/webapps/calendar/viewPersonal - calendar url
    //logout button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        courseBtn = findViewById(R.id.courseBtnId);
        gradeBtn = findViewById(R.id.gradeBtnId);
        mapBtn = findViewById(R.id.mapBtnId);
        noteBtn = findViewById(R.id.noteBtnId);
        emailBtn = findViewById(R.id.emailBtnId);
        calendarBtn = findViewById(R.id.calendarId);
        logoutBtn = findViewById(R.id.logoutBtnId);

        //redirecting functions for the buttons/features of the app
        courseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent to redirect user to courses when button is clicked
                Toast.makeText(getApplicationContext(),"Redirecting to courses",Toast.LENGTH_SHORT).show();
                Intent courseIntent = new Intent(HomepageActivity.this,CourseActivity.class);
                startActivity(courseIntent);
            }
        });
        gradeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent to redirect user to grades when button is clicked
                Toast.makeText(getApplicationContext(),"Redirecting to grades",Toast.LENGTH_SHORT).show();
                Intent gradeIntent = new Intent(HomepageActivity.this,GradeActivity.class);
                startActivity(gradeIntent);
            }
        });
        mapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent to redirect user to maps when button is clicked
                Toast.makeText(getApplicationContext(),"Redirecting to maps",Toast.LENGTH_SHORT).show();
                Intent mapIntent = new Intent(HomepageActivity.this,MapActivity.class);
                startActivity(mapIntent);
            }
        });
        noteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent to redirect user to notes when button is clicked
                Toast.makeText(getApplicationContext(),"Redirecting to notes",Toast.LENGTH_SHORT).show();
                Intent noteIntent = new Intent(HomepageActivity.this,NotepadActivity.class);
                startActivity(noteIntent);
            }
        });
        emailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent to redirect user to student email when button is clicked
                Toast.makeText(getApplicationContext(),"Redirecting to student email",Toast.LENGTH_SHORT).show();
                Intent emailIntent = new Intent(HomepageActivity.this,EmailActivity.class);
                startActivity(emailIntent);
            }
        });
        calendarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Redirecting to calendar",Toast.LENGTH_SHORT).show();
                Intent calendarIntent = new Intent(HomepageActivity.this,CalendarActivity.class);
                startActivity(calendarIntent);
            }
        });
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent to redirect user to login page when button is clicked
                Toast.makeText(getApplicationContext(),"Logging Out",Toast.LENGTH_SHORT).show();
                Intent logoutIntent = new Intent(HomepageActivity.this,LogoutActivity.class);
                startActivity(logoutIntent);
            }
        });
    }
}
