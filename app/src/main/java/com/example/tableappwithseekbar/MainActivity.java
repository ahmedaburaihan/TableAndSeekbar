package com.example.tableappwithseekbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SeekBar seekBar;
    ArrayList<MyModel> myModelArrayList;
    MyAdapterClass adapterClass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        seekBar = findViewById(R.id.seekBar);
        seekBar.setMax(10);
        myModelArrayList = new ArrayList<>();

        adapterClass = new MyAdapterClass(myModelArrayList);
        addItems(1);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(progress <= 0){
                    progress = 1;
                }

                addItems(progress);
                adapterClass.notifyDataSetChanged();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(adapterClass);

    }


    private void addItems(int tableNum){
        myModelArrayList.clear();
        try{

            for(int i=1; i<=10; i++){
                myModelArrayList.add(new MyModel(tableNum, i, (tableNum*i)));
            }

        }catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

}
