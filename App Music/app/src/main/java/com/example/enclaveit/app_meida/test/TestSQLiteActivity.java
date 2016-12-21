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

        final String nametx = String.valueOf("Baby");
        final String authortx = String.valueOf("Justin Bieber; Ludacris");
        final String singertx = String.valueOf("Justin Bieber; Ludacris");
        final String lyrictx = String.valueOf("You know you love me, I know you care\n" +
                "Just shout whenever, and i'll be there\n" +
                "You are my love, you are my heart\n" +
                "And we will never ever ever be apart.\n" +
                "\n" +
                "Are we an item? Girl, quit playing\n" +
                "We're just friends, what are you saying\n" +
                "Say there's another and look right in my eyes\n" +
                "My first love broke my heart for the first time\n" +
                "And I was like...\n" +
                "\n" +
                "[Chorus:]\n" +
                "Baby, ibaby, ibaby oooh\n" +
                "Like ibaby, ibaby, ibaby nooo\n" +
                "Like ibaby, ibaby, ibaby oooh\n" +
                "I thought you'd always be mine (mine).\n" +
                "\n" +
                "Baby, ibaby, ibaby oooh\n" +
                "Like ibaby, ibaby, ibaby nooo\n" +
                "Like ibaby, ibaby, ibaby oooh\n" +
                "I thought you'd always be mine (mine).\n" +
                "\n" +
                "2. Oh, for you I would have done whatever\n" +
                "And I just can't believe we ain't together\n" +
                "And I wanna play it cool, but I'm losin' you\n" +
                "I'll buy you anything, i'll buy you any ring\n" +
                "And I'm in pieces, ibaby fix me\n" +
                "And just shake me 'til you wake me from this bad dream\n" +
                "I'm going down, down, down, down\n" +
                "And I just can't believe my first love won't be around.\n" +
                "\n" +
                "And I'm like\n" +
                "Baby, ibaby, ibaby oooh\n" +
                "Like ibaby, ibaby, ibaby nooo\n" +
                "Like ibaby, ibaby, ibaby oooh\n" +
                "I thought you'd always be mine (mine).\n" +
                "\n" +
                "Baby, ibaby, ibaby oooh\n" +
                "Like ibaby, ibaby, ibaby nooo\n" +
                "Like ibaby, ibaby, ibaby oooh\n" +
                "I thought you'd always be mine (mine)\n" +
                "\n" +
                "[Rap:]\n" +
                "Luda! When I was 13, I had my first love,\n" +
                "There was nobody that compared to my ibaby\n" +
                "And nobody came between us or could ever come above\n" +
                "She had me going crazy, oh, I was star-struck\n" +
                "She woke me up daily, don't need no Starbucks\n" +
                "Baby lyrics on ChiaSeNhac.vn\n" +
                "She made my heart pound, it skipped a beat when I see her in the street and\n" +
                "At school on the playground but I really wanna see her on the weekend\n" +
                "She knows she got me dazing cause she was so amazing\n" +
                "And now my heart is breaking but I just keep on saying.\n" +
                "\n" +
                "[Chorus:]\n" +
                "Baby, ibaby, ibaby oooh\n" +
                "Like ibaby, ibaby, ibaby nooo\n" +
                "Like ibaby, ibaby, ibaby oooh\n" +
                "I thought you'd always be mine (mine).\n" +
                "\n" +
                "Baby, ibaby, ibaby oooh\n" +
                "Like ibaby, ibaby, ibaby nooo\n" +
                "Like ibaby, ibaby, ibaby oooh\n" +
                "I thought you'd always be mine (mine).\n" +
                "\n" +
                "I'm gone (Yeah Yeah Yeah, Yeah Yeah Yeah)\n" +
                "Now I'm all gone (Yeah Yeah Yeah, Yeah Yeah Yeah)\n" +
                "Now I'm all gone (Yeah Yeah Yeah, Yeah Yeah Yeah)\n" +
                "Now I'm all gone (gone, gone, gone)\n" +
                "I'm gone.");

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
