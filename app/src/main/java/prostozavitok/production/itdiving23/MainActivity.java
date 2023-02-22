package prostozavitok.production.itdiving23;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import prostozavitok.production.itdiving23.Handlers.cameraButtonOnClickListener;
import prostozavitok.production.itdiving23.Handlers.changeShowModeOnClickListener;
import prostozavitok.production.itdiving23.Handlers.contactsButtonOnClickListener;
import prostozavitok.production.itdiving23.Handlers.exitButtonOnClickListener;
import prostozavitok.production.itdiving23.Handlers.handButtonOnClickListener;
import prostozavitok.production.itdiving23.Handlers.micrButtonOnClickListener;
import prostozavitok.production.itdiving23.Handlers.smsButtonOnClickListener;

public class MainActivity extends AppCompatActivity {
    private ImageButton smsButton, contactsButton, viewModeButton, cameraButton, micrButton,
            handButton, endCallButton, exitArrowButton;
    private Boolean cameraOn = false, micOn = false;
    private LinearLayout scrollLinLayout, inLayout;
    ScrollView scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smsButton = findViewById(R.id.smsButton);
        contactsButton = findViewById(R.id.contactsButton);
        handButton = findViewById(R.id.handButtton);
        viewModeButton = findViewById(R.id.viewModeButton);
        cameraButton = findViewById(R.id.cameraButton);
        micrButton = findViewById(R.id.microphoneButton);
        endCallButton = findViewById(R.id.callEndButton);
        handButton = findViewById(R.id.handButtton);
        scrollLinLayout=findViewById(R.id.callParticipantsLinLayout);
        inLayout=findViewById(R.id.cardLinearLayout);
        scroll = findViewById(R.id.scrollView2);
        inLayout = findViewById(R.id.cardLinearLayout);
        exitArrowButton =  findViewById(R.id.exitButton);

        cameraButton.setOnClickListener(new cameraButtonOnClickListener(cameraButton, cameraOn));
        micrButton.setOnClickListener(new micrButtonOnClickListener(micrButton, micOn));
        handButton.setOnClickListener(new handButtonOnClickListener(getSupportFragmentManager()));
        endCallButton.setOnClickListener(new exitButtonOnClickListener(this));

        contactsButton.setOnClickListener(new contactsButtonOnClickListener(getSupportFragmentManager()));
        viewModeButton.setOnClickListener(new changeShowModeOnClickListener(inLayout, scrollLinLayout, scroll));
        smsButton.setOnClickListener(new smsButtonOnClickListener(this, getPackageManager()));
        exitArrowButton.setOnClickListener(new exitButtonOnClickListener(this));
    }
}