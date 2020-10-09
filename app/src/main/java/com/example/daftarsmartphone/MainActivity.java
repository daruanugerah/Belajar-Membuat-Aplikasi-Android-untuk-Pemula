package com.example.daftarsmartphone;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvHape;
    private ArrayList<hape> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHape = findViewById(R.id.rv_hp);
        rvHape.setHasFixedSize(true);

        list.addAll(datahape.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvHape.setLayoutManager(new LinearLayoutManager(this));
        ListHapeAdapter listHapeAdapter = new ListHapeAdapter(MainActivity.this,list);
        rvHape.setAdapter(listHapeAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.about:
                Intent intent = new Intent(this, TentangActivity.class);
                this.startActivity(intent);
                break;

            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

}
