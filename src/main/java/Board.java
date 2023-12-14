import Pieces.Bishop;
import Pieces.Pawn;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    public void setupBoard(){
        GridBagLayout gridbag = new GridBagLayout();
        setLayout(gridbag);
        GridBagConstraints c = new GridBagConstraints();

        Tile[][] board = new Tile[9][9]; // Create board with tile and set size
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (row == 0 || col == 0) { // Create the first row and column
                    if (row == 0 && col == 0){
                        continue;
                    }
                    JLabel label = new JLabel();
                    label.setHorizontalAlignment(SwingConstants.CENTER);
                    label.setOpaque(true); // Make the label opaque so it can have a background color
                    label.setBackground(Color.LIGHT_GRAY); // Set the background color
                    if (row == 0) { // Add label text to the first row
                        label.setText(Character.toString((char) ('A' +  col - 1))); // Convert the column number to a character
                        label.setPreferredSize(new Dimension(75, 25));
                    } else { // Add label text to the first column
                        label.setText(Character.toString((char) ('8' - row  +1))); // Convert the row number to a character(number)
                        label.setPreferredSize(new Dimension(25, 75));
                    }
                    c.gridx = col; // Adjust the column number
                    c.gridy = row; // Adjust the row number
                    add(label, c); // Add the label to the JPanel
                } else {
                    board[row][col] = new Tile(row, col); // create a new tile in the specified spot on the board
                    c.gridx = col; // Adjust the column number
                    c.gridy = row; // Adjust the row number
                    add(board[row][col], c); // Add tile to the panel
                }
            }
        }
    }
}