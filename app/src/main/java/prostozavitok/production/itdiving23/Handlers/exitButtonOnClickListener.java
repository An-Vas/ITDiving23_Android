package prostozavitok.production.itdiving23.Handlers;

import android.app.Activity;
import android.view.View;

public class exitButtonOnClickListener implements View.OnClickListener{
    private Activity activity;
    public exitButtonOnClickListener(Activity context){
        this.activity = context;
    }
    public void onClick(View v){
        activity.finish();
        System.exit(0);
    }
}