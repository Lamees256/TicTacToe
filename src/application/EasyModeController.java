package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class EasyModeController {
	@FXML
	Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;

	@FXML
	TextField winnerTf, turnTf;

	@FXML
	GridPane gridPane;

	// Button [][] board = new Button[3][3];
	private int turn = 0; // starts with x

	ArrayList<Button> playerMoves = new ArrayList<Button>();
	ArrayList<Button> computerMoves = new ArrayList<Button>();

	@FXML
	private void click(ActionEvent event) {
		Scanner scanner = new Scanner(System.in);

		Button button = (Button) event.getSource();
		if (turn % 2 == 0) {
			turnTf.setText("X");
			button.setText("X");
			button.setDisable(true);
//			if (checkWinner() == true) {
//				winnerTf.setText("X WON !!");
//			}
			turn++;
			turnTf.setText("O");
			computerTurn();
		} else {
			
		}
	}

	private void computerTurn() {
		Random rand = new Random();
		int pos = rand.nextInt(9) + 1;
		switch (pos) {
		case 1:
			bt1.setText("O");
			bt1.setDisable(false);
			turn++;
			break;
		case 2:
			bt2.setText("O");
			bt2.setDisable(false);
			turn++;
			break;
		case 3:
			bt3.setText("O");
			bt3.setDisable(false);
			turn++;
			break;
		case 4:
			bt4.setText("O");
			bt4.setDisable(false);
			turn++;
			break;
		case 5:
			bt5.setText("O");
			bt5.setDisable(false);
			turn++;
			break;
		case 6:
			bt6.setText("O");
			bt6.setDisable(false);
			turn++;
			break;
		case 7:
			bt7.setText("O");
			bt7.setDisable(false);
			turn++;
			break;
		case 8:
			bt8.setText("O");
			bt8.setDisable(false);
			turn++;
			break;
		case 9:
			bt9.setText("O");
			bt9.setDisable(false);
			turn++;
			break;
		default:
		}
		
	}

}
