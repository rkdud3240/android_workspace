package com.example.myapp4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class IntentActivity_B extends AppCompatActivity {

    final static String TAG = IntentActivity_B.class.getName();//IntentActivity_B
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_b);

        if(getIntent() != null){
            int getNumber = getIntent().getIntExtra("number1", 0);
            int getRoomNumber = getIntent().getIntExtra("roomNumber", 0);
            String getStrData = getIntent().getStringExtra("strData");

            //String 데이터 타입으로 값 받기
            Log.d(TAG,"getNumber :" + getNumber);
            Log.d(TAG,"getRoomNumber :"+getRoomNumber);
            Log.d(TAG,"getStrData :"+getStrData);
        }
        TextView textView = findViewById(R.id.textViewB);
        textView.setOnClickListener(v->{
            Intent resultIntent = new Intent();
            resultIntent.putExtra("result",100);
//            if (true){
//                //값을 돌려 보낼 때 //()안에 커서 두고 ctrl p 하면 어떤 타입 넣어야하는지 알려줌
//                setResult(Activity.RESULT_OK, resultIntent);
//            }else{
//                setResult(Activity.RESULT_CANCELED, resultIntent);
//            }
            setResult(Activity.RESULT_OK, resultIntent);

            finish(); // 화면 종료 메서드
        });
        Log.d(TAG,"B : onCreate 호출");
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"B : onStart 호출");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG,"B : onResume 호출");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"B : onPause 호출");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"B : onStop 호출");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"B : onDestroy 호출");
    }
}