package com.example.medicalstore;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        RecyclerView recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





        MyMovieData[] myMovieData = new MyMovieData[]{
                new MyMovieData("medicinelogo","98997 flim",R.drawable.medicine_logo),
                new MyMovieData("medicinelogo","784",R.drawable.medicine_logo),
                new MyMovieData("medicinelogo","784",R.drawable.medicine_logo),
                new MyMovieData("medicinelogo","784",R.drawable.medicine_logo),
                new MyMovieData("medicinelogo","784",R.drawable.medicine_logo),
                new MyMovieData("medicinelogo","784",R.drawable.medicine_logo),
                new MyMovieData("medicinelogo","784",R.drawable.medicine_logo),
        };
        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,MainActivity2.this);
        recyclerView.setAdapter(myMovieAdapter);
    }
}