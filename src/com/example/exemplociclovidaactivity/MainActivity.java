package com.example.exemplociclovidaactivity;

import android.support.v7.app.ActionBarActivity;

import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.util.Log;
public class MainActivity extends ActionBarActivity {
    private static final String TAG = "com.example.exemplociclovidaactivity";
    	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	    Log.i(TAG,"OnCreate");
	}
		@Override
	protected void onStart(){
		super.onStart();
		Log.i(TAG,"onStart");
	}
		@Override
	protected void onResume(){
		super.onResume();
		Log.i(TAG,"onResume");
	}
		@Override
	protected void onPause(){
		super.onPause();
		Log.i(TAG,"onPause");
	}
	@Override
	protected void onStop(){
		super.onStop();
		Log.i(TAG,"onStop");
	}
	@Override
	protected void onRestart(){
		super.onRestart();
		Log.i(TAG,"onRestart");
	}
		@Override
	protected void onDestroy(){
		super.onDestroy();
		Log.i(TAG,"onDestroy");
	}
	protected void onSaveIntanceState(Bundle outState){
		super.onSaveInstanceState(outState);
		Log.i(TAG, "onSaveInstanceState");
	}
		protected void onRestoreInstanceState(Bundle savedState){
		Log.i(TAG, "onRestoreInstanceState");
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}
	
}
