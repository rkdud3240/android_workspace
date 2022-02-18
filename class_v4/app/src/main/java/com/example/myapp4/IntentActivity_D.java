package com.example.myapp4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class IntentActivity_D extends AppCompatActivity {

    final static String TAG = IntentActivity_D.class.getName();//IntentActivity_D
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_d);

        if(getIntent() != null){
            int getNumber = getIntent().getIntExtra("number1",0);
            int getRoomNumber = getIntent().getIntExtra("roomNumber",0);
            String getStrData = getIntent().getStringExtra("strData");

            //string 데이터 타입으로 값 받기
            Log.d(TAG,"getNumber : "+ getNumber);
            Log.d(TAG,"getRoomNumber : "+ getRoomNumber);
            Log.d(TAG,"getStrData : "+ getStrData);
        }
        TextView textView = findViewById(R.id.textViewD);
        textView.setOnClickListener(v->{
            Intent resultIntent = new Intent();
            resultIntent.putExtra("result",100);
            setResult(Activity.RESULT_OK, resultIntent);

            finish();// 화면 종료 메서드
        });
        Log.d(TAG, "D : onCreate 호출");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "D : onStart 호출");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "D : onResume 호출");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "D : onPause 호출");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "D : onStop 호출");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "D : onDestroy 호출");
    }
}