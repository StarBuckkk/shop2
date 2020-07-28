package com.silogood.shop.user.user_acc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.silogood.shop.R;
import com.silogood.shop.user.user_shoes.User_Shoes;

public class User_Acc extends AppCompatActivity {
    private Button UserAccOrderBtn;
    private String TAG = "StarBuck_MAINACTIVITY5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_acc);
        init_view();
    }

    private void init_view() {
        UserAccOrderBtn = (Button) findViewById(R.id.user_cloth_order_btn);
        UserAccOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"CLOTHES CLICK");

                Intent intent = new Intent(User_Acc.this , User_Acc.class);
                startActivity(intent);

                //TODO goto mainactivity
                finish();

            }
        });

    }
}
