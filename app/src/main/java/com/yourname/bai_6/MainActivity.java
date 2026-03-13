package com.yourname.bai_6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox cbSach, cbNhac, cbDuLich, cbTheThao;
    Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbSach = findViewById(R.id.cbSach);
        cbNhac = findViewById(R.id.cbNhac);
        cbDuLich = findViewById(R.id.cbDuLich);
        cbTheThao = findViewById(R.id.cbTheThao);
        btnResult = findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String result = "Sở thích:\n";

                if(cbSach.isChecked()){
                    result += "- Đọc sách\n";
                }

                if(cbNhac.isChecked()){
                    result += "- Nghe nhạc\n";
                }

                if(cbDuLich.isChecked()){
                    result += "- Du lịch\n";
                }

                if(cbTheThao.isChecked()){
                    result += "- Chơi thể thao\n";
                }

                Toast.makeText(MainActivity.this,
                        result,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}