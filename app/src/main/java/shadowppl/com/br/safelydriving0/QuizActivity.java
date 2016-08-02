package shadowppl.com.br.safelydriving0;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new SwipeCustomAdapter(getSupportFragmentManager(),getApplicationContext()));
    }

    private class SwipeCustomAdapter extends FragmentPagerAdapter {

        private String fragments[] = {"Quiz 1","Quiz 2","Quiz 3","Quiz 4","Quiz 5"};

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
