package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import otus.gpb.homework.activities.databinding.ActivityABinding
import otus.gpb.homework.activities.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    private lateinit var binding: ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        binding = ActivityBBinding.inflate(layoutInflater)
        binding.openButtonC.setOnClickListener {
            val intent = Intent().setClass(applicationContext, ActivityC::class.java)
            startActivity(intent)
        }

        val view = binding.root
        setContentView(view)
    }
}