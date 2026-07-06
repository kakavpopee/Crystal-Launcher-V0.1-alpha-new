package net.kdt.pojavlaunch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.greecroafto.crystal.R;

import net.kdt.pojavlaunch.extra.ExtraConstants;
import net.kdt.pojavlaunch.extra.ExtraCore;
import android.content.Intent;

public class AccountManagerActivity extends Activity {

    @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_account_manager);

    Button addAccount = findViewById(R.id.button_add_account);

    addAccount.setOnClickListener(v -> {

        LauncherActivity.OPEN_LOGIN_AFTER_START = true;

        Intent intent = new Intent(this, LauncherActivity.class);

        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        startActivity(intent);

        finish();

    });
}

}
