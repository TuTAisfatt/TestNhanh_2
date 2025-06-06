package com.example.testnhanh;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editTextName;
    Button buttonWish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.txtEnterName);
        buttonWish = findViewById(R.id.btnWishMeLuck);

        buttonWish.setOnClickListener(v -> {
            String name = editTextName.getText().toString();
            Intent intent = new Intent(MainActivity.this, LuckyNumberActivity.class);
            intent.putExtra("userName", name);
            startActivity(intent);
        });
    }
}
