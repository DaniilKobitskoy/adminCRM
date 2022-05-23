package daniil.kobiyskoy.crmadmin

import android.os.Bundle
import android.text.Editable
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import daniil.kobiyskoy.crmadmin.`interface`.RetrofitServices
import daniil.kobiyskoy.crmadmin.common.Common
import daniil.kobiyskoy.crmadmin.data.auth
import daniil.kobiyskoy.crmadmin.databinding.AutorizationMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Autorization(login: Editable, password: Editable) : Fragment() {

private var _binding: AutorizationMainBinding? = null
    private val binding get() = _binding!!
    lateinit var mService: RetrofitServices
    var login = binding.login.text
    var password = binding.editTextTextPassword.text
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

            callserver1()
        }

    }

    private fun callserver1() {
        mService.autorization(login = login.toString(), password = password.toString()).enqueue(object : Callback<MutableList<auth>> {
            override fun onFailure(call: Call<MutableList<auth>>, t: Throwable) {

            }

            override fun onResponse(call: Call<MutableList<auth>>, response: Response<MutableList<auth>>) {
Log.d("Log", "$login")
            }
        })
    }

}
