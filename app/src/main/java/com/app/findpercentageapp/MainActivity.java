package com.app.findpercentageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit_percent, edit_number;
    Button btn_resutl;
    TextView result;
    float number, percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_percent = findViewById(R.id.edit_percent);
        edit_number = findViewById(R.id.edit_number);
        btn_resutl = findViewById(R.id.btn_resutl);
        result = findViewById(R.id.result);

        btn_resutl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //converting whatever the number in edit_percent to float bcz edit text containnumber in String
                float percent = Float.parseFloat(edit_percent.getText().toString()) / 100;

                //converting whatever the number in edit_number to float bcz edit text containnumber in String
                float number = percent * Float.parseFloat(edit_number.getText().toString());

                //Converting float to string to set data in result(Textview)
                result.setText(Float.toString(number));


            }
        });
    }
}
