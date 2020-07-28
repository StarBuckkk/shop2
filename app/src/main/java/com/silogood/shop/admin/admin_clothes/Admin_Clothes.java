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
    private String TAG = "Admin_Clothes";
    private DatabaseHelper mDatabaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_clothes);
        mDatabaseHelper= new DatabaseHelper(this);
       init_view();

    }

    private void init_view(){

        mListView = (ListView)findViewById(R.id.listview);
        mTextView = (TextView)findViewById(R.id.selected_item_textview);

        ArrayList<ClothesNote> list1 = new ArrayList<ClothesNote>();

        NotesAdapter adapter1 = new NotesAdapter(this,R.layout.custom_listview_item,list1);

        mListView.setAdapter(adapter1);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view, int position, long id) {

                ClothesNote selected_item = (ClothesNote)adapterView.getItemAtPosition(position);

                mTextView.setText(selected_item.getName());
                ClothesNote cn = new ClothesNote(selected_item.getId(),selected_item.getName(),selected_item.getCode(),selected_item.getBqt()-1,selected_item.getTimestamp());
                mDatabaseHelper.updateClothesNote(cn);

            }
        });



        int i = mDatabaseHelper.getClothesNotesCount();
        long index ;
        for( index = 1 ; index < i ; index++ ){
            ClothesNote admin_clothes = mDatabaseHelper.getClothesNote(index);
            list1.add(admin_clothes);

        }
    }

}
