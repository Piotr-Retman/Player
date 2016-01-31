package com.example.Player;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);
        Button button = (Button) findViewById(R.id.button);
//        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.song);
//        mediaPlayer.start(); Some sort of things like a more than boss
//        currentPosition = (TextView) findViewById(R.id.textView);
//        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.string);
    }


    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

}
