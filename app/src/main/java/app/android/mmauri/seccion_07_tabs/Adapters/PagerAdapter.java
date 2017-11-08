package app.android.mmauri.seccion_07_tabs.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import app.android.mmauri.seccion_07_tabs.Fragments.FirstFragment;
import app.android.mmauri.seccion_07_tabs.Fragments.SecondFragment;
import app.android.mmauri.seccion_07_tabs.Fragments.ThirdFragment;

/**
 * Created by marc on 11/8/17.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public PagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.numberOfTabs;
    }
}
