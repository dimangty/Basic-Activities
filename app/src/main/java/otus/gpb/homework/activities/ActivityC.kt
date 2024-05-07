package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var button: Button = findViewById(R.id.openA_button)
        button.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        button = findViewById(R.id.openD_button)
        button.setOnClickListener {
            finishAffinity()
            val intent= Intent(this, ActivityD::class.java)
            startActivity(intent)
        }

        button = findViewById(R.id.closeC_Button)
        button.setOnClickListener {
            finish()
        }

        button = findViewById(R.id.closeStack_Button)
        button.setOnClickListener {
            finishAffinity()
        }
    }
}