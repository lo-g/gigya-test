package it.log.gigyatest

import android.app.Application
import com.gigya.android.sdk.Gigya
import com.gigya.android.sdk.GigyaLogger

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()

        GigyaLogger.setDebugMode(BuildConfig.DEBUG)
        Gigya.setApplication(this)
        Gigya.secureActivityWindow(BuildConfig.DEBUG.not())
        val gigyaInstance = Gigya.getInstance()
        gigyaInstance.init(
            "replace-with-your-api-key",
            "replace-with-your-domain"
            )
    }
}