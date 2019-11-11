package com.example.squares;

/**
 * @author Haley Welliver
 * this class creates an individual square on the puzzle
 */
public class Square {

    int pictureID;
    int id;

    /**
     * square constructor
     * @param pID
     * @param id
     */
    public Square(int pID, int id){
        this.pictureID = pID;
        this.id = id;
    }

    /**
     * copy constructor
     * @param square
     */
    public Square(Square square){
        this.pictureID = square.pictureID;
        this.id = square.id;
    }

    public int getId() {
        return id;
    }

    public int getPictureID() {
        return pictureID;
    }

}
