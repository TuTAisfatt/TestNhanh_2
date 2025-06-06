package com.example.testnhanh;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class LuckyNumberActivity extends AppCompatActivity {
    TextView textViewLuckyNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lucky_number);

        textViewLuckyNumber = findViewById(R.id.txtYourNumber);

        int luckyNumber = new Random().nextInt(999) + 1; // 1 to 999
        textViewLuckyNumber.setText(String.valueOf(luckyNumber));
    }
}
