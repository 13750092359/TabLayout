package mobileapplicationsclass.tablayout.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by pyk on 2016/9/3 0003.
 * QQ:543478509
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> list;
    List<String>mTitleList;

    public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> list, List<String> mTitleList){
        super(fm);
        this.list = list;
        this.mTitleList=mTitleList;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitleList.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }
}
