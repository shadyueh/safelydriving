package shadowppl.com.br.safelydriving0;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Held on 02/08/2016.
 */
public class FragmentQuizResult extends Fragment {

    TextView scoreTitle;
    TextView scoreText;
    ImageView quizResultImage;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quiz_result, container, false);

        //Encontrando os componentes da tela
        scoreTitle = (TextView) view.findViewById(R.id.scoreTitle);
        scoreText = (TextView) view.findViewById(R.id.score);
        quizResultImage = (ImageView) view.findViewById(R.id.quizResultImage);

        //Chama método da Parent
        int score = ((QuizActivity)getActivity()).getScore();

        if (score > 7){
            setQuizResult("Your score is",score,R.drawable.quiz_win);
        } else if (score > 4){
            setQuizResult("Your score is",score,R.drawable.quiz_thumbs_up);
        } else if (score > 0){
            setQuizResult("Your score is",score,R.drawable.quiz_fallen);
        }

        return view;
    }

    private void setQuizResult(String title, int score, int imageResID){
        quizResultImage.setImageResource(imageResID);
        scoreTitle.setText(title);
        scoreText.setVisibility(View.VISIBLE);
        scoreText.setText(""+score);
    }
}
