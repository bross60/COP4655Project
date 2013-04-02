package com.seminolestate.congressfinder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.widget.TextView;
import android.util.Log;

public class MyLocation extends Activity {

	LocationManager mLocationManager;
	TextView tv;
	private static final String TAG = "MyLocation";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		try {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_my_location);
			tv = (TextView) findViewById(R.id.tv1);
			
			mLocationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
			
			Criteria  criteria = new Criteria();
			criteria.setAccuracy(Criteria.ACCURACY_FINE);
			criteria.setPowerRequirement(Criteria.POWER_LOW);
			String locationprovider = mLocationManager.getBestProvider(criteria, true);
			Location mLocation = mLocationManager.getLastKnownLocation(locationprovider);
			
			Log.i(TAG, "lat: " + mLocation.getLatitude());
			Log.i(TAG, "long: " + mLocation.getLongitude());
			
			tv.setText("Last location lat: " + mLocation.getLatitude() + "  long: " + mLocation.getLongitude());
		
		} catch(Exception e) {
			Log.e(TAG, "Exception error: " + e.toString());
		}
		
	}
}
