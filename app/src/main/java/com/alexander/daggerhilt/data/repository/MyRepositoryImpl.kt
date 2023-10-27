package com.alexander.daggerhilt.data.repository

import com.alexander.daggerhilt.data.remote.MyAPI
import com.alexander.daggerhilt.domain.repository.MyRepository

class MyRepositoryImpl(api: MyAPI): MyRepository {
    private var api: MyAPI;

    init {
        this.api = api
    }

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}