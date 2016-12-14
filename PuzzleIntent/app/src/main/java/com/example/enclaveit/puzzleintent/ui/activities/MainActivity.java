package com.example.enclaveit.puzzleintent.ui.activities;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TableRow;

import com.example.enclaveit.puzzleintent.R;
import com.example.enclaveit.puzzleintent.lib.InterfaceView;
import com.example.enclaveit.puzzleintent.utils.CustomFonts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements InterfaceView{

    private EditText enterNumber;
    private EditText showNumber;
    private TableRow tbRow;

    private List<String> listRow = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        setContentView(R.layout.activity_main);
        initComponents();

        listRow.add("tbRow1");
//        listRow.add("tbRow2");
//        listRow.add("tbRow3");
//        listRow.add("tbRow4");
//        listRow.add("tbRow5");

        for (int index= 0;index < listRow.size(); index++){
            int resIdTitle = getResources().getIdentifier(listRow.get(index), "id", getPackageName());
            tbRow = (TableRow) this.findViewById(resIdTitle);
            tbRow.addView(getLineHorizontal());
        }

    }

    private void configuras() {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    private void initComponents(){
        enterNumber = (EditText) this.findViewById(R.id.enterNumber);
        enterNumber.setTypeface(new CustomFonts(MainActivity.this).setFont("Roboto-Medium"));

        showNumber = (EditText)this.findViewById(R.id.showNumber);
        showNumber.setTypeface(new CustomFonts(MainActivity.this).setFont("Roboto-Black"));
    }

    @Override
    public View getLineHorizontal() {
        View view = new View(this);
        view.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, 1));
        view.setBackgroundResource(R.drawable.horizontal_line);
        return view;
    }

    @Override
    public View getLineVertical(){
        return null;
    }
}