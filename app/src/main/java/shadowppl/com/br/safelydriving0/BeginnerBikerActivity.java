package shadowppl.com.br.safelydriving0;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BeginnerBikerActivity extends AppCompatActivity {

    public static final String SHARED_PREFS = "SafelyDriveSharedPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_biker);
        setTitle("Beginner Biker");
    }

    public void markAsReaded(){
        // All objects are from android.context.Context
        SharedPreferences sharedPrefs = getSharedPreferences(SHARED_PREFS, 0);
        SharedPreferences.Editor editor = sharedPrefs.edit();
      //  editor.putBoolean(getString(R.string.saved_high_score), newHighScore);

        // Commit the edits!
        editor.commit();
    }
}
