package com.seminolestate.congressfinder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
	private final int GROUP_DEFAULT = 0;
	private final int MENU_PREF = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Intent i = new Intent(this, MyLocation.class);
		//startActivity(i);
	}
	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		menu.add(GROUP_DEFAULT, MENU_PREF, 0, "Location services");
		
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemID()) {
			case MENU_PREF:
				Intent i = new Intent(this, MyLocation.class)
				startActivity(i);
				return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
}
