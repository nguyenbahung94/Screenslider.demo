package com.example.android.screensliderdemo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by everything on 3/5/2016.
 */
public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    int[] image_res={R.drawable.hqdefault,R.drawable.dogpicture13,R.drawable.images,R.drawable.maxresdefault};
    LayoutInflater layoutInflater;
    public ViewPagerAdapter(Context context){
        this.context=context;
    }
    @Override
    public int getCount() {

        return image_res.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }
    public Object instantiateItem(ViewGroup container,int position){
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view=layoutInflater.inflate(R.layout.activity_viewpager,container,false);
        ImageView imageView=(ImageView)item_view.findViewById(R.id.imagehinh);
        imageView.setImageResource(image_res[position]);
        container.addView(item_view);
        return item_view;
    }
    public void destroyItem(ViewGroup container,int position,Object object){
        container.removeView((LinearLayout)object);
    }

}
