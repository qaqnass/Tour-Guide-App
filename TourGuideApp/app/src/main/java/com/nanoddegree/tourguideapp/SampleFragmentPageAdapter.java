package com.nanoddegree.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


class SampleFragmentPageAdapter extends FragmentPagerAdapter {

  private String tabTitles[] = {"Hotel", "Food", "Hospital", "Shop"};

  public SampleFragmentPageAdapter(FragmentManager fm) {
    super(fm);
  }

  @Override
  public Fragment getItem(int position) {
    switch (position) {
      case 0:
        return new HotelFragment();
      case 1:
        return new FoodFragment();
      case 2:
        return new HospitalFragment();
      case 3:
        return new ShopFragment();
      default:
        return new HotelFragment();
    }
  }

  @Override
  public int getCount() {
    return 4;
  }

  @Override
  public CharSequence getPageTitle(int position) {
    return tabTitles[position];
  }
}
