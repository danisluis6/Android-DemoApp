package com.example.enclaveit.fragmentdemo.ui.activities.chapterone;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
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
                final Toast toast = ConfiguraToast.makeToast((Activity) context,"Defining the layout as a reusable list","To create a fragment for the book list, we define a new layout resource file called\n" +
                        "fragment_book_list.xml . We copy the top ScrollView element and its contents\n" +
                        "from the activity_main.xml resource file to the fragment_book_list.xml\n" +
                        "resource file.", Toast.LENGTH_LONG);
                toast.show();
                /**
                 * Description Codeing File XML
                     <ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
                     android:id="@+id/scrollTitles"
                     android:layout_width="match_parent"
                     android:layout_height="0dp"
                     android:layout_weight="1">
                     <RadioGroup
                     android:id="@+id/bookSelectGroup"
                     android:layout_width="wrap_content"
                     android:layout_height="wrap_content">
                     <RadioButton
                     android:checked="true"
                     android:id="@+id/dynamicUiBook"
                     android:text="@string/dynamicUiTitle"
                     android:layout_width="wrap_content"
                     android:layout_height="wrap_content" />
                     <RadioButton
                     android:id="@+id/android4NewBook"
                     android:text="@string/android4NewTitle"
                     android:layout_height="wrap_content"
                     android:layout_width="wrap_content" />
                     <RadioButton
                     android:id="@+id/android5NewBook"
                     android:text="@string/android4NewTitle"
                     android:layout_height="wrap_content"
                     android:layout_width="wrap_content" />
                     <RadioButton
                     android:id="@+id/android6NewBook"
                     android:text="@string/android4NewTitle"
                     android:layout_height="wrap_content"
                     android:layout_width="wrap_content" />
                     <RadioButton
                     android:id="@+id/android7NewBook"
                     android:text="@string/android4NewTitle"
                     android:layout_height="wrap_content"
                     android:layout_width="wrap_content" />
                     <!-- Other RadioButtons elided for clarify -->
                     </RadioGroup>
                     </ScrollView>
                 *
                 */
                break;
            case R.id.two:
                final Toast toast2 = ConfiguraToast.makeToast((Activity) context,"Encapsulating the display layout","For the book description, we'll define a layout resource file called\n" +
                        "fragment_book_desc.xml . The fragment layout includes the contents\n" +
                        "of the activity layout resource's bottom ScrollView element (has an id\n" +
                        "value of scrollDescription ). Just as in the book list fragment,\n" +
                        "we'll remove the layout_weight attribute, set the layout_height\n" +
                        "attribute to match_parent , and add the android namespace\n" +
                        "prefix declaration.", Toast.LENGTH_LONG);
                toast2.show();
                /**
                 * Description Code XML
                     <ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
                     android:layout_width="match_parent"
                     android:layout_height="match_parent"
                     android:id="@+id/scrollDescription">
                     <TextView
                     android:layout_width="wrap_content"
                     android:layout_height="wrap_content"
                     android:textAppearance="?android:attr/textAppearanceMedium"
                     android:text="@string/dynamicUiDescription"
                     android:id="@+id/textView"
                     android:paddingLeft="@dimen/activity_horizontal_margin"
                     android:paddingRight="@dimen/activity_horizontal_margin"
                     android:gravity="fill_horizontal"/>
                     </ScrollView>
                 */
                break;
            case R.id.three:
                final Toast toast3 = ConfiguraToast.makeToast((Activity) context,"Converting the activity to use fragments","we'll remove all the book titles and description layout information from the\n" +
                        "activity_main.xml layout resource file. The file now contains just the top-level\n" +
                        "LinearLayout element and comments to show where the book titles and description", 20000);
                toast3.show();
                /**
                 *   <LinearLayout
                     android:orientation="vertical"
                     android:layout_width="match_parent"
                     android:layout_height="match_parent"
                     xmlns:android="http://schemas.android.com/apk/res/android">
                     <!-- List of Book Titles
                     -->
                     <!-- Description of selected book
                     </LinearLayout>
                 */
                break;
            case R.id.four:
                 /**
                  * First with Activity: We using three attribute to decorate
                  * android:layout_width = 'match_parent'
                  * android:layout_weight = '1'
                  * android:layout_height = '0dp'
                  */

                 /**
                  * Second with Acitivty: We will seprate part of activity with call
                  * (WEBSITEL: header,footer or sidebar)
                  * (MOBILE : fgrament)
                  * Notice that: We remove all attribute
                  */

                  /**
                   * MIDDLE STEP
                   * We provide the display fragment. We will using extend Fragment and Under function onCreateView
                   * (It's is Lifecycle Android)
                   * public class BookDescFragment extends Fragment {
                      @Override
                      public View onCreateView(LayoutInflater inflater, ViewGroup
                          container, Bundle savedInstanceState) {
                              View viewHierarchy =
                              inflater.inflate(R.layout.fragment_book_desc, container,
                              false);
                              return viewHierarchy;
                          }
                      }
                   * Every fragment, will have a class java to provide display fragment.
                   */


                /** Final with activity =>
                 *  Using again with 3 commnad line to completed UI and set Fragment Layout
                 *  Thanks for researching...
                 */
                break;
        }
        return true;

    }
}
