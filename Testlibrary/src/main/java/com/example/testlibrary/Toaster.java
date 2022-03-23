package com.example.testlibrary;
import android.widget.Toast;
import android.content.Context;

public class Toaster {

    public static void s(Context c,String msg){

        Toast.makeText(c,msg,Toast.LENGTH_SHORT).show();
    }

}
