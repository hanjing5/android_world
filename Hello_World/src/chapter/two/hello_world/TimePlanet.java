package chapter.two.hello_world;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class TimePlanet extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_time);
		final TransitionDrawable trans = (TransitionDrawable) getResources().getDrawable(R.drawable.tran_stars_galaxy);
		LinearLayout timePlanetScreen = (LinearLayout)findViewById(R.id.timePlanetScreen);
		timePlanetScreen.setBackground(trans);
		trans.startTransition(5000);
		Button returnFromTimeButton = (Button) findViewById(R.id.timeButton);
		returnFromTimeButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view){
				Intent returnIntent = new Intent();
				setResult(RESULT_OK, returnIntent);
				finish();
			}
		});
		Button startMusicServiceButton = (Button) findViewById(R.id.startServiceButton);
		startMusicServiceButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view){
				startService(new Intent(TimePlanet.this, MusicService.class));
			}
		});
		Button stopMusicServiceButton = (Button) findViewById(R.id.stopServiceButton);
		stopMusicServiceButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				stopService(new Intent(TimePlanet.this, MusicService.class));
			}
		});
	}
}
