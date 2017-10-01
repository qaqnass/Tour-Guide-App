package com.nanoddegree.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopFragment extends Fragment {

  ArrayList<Shop> shops;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.activity_shop_fragment, container, false);

    shops = new ArrayList<Shop>();
    shops.add(new Shop("AAA", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("BBB", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));
    shops.add(new Shop("CCC", R.drawable.ic_android_black_24dp));

    ShopAdapter shopAdapter = new ShopAdapter(getContext(), shops);

    ListView listView = (ListView) view.findViewById(R.id.listItem);
    listView.setAdapter(shopAdapter);
    return view;
  }
}
