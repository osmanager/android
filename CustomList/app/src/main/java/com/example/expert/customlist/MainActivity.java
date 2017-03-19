package com.example.expert.customlist;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ListViewAdapter adapter;

        adapter = new ListViewAdapter();
        ListView listview = (ListView)findViewById(R.id.logListView);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_account_circle_black_24dp), "Box", "Account Box");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_android_black_24dp), "Box2", "Account Box2");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_build_black_24dp), "Box3", "Account Box3");
    }
}
