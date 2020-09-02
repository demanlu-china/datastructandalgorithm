package com.demanmath.dataandalgorithm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demanmath.dataandalgorithm.data.linkedlist.LinkedListSolution

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testCode()
    }

    private fun testCode() {
        var iSolutionInterface = LinkedListSolution()
        iSolutionInterface.run()
    }
}