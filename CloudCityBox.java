public class CloudCityBox extends Pack{
	
	public CloudCityBox(){
		super(130.00f, ProductType.BOX, SWSet.CLOUD_CITY);
		super.setName("Cloud City Booster Box");
		for (int i = 0; i < 60; i++){
			super.add(new CloudCityPack());
		}
	}


}