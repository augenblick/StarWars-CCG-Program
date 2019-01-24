public class PremierePack extends Pack{
	
	public PremierePack(){
		super(3.00f, ProductType.PACK, SWSet.PREMIERE);
		SWCardDatabase cardPool = SWCardDatabase.getInstance();
		super.setName("Premiere Booster Pack");
		super.add(cardPool.retrieveRandomCard(SWSet.PREMIERE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.PREMIERE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.PREMIERE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.PREMIERE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.PREMIERE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.PREMIERE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.PREMIERE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.PREMIERE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.PREMIERE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.PREMIERE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.PREMIERE, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.PREMIERE, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.PREMIERE, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.PREMIERE, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.PREMIERE, SWRarity.R));
	}


}