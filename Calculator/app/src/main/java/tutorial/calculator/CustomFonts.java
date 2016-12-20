package tutorial.calculator;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by vuongluis on 18/12/2016.
 */
public class CustomFonts {

    private Context context;

    public CustomFonts(Context context) {
        this.context = context;
    }

    public Typeface setFont(String fonts){
        Typeface typeface = Typeface.createFromAsset(context.getAssets(),"fonts/"+fonts+".ttf");
        return typeface;
    }
}
