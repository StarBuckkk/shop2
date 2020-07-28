package com.silogood.shop.user.user_clothes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.silogood.shop.ItemViewByUser;
import com.silogood.shop.R;

public class User_Clothes extends AppCompatActivity {

    private Button UserClothesOrderBtn;
    private String TAG = "StarBuck_MAINACTIVITY4";

    private ListView mListView;
    private ListAdapter mListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_clothes);
        init_view();


    }



    private void init_view() {
        UserClothesOrderBtn = (Button) findViewById(R.id.user_cloth_order_btn);
        UserClothesOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"CLOTHES CLICK");

                Intent intent = new Intent(User_Clothes.this , User_Clothes.class);
                startActivity(intent);

                //TODO goto mainactivity
                 finish();

            }
        });

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
