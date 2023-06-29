package cl.fernando.individual_12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.fernando.individual_12.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding; // Atributo

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}