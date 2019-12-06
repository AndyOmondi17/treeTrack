package com.example.capstone;


import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends FragmentActivity implements OnMapReadyCallback {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng arabukoSokoke = new LatLng(-3.338800,39.909806);
        googleMap.addMarker(new MarkerOptions().position(arabukoSokoke).title("arabukoSokoke"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(arabukoSokoke));

        LatLng mauRegion = new LatLng(-0.611156,35.745240);
        googleMap.addMarker(new MarkerOptions().position(mauRegion).title("mauRegion"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(arabukoSokoke));

        LatLng ngongForest = new LatLng(-1.314798,36.740611);
        googleMap.addMarker(new MarkerOptions().position(ngongForest).title("ngongForest"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(arabukoSokoke));

        LatLng karuraForest = new LatLng(-1.237586,36.83057);
        googleMap.addMarker(new MarkerOptions().position(karuraForest).title("karuraForest"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(arabukoSokoke));



    }
}
