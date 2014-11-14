package ctec.androidstateproject.controller;

import ctec.androidstateproject.model.androidAppState;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StateActivity extends Activity
{
	private EditText ageField, nameField, phraseField, otherField;
	private Button changeButton;
	private androidAppState appState;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);
        
        ageField = (EditText) findViewById(R.id.ageEditText);
        nameField =(EditText) findViewById(R.id.nameEditText);
        phraseField =(EditText) findViewById(R.id.phraseEditText);
        otherField =(EditText) findViewById(R.id.otherEditText);
        changeButton =(Button) findViewById(R.id.swapButton);
        appState =(androidAppState) getApplication();
        
        setupListeners();
    }
    
    private void setupListeners()
    {
    	changeButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View currentView)
			{
				appState.setName(nameField.getText().toString());
				appState.setAge(ageField.getText().toString());
				appState.setPhrase(phraseField.getText().toString());
				appState.setOther(otherField.getText().toString());
				
				Intent otherScreenIntent = new Intent(currentView.getContext(), TransferActivity.class);
				startActivityForResult(otherScreenIntent, 0);
				
				
			}
		});
    }
    
    
}
