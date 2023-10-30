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
import javax.inject.Named
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
    fun provideMyRepository(
        api: MyAPI,
        app: Application,
        @Named("hello1") hello1: String
    ): MyRepository {
        return MyRepositoryImpl(api, app, hello1)
    }

    @Provides
    @Singleton
    @Named("hello1")
    fun provideString1() = "Hello 1"

    @Provides
    @Singleton
    @Named("hello2")
    fun provideString2() = "Hello 2"
}