package com.nanoddegree.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ShopAdapter extends ArrayAdapter<Shop> {

  public ShopAdapter(Context context, ArrayList<Shop> words) {
    super(context, 0, words);
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    View listItemView = convertView;
    if (listItemView == null) {
      listItemView = LayoutInflater.from(getContext()).inflate(R.layout.shop_item, parent, false);
    }

    Shop shop = getItem(position);

    TextView shopTitle = (TextView) listItemView.findViewById(R.id.shopTitle);
    shopTitle.setText(shop.getTitle());

    ImageView shopLogo = (ImageView) listItemView.findViewById(R.id.list_item_icon);
    shopLogo.setImageResource(shop.getImageURL());

    return listItemView;
  }
}
