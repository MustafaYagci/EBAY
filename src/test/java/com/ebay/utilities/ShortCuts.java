package com.ebay.utilities;

public class ShortCuts {


    public static void staticWait(int x){
        int total=x*1000;
        try{
            Thread.sleep(total);
        }catch (Exception e){

        }
    }

    public static String pageTitle(){
       return Driver.get().getTitle();
    }




}
