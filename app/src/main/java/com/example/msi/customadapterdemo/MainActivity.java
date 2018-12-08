package com.example.msi.customadapterdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private ListView lv;
    private String [] countrynames;
    private int [] flags={R.drawable.afghanistan,R.drawable.algeria,R.drawable.bangladesh,R.drawable.brazil,R.drawable.canada,R.drawable.croatia,
                            R.drawable.denmark,R.drawable.djibouti,R.drawable.egypt,R.drawable.ethiopia,R.drawable.fiji,R.drawable.france,R.drawable.germany,
                        R.drawable.greece,R.drawable.haiti,R.drawable.honduras,R.drawable.iceland,R.drawable.india,R.drawable.ireland,R.drawable.jamaica,R.drawable.jordan,
                        R.drawable.kazakhstan,R.drawable.kwait,R.drawable.lebanon,R.drawable.luxembourg,R.drawable.madagascar,R.drawable.maldives,
                        R.drawable.mauritius,R.drawable.netherlands,R.drawable.norway,R.drawable.oman,R.drawable.pakistan,R.drawable.poland,R.drawable.qatar,R.drawable.romania,
                        R.drawable.russia,R.drawable.switzerland,R.drawable.syria,R.drawable.somalia,R.drawable.thailand,R.drawable.tuvalu,R.drawable.uganda,R.drawable.uruguay,
                        R.drawable.venezuela,R.drawable.vietnam,R.drawable.yemen,R.drawable.zambia,R.drawable.zimbabwe};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countrynames = getResources().getStringArray(R.array.country_names);


        lv = findViewById(R.id.lvID);
        CustomAdapter adapter = new CustomAdapter(this,countrynames,flags);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String st = ""+position;

                intent = new Intent(MainActivity.this,ProfileActivity.class);

                intent.putExtra("name",st);
                startActivity(intent);
            }
        });
    }



}
