package parkway.udemy.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSpot(View v) {
        Toast.makeText(this, "Open Spotify Stream", Toast.LENGTH_LONG).show();
    }
    public void Scores(View c) {
        Toast.makeText(this, "Open Scores", Toast.LENGTH_LONG).show();
    }
    public void openLib(View b) {
        Toast.makeText(this, "Open Library", Toast.LENGTH_LONG).show();
    }
    public void openBigger(View g) {
        Toast.makeText(this, "Open Bigger", Toast.LENGTH_LONG).show();
    }
    public void personalApp(View e) {
        Toast.makeText(this, "Open personal app", Toast.LENGTH_LONG).show();
    }
}
