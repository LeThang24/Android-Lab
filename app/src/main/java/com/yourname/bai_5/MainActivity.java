package com.yourname.bai_5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroupGender);
        btnConfirm = findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                if(selectedId == -1){
                    Toast.makeText(MainActivity.this,
                            "Bạn chưa chọn giới tính",
                            Toast.LENGTH_SHORT).show();
                }else{

                    RadioButton radioButton = findViewById(selectedId);
                    String gender = radioButton.getText().toString();

                    Toast.makeText(MainActivity.this,
                            "Giới tính: " + gender,
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}