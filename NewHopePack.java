public class NewHopePack extends Pack{
	
	public NewHopePack(){
		super(3.00f, ProductType.PACK, SWSet.A_NEW_HOPE);
		SWCardDatabase cardPool = SWCardDatabase.getInstance();
		super.setName("A New Hope Booster Pack");
		super.add(cardPool.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.A_NEW_HOPE, SWRarity.R));
	}


}