package com.gannett.android.candidate_assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gannett.android.candidate_assessment.feature.books.BookListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, BookListFragment.newInstance())
            .commitNow()
    }
}
