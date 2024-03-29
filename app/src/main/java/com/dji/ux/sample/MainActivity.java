package com.dji.ux.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import dji.ux.widget.BatteryWidget;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    BatteryWidget batteryWidget;
    ImageView menu_btx;
    ImageView settings_btx;
    ImageView ctrl_btx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        batteryWidget=findViewById(R.id.battery_widget);
        batteryWidget.bringToFront();
        settings_btx=findViewById(R.id.settings_img_btx);
        ctrl_btx=findViewById(R.id.ctrl_btx);
        ctrl_btx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(MainActivity.this, view);
                popup.setOnMenuItemClickListener(MainActivity.this);
                popup.inflate(R.menu.ctrl_menu);
                popup.show();
            }
        });
        settings_btx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(MainActivity.this, view);
                popup.setOnMenuItemClickListener(MainActivity.this);
                popup.inflate(R.menu.settings_menu);
                popup.show();
            }
        });
        menu_btx=findViewById(R.id.toolbar_menu);

        menu_btx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(MainActivity.this, view);
                popup.setOnMenuItemClickListener(MainActivity.this);
                popup.inflate(R.menu.primary_activity_menu);
                popup.show();

            }
        });

    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.system1_menu_item:
                //TODO: When system 1 item is selected
                Toast.makeText(MainActivity.this,"System 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.system2_menu_item:
                //TODO: WHen system 2 item is selected
                Toast.makeText(MainActivity.this,"System 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.system3_menu_item:
                //TODO: When system3 is selected
                Toast.makeText(MainActivity.this,"System 3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.system1_save_menu_item:
                //TODO: When system 1 item is selected
                Toast.makeText(MainActivity.this,"System 1 create mission",Toast.LENGTH_SHORT).show();
                break;
            case R.id.system1_create_menu_item:
                //TODO: When system 1 create item is selected
                Toast.makeText(MainActivity.this,"System 1 create mission",Toast.LENGTH_SHORT).show();
                break;
            case R.id.system2_save_menu_item:
                //TODO: WHen system 2 save mission item is selected
                Toast.makeText(MainActivity.this,"System 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.system2_create_menu_item:
                //TODO: When system 2 create mission is selected
                Toast.makeText(MainActivity.this,"System 3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.system3_save_menu_item:
                //TODO: WHen system 3 save mission item is selected
                Toast.makeText(MainActivity.this,"System 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.system3_create_menu_item:
                //TODO: When system 3 create mission is selected
                Toast.makeText(MainActivity.this,"System 3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.checklist_item:
                Toast.makeText(MainActivity.this,"Checklist",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cam_setting_item:
                Toast.makeText(MainActivity.this,"Cam Settings",Toast.LENGTH_SHORT).show();
                break;
            case R.id.monitor_item:
                Toast.makeText(MainActivity.this,"monitor",Toast.LENGTH_SHORT).show();
                break;
            case R.id.send_reports_item:
                Toast.makeText(MainActivity.this,"Send reports",Toast.LENGTH_SHORT).show();
                break;

        }
        return false;
    }
}

