public class Product{
	
	enum ProductType{
		CARD, PACK, BOX;
	}

	private float price;
	private String imagePath;
	private ProductType productType;
	private String name;
	

	public Product(float price, ProductType productType){
		this.price = price;
		this.imagePath = null;
		this.productType = productType;
	}

	protected float getPrice(){
		return this.price;
	}

	protected String getImagePath(){
		return this.imagePath;
	}

	protected ProductType getProductType(){
		return this.productType;
	}

	protected void setImagePath(String imagePath){
		this.imagePath = imagePath;
	}

	protected void setName(String name){
		this.name = name;
	}

	protected String getName(){
		return this.name;
	}

}