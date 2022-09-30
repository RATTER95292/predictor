package com.example.predictor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView2;
    Button button;
    String[] phrase = new String[20];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2=(TextView)findViewById(R.id.textView2);
        button=(Button)findViewById(R.id.button);
        phrase = getResources().getStringArray(R.array.Phrase);

    }
    /*Не забудь!
    - Сначала доделать логигу приложения!
    - поменять оформление кнопки!
    - поменять оформление текста!
    - Поменять задний фон!
    - Поменять логотип!
    - добавить свое лого в приложение!
    Не смей удалять пока все не сделаешь!
*/
    public String getRandomPhrase(){
        // всего фраз 21 (Сделай тттттак что бы он сам считывал информасию)
        int marx=1;
        int min=21;
        String random_phrase = " ";
        int x = 0;
        x = (int) (Math.random()*(((marx-min)+1))+min);
        random_phrase = phrase[x];
        return random_phrase;
    }


    public void Button_click(View view){
        textView2.setText(getRandomPhrase());
    }
}