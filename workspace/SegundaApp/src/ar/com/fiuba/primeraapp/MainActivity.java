package ar.com.fiuba.primeraapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity 
					extends ActionBarActivity 
					implements OnClickListener {
 
	private ImageView im;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		im = (ImageView)findViewById(R.id.imageView1);
		im.setImageResource(R.drawable.led_3mm_off);
		
		Button b = (Button) findViewById(R.id.button1);
		OnClickListener l = this;
		b.setOnClickListener(l);

		Button b2 = (Button) findViewById(R.id.button2);
		b2.setOnClickListener(l);
		
	}

	@Override
	public void onClick(View arg0) {
		
		Log.d("main","se hizo cliikkkkkk");	
		
		switch(arg0.getId())
		{
			case R.id.button1:
				Log.d("main","ON");	
				im.setImageResource(R.drawable.led_3mm_on);
				break;
			case R.id.button2:
				Log.d("main","OFF");	
				im.setImageResource(R.drawable.led_3mm_off);
				break;
		}
	}

}
