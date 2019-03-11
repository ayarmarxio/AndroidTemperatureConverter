package com.example.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button convert;
    RadioGroup tempOptions;
    EditText input;
    RadioButton radio_celsius;
    RadioButton radio_fahren;
    String celsiusValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.textView);
        tempOptions = findViewById(R.id.radioGroup2);
        input = findViewById(R.id.editText);
        radio_celsius = findViewById(R.id.radio_celsius);
        radio_fahren = findViewById(R.id.radio_fahren);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        Float inputValue = Float.parseFloat(input.getText().toString());

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_celsius:
                if (checked) {
                    Float celsiusValue = (inputValue * 9 / 5) + 32;
                    String celsiusResult = celsiusValue.toString();
                    result.setText(celsiusResult);
                    break;
                }
            case R.id.radio_fahren:
                if (checked) {
                    Float fahrenValue = ((inputValue -32) * 5)/9;
                    String fahrenResult = fahrenValue.toString();
                    result.setText(fahrenResult);
                    break;
                }
        }
    }
}