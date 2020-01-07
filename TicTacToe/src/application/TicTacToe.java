package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TicTacToe extends Application{
	public boolean turn = false;
	public String whosTurn = "X";
	public boolean isSelect = false;
	public static void main(String[] args){
		launch(args);
	}
	public void start(Stage primaryStage) {
	
		
		Button topLeft = new Button();
		Button topMiddle = new Button();
		Button topRight = new Button();
		
		Button midLeft = new Button();
		Button midMiddle = new Button();
		Button midRight = new Button();
		
		Button botLeft = new Button();
		Button botMiddle = new Button();
		Button botRight = new Button();
		
		Button[][] buttonArray = {{topLeft,topMiddle,topRight},{midLeft,midMiddle,midRight},{botLeft,botMiddle,botRight}};
		
		Label l1 = new Label("It's X's turn!");
		Label l2 = new Label("");
		l1.setAlignment(Pos.CENTER);
		l2.setAlignment(Pos.CENTER);
		 
		
		GridPane gridpane = new GridPane();
		 gridpane.setAlignment(Pos.CENTER);
		 
		 
		 gridpane.add(buttonArray[0][0],0,0);
		 gridpane.add(buttonArray[0][1],0,1);
		 gridpane.add(buttonArray[0][2],0,2);
		 
		 gridpane.add(buttonArray[1][0],1,0);
		 gridpane.add(buttonArray[1][1],1,1);
		 gridpane.add(buttonArray[1][2],1,2);
		 
		 gridpane.add(buttonArray[2][0],2,0);
		 gridpane.add(buttonArray[2][1],2,1);
		 gridpane.add(buttonArray[2][2],2,2);
		 
		 for(int i = 0; i < buttonArray.length;i++) {
			 for(int j = 0; j < buttonArray[i].length;j++){
				 buttonArray[i][j].setPrefSize(200, 200);
			 }
			}
		
		 
		 VBox contain = new VBox(gridpane,l1,l2); 
		 contain.setAlignment(Pos.CENTER);
		 
		
		
		 
		for(Button[] i: buttonArray) {
	    	  for(Button j : i) {
	    		  j.setOnAction(event ->
	    		 {	 
	    			 if(j.getText().isEmpty()) {
	    				 if(turn == false){
	    					j.setText("X");
	    					turn = true;
	    					whosTurn = "X";
	    					l1.setText("It's O's turn!");
	    				}else if(turn == true){
	    					j.setText("O");
	    					turn = false;
	    					whosTurn = "O";
	    					l1.setText("It's X's turn!");
	    				}
	    				 l2.setText("");
	    				 isSelect = true;
	    		 }else {
	    			 l2.setText("Already Selected");
	    		 }
    			 if(midMiddle.getText().equals("X") || midMiddle.getText().equals("O")) {
    					if(topLeft.getText().equals(midMiddle.getText())){
    						if(botRight.getText().equals(midMiddle.getText())){
    							l2.setText(whosTurn+" Wins!");
    							turn = true;
    							 topLeft.setText("");
    							 topMiddle.setText("");
    							 topRight.setText("");
    							
    							 midLeft.setText("");
    							 midMiddle.setText("");
    							 midRight.setText("");
    							
    							 botLeft.setText("");
    							 botMiddle.setText("");
    							 botRight.setText(""); 
    							 
    							 l1.setText("It's X's turn!");
    						}
    					}
    					if(topRight.getText().equals(midMiddle.getText())){
    						if(botLeft.getText().equals(midMiddle.getText())){
    							l2.setText(whosTurn+" Wins!");
    							turn = true;
    							topLeft.setText("");
   							 topMiddle.setText("");
   							 topRight.setText("");
   							
   							 midLeft.setText("");
   							 midMiddle.setText("");
   							 midRight.setText("");
   							
   							 botLeft.setText("");
   							 botMiddle.setText("");
   							 botRight.setText(""); 
   							 
   							l1.setText("It's O's turn!");
    						
    						}
    					}
    					if(topMiddle.getText().equals(midMiddle.getText())){	
    						if(botMiddle.getText().equals(midMiddle.getText())){
    							l2.setText(whosTurn+" Wins!");
    							turn = true;
    							topLeft.setText("");
   							 topMiddle.setText("");
   							 topRight.setText("");
   							
   							 midLeft.setText("");
   							 midMiddle.setText("");
   							 midRight.setText("");
   							
   							 botLeft.setText("");
   							 botMiddle.setText("");
   							 botRight.setText(""); 
   							 
   							l1.setText("It's O's turn!");
    							}
    						}
    					if(midLeft.getText().equals(midMiddle.getText())){	
    							if(midRight.getText().equals(midMiddle.getText())){
        							l2.setText(whosTurn+" Wins!");
        							turn = true;
        							topLeft.setText("");
          							 topMiddle.setText("");
          							 topRight.setText("");
          							
          							 midLeft.setText("");
          							 midMiddle.setText("");
          							 midRight.setText("");
          							
          							 botLeft.setText("");
          							 botMiddle.setText("");
          							 botRight.setText(""); 
          							 
          							l1.setText("It's O's turn!");
        							}
    							
    						}
    			}
    			 if(midLeft.getText().equals("X") || midLeft.getText().equals("O")){
					 if(topLeft.getText().equals(midLeft.getText())){
    						if(botLeft.getText().equals(midLeft.getText())){
    							l2.setText(whosTurn+" Wins!");
    							turn = true;
    							topLeft.setText("");
   							 topMiddle.setText("");
   							 topRight.setText("");
   							
   							 midLeft.setText("");
   							 midMiddle.setText("");
   							 midRight.setText("");
   							
   							 botLeft.setText("");
   							 botMiddle.setText("");
   							 botRight.setText(""); 
   							 
   							l1.setText("It's O's turn!");
    						}
    					}
    			 }
    			 if(botMiddle.getText().equals("X") || botMiddle.getText().equals("O")){
    					 if(botLeft.getText().equals(botMiddle.getText())){
	    						if(botRight.getText().equals(botMiddle.getText())){
	    							l2.setText(whosTurn+" Wins!");
	    							turn = true;
	    							topLeft.setText("");
	    							 topMiddle.setText("");
	    							 topRight.setText("");
	    							
	    							 midLeft.setText("");
	    							 midMiddle.setText("");
	    							 midRight.setText("");
	    							
	    							 botLeft.setText("");
	    							 botMiddle.setText("");
	    							 botRight.setText(""); 
	    							 
	    							 l1.setText("It's O's turn!");
	    						}
	    					}
    					 if(midMiddle.getText().equals(botMiddle.getText())){
	    						if(topMiddle.getText().equals(botMiddle.getText())){
	    							l2.setText(whosTurn+" Wins!");
	    							turn = true;
	    							topLeft.setText("");
	    							 topMiddle.setText("");
	    							 topRight.setText("");
	    							
	    							 midLeft.setText("");
	    							 midMiddle.setText("");
	    							 midRight.setText("");
	    							
	    							 botLeft.setText("");
	    							 botMiddle.setText("");
	    							 botRight.setText(""); 
	    							 
	    							 l1.setText("It's O's turn!");
		    					}
		    				}
	    		 }
    			 if(midRight.getText().equals("X") || midRight.getText().equals("O")){
	    					 if(topRight.getText().equals(midRight.getText())){
		    						if(botRight.getText().equals(midRight.getText())){
		    							l2.setText(whosTurn+" Wins!");
		    							turn = true;
		    							topLeft.setText("");
		    							 topMiddle.setText("");
		    							 topRight.setText("");
		    							
		    							 midLeft.setText("");
		    							 midMiddle.setText("");
		    							 midRight.setText("");
		    							
		    							 botLeft.setText("");
		    							 botMiddle.setText("");
		    							 botRight.setText(""); 
		    							 
		    							 l1.setText("It's O's turn!");
		    						}
		    					}
	    		}
    			 if(topMiddle.getText().equals("X") || topMiddle.getText().equals("O")){
		    				 if(topRight.getText().equals(topMiddle.getText())){
			    					if(topLeft.getText().equals(topMiddle.getText())){
			    						l2.setText(whosTurn+" Wins!");
			    						turn = true;
			    						topLeft.setText("");
		    							 topMiddle.setText("");
		    							 topRight.setText("");
		    							
		    							 midLeft.setText("");
		    							 midMiddle.setText("");
		    							 midRight.setText("");
		    							
		    							 botLeft.setText("");
		    							 botMiddle.setText("");
		    							 botRight.setText(""); 
		    							 
		    							 l1.setText("It's O's turn!");
			    					}
			    				}
			    			}
    			 if(!topLeft.getText().isEmpty() && !topMiddle.getText().isEmpty() && !topRight.getText().isEmpty() && 
    					 !midLeft.getText().isEmpty() && !midMiddle.getText().isEmpty() && !midRight.getText().isEmpty() &&
    					 !botLeft.getText().isEmpty() && !botMiddle.getText().isEmpty() && !botRight.getText().isEmpty()) {
    				 l2.setText("Nobody won!");
    				 	turn = true;
						topLeft.setText("");
						 topMiddle.setText("");
						 topRight.setText("");
						
						 midLeft.setText("");
						 midMiddle.setText("");
						 midRight.setText("");
						
						 botLeft.setText("");
						 botMiddle.setText("");
						 botRight.setText(""); 
						 
						 l1.setText("It's O's turn!");
    			 }
	    		 });
		}
	      } 
		
		 
		 Scene scene = new Scene(contain,400,400);
		 	scene.getStylesheets().add("TicTac.css");
			primaryStage.setScene(scene);
			primaryStage.show();
	}
}
