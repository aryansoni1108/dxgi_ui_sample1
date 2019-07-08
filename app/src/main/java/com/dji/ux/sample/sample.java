package com.dji.ux.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;


public class sample extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{
    ImageView option_menu_btx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        option_menu_btx = findViewById(R.id.option_menu);

        option_menu_btx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(sample.this, view);
                popup.setOnMenuItemClickListener(sample.this);
                popup.inflate(R.menu.primary_activity_menu);
                popup.show();
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.automated_menu_item:
                Toast.makeText(sample.this,"Automated",Toast.LENGTH_SHORT).show();
                break;
            case R.id.manual_menu_item:
                Toast.makeText(sample.this,"Manual",Toast.LENGTH_SHORT).show();
                break;
            case R.id.extensions_menu_item:
                Toast.makeText(sample.this,"Extenstions",Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
}
