package com.example.enclaveit.app_meida.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.enclaveit.app_meida.R;
import com.example.enclaveit.app_meida.models.bean.Song;
import com.example.enclaveit.app_meida.models.dao.ModelSong;

import java.util.ArrayList;

public class TestSQLiteActivity extends AppCompatActivity {

    private EditText name;
    private EditText author;
    private EditText singer;
    private EditText lyric;
    private Button btn;

    private ModelSong modelSong = new ModelSong(this);
    private ArrayList<Song> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_sqlite);
        initComponents();
        addOnListenner();
    }
    private void initComponents(){
        name = (EditText)this.findViewById(R.id.name);
        author = (EditText)this.findViewById(R.id.author);
        singer = (EditText)this.findViewById(R.id.singer);
        lyric = (EditText)this.findViewById(R.id.lyric);
        btn = (Button)this.findViewById(R.id.btn);
    }

    private void addOnListenner(){

//        final String nametx = String.valueOf(name.getText());
//        final String authortx = String.valueOf(name.getText());
//        final String singertx = String.valueOf(singer.getText());
//        final String lyrictx = String.valueOf(lyric.getText());

        final String nametx = String.valueOf("See You Again");
        final String authortx = String.valueOf("Universal (2015)");
        final String singertx = String.valueOf("Wiz Khalifa; Charlie Puth");
        final String lyrictx = String.valueOf("It's been a long day, without you my friend\n" +
                "And I'll tell you all about it when I see you again\n" +
                "We've come a long way from where we began\n" +
                "Oh I'll tell you all about it when I see you again\n" +
                "When I see you again.\n" +
                "\n" +
                "[Verse 1: Wiz Khalifa]\n" +
                "Damn, who knew\n" +
                "All the planes we flew\n" +
                "Good things we been through\n" +
                "That I'd be standing right here talking to you\n" +
                "Bout another path\n" +
                "I know we loved to hit the road and laugh\n" +
                "But something told me that it wouldn't last\n" +
                "Had to switch up look at things different see the bigger picture\n" +
                "Those were the days\n" +
                "Hard work forever pays\n" +
                "Now I see you in a better place.\n" +
                "\n" +
                "[Pre-Hook: Wiz Khalifa]\n" +
                "How could we not talk about family when family's all that we got?\n" +
                "Everything I went through you were standing by my side\n" +
                "And now you gon' be with me for the last ride.\n" +
                "\n" +
                "[Hook: Charlie Puth]\n" +
                "\n" +
                "[Verse 2: Wiz Khalifa]\n" +
                "First, you both go out your way\n" +
                "And the vibe is feeling strong\n" +
                "And what's small turned to a friendship\n" +
                "A friendship turned to a bond\n" +
                "See You Again lyrics on ChiaSeNhac.vn\n" +
                "And that bond will never be broken\n" +
                "The love will never get lost\n" +
                "And when brotherhood come first\n" +
                "Then the line will never be crossed\n" +
                "Established it on our own\n" +
                "When that line had to be drawn\n" +
                "And that line is what we reached\n" +
                "So remember me when i'm gone.\n" +
                "\n" +
                "[Pre-Hook: Wiz Khalifa]\n" +
                "\n" +
                "[Bridge: Charlie Puth]\n" +
                "So let the light guide your way, yea\n" +
                "Hold every memory as you go\n" +
                "And every road you take\n" +
                "Will always lead you home\n" +
                "Hoooooome.");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modelSong.open();
                if( modelSong.addItem(new Song(0,nametx,authortx,singertx,lyrictx)) > 0){
                    Toast.makeText(TestSQLiteActivity.this,"Successfully!",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(TestSQLiteActivity.this,"Fail!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
