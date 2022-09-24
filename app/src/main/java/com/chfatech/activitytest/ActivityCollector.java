package com.chfatech.activitytest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 活动管理器
 * */
public class ActivityCollector {
    // list暂存活动
    public static List<Activity> activities = new ArrayList<>();
    // 添加活动的方法
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    // 从list中移除活动
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    // 将list中存储的活动全部销毁掉
    public static void finishAll(){
        for (Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
        // 销毁所有活动
        activities.clear();
        // 杀掉当前进程,传入进程ID，只能杀掉当前程序的进程
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
