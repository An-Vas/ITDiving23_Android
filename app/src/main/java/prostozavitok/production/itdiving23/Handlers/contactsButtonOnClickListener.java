package prostozavitok.production.itdiving23.Handlers;

import android.view.View;

import androidx.fragment.app.FragmentManager;

import prostozavitok.production.itdiving23.ContactsDialogFragment;
import prostozavitok.production.itdiving23.HelloDialogFragment;

public class contactsButtonOnClickListener implements View.OnClickListener{
    private FragmentManager manager;
    public contactsButtonOnClickListener(FragmentManager manager){
        this.manager = manager;
    }
    public void onClick(View v){
        ContactsDialogFragment myDialogFragment = new ContactsDialogFragment();
        myDialogFragment.show(manager, "myContactsDialog");

    }
}
