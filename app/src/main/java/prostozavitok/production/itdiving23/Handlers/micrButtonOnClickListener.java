package prostozavitok.production.itdiving23.Handlers;

import android.view.View;
import android.widget.ImageButton;

import prostozavitok.production.itdiving23.R;



public class micrButtonOnClickListener implements View.OnClickListener{
    private ImageButton ib;
    private Boolean cameraOn;
    public micrButtonOnClickListener(ImageButton ib, Boolean micrOn){
        this.ib = ib;
        this.cameraOn = micrOn;
    }

    public void onClick(View v){
        if (cameraOn){
            cameraOn = false;
            ib.setImageResource(R.drawable.baseline_mic_off_24);
        } else {
            cameraOn = true;
            ib.setImageResource(R.drawable.baseline_mic_24);
        }

    }
}