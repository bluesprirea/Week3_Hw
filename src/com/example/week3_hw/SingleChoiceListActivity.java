package com.example.week3_hw;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SingleChoiceListActivity extends ListActivity {
        
        private ArrayAdapter<String> arrayAdapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
//                setContentView(R.layout.activity_single_choice_list);
                
                arrayAdapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_single_choice, Data.titles);
                setListAdapter(arrayAdapter);
                getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
                
        }

}