import java.awt.*;
import javax.swing.*;

public class Turtle {

	private static final int FRAME_WIDTH = 690;
	private static final int FRAME_HEIGHT = 650;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final JFrame frame = new JFrame();

		final ImageIcon wall = new ImageIcon("c:/Users/kevin/Desktop/pacman/TurtleGame/wall.png");
		final ImageIcon empty = new ImageIcon("c:/Users/kevin/Desktop/pacman/TurtleGame/empty.png");
		

		final JLabel[][] f = new JLabel[14][14];
		
		for (int i=0; i<14; i++) {
			for(int j=0; j<14; j++) {
				f[i][j] = new JLabel();
			}
		}

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(14,14));
		frame.requestFocus();


		for(int i=0; i<14; i++) {
			for(int j=0; j<14; j++) {
				f[i][j].setIcon(wall);
				panel.add(f[i][j]);
			}
		}
		f[1][1].setIcon(empty);	f[2][1].setIcon(empty);	f[3][1].setIcon(empty);	f[4][1].setIcon(empty);	f[5][1].setIcon(empty);
		f[5][2].setIcon(empty);	f[5][3].setIcon(empty);	f[1][3].setIcon(empty);	f[2][3].setIcon(empty);	f[3][3].setIcon(empty);
		f[4][3].setIcon(empty);	f[1][4].setIcon(empty);	f[1][5].setIcon(empty);	f[1][6].setIcon(empty);	f[1][7].setIcon(empty);
		f[1][8].setIcon(empty);	f[1][9].setIcon(empty);	f[1][10].setIcon(empty);	f[1][11].setIcon(empty);	f[1][12].setIcon(empty);
		f[2][9].setIcon(empty);	f[2][12].setIcon(empty);	f[3][12].setIcon(empty);	f[4][12].setIcon(empty);	f[5][12].setIcon(empty);
		f[3][4].setIcon(empty);	f[3][5].setIcon(empty);	f[3][10].setIcon(empty);	f[3][11].setIcon(empty);
		f[4][5].setIcon(empty);	f[4][6].setIcon(empty);	f[4][7].setIcon(empty);	f[4][8].setIcon(empty);	f[4][9].setIcon(empty);
		f[4][10].setIcon(empty);	f[2][7].setIcon(empty);	f[3][7].setIcon(empty);	f[4][10].setIcon(empty);	f[4][11].setIcon(empty);
		f[5][11].setIcon(empty);	f[6][11].setIcon(empty);	f[7][11].setIcon(empty);	f[7][12].setIcon(empty);	f[8][12].setIcon(empty);
		f[9][12].setIcon(empty);	f[10][12].setIcon(empty);f[11][12].setIcon(empty);	f[5][7].setIcon(empty);	f[6][2].setIcon(empty);
		f[7][1].setIcon(empty);	f[9][11].setIcon(empty);	f[11][1].setIcon(empty);	f[11][3].setIcon(empty);	f[11][11].setIcon(empty);
		f[7][2].setIcon(empty);	f[7][3].setIcon(empty);	f[8][1].setIcon(empty);	f[9][1].setIcon(empty);	f[9][2].setIcon(empty);
		f[9][3].setIcon(empty);	f[9][4].setIcon(empty);	f[9][5].setIcon(empty);	f[9][6].setIcon(empty);	f[12][1].setIcon(empty);
		f[12][2].setIcon(empty);	f[12][3].setIcon(empty);	f[12][4].setIcon(empty);	f[12][5].setIcon(empty);	f[12][9].setIcon(empty);
		f[12][10].setIcon(empty);f[12][11].setIcon(empty); f[10][5].setIcon(empty); f[11][5].setIcon(empty); f[10][6].setIcon(empty);
		f[10][7].setIcon(empty);	f[10][8].setIcon(empty); f[10][9].setIcon(empty); f[11][7].setIcon(empty); f[12][7].setIcon(empty);
		f[9][8].setIcon(empty); f[9][9].setIcon(empty); f[11][9].setIcon(empty); f[6][5].setIcon(empty);f[6][6].setIcon(empty);
		f[6][7].setIcon(empty); f[6][8].setIcon(empty);f[6][9].setIcon(empty); f[7][5].setIcon(empty);f[7][6].setIcon(empty);
		f[7][7].setIcon(empty); f[7][8].setIcon(empty);f[7][9].setIcon(empty);
		
		frame.add(panel);
		frame.setTitle("TurtleGame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
		
	}
