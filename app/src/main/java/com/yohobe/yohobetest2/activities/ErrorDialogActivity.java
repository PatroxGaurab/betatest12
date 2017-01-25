package com.yohobe.yohobetest2.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.IntentService;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import com.yohobe.yohobetest2.R;

/**
 * Created by patrox on 22/1/17.
 */

public class ErrorDialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //hide activity title

        Intent iin= getIntent();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder
                .setTitle("")
                .setMessage("")
                .setCancelable(false)
                .setNegativeButton("OK", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }

}