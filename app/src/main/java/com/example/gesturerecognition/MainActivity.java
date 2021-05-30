package com.example.gesturerecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView gestures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        gestures = findViewById(R.id.gesture);
    }

    public boolean onKeyUp(int keyCode, KeyEvent event) {
        Log.d("Keycode",keyCode+"");
        switch (keyCode) {
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                gestures.append("Volume Down Gesture Performed \n ");
                Toast.makeText(getApplicationContext(),"Anti Clockwise Gesture Performed ",Toast.LENGTH_LONG).show();
                return true;
            case KeyEvent.KEYCODE_VOLUME_UP:
                gestures.append("Volume Up Gesture Performed \n ");
                Toast.makeText(getApplicationContext(),"Anti Clockwise Gesture Performed ",Toast.LENGTH_LONG).show();
                return true;
            case KeyEvent.KEYCODE_A:
                gestures.append("Anti Clockwise Gesture Performed \n ");
                Toast.makeText(getApplicationContext(),"Anti Clockwise Gesture Performed ",Toast.LENGTH_LONG).show();
                return true;
            case KeyEvent.KEYCODE_L:
                gestures.append("Left Gesture Performed \n ");
                Toast.makeText(getApplicationContext(),"Left Gesture Performed ",Toast.LENGTH_LONG).show();
                return true;
            case KeyEvent.KEYCODE_R:
                gestures.append("Right Gesture Performed \n ");
                Toast.makeText(getApplicationContext(),"Right Gesture Performed ",Toast.LENGTH_LONG).show();
                return true;
            case KeyEvent.KEYCODE_U:
                gestures.append("UP Gesture Performed \n ");
                Toast.makeText(getApplicationContext(),"UP Gesture Performed ",Toast.LENGTH_LONG).show();
                return true;
            case KeyEvent.KEYCODE_D:
                gestures.append("Down Gesture Performed \n ");
                Toast.makeText(getApplicationContext(),"Down Gesture Performed ",Toast.LENGTH_LONG).show();
                return true;
            case KeyEvent.KEYCODE_C:
                gestures.append("Clockwise Gesture Performed \n ");
                Toast.makeText(getApplicationContext(),"Clockwise Gesture Performed ",Toast.LENGTH_LONG).show();
                return true;
                default:
                return super.onKeyUp(keyCode, event);
        }
    }
}