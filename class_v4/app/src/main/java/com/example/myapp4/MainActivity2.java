package com.example.myapp4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {
    
    //변수 : 태그 하나 더 만들기 (태그 필터 생성)
    private String TAG2 = "Life_cycle2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(TAG2, "onCreate 호출됨2");
    }
    //Life cycle 메서드 오버라이드 해보기

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG2, "onStart 호출됨2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG2, "onResume 호출됨2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG2, "onPause 호출됨2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG2, "onStop 호출됨2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG2, "onDestroy 호출됨2");
    }
}