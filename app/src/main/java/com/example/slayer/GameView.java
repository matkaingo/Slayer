package com.example.slayer;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
    private Bird bird;
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        bird = new Bird();
        bird.setWidth(100*Constants.SCREEN_WIDTH/1080);
        bird.setHeight(100*Constants.SCREEN_HEIGHT/1920);
        bird.setX(100*Constants.SCREEN_WIDTH/1080);
        bird.setY(Constants.SCREEN_HEIGHT/2-bird.getHeight()/2);
    }
    public void draw(Canvas canvas){
        super.draw(canvas);
    }
}
