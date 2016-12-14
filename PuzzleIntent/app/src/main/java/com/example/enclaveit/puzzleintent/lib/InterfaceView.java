package com.example.enclaveit.puzzleintent.lib;

import android.view.View;

/**
 * Created by enclaveit on 14/12/2016.
 */

public interface InterfaceView {
    /**
     * Initial a view and support design gui with tablelayout or using object tablerow
     * For example:
     * I want to design gui for app calculator and i need draw line horizontal and vertical
     * So, I can't draw xml layout. I need custom and create a view to make that
     * Below a example to make that:
     * View view = new View(this);
     * view.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, 1));
     * view.setBackgroundResource(R.drawable.horizontal_line);
     *
     * View view = new View(this);
     * view.setLayoutParams(new TableRow.LayoutParams(1, TableRow.LayoutParams.MATCH_PARENT));
     * view.setBackgroundResource(R.drawable.vertical_line);
     * return view;
     */
    public abstract View getLineHorizontal();
    public abstract View getLineVertical();
}
