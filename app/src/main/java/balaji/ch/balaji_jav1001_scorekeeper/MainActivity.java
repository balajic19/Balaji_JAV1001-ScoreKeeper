package balaji.ch.balaji_jav1001_scorekeeper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int teamAScore = 0;
    private int teamBScore = 0;
    private Boolean teamBChecked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Initializing Score Buttons from 1 to 6
        Button oneScore = findViewById(R.id.one);
        Button twoScore = findViewById(R.id.two);
        Button threeScore = findViewById(R.id.three);
        Button fourScore = findViewById(R.id.four);
        Button sixScore = findViewById(R.id.six);


        oneScore.setOnClickListener(this);
        twoScore.setOnClickListener(this);
        threeScore.setOnClickListener(this);
        fourScore.setOnClickListener(this);
        sixScore.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        TextView teamATV = findViewById(R.id.teamAScore);
        TextView teamBTV = findViewById(R.id.teamBScore);

        SwitchCompat switchTeam = findViewById(R.id.teamSide);

        String teamAScoreString = (String.valueOf(teamATV.getText()).split("/")[0]);
        teamAScore = Integer.parseInt(teamAScoreString);

        String teamBScoreString = (String.valueOf(teamBTV.getText()).split("/")[0]);
        teamBScore = Integer.parseInt(teamBScoreString);

        if (!switchTeam.isChecked()) {
            switch (view.getId()) {
                case R.id.one:
                    teamAScore += 1;
                    break;
                case R.id.two:
                    teamAScore += 2;
                    break;
                case R.id.three:
                    teamAScore += 3;
                    break;
                case R.id.four:
                    teamAScore += 4;
                    break;
                case R.id.six:
                    teamAScore += 6;
                    break;
                default:
                    teamAScore = 0;
                    break;
            }
            teamATV.setText(String.valueOf(teamAScore) + "/0");
        } else {
            switch (view.getId()) {
                case R.id.one:
                    teamBScore += 1;
                    break;
                case R.id.two:
                    teamBScore += 2;
                    break;
                case R.id.three:
                    teamBScore += 3;
                    break;
                case R.id.four:
                    teamBScore += 4;
                    break;
                case R.id.six:
                    teamBScore += 6;
                    break;
                default:
                    teamBScore = 0;
                    break;
            }
            teamBTV.setText(String.valueOf(teamBScore) + "/0");
        }
    }
}