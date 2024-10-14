package com.mysoft.tp1relaciones;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {
    private int contadorSinViewModel = 0;
    private ContadorViewModel contadorViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorViewModel = new ViewModelProvider(this).get(ContadorViewModel.class); // Instancia del ViewModel

        TextView tvResSin = findViewById(R.id.tvResSin);
        TextView tvResCon = findViewById(R.id.tvResCon);
        Button btIncrementarSin = findViewById(R.id.btIncrementarSin);
        Button btIncrementarCon = findViewById(R.id.btIncrementarCon);


        btIncrementarSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorSinViewModel++;
                tvResSin.setText("Incremento sin ViewModel: " + contadorSinViewModel);
            }
        });


        btIncrementarCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorViewModel.incrementar();
                tvResCon.setText("Incremento con ViewModel: " + contadorViewModel.getContador());
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG1", "Activity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG1", "Activity onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG1", "Activity onDestroy");
    }
}