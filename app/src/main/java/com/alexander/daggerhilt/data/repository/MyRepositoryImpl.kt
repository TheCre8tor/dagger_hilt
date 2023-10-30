package com.alexander.daggerhilt.data.repository

import android.app.Application
import android.util.Log
import com.alexander.daggerhilt.R
import com.alexander.daggerhilt.data.remote.MyAPI
import com.alexander.daggerhilt.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyAPI,
    appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        Log.d("APP_NAME", "The app name is: $appName")
    }

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}