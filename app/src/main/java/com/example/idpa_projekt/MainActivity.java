package com.example.idpa_projekt;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button T11;
    Button T12;
    Button T13;
    Button T14;
    Button T15;
    Button T16;
    Button T17;
    Button T18;

    Button T21;
    Button T22;
    Button T23;
    Button T24;
    Button T25;
    Button T26;
    Button T27;
    Button T28;

    Button T31;
    Button T32;
    Button T33;
    Button T34;
    Button T35;
    Button T36;
    Button T37;
    Button T38;

    Button T41;
    Button T42;
    Button T43;
    Button T44;
    Button T45;
    Button T46;
    Button T47;
    Button T48;

    Button T51;
    Button T52;
    Button T53;
    Button T54;
    Button T55;
    Button T56;
    Button T57;
    Button T58;

    Button T61;
    Button T62;
    Button T63;
    Button T64;
    Button T65;
    Button T66;
    Button T67;
    Button T68;

    Button T71;
    Button T72;
    Button T73;
    Button T74;
    Button T75;
    Button T76;
    Button T77;
    Button T78;

    Button T81;
    Button T82;
    Button T83;
    Button T84;
    Button T85;
    Button T86;
    Button T87;
    Button T88;

    Button[][] Tiles = new Button[8][8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //SetButtonVariables();
        //Play();

        for (int i = 0; i<7; i++){
            for (int j = 0; j<7; j++){
                Tiles[i][j].setBackgroundResource(R.drawable.whiterook);
            }
        }
        RelativeLayout mainlayout = (RelativeLayout) findViewById(R.id.mainlayout);
    }

    /*public void SetButtonVariables(){
        Button T11 = findViewById(R.id.T11);
        Button T12 = findViewById(R.id.T12);
        Button T13 = findViewById(R.id.T13);
        Button T14 = findViewById(R.id.T14);
        Button T15 = findViewById(R.id.T15);
        Button T16 = findViewById(R.id.T16);
        Button T17 = findViewById(R.id.T17);
        Button T18 = findViewById(R.id.T18);

        Button T21 = findViewById(R.id.T21);
        Button T22 = findViewById(R.id.T22);
        Button T23 = findViewById(R.id.T23);
        Button T24 = findViewById(R.id.T24);
        Button T25 = findViewById(R.id.T25);
        Button T26 = findViewById(R.id.T26);
        Button T27 = findViewById(R.id.T27);
        Button T28 = findViewById(R.id.T28);

        Button T31 = findViewById(R.id.T31);
        Button T32 = findViewById(R.id.T32);
        Button T33 = findViewById(R.id.T33);
        Button T34 = findViewById(R.id.T34);
        Button T35 = findViewById(R.id.T35);
        Button T36 = findViewById(R.id.T36);
        Button T37 = findViewById(R.id.T37);
        Button T38 = findViewById(R.id.T38);

        Button T41 = findViewById(R.id.T41);
        Button T42 = findViewById(R.id.T42);
        Button T43 = findViewById(R.id.T43);
        Button T44 = findViewById(R.id.T44);
        Button T45 = findViewById(R.id.T45);
        Button T46 = findViewById(R.id.T46);
        Button T47 = findViewById(R.id.T47);
        Button T48 = findViewById(R.id.T48);

        Button T51 = findViewById(R.id.T51);
        Button T52 = findViewById(R.id.T52);
        Button T53 = findViewById(R.id.T53);
        Button T54 = findViewById(R.id.T54);
        Button T55 = findViewById(R.id.T55);
        Button T56 = findViewById(R.id.T56);
        Button T57 = findViewById(R.id.T57);
        Button T58 = findViewById(R.id.T58);

        Button T61 = findViewById(R.id.T61);
        Button T62 = findViewById(R.id.T62);
        Button T63 = findViewById(R.id.T63);
        Button T64 = findViewById(R.id.T64);
        Button T65 = findViewById(R.id.T65);
        Button T66 = findViewById(R.id.T66);
        Button T67 = findViewById(R.id.T67);
        Button T68 = findViewById(R.id.T68);

        Button T71 = findViewById(R.id.T71);
        Button T72 = findViewById(R.id.T72);
        Button T73 = findViewById(R.id.T73);
        Button T74 = findViewById(R.id.T74);
        Button T75 = findViewById(R.id.T75);
        Button T76 = findViewById(R.id.T76);
        Button T77 = findViewById(R.id.T77);
        Button T78 = findViewById(R.id.T78);

        Button T81 = findViewById(R.id.T81);
        Button T82 = findViewById(R.id.T82);
        Button T83 = findViewById(R.id.T83);
        Button T84 = findViewById(R.id.T84);
        Button T85 = findViewById(R.id.T85);
        Button T86 = findViewById(R.id.T86);
        Button T87 = findViewById(R.id.T87);
        Button T88 = findViewById(R.id.T88);


    }

    public void Play() {

    }

    public void moveknight (View view){
        T31.setBackgroundResource(R.drawable.move);
        T33.setBackgroundResource(R.drawable.move);
    }*/
}
