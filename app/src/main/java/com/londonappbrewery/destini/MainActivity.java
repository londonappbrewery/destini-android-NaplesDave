package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;
 // Destini Story telling app Feb 8, 2018  - David King
public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView ;
    private TextView mButtonTop ;
    private TextView mButtonBottom ;
    private int mStoryIndex = 1; // track where we are in the story. 1 = T1_Story


    @Override
    public View findViewById(int id) {
        return super.findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (TextView) findViewById(R.id.buttonTop);
        mButtonBottom = (TextView) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

       mButtonTop.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

                // ifs for Left branch story
               if (mStoryIndex == 1 ) {

                   mStoryTextView.setText(R.string.T3_Story);
                   mButtonTop.setText(R.string.T3_Ans1);
                   mButtonBottom.setText(R.string.T3_Ans2);
                   mStoryIndex = 3;
               } else if (mStoryIndex == 2){
                       mStoryTextView.setText(R.string.T3_Story);
                   mButtonTop.setText(R.string.T3_Ans1);
                   mButtonBottom.setText(R.string.T3_Ans2);
                   mStoryIndex = 3;

               } else if (mStoryIndex == 3){
                   mStoryTextView.setText(R.string.T6_End);
                   mButtonTop.setVisibility(View.GONE); // remove button
                   mButtonBottom.setVisibility(View.GONE);// remove button

               } // end of ifs for LEFT Branch


           }// end on click Bottom Button
       });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
    mButtonBottom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            // If branch for RIGHT story branch
            if (mStoryIndex == 1){
                mStoryTextView.setText(R.string.T2_Story);
                mButtonTop.setText(R.string.T2_Ans1 );
                mButtonBottom.setText(R.string.T2_Ans2  );
                mStoryIndex = 2;
            } else if (mStoryIndex == 2){
                mStoryTextView.setText(R.string.T4_End);
                mButtonTop.setVisibility(View.GONE);// remove button
                mButtonBottom.setVisibility(View.GONE);// remove button
            }else if (mStoryIndex == 3) {
                mStoryTextView.setText(R.string.T5_End);
                mButtonTop.setVisibility(View.GONE);// remove button
                mButtonBottom.setVisibility(View.GONE);// remove button
            }
        }// end on click
    });// end listener
    }// end on create
} // end class
