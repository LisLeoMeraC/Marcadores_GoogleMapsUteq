package com.example.googlemapsuteq;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity
                            implements OnMapReadyCallback{
    GoogleMap mapa;
    int tipoVista;
    LatLng[] puntos = new LatLng[4];
    int cpuntos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        tipoVista=1;
        cpuntos=0;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mapa=googleMap;

        mapa.getUiSettings().setZoomControlsEnabled(true);

       // mapa.setMapType(GoogleMap.MAP_TYPE_HYBRID);

    }



    public void ConfigurarMapaCentral(View v) {

        //Facultades de la Central

        LatLng central = new LatLng(-1.012643163451205, -79.46970272281175);
        mapa.addMarker(new MarkerOptions()
                .position(central)
                .title("La central"));

        LatLng empresariales = new LatLng(-1.0121912817955292, -79.46968126533777);
        mapa.addMarker(new MarkerOptions()
                .position(empresariales)
                .title("empresariales"));

        LatLng ingenieria = new LatLng(-1.0126391407661246, -79.46991193529453);
        mapa.addMarker(new MarkerOptions()
                .position(ingenieria)
                .title("ingenieria"));

        LatLng educacion = new LatLng(-1.0128429568041064, -79.4694800996778);
        mapa.addMarker(new MarkerOptions()
                .position(educacion)
                .title("educacion"));

        CameraPosition camPos = new CameraPosition.Builder()
                .target(central)
                .target(empresariales)
                .target(ingenieria)
                .target(educacion)
                .zoom(19)
                .bearing(45)      //noreste arriba
                .tilt(90)         //punto de vista de la cámara 70 grados
                .build();

        mapa.setInfoWindowAdapter(new CustomInfoWindowAdapter(LayoutInflater.from(getApplicationContext())));
        CameraUpdate camUpd3 =
                CameraUpdateFactory.newCameraPosition(camPos);
        mapa.animateCamera(camUpd3);



    }
    public void ConfigurarMapaMaria(View v) {

        //Facultades de la María
        LatLng finca = new LatLng(-1.0802089299140054, -79.50097140591268);
        mapa.addMarker(new MarkerOptions()
                .position(finca)
                .title("La maria"));


        LatLng industrias= new LatLng(-1.081136872245809, -79.50232071076853);
        mapa.addMarker(new MarkerOptions()
                .position(industrias)
                .title("Facultad de ciencias de la Industria y Produccion"));

        LatLng agropecuarias= new LatLng(-1.080563, -79.501561);
        mapa.addMarker(new MarkerOptions()
                .position(agropecuarias)
                .title("Facultad de ciencias agropecuarias"));

        CameraPosition camPos = new CameraPosition.Builder()
                .target(finca)
                .target(industrias)
                .target(agropecuarias)
                .zoom(19)
                .bearing(45)      //noreste arriba
                .tilt(90)         //punto de vista de la cámara 70 grados
                .build();

        mapa.setInfoWindowAdapter(new CustomInfoWindowAdapter(LayoutInflater.from(getApplicationContext())));
        CameraUpdate camUpd3 =
                CameraUpdateFactory.newCameraPosition(camPos);
        mapa.animateCamera(camUpd3);


    }

}