package shadowppl.com.br.safelydriving0;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class QuizActivity extends AppCompatActivity {

    ViewPager viewPager;
    int quizPoints[] = {0,0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new SwipeCustomAdapter(getSupportFragmentManager(),getApplicationContext()));
    }

    public void onQuizAnswer(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        int point = 0;

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rbQ1A:
            case R.id.rbQ2B:
            case R.id.rbQ3A:
            case R.id.rbQ4C:
            case R.id.rbQ5B:
                if (checked)
                    point = 2;
                    break;
            case R.id.rbQ1B:
            case R.id.rbQ1C:
            case R.id.rbQ2A:
            case R.id.rbQ2C:
            case R.id.rbQ3B:
            case R.id.rbQ3C:
            case R.id.rbQ4A:
            case R.id.rbQ4B:
            case R.id.rbQ5A:
            case R.id.rbQ5C:
                if (checked)
                    point = 1;
                    break;
        }

        quizPoints[viewPager.getCurrentItem()] = point;
    }

    public int getScore(){
        int sum = 0;
        for (int i : quizPoints)
            sum += i;
        return sum;
    }

    private class SwipeCustomAdapter extends FragmentPagerAdapter {

        private String fragments[] = {"Quiz 1","Quiz 2","Quiz 3","Quiz 4","Quiz 5","Quiz Result"};

        public SwipeCustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        /**
         * Returns the specified fragment on specified position
         * @param position
         * @return
         */
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new FragmentQuiz1();
                case 1:
                    return new FragmentQuiz2();
                case 2:
                    return new FragmentQuiz3();
                case 3:
                    return new FragmentQuiz4();
                case 4:
                    return new FragmentQuiz5();
                case 5:
                    return new FragmentQuizResult();
                default:
                    return null;
            }
        }

        /**
         * Retuns the number of fragments/views
         * @return int
         */
        @Override
        public int getCount() {
            return fragments.length;
        }

        /**
         * Returns the fragment title of specified position
         * @param position
         * @return String
         */
        @Override
        public CharSequence getPageTitle(int position) {
            return fragments[position];
        }
    }
}
