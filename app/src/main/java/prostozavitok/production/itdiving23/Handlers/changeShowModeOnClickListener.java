package prostozavitok.production.itdiving23.Handlers;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import prostozavitok.production.itdiving23.R;

public class changeShowModeOnClickListener implements View.OnClickListener{
    private LinearLayout additionallinearLayout, scrollLayout;
    private ScrollView scroll;

    public changeShowModeOnClickListener(LinearLayout linearLayout, LinearLayout scrollLayout, ScrollView scroll){

        this.additionallinearLayout = linearLayout;
        this.scrollLayout = scrollLayout;
        this.scroll = scroll;
    }

    public void onClick(View v){
        //scroll.removeAllViews();
        if (additionallinearLayout.getParent() != null){
            FrameLayout v1 = (FrameLayout)additionallinearLayout.getParent();
            v1.removeView(additionallinearLayout);
            scroll.removeAllViews();
        }
        scrollLayout.addView(additionallinearLayout);
    }
}
