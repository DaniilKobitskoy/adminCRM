package daniil.kobiyskoy.crmadmin.common

import daniil.kobiyskoy.crmadmin.`interface`.RetrofitServices
import daniil.kobiyskoy.crmadmin.client.RetrofitClient

object Common {
    private val BASE_URL = "https://mykvm.ru/danya-server/"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}