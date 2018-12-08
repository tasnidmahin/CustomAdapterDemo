package com.example.msi.customadapterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView iv;
    private TextView tv;

    private String[] ctext=getResources().getStringArray(R.array.country_details);
    private int[] pics={R.drawable.afghanistan_details,R.drawable.algeria_details,R.drawable.bangladesh_details,R.drawable.brazil_details,R.drawable.canada_details,R.drawable.croatia_details,
            R.drawable.denmark_details,R.drawable.djibouti_details,R.drawable.egypt_details,R.drawable.ethiopia_details,R.drawable.fiji_details,R.drawable.france_details,R.drawable.germany_details,
            R.drawable.greece_details,R.drawable.haiti_details,R.drawable.hondurus_details,R.drawable.iceland_details,R.drawable.india_details,R.drawable.ireland_details,R.drawable.jamaica_details,R.drawable.jordan_details,
            R.drawable.kazakhstan_details,R.drawable.kuwait_details,R.drawable.lebanon_details,R.drawable.luxembourg_details,R.drawable.madagascar_details,R.drawable.maldives_details,
            R.drawable.mauritius_details,R.drawable.netherlands_details,R.drawable.norway_details,R.drawable.oman_details,R.drawable.pakistan_details,R.drawable.poland_details,R.drawable.qatar_details,R.drawable.romania_details,
            R.drawable.russia_details,R.drawable.switzerland_details,R.drawable.syria_details,R.drawable.somalia_details,R.drawable.thailand_details,R.drawable.tuvalu_details,R.drawable.uganda_details,R.drawable.uruguay_details,
            R.drawable.venezuela_details,R.drawable.vietnam_details,R.drawable.yemen_details,R.drawable.zambia_details,R.drawable.zimbabwe_details};;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        iv = findViewById(R.id.divID);
        tv = findViewById(R.id.dtvID);
        Log.d("gg","GgGgVv");
        Bundle bnd = getIntent().getExtras();
        Log.d("gg","GgGg");
        if(bnd!=null)
        {
            Log.d("tg","mhn");
            String ss = bnd.get("name").toString();
            int pos = Integer.parseInt(ss);
            Log.d("tag",ss);
            showDetails(pos);
        }
    }

    void showDetails(int pos)
    {
        iv.setImageResource(pics[pos]);
        tv.setText(ctext[pos]);
    }
}
