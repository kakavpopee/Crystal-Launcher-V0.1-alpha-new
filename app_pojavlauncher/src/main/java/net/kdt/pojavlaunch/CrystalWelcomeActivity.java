package net.kdt.pojavlaunch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.content.Intent;
import com.greecroafto.crystal.R;

public class CrystalWelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TODO: Replace with your welcome screen layout
        setContentView(R.layout.activity_crystal_welcome);

        // Show welcome screen for 2 seconds
	Button continueButton = findViewById(R.id.button_continue);
Button termsButton = findViewById(R.id.button_terms);
Button privacyButton = findViewById(R.id.button_privacy);

continueButton.setOnClickListener(v -> {
    startActivity(new Intent(this, TestStorageActivity.class));
    finish();
	});

termsButton.setOnClickListener(v -> {
    startActivity(new Intent(this, TermsActivity.class));
	});

privacyButton.setOnClickListener(v -> {
    // We'll create PrivacyActivity next.
	});
    }
}
