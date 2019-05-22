package com.example.alison.autprimeputtogether;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NotepadActivity extends AppCompatActivity {
    Button saveNoteBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notepad);

        saveNoteBtn = findViewById(R.id.saveNoteBtnId);

        saveNoteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Saving note",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
