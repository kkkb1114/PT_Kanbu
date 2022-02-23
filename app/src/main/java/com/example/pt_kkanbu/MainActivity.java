package com.example.pt_kkanbu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    // 상단 툴바 변수
    private ActionBar actionbar;

    private Toolbar toolbar;

    // 상단 툴바 소메뉴 변수
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        ViewSet();
    }

    // 뷰 세팅 메소드
    public void ViewSet(){
        // 상단 툴바
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.myCarList:
                        Toast.makeText(mContext,"myCarList", Toast.LENGTH_SHORT).show();
                        item.setCheckable(true);
                        drawerLayout.closeDrawers();
                        return true;

                    case R.id.connect:
                        Toast.makeText(mContext,"connect", Toast.LENGTH_SHORT).show();
                        item.setCheckable(true);
                        drawerLayout.closeDrawers();
                        return true;

                    case R.id.setting:
                        Toast.makeText(mContext,"setting", Toast.LENGTH_SHORT).show();
                        item.setCheckable(true);
                        drawerLayout.closeDrawers();
                        return true;
                }
                return false;
            }
        });

    }



}