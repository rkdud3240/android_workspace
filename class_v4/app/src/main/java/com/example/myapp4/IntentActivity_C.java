package com.example.myapp4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class IntentActivity_C extends AppCompatActivity {
    
    //1. 버튼 만들기
    //2. 인텐트 만들기
    //3. 인텐트 값 전달하기
    //4. 값 돌려 받기

    final static String TAG = IntentActivity_C.class.getName();//IntentActivity_C

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_c);

        Log.d(TAG,"C : onCreate 호출");

        Button button = findViewById(R.id.ButtonC);
//        button.setOnClickListener(v->{
//
//            //B라는 화면을 보내줘 -> os
//            //1. 명시적 인텐트
//            Intent intent1 = new Intent(this, IntentActivity_D.class);
//            // 1-1. 인텐트 값을 보내는 방법
//            intent1.putExtra("nmumber1",1);
//            intent1.putExtra("roomNumber",2);
//            intent1.putExtra("strData","안녕");//키와 밸류 값 맵 구조
//
//            //String 데이터 타입으로 바꾸기
//            startActivity(intent1);
//
//            //암시적 인텐트(사용자가 가지고 있는 자원 안에서 선택권을 줌 : naver를 어떤 브라우저로 열지)
//            Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
//            startActivity(intent2);
//        });
        button.setOnClickListener(v->{
            Intent intent = new Intent(this, IntentActivity_D.class);
            //값을 안보냄
            //startActivity(intent);
            startActivityForResult(intent, 10001);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG,requestCode+"");
        Log.d(TAG,resultCode+"");
        Log.d(TAG,data+"");
        if(resultCode == RESULT_OK){
            int resultData = data.getIntExtra("result",0);
            Log.d(TAG,"resultData : "+ resultData);
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"C : onStart 호출");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"C : onResume 호출");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"C : onPause 호출");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"C : onStop 호출");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"C : onDestroy 호출");
    }
}