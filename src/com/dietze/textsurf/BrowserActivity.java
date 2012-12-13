package com.dietze.textsurf;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;


public class BrowserActivity extends Activity {

	TextView text;
	WebView webview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_browser);
		
		//Initialize the Web and TextViews
		webview = (WebView) findViewById(R.id.webView1);
		text = (TextView) findViewById(R.id.editText1);
		
		//Initialize Go Button last to avoid nullPointerException
		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(urlListener);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_browser, menu);
		return true;
	}
	
	private OnClickListener urlListener = new OnClickListener(){
		public void onClick(View v){
			//Do something
			String url = text.getText().toString();
			webview.loadUrl(url);
			
		}
	};
	
	

}
