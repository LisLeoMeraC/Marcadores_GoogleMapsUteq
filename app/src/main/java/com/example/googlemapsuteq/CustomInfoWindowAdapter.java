package com.example.googlemapsuteq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {

    private static final String TAG = "CustomInfoWindowAdapter";
    private LayoutInflater inflater;

    public CustomInfoWindowAdapter(LayoutInflater inflater){
        this.inflater = inflater;
    }

    @Override
    public View getInfoContents(final Marker m) {
        //Carga layout personalizado.
        View v = inflater.inflate(R.layout.info_windows, null);
        if(m.getTitle().equals("Facultad de ciencias de la Industria y Produccion")) {
            ((TextView) v.findViewById(R.id.info_window_nombre)).setText("Facultad de ciencias de la Industria y Produccion");
            ((TextView) v.findViewById(R.id.info_window_decano)).setText("Decana: Ing. Sonnia Esther Barzola Miranda, M.Sc.");
            ((TextView) v.findViewById(R.id.info_window_direccion)).setText("Campus “La María”, km 7 vía Quevedo-El Empalme");
            ((TextView) v.findViewById(R.id.info_window_extra)).setText("Carreras: Seguridad Industrial-Alimentos-Agroindustria-Industrial");
            ((ImageView) v.findViewById(R.id.info_window_logo)).setImageResource(R.drawable.industrias);
        }
        else if(m.getTitle().equals("Facultad de ciencias agropecuarias")) {
            ((TextView) v.findViewById(R.id.info_window_nombre)).setText("Facultad de ciencias agropecuarias");
            ((TextView) v.findViewById(R.id.info_window_decano)).setText("Decano: Ing. Leonardo Gonzalo Matute, M.Sc.");
            ((TextView) v.findViewById(R.id.info_window_direccion)).setText("Campus “La María”, km 7 vía Quevedo-El Empalme");
            ((TextView) v.findViewById(R.id.info_window_extra)).setText("Carreras: Forestal-Agropecuaria-Zooctenia-Agronomía-Agrícola");
            ((ImageView) v.findViewById(R.id.info_window_logo)).setImageResource(R.drawable.agropecuaria);
        }
        else if(m.getTitle().equals("La maria")){
            ((TextView) v.findViewById(R.id.info_window_nombre)).setText("Finca Experimental La María (Universidad Técnica Estatal de Quevedo)");
            ((TextView) v.findViewById(R.id.info_window_decano)).setText("Rector: Dr. Eduardo Díaz Ocampo, PhD.");
            ((TextView) v.findViewById(R.id.info_window_direccion)).setText("km 7 vía Quevedo-El Empalme");
            ((TextView) v.findViewById(R.id.info_window_extra)).setText("Facultades: ciencias de la Industria y Produccion - Agropecuarias");
            ((ImageView) v.findViewById(R.id.info_window_logo)).setImageResource(R.drawable.finc_maria);
        }
        else if(m.getTitle().equals("La central")){
            ((TextView) v.findViewById(R.id.info_window_nombre)).setText("Universidad Técnica Estatal de Quevedo, Campus Central");
            ((TextView) v.findViewById(R.id.info_window_decano)).setText("Rector: Dr. Eduardo Díaz Ocampo, PhD.");
            ((TextView) v.findViewById(R.id.info_window_direccion)).setText("Avenida Carlos J. Arosemena, Quevedo");
            ((TextView) v.findViewById(R.id.info_window_extra)).setText("Facultades: Ciencias de la Ingeniería-Ciencias Empresariales-Cien.Soc y de la Educacion");
            ((ImageView) v.findViewById(R.id.info_window_logo)).setImageResource(R.drawable.central);
        }
        else if(m.getTitle().equals("ingenieria")){
            ((TextView) v.findViewById(R.id.info_window_nombre)).setText("Facultad de Ciencias de la Ingeniería");
            ((TextView) v.findViewById(R.id.info_window_decano)).setText("Decano: Ing. Washington Alberto Chiriboga Casanova, M.Sc.");
            ((TextView) v.findViewById(R.id.info_window_direccion)).setText("Campus La Central, Avenida Carlos J. Arosemena, Quevedo");
            ((TextView) v.findViewById(R.id.info_window_extra)).setText("Carreras: Ambiental-Electricidad-Mecánica-Software-Telemática");
            ((ImageView) v.findViewById(R.id.info_window_logo)).setImageResource(R.drawable.ingenieria);
        }
        else if(m.getTitle().equals("empresariales")){
            ((TextView) v.findViewById(R.id.info_window_nombre)).setText("Facultad de Ciencias Empresariales");
            ((TextView) v.findViewById(R.id.info_window_decano)).setText("Decana: Ing. Mariela Susana Andrade Arias, PhD.");
            ((TextView) v.findViewById(R.id.info_window_direccion)).setText("Campus La Central, Avenida Carlos J. Arosemena, Quevedo");
            ((TextView) v.findViewById(R.id.info_window_extra)).setText("Carreras: Adm de Empresas-CPA-Economía-Finanzas-Talento Humano");
            ((ImageView) v.findViewById(R.id.info_window_logo)).setImageResource(R.drawable.empresariales);
        }
        else if(m.getTitle().equals("educacion")){
            ((TextView) v.findViewById(R.id.info_window_nombre)).setText("Facultad de Ciencias de la Educación");
            ((TextView) v.findViewById(R.id.info_window_decano)).setText("Rector: Dr. Eduardo Díaz Ocampo, PhD.");
            ((TextView) v.findViewById(R.id.info_window_direccion)).setText("Campus La Central, Avenida Carlos J. Arosemena, Quevedo");
            ((TextView) v.findViewById(R.id.info_window_extra)).setText("Carreras: Educación básica-Psicopedagogía-Idiomas");
            ((ImageView) v.findViewById(R.id.info_window_logo)).setImageResource(R.drawable.educacion);
        }

        return v;
    }

    @Override
    public View getInfoWindow(Marker m) {
        return null;
    }

}
