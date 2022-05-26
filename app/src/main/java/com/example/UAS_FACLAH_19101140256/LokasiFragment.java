package com.example.UAS_FACLAH_19101140256;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class LokasiFragment extends Fragment implements OnMapReadyCallback {

    Button tombolnormal,tombolhybrid,tombolsatelit,tombolterrain;

    private static LokasiFragment INSTANCE = null;
    View view;
    GoogleMap map;
    MapView mapView;
    public LokasiFragment(View view){
    }

    public LokasiFragment() {

    }

    public static LokasiFragment getInstance(){
        if (INSTANCE == null)
            INSTANCE = new LokasiFragment();
        return INSTANCE;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      view = inflater.inflate(R.layout.fragment_lokasi,container,false);
      return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tombolnormal = view.findViewById(R.id.tombolnormal);
        tombolhybrid = view.findViewById(R.id.tombolhybrid);
        tombolsatelit = view.findViewById(R.id.tombolsatelite);
        tombolterrain = view.findViewById(R.id.tombolterrain);



        tombolnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            }
        });
        tombolhybrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
            }
        });
        tombolsatelit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
            }
        });
        tombolterrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
            }
        });





        mapView = view.findViewById(R.id.map);
        if (mapView != null){
            mapView.onCreate(null);
            mapView.onResume();
            mapView.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        MapsInitializer.initialize(getContext());
        map = googleMap;

// Add a marker in Sydney, Australia, and move the camera.
        LatLng Unpam = new LatLng(-6.3444406,106.7370236);
        googleMap.addMarker(new MarkerOptions().position(Unpam).title("Universitas Pamulang"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Unpam));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Unpam, 20));
        map.getUiSettings().setZoomControlsEnabled(true);
        map.getUiSettings().setCompassEnabled(true);
        map.getUiSettings().setMyLocationButtonEnabled(true);
    }
}