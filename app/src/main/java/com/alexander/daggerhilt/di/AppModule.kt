package com.alexander.daggerhilt.di

import android.app.Application
import com.alexander.daggerhilt.data.remote.MyAPI
import com.alexander.daggerhilt.data.repository.MyRepositoryImpl
import com.alexander.daggerhilt.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMyAPI(): MyAPI {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build().create(MyAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideMyRepository(api: MyAPI, app: Application): MyRepository {
        return MyRepositoryImpl(api, app)
    }
}