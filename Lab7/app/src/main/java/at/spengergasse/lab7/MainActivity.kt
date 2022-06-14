package at.spengergasse.lab7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var btn: Button? = null
    var result = 0.0
    private var a: EditText? = null
    private var b: EditText? = null
    private var Ergebnis: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn)
        a = findViewById(R.id.a)
        b = findViewById(R.id.b)
        Ergebnis = findViewById(R.id.Ergebnis)



        with(btn) { this?.setOnClickListener(View.OnClickListener { berrechene() }) }

    }
	fun berrechene() {
			try {
				result =
					java.lang.Double.valueOf(a!!.text.toString()) * java.lang.Double.valueOf(b!!.text.toString()) * 0.5
				Ergebnis!!.text = result.toString()
			} catch (e: Exception) {
				Ergebnis!!.text = "Error"
			}
		}


}