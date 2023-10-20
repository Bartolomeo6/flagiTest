package pl.zs10.testflagi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPanstwo;
    private Button buttonSprawdz;
    private String panstwo;
    private RadioGroup radioGrupa1;
    private RadioButton radioB1_1;
    private TextView textViewKolor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPanstwo = findViewById(R.id.editTextTextPersonName);
        buttonSprawdz = findViewById(R.id.button);
        radioGrupa1 = findViewById(R.id.radioGroupKolor1);
        radioB1_1 = findViewById(R.id.radioButton);
        textViewKolor1 = findViewById(R.id.textViewKolor1);

        buttonSprawdz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //odczytamy edit-text i do toast

                        panstwo = editTextPanstwo.getText().toString();
                        Toast.makeText(MainActivity.this, panstwo, Toast.LENGTH_SHORT).show();

                        if(radioB1_1.isChecked()) {
                            Toast.makeText(MainActivity.this, "wybrano kolor czerwony", Toast.LENGTH_SHORT).show();
                            textViewKolor1.setBackgroundColor(Color.RED);
                        }

                        int idRadio = radioGrupa1.getCheckedRadioButtonId();

                        if(idRadio == R.id.radioButton2){
                            Toast.makeText(MainActivity.this, "wybrano biały", Toast.LENGTH_SHORT).show();
                            textViewKolor1.setBackgroundColor(Color.WHITE);
                        }
                    }
                }
        );
    }

}