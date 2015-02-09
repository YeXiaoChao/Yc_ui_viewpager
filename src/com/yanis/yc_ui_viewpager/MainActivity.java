package com.yanis.yc_ui_viewpager;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends Activity {
	private View view1,view2,view3;
	private List<View> viewList;
	ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();  
	}

	private void initView() {

        mViewPager = (ViewPager) findViewById(R.id.viewpager); 
        
		LayoutInflater lf = getLayoutInflater().from(this);  
        view1 = lf.inflate(R.layout.layout1, null);  
        view2 = lf.inflate(R.layout.layout2, null);  
        view3 = lf.inflate(R.layout.layout3, null);  
  
        viewList = new ArrayList<View>();// 将要分页显示的View装入数组中   
        viewList.add(view1);  
        viewList.add(view2);  
        viewList.add(view3);  
        
        mViewPager.setAdapter(new MyViewPagerAdapter(viewList));
	}
	
	
}
