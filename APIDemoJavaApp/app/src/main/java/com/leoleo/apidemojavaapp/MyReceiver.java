package com.leoleo.apidemojavaapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.LocaleList;
import android.util.Log;

import androidx.core.text.util.LocalePreferences;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        final String packageName = intent.getStringExtra(Intent.EXTRA_PACKAGE_NAME);
        final LocaleList localeList = intent.getParcelableExtra(Intent.EXTRA_LOCALE_LIST, LocaleList.class);
        Log.d("TAG", "onReceive: packageName= " + packageName);
        Log.d("TAG", "onReceive: localeList= " + localeList);
        Log.d("TAG", "onReceive: localeList= " + LocalePreferences.getTemperatureUnit());
        Log.d("TAG", "onReceive: localeList= " + LocalePreferences.getFirstDayOfWeek());
    }
}