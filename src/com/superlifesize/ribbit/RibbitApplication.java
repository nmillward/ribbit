package com.superlifesize.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "5XclDMoHoij4ND3zwjlNhp0NnI0hjAfhc9epFMwm", "9V09LTmERDqze20tNiBmYweodkOekhLeDpbIPSbE");
		
		ParseObject testObject = new ParseObject("TestObject");
		testObject.put("foo", "bar");
		testObject.saveInBackground();
		
		}
		
}
