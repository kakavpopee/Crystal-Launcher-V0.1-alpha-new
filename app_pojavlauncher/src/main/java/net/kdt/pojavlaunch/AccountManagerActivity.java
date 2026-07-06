package net.kdt.pojavlaunch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.greecroafto.crystal.R;

import net.kdt.pojavlaunch.extra.ExtraConstants;
import net.kdt.pojavlaunch.extra.ExtraCore;

public class AccountManagerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_manager);

        Button addAccount = findViewById(R.id.button_add_account);

        addAccount.setOnClickListener(v -> {
            ExtraCore.setValue(ExtraConstants.SELECT_AUTH_METHOD, true);
            finish();
        });
    }
}
