class CardShop {
	
	SWCard[] releasedCards;
	private static int[] PremierePack = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -3};
	private int[] PremiereCommons;
	private int[] PremiereUncommons;
	private int[] PremiereRares;


	public Cardshop(SWCard[] releasedCards){

		this.releasedCards = releasedCards;
		this.createRaritySets();
	}

	public SWCard[] getPack(){

		for(int i = 0; i < PremierePack.length; i++){

		}
	}

	private void createAllRaritySets(){

		int commonCount = 0;
		int uncommonCount = 0;
		int rareCount = 0;

		for (int i = 0; i < releasedCards.length; i++){
			SWCard thisCard = releasedCards[i];
			if thisCard.getSet.equals(Premiere){
				if thisCard.getPreciseRarity.equals(C3){
					PremiereCommons[commonCount] = thisCard;
					PremiereCommons[commonCount + 1] = thisCard;
					PremiereCommons[commonCount + 2] = thisCard;
					commonCount += 3;
				}
				else if thisCard.getPreciseRarity.equals(C2){
					PremiereCommons[commonCount] = thisCard;
					PremiereCommons[commonCount + 1] = thisCard;
					commonCount += 2;
				}
				else if thisCard.getPreciseRarity.equals(C1){
					PremiereCommons[commonCount] = thisCard;
					commonCount += 1;
				}
				else if thisCard.getPreciseRarity.equals(U2){
					PremiereUncommons[uncommonCount] = thisCard;
					PremiereUncommons[uncommonCount + 1] = thisCard;
					uncommonCount += 2;
				}
				else if thisCard.getPreciseRarity.equals(U1){
					PremiereUncommons[uncommonCount] = thisCard;
					uncommonCount += 1;
				}
				else if thisCard.getPreciseRarity.equals(R2){
					PremiereRares[rareCount] = thisCard;
					PremiereRares[rareCount + 1] = thisCard;
					rareCount += 2;
				}
				else if thisCard.getPreciseRarity.equals(R1){
					PremiereRares[rareCount] = thisCard;
					rareCount += 1;
				}
			}
		}
	}

	private SWCard[] createRaritySet(String setName){
		
	}

}