package prostozavitok.production.itdiving23.Handlers;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.view.View;


import androidx.fragment.app.FragmentManager;

import prostozavitok.production.itdiving23.HelloDialogFragment;
import prostozavitok.production.itdiving23.R;

public class handButtonOnClickListener  implements View.OnClickListener{
    private FragmentManager manager;
    public handButtonOnClickListener(FragmentManager manager){
        this.manager = manager;
    }
    public void onClick(View v){
        HelloDialogFragment myDialogFragment = new HelloDialogFragment();
        myDialogFragment.show(manager, "myDialog");

    }
}
