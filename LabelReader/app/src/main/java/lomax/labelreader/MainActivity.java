package lomax.labelreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void doBaselineRead(View view)
	{
//		Toast.makeText(this, "Do baseline read", Toast.LENGTH_SHORT).show();

		Intent baselineReader = new Intent(this, BaselineReader.class);
		startActivity(baselineReader);
	}
}
