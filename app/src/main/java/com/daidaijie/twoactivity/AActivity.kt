package com.daidaijie.twoactivity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log

import kotlinx.android.synthetic.main.activity_a.*

class AActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        setSupportActionBar(toolbar)

        Log.d("SingleInstance","AActivity onCreate")

        fab.setOnClickListener { view ->
            startActivity(BActivity.newIntent(this))
        }
    }

    companion object {
        @JvmStatic
        fun newIntent(context: Context) = Intent(context, AActivity::class.java)
    }

}
