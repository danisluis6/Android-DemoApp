package com.example.enclaveit.fragmentdemo.ui.activities.chapterone;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

import com.example.enclaveit.fragmentdemo.R;
import com.example.enclaveit.fragmentdemo.lib.ConfiguraToast;

/**
 * @author
 * @author enclaveit  The activity displays a list of five book titles in the top portion of the activity.
 * When the user selects one of those books titles, the description of that book
 * appears in the bottom portion of the activity.
 */
public class BookActivity extends AppCompatActivity {

    private Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        setContentView(R.layout.activity_book);
    }

    private void configuras(){
        /**
         * Set fullscreen and title
         */
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.itemsbook, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch(item.getItemId()){
            case R.id.one:
//                final Toast toast = ConfiguraToast.makeToast((Activity) context,"The new thinking – fragment-oriented","The activity-oriented user interface we currently have would be fine if all Android\n" +
//                    "devices had the same form factor. As we've discussed, that's not the case.\n" +
//                    "We need to partition the application user interface so that we can switch to a\n" +
//                    "fragment-oriented approach. With proper partitioning, we can be ready to make\n" +
//                    "some simple enhancements to our application to help it adapt to device differences.\n" +
//                    "Let's look at some simple changes we can make that will partition our user interface.", Toast.LENGTH_LONG);
//                toast.show();
                break;
            case R.id.two:
//                final Toast toast2 = ConfiguraToast.makeToast((Activity) context,"The new thinking – fragment-oriented","The activity-oriented user interface we currently have would be fine if all Android\n" +
//                        "devices had the same form factor. As we've discussed, that's not the case.\n" +
//                        "We need to partition the application user interface so that we can switch to a\n" +
//                        "fragment-oriented approach. With proper partitioning, we can be ready to make\n" +
//                        "some simple enhancements to our application to help it adapt to device differences.\n" +
//                        "Let's look at some simple changes we can make that will partition our user interface.", Toast.LENGTH_LONG);
//                toast2.show();
                break;
        }
        return true;

    }
}
