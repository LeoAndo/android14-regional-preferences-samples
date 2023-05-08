package com.leoleo.apidemokotlinapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.LocaleList
import android.util.Log
import androidx.core.text.util.LocalePreferences

class MyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val packageName = intent.getStringExtra(Intent.EXTRA_PACKAGE_NAME)
        val localeList = intent.getParcelableExtra(Intent.EXTRA_LOCALE_LIST, LocaleList::class.java)
        val message = """
            onReceive: packageName= $packageName
            localeList= $localeList
            getHourCycle= ${LocalePreferences.getHourCycle()}
            getCalendarType= ${LocalePreferences.getCalendarType()}
            getCalendarType= ${LocalePreferences.getCalendarType()}
            getTemperatureUnit= ${LocalePreferences.getTemperatureUnit()}
            getFirstDayOfWeek= ${LocalePreferences.getFirstDayOfWeek()}
        """.trimIndent()

        Log.d("TAG", message)
    }
}