package daniil.kobiyskoy.admincrm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = Autorization()
        makeCurrentFragment(num1)

    }
    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.conteinerFrag, fragment)
            commit()
        }
    public fun goTo(fragment: Fragment, fragmentName:String) {
        val beginTransactionDetailFragment = supportFragmentManager
        beginTransactionDetailFragment.popBackStack(
            fragmentName,
            FragmentManager.POP_BACK_STACK_INCLUSIVE
        )
        beginTransactionDetailFragment.beginTransaction()
            .replace(R.id.conteinerFrag, fragment)
            .addToBackStack(fragmentName)
            .commit()
    }
}