package daniil.kobiyskoy.admincrm.`interface`

import daniil.kobiyskoy.admincrm.data.autorizhation_data
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitServices {

    @GET("auth/")
    fun autorization(
        @Query ("login") login: String,
        @Query ("password") password: String

    ): Call<MutableList<autorizhation_data>>
}