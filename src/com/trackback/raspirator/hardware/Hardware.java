package com.trackback.raspirator.hardware;

import com.trackback.raspirator.tools.D;
import com.trackback.raspirator.tools.Raspirator;

public class Hardware extends Raspirator{
	private final String TAG = "Hardware";
	
	public Hardware() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void onCreate(){
		super.onCreate();
		D.log(TAG, "Ready");
	}
	
	@Override
	public void onStop(){
		super.onStop();
		D.log(TAG, "Stop");
	}
	
	@Override
	public void onDestroy(){
		super.onDestroy();
		D.log(TAG, "onDestroy");
	}
	

}
