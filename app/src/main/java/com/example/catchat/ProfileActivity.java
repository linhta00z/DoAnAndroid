package com.example.catchat;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {
    //firebase auth
    // FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Profile");

        //init
        // firebaseAuth=FirebaseAuth.getInstance();

    }
    //private void checkUserStatus(){
    //get current user
    //    FirebaseUser user=firebaseAuth.getCurrentUser();
    //   if(user!=null)
    //   {
    //user is signed in stay here
    //     }
    //   else {
    //user not signed in ,go to main activity
    //       startActivity(new Intent(ProfileActivity.this,MainActivity.class));
    //     finish();
    //   }
    // }

    //@Override
    //protected void onStart() {
    //Check on start
    //  super.onStart();
    //}
}