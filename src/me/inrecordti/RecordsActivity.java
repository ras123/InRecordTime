package me.inrecordti;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class RecordsActivity extends ListActivity {
	ListView records;
	private static final String[] exerciseType = {"5K", "10K", "Grouse Grind",
		"Bench Press", "Push Ups", "100m Run", "200m Run"};
	private static final String[] exerciseValue = {"26 min", "65 min", "51 min",
		"175 lbs", "65", "12.5 s", "27 s"};
	private static final String date = "Aug 31, 2012 11:23 PM";
	
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.records);
		setListAdapter (new RecordsAdapter ());
	}
	
	class RecordsAdapter extends ArrayAdapter<String> {
		RecordsAdapter () {
			super (RecordsActivity.this, R.layout.row_records, exerciseType);
		}
		
		public View getView (int position, View convertView, ViewGroup parent) {
			LayoutInflater inflater = getLayoutInflater ();
			View row = inflater.inflate (R.layout.row_records, parent, false);
			
			TextView recordType = (TextView) row.findViewById (R.id.recordType);
			recordType.setText (exerciseType[position]);
			
			TextView recordValue = (TextView) row.findViewById (R.id.record);
			recordValue.setText (exerciseValue[position]);
			
			TextView timestamp = (TextView) row.findViewById (R.id.timestamp);
			timestamp.setText (date);
			
			return row;
		}
	}
}
