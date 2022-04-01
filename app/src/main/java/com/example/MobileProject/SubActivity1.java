package com.example.MobileProject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.showmatch.R;

public class SubActivity1 extends AppCompatActivity {

    LinearLayout container;
    LayoutInflater inflater;
    Button getInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);


        getInfo = (Button)findViewById(R.id.getInfo);
        container = (LinearLayout) findViewById(R.id.container);
        inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        getInfo.setOnClickListener(new getInfoClickListener());}

    protected class getInfoClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            container.removeAllViews();
            inflater.inflate(R.layout.activity_match_data, container, true);
        }
    }
}