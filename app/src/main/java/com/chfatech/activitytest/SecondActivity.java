package com.chfatech.activitytest;

import android.content.Context;
import android.content.Intent;

public class SecondActivity extends BaseActivity{
/**
 * 构建一个actionStart方法，完成Intent的构建，所有SecondActivity的数据都是
 * 通过actionStart方法的参数传递过来，然后把他们存储到Inten中
 * 最后调用startActivity方法启动SecondActivity
 */
    public static void actionStart(Context context,String data1,String data2){
        Intent intent = new Intent(context,SecondActivity.class);
        intent.putExtra("param1",data1);
        intent.putExtra("param2",data2);
        context.startActivity(intent);
    }
}
