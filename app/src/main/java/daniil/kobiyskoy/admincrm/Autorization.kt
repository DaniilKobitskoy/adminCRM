package daniil.kobiyskoy.admincrm

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import daniil.kobiyskoy.admincrm.client.RetrofitClient
import daniil.kobiyskoy.admincrm.common.Common
import daniil.kobiyskoy.admincrm.data.LogPas
import daniil.kobiyskoy.admincrm.data.autorizhation_data
import daniil.kobiyskoy.admincrm.databinding.AutorizationMainBinding
import daniil.kobiyskoy.admincrm.inter.RetrofitServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Autorization() : Fragment() {
private var _binding: AutorizationMainBinding? = null
    private val binding get() = _binding!!
//    private var _binding: AutorizationMainBinding? = null
//    private val binding get() = _binding!!
    lateinit var mService: RetrofitServices

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
_binding = AutorizationMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        mService = Common.retrofitService
        binding.submitPhone.setOnClickListener {

            var login: String = binding.login.getText().toString()
            var password: String = binding.password.getText().toString()

            callserver1(l = login, p = password)
        }

    }

    private fun callserver1(l: String, p: String) {
        var login: String = l
        Log.d("Login", login)
        var password = p
        Log.d("Password", password)

        mService.autorization(request = LogPas(login = login, password = password)).enqueue(object : Callback<MutableList<autorizhation_data>> {
            override fun onFailure(call: Call<MutableList<autorizhation_data>>, t: Throwable) {
                Log.d("Log_fail", "ошибка")

            }
            override fun onResponse(call: Call<MutableList<autorizhation_data>>, response: Response<MutableList<autorizhation_data>>) {
Log.d("Log", "успешно")

            }
        })
    }



}
