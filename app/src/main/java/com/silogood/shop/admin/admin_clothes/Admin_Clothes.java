package com.silogood.shop.admin.admin_clothes;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.silogood.shop.R;
import com.silogood.shop.databasemanager.ClothesNote;
import com.silogood.shop.databasemanager.DatabaseHelper;
import com.silogood.shop.databasemanager.NotesAdapter;

import java.util.ArrayList;

public class Admin_Clothes extends AppCompatActivity {

    private ListView mListView;
    private TextView mTextView;
    private Context mContext;
    private String TAG = "Admin_Clothes";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_clothes);

        mListView = (ListView)findViewById(R.id.listview);
        mTextView = (TextView)findViewById(R.id.selected_item_textview);

        ArrayList<ClothesNote> list1 = new ArrayList<ClothesNote>();

        NotesAdapter adapter1 = new NotesAdapter(this,R.layout.custom_listview_item,list1);

        //mListView.setAdapter(adapter);
        mListView.setAdapter(adapter1);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view, int position, long id) {

                ClothesNote selected_item = (ClothesNote)adapterView.getItemAtPosition(position);

                mTextView.setText(selected_item.getName());
            }
        });

        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        int i = databaseHelper.getClothesNotesCount();
        long a ;
        for( a = 1 ; a < i ; a++ ){
            ClothesNote admin_clothes = databaseHelper.getClothesNote(a);
            list1.add(admin_clothes);

         }
    }

}