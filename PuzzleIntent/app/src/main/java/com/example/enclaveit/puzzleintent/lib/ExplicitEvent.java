package com.example.enclaveit.puzzleintent.lib;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.enclaveit.puzzleintent.R;

/**
 * Created by enclaveit on 14/12/2016.
 */

public class ExplicitEvent implements View.OnClickListener,View.OnLongClickListener{

    private  String text = "";
    private EditText showEnter;
    private EditText showOperator;

    public ExplicitEvent(){
    }

    public ExplicitEvent(EditText showEnter,String text){
        this.showEnter = showEnter;
        this.text = text;
    }

    public ExplicitEvent(EditText showEnter,EditText showOperator){
        this.showEnter = showEnter;
        this.showOperator = showOperator;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btZero){
            if(view instanceof Button){
                Button btn = (Button) view;
                // btn.setAnimation();
                text += String.valueOf(btn.getText());
                Log.d("message",String.valueOf(text));
                this.showEnter.setText(String.valueOf(text));
            }
        }if(view.getId() == R.id.btOne){
            if(view instanceof Button){
                Button btn = (Button) view;
                // btn.setAnimation();
                text += String.valueOf(btn.getText());
                Log.d("message",String.valueOf(text));
                this.showEnter.setText(String.valueOf(text));
            }
        } else if(view.getId() == R.id.btTwo){
            if(view instanceof Button){
                Button btn = (Button) view;
                // btn.setAnimation();
                text += String.valueOf(btn.getText());
                this.showEnter.setText(String.valueOf(text));
            }
        }else if(view.getId() == R.id.btThree){
            if(view instanceof Button){
                Button btn = (Button) view;
                // btn.setAnimation();
                text += String.valueOf(btn.getText());
                this.showEnter.setText(String.valueOf(text));
            }
        }else if(view.getId() == R.id.btFour){
            if(view instanceof Button){
                Button btn = (Button) view;
                // btn.setAnimation();
                text += String.valueOf(btn.getText());
                this.showEnter.setText(String.valueOf(text));
            }
        }else if(view.getId() == R.id.btFive){
            if(view instanceof Button){
                Button btn = (Button) view;
                // btn.setAnimation();
                text += String.valueOf(btn.getText());
                this.showEnter.setText(String.valueOf(text));
            }
        }else if(view.getId() == R.id.btSix){
            if(view instanceof Button){
                Button btn = (Button) view;
                // btn.setAnimation();
                text += String.valueOf(btn.getText());
                this.showEnter.setText(String.valueOf(text));
            }
        }else if(view.getId() == R.id.btSeven){
            if(view instanceof Button){
                Button btn = (Button) view;
                // btn.setAnimation();
                text += String.valueOf(btn.getText());
                this.showEnter.setText(String.valueOf(text));
            }
        }else if(view.getId() == R.id.btEight){
            if(view instanceof Button){
                Button btn = (Button) view;
                // btn.setAnimation();
                text += String.valueOf(btn.getText());
                this.showEnter.setText(String.valueOf(text));
            }
        }else if(view.getId() == R.id.btNine){
            if(view instanceof Button){
                Button btn = (Button) view;
                // btn.setAnimation();
                text += String.valueOf(btn.getText());
                this.showEnter.setText(String.valueOf(text));
            }
        }else if(view.getId() == R.id.btAdd){
            if(view instanceof Button){
                Button btn = (Button) view;
                // btn.setAnimation();

            }
        }else if(view.getId() == R.id.btSub){
            if(view instanceof Button){
                Button btn = (Button) view;
                // btn.setAnimation();

            }
        }else if(view.getId() == R.id.btMul){
            if(view instanceof Button){
                Button btn = (Button) view;
                // btn.setAnimation();

            }
        }else if(view.getId() == R.id.btDiv){
            if(view instanceof Button){
                Button btn = (Button) view;
                // btn.setAnimation();

            }
        }else if(view.getId() == R.id.btResult){
            if(view instanceof Button){
                Button btn = (Button) view;
                // btn.setAnimation();

            }
        }
    }

    @Override
    public boolean onLongClick(View view) {
        return false;
    }
}
