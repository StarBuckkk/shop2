package com.silogood.shop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button userBtn;
    private Button adminBtn;
    private ActionBar mActionbar;

    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_view();

        //git test 1

    }


    private void init_view()
    {
        userBtn = (Button) findViewById(R.id.user_btn);
        userBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d(TAG,"USER CLICK");

                Intent intent = new Intent(MainActivity.this , ItemViewByUser.class);
                startActivity(intent);

               //TODO goto mainactivity
                // finish();

            }
        });
        adminBtn = (Button) findViewById(R.id.admin_btn);
        adminBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d(TAG,"ADMIN CLICK");

                Intent intent = new Intent(MainActivity.this , ItemViewByAdmin.class);
                startActivity(intent);

                //TODO goto mainactivity
                // finish();
            }
        });


        mActionbar = getSupportActionBar();
        mActionbar.setTitle(R.string.app_label);



    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
