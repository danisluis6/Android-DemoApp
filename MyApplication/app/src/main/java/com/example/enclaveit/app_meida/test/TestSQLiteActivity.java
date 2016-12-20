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

        final String nametx = String.valueOf("Last Christmas");
        final String authortx = String.valueOf("Wham!");
        final String singertx = String.valueOf("Wham!");
        final String lyrictx = String.valueOf("1. Once bitten and twice shy\n" +
                "I keep my distance but you still catch my eye\n" +
                "Tell me baby do you recognise me\n" +
                "Well it's been a year, it doesn't surprise me.\n" +
                "\n" +
                "(Happy Christmas!) I wrapped it up and sent it\n" +
                "With a note saying \"I Love You\" I meant it\n" +
                "Now I know what a fool i've been\n" +
                "But if you kissed me now I know you'd fool me again.\n" +
                "\n" +
                "[Chorus:]\n" +
                "Last Christmas, I gave you my heart\n" +
                "But the very next day, You gave it away\n" +
                "This year, to save me from tears\n" +
                "I'll give it to someone special.\n" +
                "\n" +
                "2. A crowded room, friends with tired eyes\n" +
                "I'm hiding from you and your soul of ice\n" +
                "My God I thought you were someone to rely on\n" +
                "Me? I guess I was a shoulder to cry on\n" +
                "A face on a lover with a fire in his heart\n" +
                "A man undercover but you tore me apart\n" +
                "Oooh Oooh\n" +
                "Now i've found a real love you'll never fool me again.\n" +
                "\n" +
                "[Coda:]\n" +
                "A face on a lover with a fire in his heart\n" +
                "(Gave you my heart)\n" +
                "A man undercover but you tore me apart\n" +
                "Next year\n" +
                "I'll give it to someone, i'll give it to someone special\n" +
                "Last Christmas lyrics on ChiaSeNhac.vn\n" +
                "Special, someone, someone\n" +
                "I'll give it to someone, i'll give it to someone special\n" +
                "Who'll give me something in return\n" +
                "I'll give it to someone\n" +
                "Hold my heart and watch it burn\n" +
                "I'll give it to someone, i'll give it to someone special\n" +
                "I've got you here to stay\n" +
                "I can love you for a day\n" +
                "I thought you were someone special\n" +
                "Gave you my heart\n" +
                "I'll give it to someone, i'll give it to someone\n" +
                "Last christmas I gave you my heart\n" +
                "You gave it away\n" +
                "I'll give it to someone, i'll give it to someone.");

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
