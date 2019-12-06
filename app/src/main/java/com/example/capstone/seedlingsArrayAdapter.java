package com.example.capstone;

import android.content.Context;
import android.widget.ArrayAdapter;

public class seedlingsArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mType;
    private String[] mMaturationPeriod;
    private String[] mClimate;

    public seedlingsArrayAdapter(Context mContext, int resource, String[] mType, String[] mMaturationPeriod, String[] mClimate) {
        super(mContext,resource);

        this.mContext = mContext;
        this.mType = mType;
        this.mMaturationPeriod = mMaturationPeriod;
        this.mClimate = mClimate;
    }

    @Override
    public Object getItem(int position){
        String type = mType[position];
        String maturationPeriod = mMaturationPeriod[position];
        String climate = mClimate[position];
        return String.format("  \n Characteristics of : %s   \n  \n Time: %s \n \n Climate : %s", type, maturationPeriod,climate);
    }

    @Override
    public int getCount() {
        return mType.length;
    }
}
