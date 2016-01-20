package com.project.ted555.theknowledge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ted555 on 1/18/2016.
 */
public class GridCustomAdapter extends BaseAdapter {

    Context mContext;
    String[] textStr;
    int[] images;
    public static LayoutInflater mInflater = null;

    GridCustomAdapter(Context mContext, String[] textStr, int[] images){
        this.mContext = mContext;
        this.textStr = textStr;
        this.images = images;
        mInflater = (LayoutInflater)mContext.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder{
        public ImageView imageFlag;
        public TextView txtViewTitle;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder mViewHolder;
        if (convertView == null){
            mViewHolder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.grid_item, null);

            mViewHolder.txtViewTitle = (TextView)convertView.findViewById(R.id.textView1);
            mViewHolder.imageFlag = (ImageView) convertView.findViewById(R.id.imageView1);

            convertView.setTag(mViewHolder);
        }else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        mViewHolder.txtViewTitle.setText(textStr[position]);
        mViewHolder.imageFlag.setImageResource(images[position]);
        return convertView;
    }
}
