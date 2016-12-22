package com.example.enclaveit.app_meida.lib;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

@SuppressWarnings("all")
public class LibraryString {
	public static String md5(String input) {
        String result = input;
        MessageDigest md = null; 
        if(input != null) {
            try {
                md = MessageDigest.getInstance("MD5"); //or "SHA-1"
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(LibraryString.class.getName()).log(Level.SEVERE, null, ex);
            }
            md.update(input.getBytes());
            BigInteger hash = new BigInteger(1, md.digest());
            result = hash.toString(16);
            while(result.length() < 32) { //40 for SHA-1
                result = "0" + result;
            }
        }
        return result;
    }
    
    public static boolean isPassword(String password){
        String regex = "^[a-zA-Z]([a-zA-Z0-9!@#$%^&]{5,29})";
        return password.matches(regex);
    }
    
    public static Date convertToTime(long time){
    	int hours = 0,minutes = 0, seconds = 0;
    	Date thoiGianChoi = null;
    	hours = (int) (time/3600);
    	if(time%3600 != 0){
    		minutes = (int) (time%3600)/60;
    		if((int)(time%3600)%60 != 0){
    			seconds = (int)(time%3600)%60;
    		}
    	}    	
    	Format formatter = new SimpleDateFormat("HH:mm:ss");
	    try {
			thoiGianChoi = (Date) formatter.parseObject(String.format("%2d:%2d:%2d", hours,minutes,seconds));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return thoiGianChoi;
    }

    public static String convertToTimeMMSS(long time){
        String timeAfter = "";
        int hours = 0,minutes = 0, seconds = 0;
        hours = (int) (time/3600);
        if(time%3600 != 0){
            minutes = (int) (time%3600)/60;
            if((int)(time%3600)%60 != 0){
                seconds = (int)(time%3600)%60;
            }
        }
        if(minutes < 10){
            timeAfter += "0"+minutes;
        }else{
            timeAfter += minutes;
        }
        timeAfter+=":";
        if(seconds < 10){
            timeAfter += "0"+seconds;
        }else{
            timeAfter += seconds;
        }
        return timeAfter;
    }
    
    public static int operMoney(Date time,int donGia){
    	int money = time.getHours()*donGia + time.getMinutes()*donGia/60 + time.getSeconds()*donGia/3600; 
    	return money;
    }
    
    public static String changeCurrencyVND(String temp){
        String outString = "";
        int j = 0;
        int dot = temp.length()/3;
        if(temp.length()%3==0){
            dot = dot-1;
        }
        for(int i = temp.length()-1;i >= 0; i--){
            outString += temp.charAt(i);
            j++;
            if(j==3 && dot!=0){
               outString += ".";
               j = 0;
               dot--;
            }
        }
        return new StringBuilder(outString).reverse().toString();
    }
    
    public static String formatTime(Date temp){
    	String result = "";
    	if(temp.getHours() < 10){
    		result += "0"+temp.getHours();
    	}else{
    		result += temp.getHours();
    	}
    	if(temp.getMinutes() < 10){
    		result += ":0"+temp.getMinutes();
    	}else{
    		result += ":"+temp.getMinutes();
    	}
    	if(temp.getSeconds() < 10){
    		result += ":0"+temp.getSeconds();
    	}else{
    		result += ":"+temp.getSeconds();
    	}
    	return result;    	
    }
}
