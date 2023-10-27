package com.alexander.daggerhilt.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}