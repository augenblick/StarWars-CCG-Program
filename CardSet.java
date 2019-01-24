class CardSet{
	
	int[] inventory = new int[2517];
	String setName;
	Player owner;

	// creates a new empty CardSet
	public CardSet(Player player, String setName){
		this.owner = player;		
		this.setName = setName;
	}

	// duplicates an existing CardSet
	public CardSet(Player player, , String setName, CardSet cardSet){
		if (cardSet.getOwner() == this.owner){
			this.setName = setName;
			int[] originalSet = cardSet.getSetInventory();
			for (int i = 0; i < originalSet.length; i++){
				this.inventory[i] = originalSet[i];
			}
		}
	}

	public void addCard(int cardIndex, Player player){
		if (player == this.owner){
			int[cardIndex] += 1;
		}
	}

	public Player getOwner(){
		return this.owner;
	}

	private int[] getSetInventory(){
		return 
	}

	public String toString(){
		for (int i = 0; i < this.inventory; i++){
			if (inventory[i] > 0){
				System.out.println(fullCardList[i].getCardName() + " x" + inventory[i]);
			}
		}
	}


}