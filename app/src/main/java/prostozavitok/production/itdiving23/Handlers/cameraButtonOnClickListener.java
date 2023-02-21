package prostozavitok.production.itdiving23.Handlers;

import android.view.View;
import android.widget.ImageButton;

import androidx.core.util.SparseBooleanArrayKt;

import prostozavitok.production.itdiving23.R;

public class cameraButtonOnClickListener implements View.OnClickListener{
    private ImageButton ib;
    private Boolean cameraOn;
    public cameraButtonOnClickListener(ImageButton ib, Boolean cameraOn){
        this.ib = ib;
        this.cameraOn = cameraOn;
    }

    public void onClick(View v){
        if (cameraOn){
            cameraOn = false;
            ib.setImageResource(R.drawable.baseline_videocam_off_24);
        } else {
            cameraOn = true;
            ib.setImageResource(R.drawable.baseline_videocam_24);
        }

    }
}
