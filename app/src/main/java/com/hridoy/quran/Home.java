package com.hridoy.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Home extends AppCompatActivity {
    Button p1,p2,p3,p4,p5,s1,s2,s3,s4,s5;
    PDFView mypdfviewer;
    Button pre,nex,menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mypdfviewer=(PDFView)findViewById(R.id.pdfviewer);
        mypdfviewer.fromAsset("Quranpak.pdf").load();
        pre=(Button)findViewById(R.id.prev);
        nex=(Button)findViewById(R.id.next);
        menu=(Button)findViewById(R.id.menu);


        p1=(Button)findViewById(R.id.p1);
        p2=(Button)findViewById(R.id.p2);
        p3=(Button)findViewById(R.id.p3);
        p4=(Button)findViewById(R.id.p4);
        p5=(Button)findViewById(R.id.p5);


        s1=(Button)findViewById(R.id.s1);
        s2=(Button)findViewById(R.id.s2);
        s3=(Button)findViewById(R.id.s3);
        s4=(Button)findViewById(R.id.s4);
        s5=(Button)findViewById(R.id.s5);

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(mypdfviewer.getCurrentPage()-1);


            }
        });

        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(mypdfviewer.getCurrentPage()+1);


            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();


            }
        });



        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(2);
                Show();

            }

            private void Show() {
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(20);
                Show();
            }
        });

        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(38);

                Show();
            }
        });

        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(56);

                Show();
            }
        });

        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(74);

                Show();
            }
        });




        ///Code for surahs open
        ///@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(1);

                Show();
            }
        });

        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(2);

                Show();
            }
        });

        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(45);

                Show();
            }
        });

        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(69);

                Show();
            }
        });

        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(96);

                Show();
            }
        });









    }

    private void Show() {

            mypdfviewer.setVisibility(View.VISIBLE);
            pre.setVisibility(View.VISIBLE);
            nex.setVisibility(View.VISIBLE);
            menu.setVisibility(View.VISIBLE);
        }


        @Override
        public void onBackPressed() {
            mypdfviewer.setVisibility(View.INVISIBLE);
            pre.setVisibility(View.INVISIBLE);
            nex.setVisibility(View.INVISIBLE);
            menu.setVisibility(View.INVISIBLE);
        }
    }

