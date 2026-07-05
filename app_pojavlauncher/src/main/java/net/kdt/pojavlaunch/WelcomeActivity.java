package net.kdt.pojavlaunch;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        findViewById(R.id.button_get_started).setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });

        findViewById(R.id.button_terms).setOnClickListener(v -> {
            startActivity(new Intent(this, TermsActivity.class));
        });

        findViewById(R.id.button_privacy).setOnClickListener(v -> {
            startActivity(new Intent(this, PrivacyActivity.class));
        });
    }
}

