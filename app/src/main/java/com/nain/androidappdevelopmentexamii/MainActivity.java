package com.nain.androidappdevelopmentexamii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.nain.androidappdevelopmentexamii.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.btnSubmit.setOnClickListener(v -> {

            String username = binding.etUserName.getText().toString();
            String etPassword = binding.etPassword.getText().toString();
            if (username.equals("batman") && etPassword.equals("Joker") || username.equals("catwoman") && etPassword.equals("Joker")) {
                binding.etError.setText("");

                Intent i = new Intent(MainActivity.this, SecondActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("userName", username);
                i.putExtras(bundle);
                startActivity(i);
                finish();

            } else {

                binding.etError.setText(getString(R.string.error_messages, username));
            }


        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}