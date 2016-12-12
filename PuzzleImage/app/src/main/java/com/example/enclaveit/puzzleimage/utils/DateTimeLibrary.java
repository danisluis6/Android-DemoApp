package com.example.enclaveit.puzzleimage.utils;

import java.util.Calendar;

/**
 * Created by enclaveit on 12/12/2016.
 */

public class DateTimeLibrary {

    private Calendar calendar;

    public DateTimeLibrary(){
        calendar = Calendar.getInstance();
    }

    public int getSeconds(){
        return calendar.get(Calendar.SECOND);
    }

    public String getTimeCurrent(){
        return calendar.get(Calendar.DATE)+":"+calendar.get(Calendar.MONTH)+":"+calendar.get(Calendar.YEAR)+
                " "+calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND);
    }
}
