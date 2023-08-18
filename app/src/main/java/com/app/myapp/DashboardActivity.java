package com.app.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

public class DashboardActivity extends AppCompatActivity {
    MaterialToolbar back;
    TextView tvSchemeBilling, tvResetBill;
    ImageView ivAddBulk, ivAdministration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drshbord);
        back = findViewById(R.id.back);
        tvResetBill = findViewById(R.id.tvResetBill);
        tvSchemeBilling = findViewById(R.id.tvSchemeBilling);
        ivAdministration = findViewById(R.id.ivAdministration);
        ivAddBulk = findViewById(R.id.ivAddBulk);
        back.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, MenuActivity.class));

            }
        });
        tvResetBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, ResetBillNoActivity.class));

            }
        });
        tvSchemeBilling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, SchemeActivity.class));

            }
        });
        ivAdministration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, AdministrationActivity.class));

            }
        });
        ivAddBulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, AddBulkActivity.class));

            }
        });
    }
}