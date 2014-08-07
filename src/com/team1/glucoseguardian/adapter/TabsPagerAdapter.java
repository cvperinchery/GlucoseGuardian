package com.team1.glucoseguardian.adapter;

import com.team1.glucoseguardian.DayHistory;
import com.team1.glucoseguardian.MonthHistory;
import com.team1.glucoseguardian.Settings;
import com.team1.glucoseguardian.WeekHistory;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class TabsPagerAdapter extends FragmentPagerAdapter{

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}
	
	@Override
	public Fragment getItem(int index){
		switch(index){
		case 0:
			//Past day's history fragment activity
			return new DayHistory();
			
		case 1:
			//Past week's history fragment activity
			return new WeekHistory();
			
		case 2:
			//Past month's history fragment activity
			return new MonthHistory();
			
		case 3:
			//Settings fragment activity
			return new Settings();
		}
		
		
		return null;
	}
	
	@Override
	public int getCount(){
		//get item count - equal to the number of tabs
		return 4;
	}
}

