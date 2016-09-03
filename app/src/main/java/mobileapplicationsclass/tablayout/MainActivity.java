package mobileapplicationsclass.tablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import mobileapplicationsclass.tablayout.adapter.MyFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.tablayout_view)
    TabLayout tablayoutView;
    @Bind(R.id.vp_view)
    ViewPager vpView;


    private LayoutInflater mInflater;
    private List<String> mTitleList = new ArrayList<>();//页卡标题集合
    private List<Fragment> mViewList = new ArrayList<>();//页卡视图集合
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initTab();
    }

    private void initTab() {

        //实例化Fragment
        Fre1 fre1 = new Fre1();
        Fre2 fre2 = new Fre2();
        Fre3 fre3 = new Fre3();
        Fre4 fre4 = new Fre4();
        Fre5 fre5 = new Fre5();


        //添加页卡视图
        mViewList.add(fre1);
        mViewList.add(fre2);
        mViewList.add(fre3);
        mViewList.add(fre4);
        mViewList.add(fre5);

        //添加页卡标题
        mTitleList.add("白羊座");
        mTitleList.add("双子座");
        mTitleList.add("水瓶座");
        mTitleList.add("摩羯座");
        mTitleList.add("狮子座");

        tablayoutView.setTabMode(TabLayout.MODE_SCROLLABLE);
        tablayoutView.addTab(tablayoutView.newTab().setText(mTitleList.get(0)));
        tablayoutView.addTab(tablayoutView.newTab().setText(mTitleList.get(1)));
        tablayoutView.addTab(tablayoutView.newTab().setText(mTitleList.get(2)));
        tablayoutView.addTab(tablayoutView.newTab().setText(mTitleList.get(3)));
        tablayoutView.addTab(tablayoutView.newTab().setText(mTitleList.get(4)));
        //        tablayoutView.addTab(tablayoutView.newTab().setText("处女座"));
        //        tablayoutView.addTab(tablayoutView.newTab().setText("金牛座"));
        //        tablayoutView.addTab(tablayoutView.newTab().setText("天蝎座"));
        //        tablayoutView.addTab(tablayoutView.newTab().setText("射手座"));
        //        tablayoutView.addTab(tablayoutView.newTab().setText("天秤座"));
        //        tablayoutView.addTab(tablayoutView.newTab().setText("巨蟹座"));
        //        tablayoutView.addTab(tablayoutView.newTab().setText("双鱼座"));

        MyFragmentPagerAdapter myPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),mViewList,mTitleList);
        vpView.setAdapter(myPagerAdapter);
        tablayoutView.setupWithViewPager(vpView);
        tablayoutView.setTabsFromPagerAdapter(myPagerAdapter);




    }



}
