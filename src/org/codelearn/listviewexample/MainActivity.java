package org.codelearn.listviewexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String[] stringArray = new String[] {"List item 1","List item 2","List item 3","List item 4","List item 5"};
		
    	ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, stringArray);
		ListView listView = (ListView) findViewById(R.id.listView1);
		listView.setAdapter(adapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
