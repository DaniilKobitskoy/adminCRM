package daniil.kobiyskoy.admincrm.inter

import daniil.kobiyskoy.admincrm.Autorization
import daniil.kobiyskoy.admincrm.data.LogPas
import daniil.kobiyskoy.admincrm.data.autorizhation_data
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import java.net.CacheRequest

interface RetrofitServices {

    @POST("auth")
    fun autorization(

        @Body request: LogPas

    ): Call<MutableList<autorizhation_data>>
}