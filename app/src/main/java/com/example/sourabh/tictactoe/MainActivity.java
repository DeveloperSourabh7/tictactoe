package com.example.sourabh.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;
    int counter=1;
    int gamestate[]={3,3,3,3,3,3,3,3,3};
    boolean isactive=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void playagain(View v)
    {
           recreate();
    }
    public void crosspresent(View v)
    {
        ImageView img=(ImageView)v;
        if(gamestate[Integer.parseInt(img.getTag().toString())]==3&&isactive) {
            if (counter == 1) {
                img.setImageResource(R.drawable.cross);
                gamestate[Integer.parseInt(img.getTag().toString())] = counter;
                counter = 2;
                }
                else {
                img.setImageResource(R.drawable.zero);
                gamestate[Integer.parseInt(img.getTag().toString())] = counter;
                counter = 1;
            }
            if(gamestate[0]==gamestate[1]&&gamestate[1]==gamestate[2]&&gamestate[0]!=3)
            {
                Toast toast = Toast.makeText(MainActivity.this,"You Win "+ ("\ud83d\ude01"), Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                isactive=false;
            }
            if(gamestate[3]==gamestate[4]&&gamestate[4]==gamestate[5]&&gamestate[3]!=3)
            {
                Toast toast = Toast.makeText(MainActivity.this,"You Win "+ ("\ud83d\ude01"), Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                isactive=false;
            }
            if(gamestate[6]==gamestate[7]&&gamestate[7]==gamestate[8]&&gamestate[6]!=3)
            {

                Toast toast = Toast.makeText(MainActivity.this,"You Win "+ ("\ud83d\ude01"), Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                isactive=false;
            }
            if(gamestate[0]==gamestate[3]&&gamestate[3]==gamestate[6]&&gamestate[0]!=3)
            {

                Toast toast = Toast.makeText(MainActivity.this,"You Win "+ ("\ud83d\ude01"), Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                isactive=false;
            }
            if(gamestate[1]==gamestate[4]&&gamestate[4]==gamestate[7]&&gamestate[1]!=3)
            {

                Toast toast = Toast.makeText(MainActivity.this,"You Win "+ ("\ud83d\ude01"), Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                isactive=false;
            }
            if(gamestate[3]==gamestate[6]&&gamestate[6]==gamestate[8]&&gamestate[3]!=3)
            {

                Toast toast = Toast.makeText(MainActivity.this,"You Win "+ ("\ud83d\ude01"), Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                isactive=false;
            }
            if(gamestate[0]==gamestate[4]&&gamestate[4]==gamestate[8]&&gamestate[0]!=3)
            {

                Toast toast = Toast.makeText(MainActivity.this,"You Win "+ ("\ud83d\ude01"), Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                isactive=false;
            }
            if(gamestate[2]==gamestate[4]&&gamestate[4]==gamestate[6]&&gamestate[2]!=3)
            {

                Toast toast = Toast.makeText(MainActivity.this,"You Win "+ ("\ud83d\ude01"), Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                isactive=false;
            }
        }
    }
}
