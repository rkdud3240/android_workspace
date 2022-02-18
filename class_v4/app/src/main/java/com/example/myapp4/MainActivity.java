package com.example.myapp4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG1 = "Life_Cycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG1,"onCreate 호출됨");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG1,"onStart 호출됨");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG1,"onResume 호출됨");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG1,"onPause 호출됨");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG1,"onStop 호출됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG1,"onDestroy 호출됨");
    }
}
// 액티비티는 앱에 한 화면이다.
// portrait mode 가로모드는 랜드 스케이프 모드
//intent란 의도 또는 의사전달, 요청
// A라는 화면에 B라는 버튼 누르면 B화면 보여줌
// A 화면의 라이프사이클 / B 화면의 라이프 사이클
// 인텐트 
//1. 명시적 인텐트
//2. 암시적 인텐트