package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private String[] trivias =
            {
                    "zero",
                    "The Caesar salad was invented in 1924.",
                    "The sun is about 400 times larger than the moon.",
                    "Honey doesn't spoil.",
                    "Somewhere between 50% and 80% of earth's living organisms are in the ocean.",
                    "Competitive art used to be an Olympic sport.",
                    "Google Images was created after Jennifer Lopez wore the green dress at the 2000 Grammys.",
                    "Lemons float in water, but limes sink.",
                    "People once ate arsenic to improve their skin.",
                    "There are eight NFL teams currently without cheerleaders.",
                    "The Pope can’t be an organ donor."
            };
    private int btnIndex = 0;

    TextView txtView;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txtView = findViewById(R.id.textView);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIndex++;

                btn.setText("NEXT");

                txtView.setText(trivias[btnIndex]);

                if (btnIndex == trivias.length - 1)

                    btn.setEnabled(false);

            }
        });
    }
}
