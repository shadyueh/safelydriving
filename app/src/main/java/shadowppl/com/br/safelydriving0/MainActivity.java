package shadowppl.com.br.safelydriving0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPillionPassengerTips(View view) {
        Intent intent = new Intent(this, PillionPassengerActivity.class);
        startActivity(intent);
    }

    public void openBeginnerBikerTips(View view) {
        Intent intent = new Intent(this, BeginnerBikerActivity.class);
        startActivity(intent);
    }

    public void openDrivingSafelyTips(View view) {
        Intent intent = new Intent(this, DrivingSafelyActivity.class);
        startActivity(intent);
    }

    public void openQuiz(View view) {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
}
