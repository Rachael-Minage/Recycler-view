package dev.minage.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.minage.fibonacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numlist = fibonnaci(100)
        println(numlist)
        binding.rvRecyler.layoutManager = LinearLayoutManager(this)
        binding.rvRecyler.adapter= NumberItemAdapter(numlist)


    }



    fun fibonnaci(size: Int): List<Int> {
        var list = ArrayList<Int>()
        var first = 1
        var second = 0
        var sum = 1
        while (sum <= size) {
            print(first)
            val next = first + second
            first = second
            second = next
            sum++
            list += next
        }
        return list
    }

}

