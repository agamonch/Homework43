package kg.unicapp.home43


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       setup()


    }

    private fun setup() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val button = findViewById<Button>(R.id.button)
        val edit = findViewById<EditText>(R.id.editText)
        val data = mutableListOf<String>()
        var item: List<String>
        button.setOnClickListener{
            if (edit.text.isNotEmpty()){
                val text = edit.text
                data.add(text.toString())
                item = data
                recyclerView.adapter = Item(item)
            }
            else Toast.makeText(this, "EditText is EMPTY", Toast.LENGTH_SHORT).show()


        }
    }


}
