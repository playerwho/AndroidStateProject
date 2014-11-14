package ctec.androidstateproject.controller;

import ctec.androidstateproject.model.androidAppState;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TransferActivity extends Activity
{
	private androidAppState appState;
	private TextView comboText;
	private Button homeButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transfer_data);
		
		appState = (androidAppState) getApplication();
		comboText =(TextView) findViewById(R.id.combineTextView);
		homeButton =(Button) findViewById(R.id.homeButton);
		
		comboText.setText(appState.getName() + " is " + 
						  appState.getAge() +" and says " +
						  appState.getOther() + " about " + 
						  appState.getPhrase());
		setupListeners();
	}
	
	private void setupListeners()
	{
		homeButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Intent returnIntent = new Intent();
				setResult(RESULT_OK, returnIntent);
				finish();
				
			}
		});
	}
}
