public class DagobahPack extends Pack{
	
	public DagobahPack(){
		super(3.00f, ProductType.PACK, SWSet.DAGOBAH);
		SWCardDatabase cardPool = SWCardDatabase.getInstance();
		super.setName("Dagobah Booster Pack");
		super.add(cardPool.retrieveRandomCard(SWSet.DAGOBAH, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.DAGOBAH, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.DAGOBAH, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.DAGOBAH, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.DAGOBAH, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.DAGOBAH, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.DAGOBAH, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.DAGOBAH, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.DAGOBAH, SWRarity.R));
	}


}