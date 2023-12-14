package Pieces;

import javax.swing.ImageIcon;

public abstract class Piece {

    private boolean white = false; //is white or black piece?
    private String str; //name of piece
    private ImageIcon img; //image of piece
    private boolean firstMove = true; //has first move yn?

    public Piece(boolean white, String str, ImageIcon img, boolean firstMove) {
        this.white = white;
        this.str = str;
        this.img = img;
        this.firstMove = firstMove;
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }

    public boolean isFirstMove() {
        return firstMove;
    }

    public void setFirstMove(boolean firstMove) {
        this.firstMove = firstMove;
    }
}

