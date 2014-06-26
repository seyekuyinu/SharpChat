package com.seyekuyinu.sharpchat;

import android.app.Application;

import com.parse.Parse;

public class SharpChatApplication extends Application{
	@Override 
	public void onCreate() {
		super.onCreate();
		  Parse.initialize(this, "CTZSdAC6eRtsqWXZVmYdBHpMksQKxE4DU8gPVfh3", "ZAkEZpM52JYRdIVHAL5diaGxQz9J0lpuIXEC5fvQ");
		  
		}

}
