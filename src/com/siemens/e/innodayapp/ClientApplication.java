package com.siemens.e.innodayapp;

import android.app.Application;

public class ClientApplication extends Application {

	State state;
	int physicalID;
	int logicalID;
	
	public int getLogicalID() {
		return logicalID;
	}

	public void setLogicalID(int logicalID) {
		this.logicalID = logicalID;
	}

	public int getPhysicalID() {
		return physicalID;
	}

	public void setPhysicalID(int physicalID) {
		this.physicalID = physicalID;
	}

	public void onCreate(){
		super.onCreate();
		state = State.UNCONNECTED;	
	}
	
	public State getState(){
		return this.state;

	}
	
	public void setState(State state){
		this.state = state;
	}
}
