package com.cm.sms.receivers;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import com.cm.sms.TextBeeUtils;
import com.cm.sms.services.StickyNotificationService;

public class BootCompletedReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
//            if(TextBeeUtils.isPermissionGranted(context, Manifest.permission.RECEIVE_SMS)){
//                TextBeeUtils.startStickyNotificationService(context);
//            }
        }
    }
}
