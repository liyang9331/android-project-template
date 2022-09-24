package com.chfatech.activitytest;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity", getClass().getSimpleName());
        // 调用 ActivityCollector的 addActivity 方法，将当前正在创建的活动添加到活动管理器里
        ActivityCollector.addActivity(this);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        // 调用 ActivityCollector的 removeActivity 方法，将一个马上要销毁的活动从活动管理器里移除
        ActivityCollector.removeActivity(this);
    }
}
