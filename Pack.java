// adding an unopened product to a collection simply adds the product itself
// adding an opened product to a collection will add the product contents individually (which will then be sorted)
// after an opened product discards the original product (after the contents have been added)

public abstract class Pack extends Product{

	protected ProductList contents;
	protected SWSet set;
	protected boolean isOpened;

	public Pack(float price, ProductType productType, SWSet set){
		super(price, productType);
		this.isOpened = false; // all products are sealed at their outset
		contents = new ProductList();
		set = set;
	}

	
	protected void setSet(SWSet set){
		this.set = set;
	}

	protected void add(Product product){
		this.contents.add(product);
	}

	protected void open(){
		this.isOpened = true;
	}

	@Override
	public String toString(){

		if (this.isOpened == true){

			return this.contents.toString();
		}

		else return super.getName();
	}


}