import java.util.NoSuchElementException;
import java.util.Scanner;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class CardMain{

	public static void main(String[] args){

		SWCardDatabase fullCardSet = SWCardDatabase.getInstance();
		Pack packFirst;


		boolean continueLoop = true;
		while (continueLoop){
			
			Scanner userInput = new Scanner(System.in);
			System.out.println("\nPick a Pack!: \n 1)Premiere\n 2)A New Hope\n 3)Hoth\n 4)Dagobah\n 5)Cloud City\n 6)Cloud City Box\n-1)exit");
			int userChoice = userInput.nextInt();

			if (userChoice < 0){continueLoop = false; break;}
			else if(userChoice == 1) packFirst = new PremierePack();
			else if(userChoice == 2) packFirst = new NewHopePack();
			else if(userChoice == 3) packFirst = new HothPack();
			else if(userChoice == 4) packFirst = new DagobahPack();
			else if(userChoice == 5) packFirst = new CloudCityPack();
			else if(userChoice == 6) packFirst = new CloudCityBox();
			else packFirst = new PremierePack();


			packFirst.open();
			System.out.println("\n" + packFirst);

			
			//////////////////////////////

			// JFrame f = new JFrame("Card Image");
	            
	  //       f.addWindowListener(new WindowAdapter(){
	  //               public void windowClosing(WindowEvent e) {
	  //                   System.exit(0);
	  //               }
	  //           });

	  //       f.add(new LoadImageApp(thisCard.getImagePath()));
	  //       f.pack();
	  //       f.setVisible(true);
	    }
	}
}



// TO DO: check random card occurance.  Make sure random pack draws "feel" right. (not 8 Landos for every Boba Fett...)