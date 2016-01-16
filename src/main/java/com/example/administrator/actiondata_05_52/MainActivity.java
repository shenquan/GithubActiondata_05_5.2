package com.example.administrator.actiondata_05_52;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bn = (Button) findViewById(R.id.bn);
        // 为bn按钮添加一个监听器
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建Intent
                Intent intent = new Intent();
                String data = "http://www.crazyit.org";
                // 根据指定字符串解析出Uri对象
                Uri uri = Uri.parse(data);
                // 为Intent设置Action属性
                intent.setAction(Intent.ACTION_VIEW);
                // 设置Data属性
                intent.setData(uri);
                startActivity(intent);
            }
        });
        Button edit = (Button) findViewById(R.id.edit);
        // 为edit按钮添加一个监听器
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建Intent
                Intent intent = new Intent();
                // 为Intent设置Action属性（动作为：编辑）
                intent.setAction(Intent.ACTION_EDIT);
                String data = "content://com.android.contacts/contacts/1";
                // 根据指定字符串解析出Uri对象
                Uri uri = Uri.parse(data);
                // 设置Data属性
                intent.setData(uri);
                startActivity(intent);
            }
        });
        Button call = (Button) findViewById(R.id.call);
        // 为call按钮添加一个监听器
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建Intent
                Intent intent = new Intent();
                // 为Intent设置Action属性（动作为：拨号）
                intent.setAction(Intent.ACTION_DIAL);
                String data = "tel:13800138000";
                // 根据指定字符串解析出Uri对象
                Uri uri = Uri.parse(data);
                // 设置Data属性
                intent.setData(uri);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
