package cl.fernando.individual_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import cl.fernando.individual_12.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnFood.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent activityMenu = new Intent(getBaseContext(), MenuActivity.class);
                startActivity(activityMenu);
            }

        });
    }
}