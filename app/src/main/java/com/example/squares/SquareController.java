package com.example.squares;

import android.view.View;

/**
 * @author Haley Welliver
 * the SquareController class contains methods that perform actions on the squares and puzzle
 */
public class SquareController implements View.OnClickListener{

    private Puzzle puzzle;

    private int blankIndex1 = 0;
    private int blankIndex2 = 0;


    /**
     * SquareController constructor
     */
    public SquareController(Puzzle puzzle)
    {
        this.puzzle = puzzle;
    }

    /**
     * controls the randomize button and square ImageViews based on user clicks
     * @param v
     */
    public void onClick(View v) {

        //checks to see if the item clicked is the randomize button
        if (v.getId() == R.id.randomizeButton)
            puzzle.randomize();

            for (int i = 0; i < puzzle.tiles.length; i++) {
                for (int j = 0; j < puzzle.tiles.length; j++) {
                    if (puzzle.tiles[i][j].getId() == puzzle.blank.getId()){
                        blankIndex1 = i;
                        blankIndex2 = j;
                        break;
                    }
                }
            }

        //i can not figure this part out...
        //pseudo code for checking if the move is valid before swapping
        //(click is adjacent to blank square and is not off the board)
        //if clickedIndex == blankIndex[i+1][j] && blankIndex[i+1][j] != null
        //if clickedIndex == blankIndex[i-1][j] && blankIndex[i-1][j] != null
        //if clickedIndex == blankIndex[i][j+1] && blankIndex[i][j+1] != null
        //if clickedIndex == blankIndex[i][j-1] && blankIndex[i][j-1] != null

            //does the swaps
            if (v.getId() == R.id.one) {
                puzzle.swap(0, 0, blankIndex1, blankIndex2);
            }
            if (v.getId() == R.id.two) {
                puzzle.swap(0, 1, blankIndex1, blankIndex2);
            }
            if (v.getId() == R.id.three) {
                puzzle.swap(0, 2, blankIndex1, blankIndex2);
            }
            if (v.getId() == R.id.four) {
                puzzle.swap(0, 3, blankIndex1, blankIndex2);
            }
            if (v.getId() == R.id.five) {
                puzzle.swap(1, 0, blankIndex1, blankIndex2);
            }
            if (v.getId() == R.id.six) {
                puzzle.swap(1, 1, blankIndex1, blankIndex2);
            }
            if (v.getId() == R.id.seven) {
                puzzle.swap(1, 2, blankIndex1, blankIndex2);
            }
            if (v.getId() == R.id.eight) {
                puzzle.swap(1, 3, blankIndex1, blankIndex2);
            }
            if (v.getId() == R.id.nine) {
                puzzle.swap(2, 0, blankIndex1, blankIndex2);
            }
            if (v.getId() == R.id.ten) {
                puzzle.swap(2, 1, blankIndex1, blankIndex2);
            }
            if (v.getId() == R.id.eleven) {
                puzzle.swap(2, 2, blankIndex1, blankIndex2);
            }
            if (v.getId() == R.id.twelve) {
                puzzle.swap(2, 3, blankIndex1, blankIndex2);
            }
            if (v.getId() == R.id.thirteen) {
                puzzle.swap(3, 0, blankIndex1, blankIndex2);
            }
            if (v.getId() == R.id.fourteen) {
                puzzle.swap(3, 1, blankIndex1, blankIndex2);
            }
            if (v.getId() == R.id.fifteen) {
                puzzle.swap(3, 2, blankIndex1, blankIndex2);
            }
            if (v.getId() == R.id.blank) {
                puzzle.swap(3, 3, blankIndex1, blankIndex2);
            }
        //}
    }
}
