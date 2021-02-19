 package com.appalber.firststepsrecyclersview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Contacto c1 = new Contacto("Javier", "javier@jv.es", 22);
        Contacto c2 = new Contacto("Jaime", "jimbeiro@jv.es", 25);
        Contacto c3 = new Contacto("Carla", "ja546321fdr@jv.es", 27);
        Contacto c4 = new Contacto("Josu", "ja9pphj56r@jv.es", 22);
        Contacto c5 = new Contacto("Jorchi", "ja123456vier@jv.es", 29);
        Contacto c6 = new Contacto("Jorge", "javtyuiier@jv.es", 20);
        Contacto c7 = new Contacto("Yaya", "ja999r@jv.es", 23);
        Contacto c8 = new Contacto("Balarrasa", "jr@jv.es", 24);

        ArrayList<Contacto> miscontactos = new ArrayList<>();

        miscontactos.add(c1);
        miscontactos.add(c2);
        miscontactos.add(c3);
        miscontactos.add(c4);
        miscontactos.add(c5);
        miscontactos.add(c6);
        miscontactos.add(c7);
        miscontactos.add(c8);

        RecyclerView recy = findViewById(R.id.mi_recicler);
        RecyclerView.LayoutManager gestor = new LinearLayoutManager(this);
        MiAdaptador adaptador = new MiAdaptador(miscontactos);
        recy.setLayoutManager(gestor);
        recy.setAdapter(adaptador);

    }
}