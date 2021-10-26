package com.example.tradex;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    //private FirebaseAuth firebaseAuth;
    //FirebaseUser firebaseUser;
    String myuid;
    ActionBar actionBar;
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionBar = getSupportActionBar();
        actionBar.setTitle("TradeX");
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008B8B"));
        actionBar.setBackgroundDrawable(colorDrawable);
        //firebaseAuth = FirebaseAuth.getInstance();

        navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(selectedListener);
        //actionBar.setTitle("Home");

        // When we open the application first
        // time the fragment should be shown to the user
        // in this case it is home fragment
        NewCallsFragment fragment = new NewCallsFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content, fragment, "");
        fragmentTransaction.commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener selectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {

                case R.id.nav_newcalls:
                    actionBar.setTitle("New Calls");
                    ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008B8B"));
                    actionBar.setBackgroundDrawable(colorDrawable);
                    NewCallsFragment fragment = new NewCallsFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.content, fragment, "");
                    fragmentTransaction.commit();
                    return true;

                case R.id.nav_profile:
                    actionBar.setTitle("Profile");
                    colorDrawable = new ColorDrawable(Color.parseColor("#008B8B"));
                    actionBar.setBackgroundDrawable(colorDrawable);
                    ProfileFragment fragment1 = new ProfileFragment();
                    FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.content, fragment1);
                    fragmentTransaction1.commit();
                    return true;

                case R.id.nav_previouscalls:
                    actionBar.setTitle("Previous Calls");
                    colorDrawable = new ColorDrawable(Color.parseColor("#008B8B"));
                    actionBar.setBackgroundDrawable(colorDrawable);
                    PreviousCallsFragment fragment2 = new PreviousCallsFragment();
                    FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.content, fragment2, "");
                    fragmentTransaction2.commit();
                    return true;

                case R.id.nav_chat:
                    actionBar.setTitle("Chats");
                    colorDrawable = new ColorDrawable(Color.parseColor("#008B8B"));
                    actionBar.setBackgroundDrawable(colorDrawable);
                    com.example.tradex.ChatsFragment listFragment = new com.example.tradex.ChatsFragment();
                    FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.content, listFragment, "");
                    fragmentTransaction3.commit();
                    return true;

                case R.id.nav_stocks:
                    actionBar.setTitle("Stocks");
                    colorDrawable = new ColorDrawable(Color.parseColor("#008B8B"));
                    actionBar.setBackgroundDrawable(colorDrawable);
                    StocksFragment fragment4 = new StocksFragment();
                    FragmentTransaction fragmentTransaction4 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction4.replace(R.id.content, fragment4, "");
                    fragmentTransaction4.commit();
                    return true;
            }
            return false;
        }
    };
}
