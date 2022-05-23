package daniil.kobiyskoy.admincrm.common

import daniil.kobiyskoy.admincrm.client.RetrofitClient
import daniil.kobiyskoy.admincrm.inter.RetrofitServices

object Common {
    private val BASE_URL = "https://mykvm.ru/danya-server/"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}