package com.example.include_klu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class gallery3 extends AppCompatActivity {

    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        gridView=findViewById(R.id.grid_view);
        gridView.setAdapter((new imageadapter3(this)));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(),FullScreen.class);
                intent.putExtra("id",position);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent start=new Intent(gallery3.this,eventsG.class);
        startActivity(start);
        finish();
    }
}
