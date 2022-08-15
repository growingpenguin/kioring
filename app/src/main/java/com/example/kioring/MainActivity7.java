package com.example.kioring;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private fragment_1 fragment_1;
    private fragment_2 fragment_2;
    private fragment_3 fragment_3;
    private fragment_4 fragment_4;
    private fragment_5 fragment_5;
    private fragment_6 fragment_6;
    private fragment_7 fragment_7;
    private fragment_8 fragment_8;
    private FragmentTransaction transaction;

    private Button coffeeBtn;
    private Button teaBtn;
    private Button smoothieBtn;
    private Button praffeBtn;
    private Button adeBtn;
    private Button juiceBtn;
    private Button cookieBtn;
    private Button cakeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_7);

        fragmentManager = getSupportFragmentManager();

        fragment_1 = new fragment_1();
        fragment_2 = new fragment_2();
        fragment_3 = new fragment_3();
        fragment_4 = new fragment_4();
        fragment_5 = new fragment_5();
        fragment_6 = new fragment_6();
        fragment_7 = new fragment_7();
        fragment_8 = new fragment_8();

        coffeeBtn = findViewById(R.id.coffee_btn);
        teaBtn = findViewById(R.id.tea_btn);
        smoothieBtn = findViewById(R.id.smoothie_btn);
        praffeBtn = findViewById(R.id.praffe_btn);
        adeBtn = findViewById(R.id.ade_btn);
        juiceBtn = findViewById(R.id.juice_btn);
        cookieBtn = findViewById(R.id.cookie_btn);
        cakeBtn = findViewById(R.id.cake_btn);

        coffeeBtn.setOnClickListener((View.OnClickListener) this);
        teaBtn.setOnClickListener((View.OnClickListener) this);
        smoothieBtn.setOnClickListener((View.OnClickListener) this);
        praffeBtn.setOnClickListener((View.OnClickListener) this);
        adeBtn.setOnClickListener((View.OnClickListener) this);
        juiceBtn.setOnClickListener((View.OnClickListener) this);
        cookieBtn.setOnClickListener((View.OnClickListener) this);
        cakeBtn.setOnClickListener((View.OnClickListener) this);

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragment_1).commitAllowingStateLoss();

    }



    public void onClick(View view) {
        transaction = fragmentManager.beginTransaction();

        switch (view.getId()) {
            case R.id.coffee_btn:
                transaction.replace(R.id.frameLayout, fragment_1);
                transaction.commit();
                break;
            case R.id.tea_btn:
                transaction.replace(R.id.frameLayout, fragment_2);
                transaction.commit();
                break;
            case R.id.smoothie_btn:
                transaction.replace(R.id.frameLayout, fragment_3);
                transaction.commit();
                break;

            case R.id.praffe_btn:
                transaction.replace(R.id.frameLayout, fragment_4);
                transaction.commit();
                break;

            case R.id.ade_btn:
                transaction.replace(R.id.frameLayout, fragment_5);
                transaction.commit();
                break;

            case R.id.juice_btn:
                transaction.replace(R.id.frameLayout, fragment_6);
                transaction.commit();
                break;

            case R.id.cookie_btn:
                transaction.replace(R.id.frameLayout, fragment_7);
                transaction.commit();
                break;

            case R.id.cake_btn:
                transaction.replace(R.id.frameLayout, fragment_8);
                transaction.commit();
                break;
        }

    }
}