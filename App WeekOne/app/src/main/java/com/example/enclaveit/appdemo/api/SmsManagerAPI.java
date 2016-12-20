package com.example.enclaveit.appdemo.api;

import android.app.PendingIntent;
import android.telephony.SmsManager;

/**
 * Created by enclaveit on 15/12/2016.
 */

public class SmsManagerAPI{
    /**
     * Syntax   : sendTextMessage(String destinationAddress, String scAddress, String text,
     * PendingIntent sentIntent, PendingIntent deliveryIntent)
     * Purpose  : Send a text based SMS.
     * Required : SmsManagerAPI.getDefault();
     */
    public boolean sendTextMessage(String destinationAddress, String scAddress, String text, PendingIntent sentIntent, PendingIntent deliveryIntent){
        boolean result = true;
        try{
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(destinationAddress,scAddress,text,sentIntent,deliveryIntent);
        }catch (Exception ex){
            result = false;
        }
        return result;
    }

    /**
     * Notice that:
     * @param destinationAddress : +840972248187
     * @param text : I love you so much.
     */
    public boolean sendTextMessage(String destinationAddress, String text){
        boolean result = true;
        try{
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(destinationAddress,null,text,null,null);
        }catch (Exception ex){
            result = false;
        }
        return result;
    }
}
