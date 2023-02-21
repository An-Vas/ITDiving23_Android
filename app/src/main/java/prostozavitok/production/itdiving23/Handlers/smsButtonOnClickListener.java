package prostozavitok.production.itdiving23.Handlers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.Telephony;
import android.view.View;
import android.widget.Toast;

public class smsButtonOnClickListener implements View.OnClickListener{
    private Context appContext;
    private PackageManager packageManager;
    private Activity activity;

    public smsButtonOnClickListener(Context appContext, PackageManager packageManager){
        this.appContext = appContext;
        this.packageManager = packageManager;

    };
    public void onClick(View v){

        Intent intent = packageManager.getLaunchIntentForPackage(Telephony.Sms.getDefaultSmsPackage(appContext));
        if (intent != null){
            appContext.startActivity(intent);
        } else {
            Toast.makeText(appContext, "no relevant sms app",
                    Toast.LENGTH_LONG).show();
        }

    }
}
