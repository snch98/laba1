package com.example.laba1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView laba1 = findViewById(R.id.TextViewLaba1);
        Button TextChange = findViewById(R.id.TextChangeButton);

        TextChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                laba1.setText("New text is created");
            }
        });

        Button TextColorChange = findViewById(R.id.TextColorChangeButton);
        TextColorChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                laba1.setTextColor(getResources().getColor(R.color.black));
            }
        });

    }
}