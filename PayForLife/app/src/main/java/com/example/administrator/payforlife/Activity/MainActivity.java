package com.example.administrator.payforlife.Activity;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.administrator.payforlife.Fragment.FriendFragment;
import com.example.administrator.payforlife.Fragment.MyFragment;
import com.example.administrator.payforlife.Fragment.ShouyeFragment;
import com.example.administrator.payforlife.R;

public class MainActivity extends AppCompatActivity {
    private Button btnHome;
    private Button btnFriend;
    private Button btnMe;
    private android.support.v4.app.FragmentManager fragmentManager;
    private FriendFragment friendFragment;
    private ShouyeFragment shouyeFragment;
    private MyFragment myFragment;
    private Fragment currentFragment = new Fragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getview();
        setListener();
        friendFragment = new FriendFragment();
        shouyeFragment=new ShouyeFragment();
        myFragment=new MyFragment();
        changeFragment(shouyeFragment);
    }

    private void changeFragment(Fragment fragment){
        if(null == fragmentManager){
            fragmentManager = getSupportFragmentManager();
        }
        if(currentFragment != fragment){
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.hide(currentFragment);
            if(!fragment.isAdded()) {
                transaction.add(R.id.show_fragment,fragment);
            }
            transaction.show(fragment);
            transaction.commit();
            currentFragment = fragment;
        }
    }

    private void setListener() {
        OnclickedImpl listener = new OnclickedImpl();
        btnHome.setOnClickListener(listener);
        btnFriend.setOnClickListener(listener);
        btnMe.setOnClickListener(listener);
    }

    private void getview() {
        btnHome =findViewById(R.id.btn_home);
        btnFriend = findViewById(R.id.btn_friend);
        btnMe = findViewById(R.id.btn_me);
    }
    private class OnclickedImpl implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_home:
                    changeFragment(shouyeFragment);
                    break;
                case R.id.btn_friend:
                    changeFragment(friendFragment);
                    break;
                case R.id.btn_me:
                    changeFragment(myFragment);
                    break;
            }
        }
    }

}
