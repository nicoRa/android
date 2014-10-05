package ar.com.fiuba.primeraapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//setContentView(R.layout.pantalla_2);
		
		TextView t = (TextView) findViewById(R.id.textView2);
		
		t.setText("Texto desde el onCreate, jojojo");
		
		ImageView im = (ImageView)findViewById(R.id.imageView1);
		
		im.setImageResource(R.drawable.led_3mm_on);
		
		Log.d("main","hola esto es un log");
		
	}

}
