package lifepoint.counter;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI extends Application {
	Button btn_add, btn_sub, btn_mul, btn_div, btn_clr;
	Label lb_ans;
	TextField num1, num2;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		btn_add = new Button("+");
		btn_sub = new Button("-");
		btn_mul = new Button("*");
		btn_div = new Button("/");
		
		num1 = new TextField();
		num2 = new TextField();
		
		lb_ans = new Label("?");
		
		btn_clr = new Button("Clear");
		lb_ans.setAlignment(Pos.CENTER);
		lb_ans.setStyle("-fx-border-color: #000; -fx-padding: 5px");
		
		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setHgap(10);
		root.setVgap(10);
		
		root.add(btn_add, 0, 0);
		root.add(btn_sub, 1, 0);
		root.add(btn_mul, 0, 1);
		root.add(btn_div, 1, 1);
		root.add(num1, 0, 2);
		root.add(num2, 1, 2);
		root.add(lb_ans, 0, 3, 2, 1);
		root.add(btn_clr, 0, 4, 2, 1);
		
		setWidths();
		attachCode();
		
		Scene scene = new Scene(root, 200, 250);
        stage.setTitle("Mathtastic 1.0");
        stage.setScene(scene);
        stage.show();
		
	}
	public void setWidths() {
		// Set widths of all controls
		btn_add.setPrefWidth(70);
		btn_sub.setPrefWidth(70);
		btn_mul.setPrefWidth(70);
		btn_div.setPrefWidth(70);
		num1.setPrefWidth(70);
		num2.setPrefWidth(70);
		lb_ans.setPrefWidth(150);
		btn_clr.setPrefWidth(150);
	}
	public void attachCode() {
		btn_add.setOnAction(e -> btncode(e));
		btn_sub.setOnAction(e -> btncode(e));
		btn_mul.setOnAction(e -> btncode(e));
		btn_div.setOnAction(e -> btncode(e));
		btn_clr.setOnAction(e -> btncode(e));
	}
	public void btncode(javafx.event.ActionEvent e) {
		int n1, n2, answer = 0;
		char symbol = '!';
		if (e.getSource() == btn_clr) {
			num1.setText("");
			num2.setText("");
			lb_ans.setText("?");
			num1.requestFocus();
			return;
		} 
		n1 = Integer.parseInt(num1.getText());
		n2 = Integer.parseInt(num2.getText());
		if (e.getSource() == btn_add) {
			symbol = '+';
			answer = n1 + n2;
		} else if (e.getSource() == btn_sub) {
			symbol = '-';
			answer = n1 - n2;
		} else if (e.getSource() == btn_mul) {
			symbol = '*';
			answer = n1 * n2;
		} else if (e.getSource() == btn_div) {
			symbol = '/';
			answer = n1 / n2;
		}
		lb_ans.setText("" + n1 + " " + symbol + " " + n2 + " = " + answer);
	}
}

