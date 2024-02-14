package Lecture1;

import javax.swing.*;
import java.awt.*;



public class Map extends JPanel {
    private int panelWidth;
    private int panelHeight;
    private int cellHeight;
    private int cellWidth;
    Map() {}

    void startNewGame(int mode, int fSzX, int fSzY, int wLen){
        System.out.printf("Mode: %d;\nSize: x=%d, y=%d;\nWinLength: %d",
                mode, fSzX, fSzY, wLen);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void render(Graphics g){
        panelWidth = getWidth();
        panelHeight = getHeight();
        cellHeight = panelHeight / 3;
        cellWidth = cellWidth / 3;

        g.setColor(Color.BLACK);
        for (int h = 0; h < 3; h++) {
            int y = h * cellWidth;
            g.drawLine(0, y, panelWidth, y);
        }
        for (int w = 0; w < 3; w++) {
            int x = w * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }
    }
}
