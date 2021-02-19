package com.appalber.firststepsrecyclersview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.MiContenedorDeVistas> {

    private ArrayList<Contacto> lista_contactos;

    public MiAdaptador(ArrayList<Contacto> lista_contactos) {
        this.lista_contactos = lista_contactos;
    }

    @NonNull
    @Override
    public MiContenedorDeVistas  onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.vista_contacto, parent, false);
        TextView tv_nombre = vista.findViewById(R.id.tx_nombre);
        TextView tv_email = vista.findViewById(R.id.tv_email);
        TextView tv_edad = vista.findViewById(R.id.tv_edad);
        MiContenedorDeVistas micontenedor = new MiContenedorDeVistas(vista);
        Log.d("Contenedor", "Creando contenedor de vistas");
        return micontenedor;
    }

    @Override
    public void onBindViewHolder(@NonNull MiContenedorDeVistas holder, int position) {
    Contacto c = lista_contactos.get(position);
    holder.tv_nombre.setText(c.getNombre());
    holder.tv_edad.setText(String.valueOf(c.getEdad()));
    holder.tv_email.setText(c.getEmail());
    Log.d("Contenedor", "vinculando posición "+position);
    }

    @Override
    public int getItemCount() {
        return lista_contactos.size();
    }

    public static class MiContenedorDeVistas extends RecyclerView.ViewHolder{
        public TextView tv_nombre, tv_edad, tv_email;

        public MiContenedorDeVistas(View vista) {
            super(vista);
            this.tv_nombre = vista.findViewById(R.id.tx_nombre);
            this.tv_edad = vista.findViewById(R.id.tv_edad);
            this.tv_email = vista.findViewById(R.id.tv_email);
        }
    }
}
