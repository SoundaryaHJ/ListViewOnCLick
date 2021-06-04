package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        final String[] list= {"Android","Windows","Mac","Linux","Ubuntu","Android","Windows","Mac","Linux","Ubuntu","Android","Windows","Mac","Linux","Ubuntu","Android","Windows","Mac","Linux","Ubuntu" };



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, list);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {

                Toast.makeText(MainActivity.this,list[position], Toast.LENGTH_SHORT).show();


                Intent intent=  new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("input", list[position]);

                startActivity(intent);
            }
        });

    }
}