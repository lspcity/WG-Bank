package bank.general;

import bank.utils.OurSQLiteHelper;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class Test extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		OurSQLiteHelper sqliteHelper = new OurSQLiteHelper(getBaseContext());
		
		sqliteHelper.onCreate(sqliteHelper.getWritableDatabase());
		//TextView textview = new TextView(this);
        //textview.setText("Test it");
        setContentView(R.layout.startscreen);
        
        Button refreshButton = (Button) findViewById(R.id.button1);
        refreshButton.setOnClickListener(new RefreshButtonOnClickListener());
        System.out.println("refresh");
        //setContentView(textview);
	}
}