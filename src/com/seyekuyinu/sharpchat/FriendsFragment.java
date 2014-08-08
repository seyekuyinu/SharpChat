package com.seyekuyinu.sharpchat;

import java.util.List;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseRelation;
import com.parse.ParseUser;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FriendsFragment extends ListFragment{
	
	public static final String TAG = FriendsFragment.class.getSimpleName();

	protected List<ParseUser> mUsers;
	protected ParseRelation<ParseUser> mFriendsRelation;
	protected ParseUser mCurrentUser;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_friends, container,
				false);
		
		return rootView;
	}
	
	
	
	public void onResume() {
		super.onResume();
		
		
		mCurrentUser = ParseUser.getCurrentUser();
		mFriendsRelation = mCurrentUser.getRelation(ParseConstants.KEY_FRIENDS_RELATION);
		
		
		mFriendsRelation.getQuery().findInBackground(new FindCallback<ParseUser>(){
			@Override
			public void done(List<ParseUser> friends, ParseException e) {
				mFriends = friends; 
				 
				
			}
			
			
		});
		
	}

}
