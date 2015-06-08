package com.boston.thenewboston;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class OpenedClass extends Activity implements OnClickListener,
		OnCheckedChangeListener {
	Button returnData;
	TextView Question, test;
	RadioGroup selectionlist;
	String gotBread,setData;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send);
		initialize();
		
		SharedPreferences getData=PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		String et = getData.getString("name", "Travis is ..");
		String values =getData.getString("list", "4");
		if(values.contentEquals("1"))
		{
			Question.setText(et);
		}
		
		
		//Bundle gotBasket =getIntent().getExtras();
		//gotBread=gotBasket.getString("key");
		//Question.setText(gotBread);
	}

	private void initialize() {
		// TODO Auto-generated method stub
		returnData = (Button) findViewById(R.id.bReturn);
		Question = (TextView) findViewById(R.id.tvQuestion);
		test = (TextView) findViewById(R.id.tvText);
		selectionlist=(RadioGroup) findViewById(R.id.rgAnswers);
		returnData.setOnClickListener(this);
		selectionlist.setOnCheckedChangeListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
    Intent person = new Intent();
    Bundle backpack= new Bundle();
    backpack.putString("answer",setData);
    person.putExtras(backpack);
    setResult(RESULT_OK,person);
    finish(); 
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		switch (checkedId) {
		case R.id.rCrazy:
			
			setData="probably right";
			break;
		case R.id.rSexy:
			setData="definately right";
			
			break;
		case R.id.rBoth:
			setData="spot on !!";
			
			break;
		}
		test.setText(setData);
	}

}
