package application;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class MultiplayerController {
	@FXML
	Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;

	@FXML
	TextField winnerTf, turnTf;

	@FXML
	GridPane gridPane;

	private int turn = 0; // starts with x

	ArrayList<Button> player1 = new ArrayList<Button>();
	ArrayList<Button> player2 = new ArrayList<Button>();

	@FXML
	private void click(ActionEvent event) {
		Button button = (Button) event.getSource();
		button.setFocusTraversable(false);
		if (checkWinner() == true)
			return;
		if (turn % 2 == 0) {
			turnTf.setText("X");
			button.setText("X");
			button.setDisable(true);
			if (checkWinner() == true) {
				winnerTf.setText("X WON !!");
			}
			turn++;
			turnTf.setText("O");
		} else {

			button.setText("O");
			button.setDisable(true);
			if (checkWinner() == true) {
				winnerTf.setText("O WoON !!");
			}
			turn++;
			turnTf.setText("X");
		}
		if (turn == 9) {
			if (checkWinner() == true) {
				winnerTf.setText("X Won!!!");
				return;
			} else {
				winnerTf.setText("TIE!!!");
				return;
			}

		}

//		source.setText("X");
//		source.setDisable(true);
	}

	public boolean checkWinner() {
		for (int a = 0; a < 8; a++) {
			String string = switch (a) {
			case 0 -> bt1.getText() + bt2.getText() + bt3.getText();
			case 1 -> bt4.getText() + bt5.getText() + bt6.getText();
			case 2 -> bt7.getText() + bt8.getText() + bt9.getText();
			case 3 -> bt1.getText() + bt5.getText() + bt9.getText();
			case 4 -> bt3.getText() + bt5.getText() + bt7.getText();
			case 5 -> bt1.getText() + bt4.getText() + bt7.getText();
			case 6 -> bt2.getText() + bt5.getText() + bt8.getText();
			case 7 -> bt3.getText() + bt6.getText() + bt9.getText();
			default -> null;
			};

			if (string.equals("XXX") || string.equals("OOO")) {
				return true;
			}
		}
		return false;

	}

}
