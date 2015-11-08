package lifepoint.counter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Game extends Application{
	
	private Player player1;
	private Player player2;
	private Label lb_p1;
	private Label lb_p2;
	private Label lb_lp1;
	private Label lb_lp2;
	private Button btn_AddLP1;
	private Button btn_AddLP2;
	private Button btn_SubLP1;
	private Button btn_SubLP2;
	private Button btn_End;
	private TextField txt_Dam1;
	private TextField txt_Dam2;
	
	public Game() {
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		player1 = p1;
		player2 = p2;
	}
	
	public Game(Player p1, Player p2) {
		player1 = p1;
		player2 = p2;
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		lb_p1 = new Label(player1.getName());
		lb_p2 = new Label(player2.getName());
		lb_lp1 = new Label("" + player1.getLifepoints());
		lb_lp2 = new Label("" + player2.getLifepoints());
		txt_Dam1 = new TextField("");
		txt_Dam2 = new TextField("");
		btn_AddLP1 = new Button("+");
		btn_AddLP2 = new Button("+");
		btn_SubLP1 = new Button("-");
		btn_SubLP2 = new Button("-");
		btn_End = new Button("Reset");
		
		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setHgap(10);
		root.setVgap(10);
		
		root.add(lb_p1, 0, 0, 2, 1);
		root.add(lb_p2, 2, 0, 2, 1);
		root.add(lb_lp1, 0, 1, 2, 1);
		root.add(lb_lp2, 2, 1, 2, 1);
		root.add(btn_AddLP1, 0, 3);
		root.add(btn_SubLP1, 1, 3);
		root.add(txt_Dam1, 0, 2, 2, 1);
		root.add(btn_AddLP2, 2, 3);
		root.add(btn_SubLP2, 3, 3);
		root.add(txt_Dam2, 2, 2, 2, 1);
		root.add(btn_End, 1, 5, 2, 1);
		
		setWidths();
		attachCode();
		
		Scene scene = new Scene(root, 500, 500);
		stage.setTitle("Yugioh Counter");
		stage.setScene(scene);
		stage.show();
	}
	
	public void setWidths() {
		return;
	}

	public void attachCode() {
		btn_AddLP1.setOnAction(e -> btnCode(e));
		btn_SubLP1.setOnAction(e -> btnCode(e));
		btn_AddLP2.setOnAction(e -> btnCode(e));
		btn_SubLP2.setOnAction(e -> btnCode(e));
		txt_Dam1.setOnKeyPressed(e -> dam1(e));
		txt_Dam2.setOnKeyPressed(e -> dam2(e));
		btn_End.setOnAction(e -> btnCode(e));
	}

	public void dam1(KeyEvent e) {
		int lp1 = player1.getLifepoints();
		int dam1 = integerConversion(txt_Dam1.getText());
		if (e.getCode().equals(KeyCode.ENTER)) {
			lp1 -= dam1;
			player1.setLifepoints(lp1);
			lb_lp1.setText("" + lp1);
			txt_Dam1.setText("");
		}
	}
	public void dam2(KeyEvent e) {
		int lp2 = player2.getLifepoints();
		int dam2 = integerConversion(txt_Dam2.getText());
		if (e.getCode().equals(KeyCode.ENTER)) {
			lp2 -= dam2;
			player1.setLifepoints(lp2);
			lb_lp1.setText("" + lp2);
			txt_Dam2.setText("");
		}
	}

	public void btnCode(ActionEvent e) {
		int lp1 = player1.getLifepoints();
		int dam1 = integerConversion(txt_Dam1.getText());
		int lp2 = player2.getLifepoints();
		int dam2 = integerConversion(txt_Dam2.getText());
		int startVal = 8000;
		
		if (e.getSource() == btn_AddLP1) {
			lp1 += dam1;
			player1.setLifepoints(lp1);
		} else if (e.getSource() == btn_SubLP1) {
			lp1 -= dam1;
			player1.setLifepoints(lp1);
		} else if (e.getSource() == btn_AddLP2) {
			lp2 += dam2;
			player2.setLifepoints(lp2);
		} else if (e.getSource() == btn_SubLP2) {
			lp2 -= dam2;
			player2.setLifepoints(lp2);
		} else if (e.getSource() == btn_End) {
			lp1 = startVal;
			lp2 = startVal;
			player1.setLifepoints(lp1);
			player2.setLifepoints(lp2);
			lb_lp1.setText("" + lp1);
			lb_lp2.setText("" + lp2);
			return;
		}
		lb_lp1.setText("" + lp1);
		lb_lp2.setText("" + lp2);
		txt_Dam1.setText("");
		txt_Dam2.setText("");
	}

	public int integerConversion(String text) {
		if (text.matches("^[+-]?[0-9]+")) {
			return Integer.parseInt(text);
		}
		return 0;
	}
}
