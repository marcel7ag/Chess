import Pieces.Piece;

import javax.swing.*;
import java.awt.*;

public class Tile extends JButton{
    private Piece piece;
    private int x;
    private int y;

    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
        setOpaque(true);
        setTileColor();
    }

    public void setTileColor() {
        if ((x % 2 == 1 && y % 2 == 1) || (x % 2 == 0 && y % 2 == 0)) {
            this.setBackground(Color.WHITE);
        } else {
            this.setBackground(Color.DARK_GRAY);
        }
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(75, 75); // Return the preferred size
    }

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(75, 75); // Return the minimum size
    }

    @Override
    public Dimension getMaximumSize() {
        return new Dimension(75, 75); // Return the maximum size
    }
}
