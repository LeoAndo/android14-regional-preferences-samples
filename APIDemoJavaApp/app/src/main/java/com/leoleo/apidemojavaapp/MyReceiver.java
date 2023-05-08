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
        final StringBuilder message = new StringBuilder();
        message.append("onReceive: packageName= ").append(packageName).append("\n");
        message.append("localeList = ").append(localeList).append("\n");
        message.append("getHourCycle = ").append(LocalePreferences.getHourCycle()).append("\n");
        message.append("getCalendarType = ").append(LocalePreferences.getCalendarType()).append("\n");
        message.append("getTemperatureUnit = ").append(LocalePreferences.getTemperatureUnit()).append("\n");
        message.append("getFirstDayOfWeek = ").append(LocalePreferences.getFirstDayOfWeek()).append("\n");
        Log.d("TAG", message.toString());
    }
}