public class CardTester {
	
	public static void main(String[] args){

		SWCardDatabase fullCardSet = SWCardDatabase.getInstance();

		int r1Count = 0;
		int r2Count = 0;
		int oddballCount = 0;

		for (int i = 0; i < 10000; i++){

			SWCard thisCard = fullCardSet.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.R);


			if (thisCard.getRarity() == SWRarity.R1){

				r1Count++;
			}

			else if (thisCard.getRarity() == SWRarity.R2){
				r2Count++;
			}

			else oddballCount++;

		}

		System.out.println("R1 Count: " + r1Count);
		System.out.println("R2 Count: " + r2Count);
		System.out.println("oddball Count: " + oddballCount);


	}

}