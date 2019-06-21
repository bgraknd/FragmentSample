package com.example.fragmentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity(), DetailFragment.OnFragmentInteractionListener {


    val age = 26

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contentFragment = ContentFragment()
        val bottomFragment = BottomFragment.newInstance()

        supportFragmentManager.beginTransaction().apply {
            add(R.id.frmContentFragment, contentFragment)
            add(R.id.frmBottomFragment, bottomFragment)
        }.commit()

    }
    override fun onFragmentInteraction(data: String) {

        Toast.makeText(this, data, Toast.LENGTH_SHORT).show()
    }
}
