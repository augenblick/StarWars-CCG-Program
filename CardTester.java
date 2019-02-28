public class CardTester {
	
	public static void main(String[] args){

		SWCardDatabase fullCardSet = SWCardDatabase.getInstance();

		int r1Count = 0;
		int r2Count = 0;
		int oddballCount = 0;

		for (int i = 0; i < 10000; i++){

			SWCard thisCard = fullCardSet.retrieveRandomCard(SWSet.CLOUD_CITY, SWRarity.R);


			if (thisCard.getName().equals("Boba Fett")){

				r1Count++;
			}

			else if (thisCard.getName().equals("Lando Calrissian")){
				r2Count++;
			}

			else oddballCount++;

		}

		System.out.println("R1 Count: " + r1Count);
		System.out.println("R2 Count: " + r2Count);
		System.out.println("oddball Count: " + oddballCount);


	}

}