package com.mysoft.tp1relaciones;

import androidx.lifecycle.ViewModel;

public class ContadorViewModel extends ViewModel {
    private int contador = 0;

    public void incrementar() {
        contador++;
    }

    public int getContador() {
        return contador;
    }
}
