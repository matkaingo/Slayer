package com.example.slayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static TextView txt_score, txt_best_score, txt_score_over, txt_instr, txt_names, txt_dev;
    public static RelativeLayout rl_game_over;
    public static Button btn_start;
    public static ImageButton instruction, credit, instruction1, credit1;
    public static ImageView credits, instructions;
    private GameView gv;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        DisplayMetrics dm = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        Constants.SCREEN_WIDTH = dm.widthPixels;
        Constants.SCREEN_HEIGHT= dm.heightPixels;
        setContentView(R.layout.activity_main);
        txt_score = findViewById(R.id.txt_score);
        txt_best_score = findViewById(R.id.txt_best_score);
        txt_score_over = findViewById(R.id.txt_score_over);
        rl_game_over = findViewById(R.id.rl_game_over);
        instruction = findViewById(R.id.instruction);
        credit = findViewById(R.id.credits);
        instruction1 = findViewById(R.id.instruction);
        credit1 = findViewById(R.id.credits);
        btn_start = findViewById(R.id.btn_start);
        credits = findViewById(R.id.creditsView);
        txt_instr = findViewById(R.id.txt_instructions);
        instructions = findViewById(R.id.instructionsView);
        txt_dev = findViewById(R.id.txt_credits);
        txt_names = findViewById(R.id.txt_credits_names);
        gv =findViewById(R.id.gv);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gv.setStart(true);
                txt_score.setVisibility(View.VISIBLE);
                btn_start.setVisibility(View.INVISIBLE);
                instruction.setVisibility(View.INVISIBLE);
                credit.setVisibility(View.INVISIBLE);
                credits.setVisibility(View.INVISIBLE);

            }
        });

        credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                credit.setVisibility(View.VISIBLE);
                credits.setVisibility(View.VISIBLE);
                instruction.setVisibility(View.INVISIBLE);
                btn_start.setVisibility((View.INVISIBLE));
                txt_dev.setVisibility(View.VISIBLE);
                txt_names.setVisibility(View.VISIBLE);
            }
        });
        credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                credit.setVisibility(View.VISIBLE);
                credits.setVisibility(View.INVISIBLE);
                btn_start.setVisibility((View.VISIBLE));
                instruction.setVisibility(View.VISIBLE);
                txt_dev.setVisibility(View.INVISIBLE);
                txt_names.setVisibility(View.INVISIBLE);
            }
        });
        instruction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                instructions.setVisibility(View.VISIBLE);
                txt_instr.setVisibility(View.VISIBLE);
                credit.setVisibility(View.INVISIBLE);
                btn_start.setVisibility((View.INVISIBLE));
            }
        });
        instructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                instructions.setVisibility(View.INVISIBLE);
                txt_instr.setVisibility(View.INVISIBLE);
                btn_start.setVisibility((View.VISIBLE));
                credit.setVisibility(View.VISIBLE);
            }
        });


        rl_game_over.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_start.setVisibility(View.VISIBLE);
                instruction.setVisibility(View.VISIBLE);
                credit.setVisibility(View.VISIBLE);
                rl_game_over.setVisibility(View.INVISIBLE);
                gv.setStart(false);
                gv.reset();
            }
        });
        mediaPlayer = MediaPlayer.create(this, R.raw.sillychipsong);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.pause();
    }
}