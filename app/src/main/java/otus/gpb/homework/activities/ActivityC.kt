package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import otus.gpb.homework.activities.databinding.ActivityBBinding
import otus.gpb.homework.activities.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {
    private lateinit var binding: ActivityCBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        binding = ActivityCBinding.inflate(layoutInflater)
        binding.openAButton.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        binding.openDButton.setOnClickListener {
            val intent= Intent(this, ActivityD::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        }

        binding.closeCButton.setOnClickListener {
            finish()
        }

        binding.closeStackButton.setOnClickListener {
            finishAffinity()
        }

        val view = binding.root
        setContentView(view)
    }
}