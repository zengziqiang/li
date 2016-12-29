package com.hqmc.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.hqmc.mylibrarytest.MainActivity_Library;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_jump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tv_jump = (TextView) findViewById(R.id.tv_jump);
        tv_jump.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_jump:
                startActivity(new Intent(MainActivity.this, MainActivity_Library.class));
                break;
            default:

                break;
        }
    }
}
