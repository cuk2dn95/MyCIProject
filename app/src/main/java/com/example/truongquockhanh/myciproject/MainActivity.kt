package com.example.truongquockhanh.myciproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.crashlytics.android.Crashlytics
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import com.microsoft.appcenter.distribute.Distribute
import io.fabric.sdk.android.Fabric




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(
            application, BuildConfig.HOCKEY_APP_KEY,
            Analytics::class.java,
            Crashes::class.java,
            Distribute::class.java
        )

        Fabric.with(this, Crashlytics())
    }
}
