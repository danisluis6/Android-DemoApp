package com.example.enclaveit.appdemo.ui.intent;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.enclaveit.appcontacts.R;

public class DemoImplicitIntent extends Activity {

    private EditText enter_number;

    private Button btcall;
    private Button btsms;
    private Button btimg;

    private Button btZero;
    private Button btOne;
    private Button btTwo;
    private Button btThree;
    private Button btFour;
    private Button btFive;
    private Button btSix;
    private Button btSeven;
    private Button btEight;
    private Button btNine;

    private Context context = this;
    private String text = "";
    private String m_text = "";

    private static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        setContentView(R.layout.activity_demo_implicit_intent);
        initComponents();
        addOnListenerCall();
    }

    private void configuras() {
        /**
         * Set fullscreen and title
         */
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    private void initComponents() {
        enter_number = (EditText) this.findViewById(R.id.enter_number);
        btcall = (Button) this.findViewById(R.id.btcall);
        btsms = (Button)this.findViewById(R.id.btsms);
        btimg = (Button)this.findViewById(R.id.btimg);

        btZero = (Button) this.findViewById(R.id.btZero);
        btOne = (Button) this.findViewById(R.id.btOne);
        btTwo = (Button) this.findViewById(R.id.btTwo);
        btThree = (Button) this.findViewById(R.id.btThree);
        btFour = (Button) this.findViewById(R.id.btFour);
        btFive = (Button) this.findViewById(R.id.btFive);
        btSix = (Button) this.findViewById(R.id.btSix);
        btSeven = (Button) this.findViewById(R.id.btSeven);
        btEight = (Button) this.findViewById(R.id.btEight);
        btNine = (Button) this.findViewById(R.id.btNine);
    }

    private void addOnListenerCall() {
        btcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * Implicit Intent
                 * Why ?: An implicit intent specifies an action that can invoke any app on the device
                 * able to perform the action. Using an implicit intent is useful when your app cannot perform
                 * the action, but other apps probably can and you'd like the user to pick which app to use.
                 * For example:
                 */
                enter_number.setText(String.valueOf(text));
                Intent intentCall = new Intent(Intent.ACTION_CALL);
                if(text.length()>=9 && text.length() <= 10){
                    String phone = "tel:"+text;
                    intentCall.setData(Uri.parse(phone));
                    if (ActivityCompat.checkSelfPermission(context.getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intentCall);
                }else{
                    Toast.makeText(context.getApplicationContext(),"Format phone is not correct!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String phone = enter_number.getText().toString();
                String msg = m_text;
                /**
                 * CREATE TITLE: DIALOGE BOX
                 * + Get data from dialog box
                 * + Create one or more selection
                 */
                AlertDialog.Builder builder = new AlertDialog.Builder(DemoImplicitIntent.this);
                builder.setTitle("Messenger Chat");

                final EditText message = new EditText(DemoImplicitIntent.this);
                message.setInputType(InputType.TYPE_CLASS_TEXT);
                LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                message.setLayoutParams(lp1);
                builder.setView(message);

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        m_text = message.getText().toString();
                        /**
                         * Way 1: Send Message Using SmsManagerAPI
                         * You can API to send text message
                         */
//                        if(new SmsManagerAPI().sendTextMessage(phone,m_text)){
//                            Toast.makeText(DemoImplicitIntent.this,"SMS send to successfully!",Toast.LENGTH_SHORT).show();
//                        }else{
//                            Toast.makeText(DemoImplicitIntent.this,"SMS send to fail. Try again!",Toast.LENGTH_SHORT).show();
//                        }

                        /**
                         * Way 2: Send Message Using ImplicitIntent
                         */
                        try{
                            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                            sendIntent.putExtra("sms_body",m_text);
                            sendIntent.setType("vnd.android-dir/mms-sms");
                            startActivity(sendIntent);
                            Toast.makeText(DemoImplicitIntent.this,"SMS send to successfully!",Toast.LENGTH_SHORT).show();
                        }catch (Exception ex){
                            Toast.makeText(DemoImplicitIntent.this,"SMS send to fail. Try again!",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });

        btimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
                }
            }
        });

        /**
         * Add event click in android studio
         */
        btZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btZero.getText());
                enter_number.setText(String.valueOf(text));
            }
        });

        btOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btOne.getText());
                enter_number.setText(String.valueOf(text));
            }
        });

        btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btTwo.getText());
                enter_number.setText(String.valueOf(text));
            }
        });

        btThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btThree.getText());
                enter_number.setText(String.valueOf(text));
            }
        });

        btFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btFour.getText());
                enter_number.setText(String.valueOf(text));
            }
        });

        btFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btFive.getText());
                enter_number.setText(String.valueOf(text));
            }
        });

        btSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btSix.getText());
                enter_number.setText(String.valueOf(text));
            }
        });

        btSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btSeven.getText());
                enter_number.setText(String.valueOf(text));
            }
        });

        btEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btEight.getText());
                enter_number.setText(String.valueOf(text));
            }
        });

        btNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btNine.getText());
                enter_number.setText(String.valueOf(text));
            }
        });

        /**
         * Reset text
         */
        enter_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = "";
                enter_number.setText(String.valueOf(text));
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = intent.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("intent");
            Log.d("img",String.valueOf(imageBitmap));
            // mImageView.setImageBitmap(imageBitmap);
        }else{
            Log.d("img","Error");
        }
    }
}
