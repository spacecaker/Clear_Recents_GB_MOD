package com.example.taskswitcherreal;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class RecentsKill extends ImageView {

 String message;
 ImageView image;
 public RecentsKill(final Context context, AttributeSet attrs) {
  super(context, attrs);
  
	image = (ImageView) findViewById(R.id.clear_recents_tasks);
	image.setOnClickListener(new View.OnClickListener() {
		 
		@Override
		public void onClick(View v) {
	        if (v.isSelected()){
	            v.setSelected(false);
				Intent intent = new Intent();
				intent.setAction("recentsmenu.FLIP_TO_VIEW");
				context.sendBroadcast(intent);
	        } else {
	            v.setSelected(true);
				Intent intent = new Intent();
				intent.setAction("recentsmenu.FLIP_TO_HIDE");
				context.sendBroadcast(intent);
	        }		};
	});
 }
 
}

