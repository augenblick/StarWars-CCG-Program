public class HothPack extends Pack{
	
	public HothPack(){
		super(3.00f, ProductType.PACK, SWSet.HOTH);
		SWCardDatabase cardPool = SWCardDatabase.getInstance();
		super.setName("Hoth Booster Pack");
		super.add(cardPool.retrieveRandomCard(SWSet.HOTH, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.HOTH, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.HOTH, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.HOTH, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.HOTH, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.HOTH, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.HOTH, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.HOTH, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.HOTH, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.HOTH, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.HOTH, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.HOTH, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.HOTH, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.HOTH, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.HOTH, SWRarity.R));
	}


}