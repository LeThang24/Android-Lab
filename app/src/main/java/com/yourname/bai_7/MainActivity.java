package com.yourname.bai_7;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerCountry;
    Button btnSelect;

    String[] countries = {"Việt Nam", "Nhật Bản", "Hàn Quốc", "Mỹ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerCountry = findViewById(R.id.spinnerCountry);
        btnSelect = findViewById(R.id.btnSelect);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                countries
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCountry.setAdapter(adapter);

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String country = spinnerCountry.getSelectedItem().toString();

                Toast.makeText(MainActivity.this,
                        "Quốc gia đã chọn: " + country,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}