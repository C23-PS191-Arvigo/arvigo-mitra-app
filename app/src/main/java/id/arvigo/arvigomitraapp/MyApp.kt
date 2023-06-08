package id.arvigo.arvigomitraapp

import android.app.Application
import id.arvigo.arvigomitraapp.di.dataPreferencesModule
import id.arvigo.arvigomitraapp.di.networkModule
import id.arvigo.arvigomitraapp.di.viewModelModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        GlobalContext.startKoin {
            androidContext(this@MyApp)
            modules(networkModule, dataPreferencesModule, viewModelModules)
        }
    }

}