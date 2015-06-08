package com.boston.thenewboston;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Starting extends Activity {
       
	int counter;
	Button add;
	Button sub;
	Button button1;
	Button button2;
	TextView display;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startin);
        counter=0;
        add=(Button) findViewById(R.id.bAdd);
        sub=(Button) findViewById(R.id.bSub);
        
        display=(TextView) findViewById(R.id.tvDisplay);
        add.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			counter++;
    			display.setText("your total is "+ counter);
    			
    		}
    	});
       
    
	
	    sub.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			counter--;
			display.setText("your total is "+ counter);
			
		}
	});
}



   
    
}
