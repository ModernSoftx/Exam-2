package com.nain.androidappdevelopmentexamii;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.nain.androidappdevelopmentexamii.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Bundle bundle = getIntent().getExtras();
        String userName = bundle.getString("userName");

        binding.tvWelcome.setText(getString(R.string.welcome_messages,userName));


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}