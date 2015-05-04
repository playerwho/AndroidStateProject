package ctec.androidstateproject.model;

import android.app.Application;
import android.widget.Button;

public class androidAppState extends Application
{
	private String name;
	
	private String age;
	
	private String phrase;

	private String other;
	
	/**
	 * creates blank fields for text use
	 */
	public void onCreate()
	{
		super.onCreate();
		
		name ="";
		age ="";
		phrase = "";
		other = "";
	}

	/**
	 * gets ans sets various objets
	 * @return the objects
	 */
	public String getName()
	{
		return name;
	}

	public String getAge()
	{
		return age;
	}

	public String getPhrase()
	{
		return phrase;
	}

	public String getOther()
	{
		return other;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(String age)
	{
		this.age = age;
	}

	public void setPhrase(String phrase)
	{
		this.phrase = phrase;
	}

	public void setOther(String other)
	{
		this.other = other;
	}
}
