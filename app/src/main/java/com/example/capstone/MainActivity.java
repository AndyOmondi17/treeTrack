package com.example.capstone;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_options, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Change the map type based on the user's selection.
        switch (item.getItemId()) {
            case R.id.normal_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.hybrid_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            case R.id.satellite_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;
            case R.id.terrain_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
