package com.example.squares;

import android.graphics.Color;
import android.widget.LinearLayout;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Haley Welliver
 * the Puzzle class makes the game board
 * this class serves as the game state
 */
public class Puzzle implements Serializable {

    //creates an array for all squares
    public Square[][] tiles = new Square[4][4];

    MainActivity activity;

    //connects the ids and drawables for all squares
    Square blank = new Square(R.drawable.blank, R.id.blank);
    Square one = new Square(R.drawable.one, R.id.one);
    Square two = new Square(R.drawable.two, R.id.two);
    Square three = new Square(R.drawable.three, R.id.three);
    Square four = new Square(R.drawable.four, R.id.four);
    Square five = new Square(R.drawable.five, R.id.five);
    Square six = new Square(R.drawable.six, R.id.six);
    Square seven = new Square(R.drawable.seven, R.id.seven);
    Square eight = new Square(R.drawable.eight, R.id.eight);
    Square nine = new Square(R.drawable.nine, R.id.nine);
    Square ten = new Square(R.drawable.ten, R.id.ten);
    Square eleven = new Square(R.drawable.eleven, R.id.eleven);
    Square twelve = new Square(R.drawable.twelve, R.id.twelve);
    Square thirteen = new Square(R.drawable.thirteen, R.id.thirteen);
    Square fourteen = new Square(R.drawable.fourteen, R.id.fourteen);
    Square fifteen = new Square(R.drawable.fifteen, R.id.fifteen);


    /**
     * this construc tor adds squares to the tiles array
     * upon start, this method also randomizes the tiles
     * @param activity
     */
    public Puzzle(MainActivity activity) {
        this.activity = activity;
        tiles[0][0] = one;
        tiles[0][1] = two;
        tiles[0][2] = three;
        tiles[0][3] = four;
        tiles[1][0] = five;
        tiles[1][1] = six;
        tiles[1][2] = seven;
        tiles[1][3] = eight;
        tiles[2][0] = nine;
        tiles[2][1] = ten;
        tiles[2][2] = eleven;
        tiles[2][3] = twelve;
        tiles[3][0] = thirteen;
        tiles[3][1] = fourteen;
        tiles[3][2] = fifteen;
        tiles[3][3] = blank;

    }

    /**
     * this method makes a winningPuzzle that will never be changed
     * its purpose is to compare with the user's puzzle
     * if they match, the user has won the game
     * @param activity
     */
    public Square[][] winningPuzzle(MainActivity activity) {

        Square[][] winningPuzzle = new Square[3][3];
        this.activity = activity;
        winningPuzzle[0][0] = one;
        winningPuzzle[0][1] = two;
        winningPuzzle[0][2] = three;
        winningPuzzle[0][3] = four;
        winningPuzzle[1][0] = five;
        winningPuzzle[1][1] = six;
        winningPuzzle[1][2] = seven;
        winningPuzzle[1][3] = eight;
        winningPuzzle[2][0] = nine;
        winningPuzzle[2][1] = ten;
        winningPuzzle[2][2] = eleven;
        winningPuzzle[2][3] = twelve;
        winningPuzzle[3][0] = thirteen;
        winningPuzzle[3][1] = fourteen;
        winningPuzzle[3][2] = fifteen;
        winningPuzzle[3][3] = blank;

        return winningPuzzle;
    }

    /**
     * this method shuffles the array and thus randomizes the puzzle
     * it updates the GUI at the end of the method to ensure the randomized changes were made
     */
    public void randomize() {
        Random rand = new Random();
        for (int i = 0; i < 16; i++) {
            int first = rand.nextInt(4);
            int second = rand.nextInt(4);
            int swapFirst = rand.nextInt(4);
            int swapSecond = rand.nextInt(4);

            swap(first, second, swapFirst, swapSecond);
        }
        this.activity.updateGUI();


    }

    /**
     * takes in a [firstIndex, secondIndex], and [swapFirstIndex, swapSecond Index]
     * the method swaps the two elements at these indices and then updates the GUI
     * to make the change
     * @param firstIndex
     * @param secondIndex
     * @param swapFirstIndex
     * @param swapSecondIndex
     */
    public void swap(int firstIndex, int secondIndex, int swapFirstIndex, int swapSecondIndex) {
        Square temp = new Square(tiles[firstIndex][secondIndex]);
        tiles[firstIndex][secondIndex] = new Square(tiles[swapFirstIndex][swapSecondIndex]);
        tiles[swapFirstIndex][swapSecondIndex] = temp;
        this.activity.updateGUI();
    }

    /**
     * takes in a puzzle and a winningPuzzle and determines if the two are equal
     * if so, the user has won the game and the background will change to green
     * @param puzzle
     * @param winningPuzzle
     * @return
     */
     /*public boolean isWin(Puzzle puzzle, Puzzle winningPuzzle) {
        boolean win = Arrays.equals(puzzle, winningPuzzle);
        if (win == true) {
            return true;
        }
        return false;
     }*/

}