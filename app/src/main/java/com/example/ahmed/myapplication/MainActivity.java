package com.example.ahmed.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity  {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void click(View view) {

        Intent inent = new Intent(this, Main3Activity.class);

        // calling an activity using <intent-filter> action name
        // 	Intent inent = new Intent("com.engmohamedelmahgou.android.ANOTHER_ACTIVITY");
        startActivity(inent);
    }

}
