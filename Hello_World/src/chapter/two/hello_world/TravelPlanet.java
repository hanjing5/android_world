package chapter.two.hello_world;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;

public class TravelPlanet extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_travel);
		VideoView travelVideo = (VideoView)findViewById(R.id.travelVideoView);
		travelVideo.setOnTouchListener(new View.OnTouchListener(){
			@Override 
			public boolean onTouch(View v, MotionEvent event) {
				Toast.makeText(TravelPlanet.this, "Going Home", Toast.LENGTH_SHORT).show();
				finish();
				return true;
			}

		});
	}

}
