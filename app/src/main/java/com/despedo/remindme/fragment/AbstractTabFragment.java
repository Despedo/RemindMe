package com.despedo.remindme.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by Despedo on 15.03.2017.
 */

public class AbstractTabFragment extends Fragment {
    protected Context context;
    protected View view;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
