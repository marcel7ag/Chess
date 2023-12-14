import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("Windows");
        } catch(Exception ignored){}

        JFrame frame = new JFrame("board");
        Board board = new Board();
        board.setupBoard();

        frame.add(board);
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
    }
}
