package me.inrecordti;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class InRecordTimeActivity extends Activity {
	private static final String[] data = {"lorem", "ipsum", "dolor",
        "sit", "amet",
        "consectetuer", "adipiscing", "elit", "morbi", "vel",
        "ligula", "vitae", "arcu", "aliquet", "mollis",
        "etiam", "vel", "erat", "placerat", "ante",
        "porttitor", "sodales", "pellentesque", "augue", "purus"};
	
	private static final String[] records = {"10K: 55 min", "Grouse Grind: 49 min",
		"Bench Press: 180 lbs", "5K: 25 min", "Push Ups: 65", "100 m Dash: 12 s"
	};

	Button profileBtn, recordsBtn, leaderboardBtn, settingsBtn;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.main);
        
        profileBtn = (Button) findViewById (R.id.profile);
        recordsBtn = (Button) findViewById (R.id.records);
        leaderboardBtn = (Button) findViewById (R.id.leaderboard);
        settingsBtn = (Button) findViewById (R.id.settings);
        
        /*profileBtn.setOnClickListener (new View.OnClickListener() {

        	@Override
        	public void onClick(View v) {
        		ListAdapter adapter = new ArrayAdapter<String> (InRecordTimeActivity.this, 
                        										android.R.layout.simple_list_item_1, 
                        										data);
        		InRecordTimeActivity.this.setListAdapter (adapter);
            }
        });
        
        recordsBtn.setOnClickListener (new View.OnClickListener() {

        	@Override
        	public void onClick(View v) {
        		ListAdapter adapter = new ArrayAdapter<String> (InRecordTimeActivity.this, 
                        										android.R.layout.simple_list_item_1, 
                        										records);
        		InRecordTimeActivity.this.setListAdapter (adapter);
            }
        });
        */
        settingsBtn.setOnClickListener (new View.OnClickListener() {

        	@Override
        	public void onClick(View v) {
        		//InRecordTimeActivity.this.setContentView (R.layout.settings);
        		//ListView list = (ListView) findviewById (R.id.list);
        		//ImageView profilePic = (ImageView) findViewById (R.id.JasonAndOwl); //(R.drawable.jason_and_owl);
        		//profilePic.setVisibility (0);
        		//InRecordTimeActivity.this.setContentView (R.layout.settings);
        		Intent myIntent = new Intent (InRecordTimeActivity.this, SettingsActivity.class);
        		InRecordTimeActivity.this.startActivity (myIntent);
        	}
        });
        
        /*setListAdapter(new ArrayAdapter<String>(this,
                								android.R.layout.simple_list_item_1,
                								data));*/
        
    }
}