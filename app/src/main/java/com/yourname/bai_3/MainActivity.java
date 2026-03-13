package com.yourname.bai_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextA, editTextB;
    Button buttonAdd;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các view
        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        buttonAdd = findViewById(R.id.buttonAdd);
        textViewResult = findViewById(R.id.textViewResult);

        // Xử lý sự kiện button
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy giá trị từ EditText
                String strA = editTextA.getText().toString();
                String strB = editTextB.getText().toString();

                if(strA.isEmpty() || strB.isEmpty()){
                    textViewResult.setText("Vui lòng nhập cả A và B");
                    return;
                }

                // Chuyển sang số nguyên
                int a = Integer.parseInt(strA);
                int b = Integer.parseInt(strB);

                // Tính tổng
                int sum = a + b;

                // Hiển thị kết quả
                textViewResult.setText("Kết quả: " + sum);
            }
        });
    }
}