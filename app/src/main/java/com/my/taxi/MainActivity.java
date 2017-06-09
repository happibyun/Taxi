package com.my.taxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private RecyclerView addressRView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadAddressList();
    }

    private static RecyclerViewAdapter addressAdapter;
    final static ArrayList<String> address_list = new ArrayList<String>(Arrays.asList(new String[]{
        "서울시 구로구 구로동", "서울시 동작구 상도동", "서울시 마포구 마포동"
    }));

    private void loadAddressList() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        addressRView = (RecyclerView) findViewById(R.id.addressRView);
        addressRView.setHasFixedSize(true);
        addressRView.setLayoutManager(linearLayoutManager);
        addressAdapter = new RecyclerViewAdapter(address_list);
        addressRView.setAdapter(addressAdapter);
    }
}
