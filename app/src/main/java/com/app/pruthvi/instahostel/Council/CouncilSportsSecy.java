package com.app.pruthvi.instahostel.Council;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.core.app.NavUtils;
import androidx.viewpager.widget.PagerAdapter;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;

import com.app.pruthvi.instahostel.R;
import com.tmall.ultraviewpager.UltraViewPager;
import com.tmall.ultraviewpager.transformer.UltraDepthScaleTransformer;

import java.util.ArrayList;


public class CouncilSportsSecy extends AppCompatActivity
        {

            @Override

            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
                ArrayList<CouncilUserClass> sportsList = new ArrayList<>();
        CouncilUserClass footballSecy=new CouncilUserClass("Aman Yadav","Institute Football Secretary","","",R.drawable.ama);
        CouncilUserClass cricketSecy=new CouncilUserClass("Senuah Salvi","Institute Cricket Secretary","","",R.drawable.sen);
        CouncilUserClass tennisSecy=new CouncilUserClass("Senuah Salvi","Institute Tennis Secretary","","",R.drawable.ayu);

        sportsList.add(footballSecy);
        sportsList.add(cricketSecy);
        sportsList.add(tennisSecy);

        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
                PagerAdapter adapter = new UltraPagerAdapter(true, this, sportsList);
        ultraViewPager.setAdapter(adapter);

        ultraViewPager.setMultiScreen(0.8f);
        ultraViewPager.setItemRatio(1f);
        ultraViewPager.setRatio(0.75f);
        ultraViewPager.setAutoMeasureHeight(true);
                UltraViewPager.Orientation gravity_indicator = UltraViewPager.Orientation.HORIZONTAL;
        ultraViewPager.setPageTransformer(false, new UltraDepthScaleTransformer());



    }



    protected void onResume() {
        super.onResume();

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        androidx.appcompat.app.ActionBar sportsActionBar = getSupportActionBar();
        assert sportsActionBar != null;
        sportsActionBar.setHomeButtonEnabled(true);
        sportsActionBar.setDisplayHomeAsUpEnabled(true);
        sportsActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        sportsActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return true;

    }


}
