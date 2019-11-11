package com.example.squares;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * @author Haley Welliver
 * Main activity
 */
public class MainActivity extends AppCompatActivity {

    private SquareController mainSquareController;
    private Puzzle puzzle;
    private ImageView[][] spots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        puzzle = new Puzzle(this);


        mainSquareController = new SquareController(puzzle);

        //links randomize button to view and sets listener
        Button randomizeButton = (Button)findViewById(R.id.randomizeButton);
        randomizeButton.setOnClickListener(mainSquareController);

        //imageView array for square spots
        spots = new ImageView[4][4];

        //links images to view and listeners
        ImageView one = (ImageView)findViewById(R.id.one);
        one.setOnClickListener(mainSquareController);
        spots[0][0] = one;

        ImageView two = (ImageView)findViewById(R.id.two);
        two.setOnClickListener(mainSquareController);
        spots[0][1] = two;

        ImageView three = (ImageView)findViewById(R.id.three);
        three.setOnClickListener(mainSquareController);
        spots[0][2] = three;

        ImageView four = (ImageView)findViewById(R.id.four);
        four.setOnClickListener(mainSquareController);
        spots[0][3] = four;

        ImageView five = (ImageView)findViewById(R.id.five);
        five.setOnClickListener(mainSquareController);
        spots[1][0] = five;

        ImageView six = (ImageView)findViewById(R.id.six);
        six.setOnClickListener(mainSquareController);
        spots[1][1] = six;

        ImageView seven = (ImageView)findViewById(R.id.seven);
        seven.setOnClickListener(mainSquareController);
        spots[1][2] = seven;

        ImageView eight = (ImageView)findViewById(R.id.eight);
        eight.setOnClickListener(mainSquareController);
        spots[1][3] = eight;

        ImageView nine = (ImageView)findViewById(R.id.nine);
        nine.setOnClickListener(mainSquareController);
        spots[2][0] = nine;

        ImageView ten = (ImageView)findViewById(R.id.ten);
        ten.setOnClickListener(mainSquareController);
        spots[2][1] = ten;

        ImageView eleven = (ImageView)findViewById(R.id.eleven);
        eleven.setOnClickListener(mainSquareController);
        spots[2][2] = eleven;

        ImageView twelve = (ImageView)findViewById(R.id.twelve);
        twelve.setOnClickListener(mainSquareController);
        spots[2][3] = twelve;

        ImageView thirteen = (ImageView)findViewById(R.id.thirteen);
        thirteen.setOnClickListener(mainSquareController);
        spots[3][0] = thirteen;

        ImageView fourteen = (ImageView)findViewById(R.id.fourteen);
        fourteen.setOnClickListener(mainSquareController);
        spots[3][1] = fourteen;

        ImageView fifteen = (ImageView)findViewById(R.id.fifteen);
        fifteen.setOnClickListener(mainSquareController);
        spots[3][2] = fifteen;

        ImageView blank = (ImageView)findViewById(R.id.blank);
        spots[3][3] = blank;

        //randomizes puzzle upon game start
        puzzle.randomize();

        mainSquareController = new SquareController(puzzle);


        //for win case
        /*LinearLayout layout = (LinearLayout) findViewById(R.id.ScreenLayout);
        if(puzzle.isWin(puzzle, winningPuzzle) == true){
            ScreenLayout.setBackgroundColor(Color.argb(
                    255, 98, 252, 3));
        }*/
    }

    /**
     * method to update the GUI based on user interaction
     */
    public void updateGUI(){
        if (spots == null) {
            return;
        }

        for(int i = 0; i < puzzle.tiles.length; i++){
            for(int j = 0; j < puzzle.tiles.length; j++){
                spots[i][j].setImageResource(puzzle.tiles[i][j].getPictureID());
            }
        }
        mainSquareController = new SquareController(puzzle);
    }

}
