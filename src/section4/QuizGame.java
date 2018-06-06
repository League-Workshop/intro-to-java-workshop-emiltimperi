package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int userScore = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("A the 2016 E3 a new game by microsoft was teased this game featured an open world combined with pirates. What is this games name?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer == "Sea Of Thieves") {
			 userScore ++;
			JOptionPane.showMessageDialog(null, "Correct");

		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer1 = JOptionPane.showInputDialog("The popular Videogame Overwatch was created using what engine");
		
		if (answer1 == "Blizzard Engine") {
			userScore ++;
			JOptionPane.showMessageDialog(null, "Correct");
			}
			
			String answer2 = JOptionPane.showInputDialog("What was the game company Bethesda's first game");
			
			if (answer2 == "Wayne Gretzky Hockey") {
				userScore ++;
				JOptionPane.showMessageDialog(null, "Correct");

		}
		// 6.  After all the questions have been asked, print the user's score 
		System.exit(0);
	}
}

