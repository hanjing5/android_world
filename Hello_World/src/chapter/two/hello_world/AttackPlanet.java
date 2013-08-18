package chapter.two.hello_world;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.Toast;

public class AttackPlanet extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_attack);

		ImageButton bombButton = (ImageButton)findViewById(R.id.bombButton);
		Animation rotateBomb = AnimationUtils.loadAnimation(this, R.anim.anim_rot_bomb);
		bombButton.startAnimation(rotateBomb);
		
		bombButton.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Toast.makeText(AttackPlanet.this, "Bombs Away!", Toast.LENGTH_SHORT).show();
			}
		});
		ImageButton invadeButton = (ImageButton)findViewById(R.id.invadeButton);
		Animation alphaInvade = AnimationUtils.loadAnimation(this, R.anim.anim_alpha_invade);
		invadeButton.startAnimation(alphaInvade);
		invadeButton.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Toast.makeText(AttackPlanet.this, "Troops Sent!", Toast.LENGTH_SHORT).show();
			}
		});

		ImageButton infectButton = (ImageButton)findViewById(R.id.infectButton);
		infectButton.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Toast.makeText(AttackPlanet.this, "Virus Spread!", Toast.LENGTH_SHORT).show();
			}
		});
		Animation scaleVirus = AnimationUtils.loadAnimation(this, R.anim.anim_scale_virus);
		infectButton.startAnimation(scaleVirus);
		ImageButton laserButton = (ImageButton)findViewById(R.id.laserButton);
		laserButton.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Toast.makeText(AttackPlanet.this, "Laser Fired!", Toast.LENGTH_SHORT).show();
			}
		});


		ImageButton exitButton = (ImageButton)findViewById(R.id.exitButton);
		exitButton.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				finish();
			}
		});

	}
	public boolean onKeyDown(int keyCode, KeyEvent event){
		if(keyCode == KeyEvent.KEYCODE_X) {
			finish();
			return true;
		}
		return false;
	}
}
