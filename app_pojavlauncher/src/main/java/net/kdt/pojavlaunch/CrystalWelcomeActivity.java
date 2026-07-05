package net.kdt.pojavlaunch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.content.Intent;
import com.greecroafto.crystal.R;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class CrystalWelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TODO: Replace with your welcome screen layout
        setContentView(R.layout.activity_crystal_welcome);
Animation logoAnim =
        AnimationUtils.loadAnimation(this, R.anim.logo_intro);

Animation titleAnim =
        AnimationUtils.loadAnimation(this, R.anim.title_intro);

Animation buttonAnim =
        AnimationUtils.loadAnimation(this, R.anim.button_intro);

ImageView logo = findViewById(R.id.logo);

TextView title = findViewById(R.id.title);

TextView version = findViewById(R.id.version);

Button continueButton = findViewById(R.id.button_continue);

logo.startAnimation(logoAnim);

title.startAnimation(titleAnim);

version.startAnimation(titleAnim);

continueButton.startAnimation(buttonAnim);

        // idek what this is  for
TextView termsButton = findViewById(R.id.button_terms);
TextView privacyButton = findViewById(R.id.button_privacy);

continueButton.setOnClickListener(v -> {
    startActivity(new Intent(this, TestStorageActivity.class));
    finish();
	});

termsButton.setOnClickListener(v -> {
    startActivity(new Intent(this, TermsActivity.class));
	});

privacyButton.setOnClickListener(v -> {
    startActivity(new Intent(this, CrystalPrivacyActivity.class));
	});
    }
}
