package com.xpf.modular_gradle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (BuildConfig.DEBUG) {// 这段逻辑在release环境，就不会执行
            Log.d("TAG", "onCreate: ");
        }

        if (BuildConfig.isRelease) {
            Log.d(TAG, "当前为: 集成化模式，线上/正式环境，除app可运行，其它子模块扩扩扩都是Android Library");
        } else {
            Log.d(TAG, "当前为: 组件化模式，测试/开发环境，所有模块可独立运行");
        }

    }
}
