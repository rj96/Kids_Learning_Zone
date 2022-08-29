package com.example.kids_learning_zone;




import android.graphics.Bitmap;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;

import android.speech.tts.TextToSpeech;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    // creating the object of type DrawView
    // in order to get the reference of the View
    private DrawView paint;
    //instance for textRecognizer
    TextRecognizer recognizer = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
    Bitmap bmp;
    Button save;
    TextView textView;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        // getting the reference of the views from their ids
        paint = findViewById(R.id.draw_view);
        Button undo = findViewById(R.id.btn_undo);

        // creating objects of type button
        save = findViewById(R.id.btn_save);

        //creating object of type textView for result show
        textView = findViewById(R.id.textView);

        //create an object textToSpeech and adding voice feature to it
        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR ){
                    // To choose language
                    textToSpeech.setLanguage(Locale.UK);
                }
            }
        });

        // creating a OnClickListener for each button,
        // to perform certain actions

        // the undo button will remove the most
        // recent stroke from the canvas
        undo.setOnClickListener(view -> {
            paint.undo();
            textView.setText("Result");
        });

        // the save button will save the current
        // canvas which is actually a bitmap
        // in form of PNG, in the storage
        save.setOnClickListener(view -> {

            // getting the bitmap from DrawView class
            bmp = paint.save();

           /* String root = Environment.getExternalStorageDirectory().toString();
            File myDir = new File(root + "/saved_images");
            myDir.mkdirs();

            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fname = "draw_"+ timeStamp +".jpg";

            File file = new File(myDir, fname);
            if (file.exists()) file.delete ();
            try {
                FileOutputStream out = new FileOutputStream(file);
                bmp.compress(Bitmap.CompressFormat.JPEG, 100, out);
                out.flush();
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            } */

            // taking input for text recog part
            try {

                processImage();
            }
            catch (Exception e) {
                System.out.println("0000000000000000"+e);
            }


        });

        // pass the height and width of the custom view
        // to the init method of the DrawView object
        ViewTreeObserver vto = paint.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                paint.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int width = paint.getMeasuredWidth();
                int height = paint.getMeasuredHeight();
                paint.init(height, width);
            }
        });

        //Using file uri to input the image
    }

    public void processImage(){
        //TextView resultText = findViewById(R.id.resultView);
        System.out.println("In process image");
        InputImage image = InputImage.fromBitmap(bmp,0);
        Task<Text> result =
                recognizer.process(image)
                        .addOnSuccessListener(new OnSuccessListener<Text>() {
                            @Override
                            public void onSuccess(@NonNull Text text) {
                                // Task completed successfully
                                // ...
                                //Getting result Text
                                StringBuilder result = new StringBuilder();
                                for (Text.TextBlock block : text.getTextBlocks()) {
                                    String blockText = block.getText();
                                    Point[] blockCornerPoints = block.getCornerPoints();
                                    Rect blockFrame = block.getBoundingBox();
                                    for (Text.Line line : block.getLines()) {
                                        String lineText = line.getText();
                                        Point[] lineCornerPoints = line.getCornerPoints();
                                        Rect lineFrame = line.getBoundingBox();
                                        for (Text.Element element : line.getElements()) {
                                            String elementText = element.getText();
                   /* Point[] elementCornerPoints = element.getCornerPoints();
                    Rect elementFrame = element.getBoundingBox(); */
                                            result.append(elementText);
                                        }
                                       textView.setText(blockText); //reflecting result on textView
                                        // trying to speech out the result got
                                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                            textToSpeech.speak(blockText,TextToSpeech.QUEUE_FLUSH,null,null);
                                        } else {
                                            textToSpeech.speak(blockText, TextToSpeech.QUEUE_FLUSH, null);
                                        }
                                        System.out.println(blockText+"  000000");
                                    }
                                }
                            }
                        })
                        .addOnFailureListener(
                                new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        // Task failed with an exception
                                        // ...
                                        Toast.makeText(MainActivity.this, "Failed to detect"+e.getMessage(), Toast.LENGTH_SHORT).show();
                                    }
                                });


    }
}
