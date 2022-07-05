package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void rockSelect(View view){
        this.optionSelect(1);
    }
    public void paperSelect(View view){
        this.optionSelect(2);
    }
    public void scissorsSelect(View view){
        this.optionSelect(3);
    }
    public void optionSelect(int optionSelect){
        //1-rock 2-paper 3-scissors
        ImageView imgApp = findViewById(R.id.imageApp);
        TextView result = findViewById(R.id.result);

        int num = new Random().nextInt(3);
        int[] options = {1, 2, 3};
        int optionApp = options[num];

        switch (optionApp){
            case 1:
                imgApp.setImageResource(R.drawable.pedra);
                break;
            case 2:
                imgApp.setImageResource(R.drawable.papel);
                break;
            case 3:
                imgApp.setImageResource(R.drawable.tesoura);
                break;
        }

        if((optionApp==1 && optionSelect==3) || (optionApp==2 && optionSelect==1) || (optionApp==3 && optionSelect==2)){
            result.setText("VOCE PERDEU :(");
            result.setTextColor(getResources().getColor(R.color.red));
        }
        else if((optionApp==1 && optionSelect==2) ||(optionApp==2 && optionSelect==3) || (optionApp==3 && optionSelect==2)
                || (optionApp==3 && optionSelect==1)){
            result.setText("VOCE GANHOU :)");
            result.setTextColor(getResources().getColor(R.color.green));
        }
        else{
            result.setTextColor(getResources().getColor(R.color.blue));;
            result.setText("VOCE EMPATOU :|");

        }
    }
}