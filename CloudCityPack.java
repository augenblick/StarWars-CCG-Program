public class CloudCityPack extends Pack{
	
	public CloudCityPack(){
		super(3.00f, ProductType.PACK, SWSet.CLOUD_CITY);
		SWCardDatabase cardPool = SWCardDatabase.getInstance();
		super.setName("Cloud City Booster Pack");
		super.add(cardPool.retrieveRandomCard(SWSet.CLOUD_CITY, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.CLOUD_CITY, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.CLOUD_CITY, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.CLOUD_CITY, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.CLOUD_CITY, SWRarity.C));
		super.add(cardPool.retrieveRandomCard(SWSet.CLOUD_CITY, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.CLOUD_CITY, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.CLOUD_CITY, SWRarity.U));
		super.add(cardPool.retrieveRandomCard(SWSet.CLOUD_CITY, SWRarity.R));
	}


}