import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class CardlistScanner{

	File cardList;
	Scanner sc;
	String delimiter = "_";
	char ignoreChar = '\"';

	public CardlistScanner(String filename){
		this.cardList = new File(filename);
		if (cardList.canRead()){
			try{
				sc = new Scanner(cardList, "ISO-8859-1");
				sc.nextLine();
			}
			catch (FileNotFoundException e){
				System.err.println("The source card list could not be found!");
			}
		}
		else System.err.println("The source card list could be read!");
	}	

	String[] readCard(){
		int cardDataLength = 74; // 77
		String[] thisCardData = new String[cardDataLength];
		sc.useDelimiter(delimiter);

		String thisToken;

		for (int i = 0; i < cardDataLength; i++){ //77
			thisToken = sc.hasNext()? sc.next(): "" + sc.nextByte();
			//System.out.println(thisToken);


			// if (thisToken.length() > 0) {
			// 	if (thisToken.charAt(0) == ignoreChar){
			// 		// if a token begins with "
			// 		// keep concatenating until a token ends with "
			// 		boolean continueLoop = true;
			// 		//while((thisToken = thisToken + sc.next()).charAt(thisToken.length()-1) != '\"'){} 
			// 		while(continueLoop){
			// 			thisToken = (sc.hasNext()? thisToken + sc.next(): thisToken + "\"");
			// 			if (thisToken.charAt(thisToken.length()-1) == '\"'){
			// 				continueLoop = false;
			// 			}
			// 		}
			// 	}
			// }

			thisCardData[i] = thisToken;
			//System.out.println(i + ": " + thisToken);

		}
		//System.out.println(thisCardData[20]);
		return thisCardData;
	}

}