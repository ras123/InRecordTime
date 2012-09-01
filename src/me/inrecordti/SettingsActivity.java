package me.inrecordti;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

public class SettingsActivity extends ListActivity {
	private static final String[] settings={"User Name:", "Full Name:", "Email:",
		"Gender:", "Height:", "Weight:", "City:", "Country:"};
	
	private static final String[] values={"User Name:", "Full Name:", "Email:",
		"Gender:", "Height:", "Weight:", "City:", "Country:"};

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.row_settings);
		
		ListAdapter adapter = new ArrayAdapter<String> (this, 
				android.R.layout.simple_list_item_1, 
				settings);
		setListAdapter (adapter);
	}

	
}
