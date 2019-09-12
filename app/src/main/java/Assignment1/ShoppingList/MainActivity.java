package Assignment1.ShoppingList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    EditText item;
    TextView textView;
    EditText editText;
    Button save;
    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item = findViewById(R.id.id_editText_1);
        save = findViewById(R.id.id_button_1);
        done = findViewById(R.id.id_button_2);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(item.length() < 3 || item.length() > 15) {
                    Toast.makeText(MainActivity.this, R.string.WRONG, Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this, R.string.RIGHT, Toast.LENGTH_LONG).show();
                }
            }
            });

        public void sendText(View view) {
            Intent intent = new Intent((this, ShowListActivity.class))
            EditText editText = (EditText) findViewById(R.id.id_editText_1);
            String message = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }



    }

}
