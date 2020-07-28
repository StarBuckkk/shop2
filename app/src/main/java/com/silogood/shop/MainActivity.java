package com.silogood.shop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.silogood.shop.databasemanager.AccNote;
import com.silogood.shop.databasemanager.DatabaseHelper;

public class MainActivity extends AppCompatActivity {

    private Button userBtn;
    private Button adminBtn;
    private ActionBar mActionbar;

    private String TAG = "MainActivity";
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = MainActivity.this;

        init_view();

        DatabaseHelper databaseHelper = new DatabaseHelper(this);

        //insert test
        databaseHelper.setInsertNote("clothes","shot_shirt_1", "11", 1);
        databaseHelper.setInsertNote("clothes","shot_shirt_2", "12", 1);
        databaseHelper.setInsertNote("shoes","shoes_1", "21", 4);
        databaseHelper.setInsertNote("shoes","shoes_2", "22", 3);
        databaseHelper.setInsertNote("acc","acc_1", "31", 5);
        databaseHelper.setInsertNote("acc","acc_2", "32", 6);

        //get db
       /* databaseHelper.getAccNode(1);
        databaseHelper.getClothesNote(0);
        databaseHelper.getShoesNote(1);*/

        //update..

        //delete..



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
