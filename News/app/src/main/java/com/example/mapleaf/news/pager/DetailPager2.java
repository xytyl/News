package com.example.mapleaf.news.pager;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Mapleaf on 2016/7/3.
 */
public class DetailPager2 extends BaseDetailPager{
    public DetailPager2(Activity activity) {
        super(activity);
    }

    @Override
    protected View initView() {
        TextView textView = new TextView(mActivity);
        textView.setText("detail-专题");
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        textView.setTextSize(40);
        return textView;
    }
}
