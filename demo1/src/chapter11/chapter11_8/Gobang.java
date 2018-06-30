package chapter11.chapter11_8;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gobang {
	BufferedImage table;
	BufferedImage black;
	BufferedImage white;
	BufferedImage selected;
	private static int BOARD_SIZE;
	private final int TABLE_WIDTH = 535;
	private final int TABLE_HEIGHT = 536;
	private final int RATE = TABLE_WIDTH / BOARD_SIZE;
	private final int X_OFFSET = 5;
	private final int Y_OFFSET = 6;
	private String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
	JFrame f = new JFrame("Îå×ÓÆåÓÎÏ·");
	ChessBoard chessBoard = new ChessBoard();
	private int selectedX = -1;
	private int selectedY = -1;
	public void init() throws Exception{
		table = ImageIO.read(new File("Image/board.jpg"));
		black = ImageIO.read(new File("Image/black.gif"));
		white = ImageIO.read(new File("Image/white.gif"));
		selected = ImageIO.read(new File("image/selected.gif"));
		for(int i = 0; i < BOARD_SIZE; i++) {
			for(int j = 0; j < BOARD_SIZE; j++) {
				board[i][j] = "+";
			}
		}
		chessBoard.setPreferredSize(new Dimension(TABLE_WIDTH, TABLE_HEIGHT));
		chessBoard.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int xPos = (int)((e.getX() - X_OFFSET) / RATE);
				int yPos = (int)((e.getY() - Y_OFFSET) / RATE);
				board[xPos][yPos] = ".";
				chessBoard.repaint();
			}
			public void mouseExited(MouseEvent e) {
				selectedX = -1;
				selectedY = -1;
				chessBoard.repaint();
			}
		});
		f.add(chessBoard);
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) throws Exception{
		Gobang gb = new Gobang();
		gb.init();
	}
	
	class ChessBoard extends JPanel{
		public void paint(Graphics g) {
			g.drawImage(table, 0, 0, null);
			if(selectedX >= 0 && selectedY >= 00) {
				g.drawImage(selected, selectedX * RATE +X_OFFSET, selectedY*RATE+Y_OFFSET, null);
			}
			for(int i = 0; i<BOARD_SIZE;i++) {
				for(int j=0; j < BOARD_SIZE; j++) {
					if(board[i][j].equals(".")) {
						g.drawImage(black, i * RATE +X_OFFSET, j*RATE+Y_OFFSET, null);
					}
					if(board[i][j].equals("o")) {
						g.drawImage(white, i * RATE +X_OFFSET, j*RATE+Y_OFFSET, null);
					}
				}
			}
		}
	}
}
