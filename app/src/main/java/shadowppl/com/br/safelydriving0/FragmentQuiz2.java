package shadowppl.com.br.safelydriving0;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Held on 01/08/2016.
 */
public class FragmentQuiz2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_quiz2,container,false);

        Button btnNext = (Button) view.findViewById(R.id.btnNextQuiz2);

        btnNext.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                ViewPager vPager = (ViewPager) getActivity().findViewById(R.id.viewPager);
                vPager.setCurrentItem(vPager.getCurrentItem()+1, true);
            }
        });

        return view;
    }
}
