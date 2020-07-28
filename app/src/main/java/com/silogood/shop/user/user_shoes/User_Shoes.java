package com.silogood.shop.user.user_shoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.silogood.shop.R;
import com.silogood.shop.user.user_clothes.User_Clothes;

public class User_Shoes extends AppCompatActivity {

    private Button UserShoesOrderBtn;
    private String TAG = "StarBuck_MAINACTIVITY5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_shoes);
        init_view();
    }

    private void init_view() {
        UserShoesOrderBtn = (Button) findViewById(R.id.user_cloth_order_btn);
        UserShoesOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"CLOTHES CLICK");

                Intent intent = new Intent(User_Shoes.this , User_Shoes.class);
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
