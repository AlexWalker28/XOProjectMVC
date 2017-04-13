package com.example.alexwalker.xoprojectmvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button00;
    Button button10;
    Button button20;
    Button button01;
    Button button11;
    Button button21;
    Button button02;
    Button button12;
    Button button22;
    TextView textView;
    XOController controller;
    XOView view;
    XOModel model;
    View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        model = new XOModel();
        controller = new XOController(model);
        view = new XOView(model);

        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button00:
                        controller.setData(0, 0, controller.getPlayer());
                        button00.setText(view.getPlayer());
                        controller.update();
                        if (model.getWinner() != 0) textView.setText(view.getWinner());
                        break;
                    case R.id.button10:
                        controller.setData(1, 0, controller.getPlayer());
                        button10.setText(view.getPlayer());
                        controller.update();
                        if (model.getWinner() != 0) textView.setText(view.getWinner());
                        break;
                    case R.id.button20:
                        controller.setData(2, 0, controller.getPlayer());
                        button20.setText(view.getPlayer());
                        controller.update();
                        if (model.getWinner() != 0) textView.setText(view.getWinner());
                        break;
                }
            }
        };

        setOnClickListeners();


    }

    private void setOnClickListeners() {
        button00.setOnClickListener(onClickListener);
        button10.setOnClickListener(onClickListener);
        button20.setOnClickListener(onClickListener);
        button01.setOnClickListener(onClickListener);
        button11.setOnClickListener(onClickListener);
        button21.setOnClickListener(onClickListener);
        button02.setOnClickListener(onClickListener);
        button12.setOnClickListener(onClickListener);
        button22.setOnClickListener(onClickListener);
    }

    private void init() {
        button00 = (Button)findViewById(R.id.button00);
        button10 = (Button)findViewById(R.id.button10);
        button20 = (Button)findViewById(R.id.button20);
        button01 = (Button)findViewById(R.id.button01);
        button11 = (Button)findViewById(R.id.button11);
        button21 = (Button)findViewById(R.id.button21);
        button02 = (Button)findViewById(R.id.button02);
        button12 = (Button)findViewById(R.id.button12);
        button22 = (Button)findViewById(R.id.button22);
        textView = (TextView)findViewById(R.id.textView);
    }
}
