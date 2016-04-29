package com.practice.myapplication.fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practice.myapplication.R;

/**
 * Created by hagtfms on 2016-04-25.
 */
public class MainFragment extends Fragment {
    private Bitmap mBitmapBackground;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        /**
         * http://egloos.zum.com/javalove/v/67828
         */
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 4;
        mBitmapBackground = BitmapFactory.decodeResource(
                getResources(), R.drawable.background_activity_fragment, options);
        v.setBackground(new BitmapDrawable(getResources(), mBitmapBackground));
        return v;
    }
    @Override
    public void onDestroyView(){
        if(mBitmapBackground != null){
            mBitmapBackground.recycle();
            mBitmapBackground = null;
        }
        super.onDestroyView();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}