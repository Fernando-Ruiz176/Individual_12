package cl.fernando.individual_12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import cl.fernando.individual_12.databinding.ActivityMenuBinding;

public class MenuActivity extends AppCompatActivity {

    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        List<String> listaDeMenu = new ArrayList<>();
        listaDeMenu.add("Puré de calabacín");
        listaDeMenu.add("Tortilla de patatas");
        listaDeMenu.add("Albóndigas de pollo");
        listaDeMenu.add("Ensalada de tomate");
        listaDeMenu.add("Leche, pan con aceite y fruta");
        listaDeMenu.add("Lentejas vegetales");
        listaDeMenu.add("Croquetas de atún");
        listaDeMenu.add("Menestra de verduras");
        listaDeMenu.add("Sardinas al horno");
        listaDeMenu.add("Leche, pan con aceite y fruta");
        listaDeMenu.add("Macarrones con verduras");
        listaDeMenu.add("Pollo a la cerveza");
        listaDeMenu.add("Sopa juliana");
        listaDeMenu.add("Corvina al ajillo");
        listaDeMenu.add("Leche, pan con aceite y fruta");

        listaDeMenu.add("Empanadas de camarones");
        listaDeMenu.add("Empanada Napolitana");
        listaDeMenu.add("Cremas de langostinos");


        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaDeMenu );
        binding.ListViewMenu.setAdapter(adapter);
    }
}