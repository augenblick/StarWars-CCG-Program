class Player{
	
	CardSet[] playerCollection;
	String playerName;
	int setCount;

	public Player(String name){
		this.playerName = name;
	}

	public CardSet createSet(){
		CardSet newSet = new CardSet(this, "TestSet");
		//playerCollection[setCount] = CardSet;
		return null;
	}

	public void addCardtoSet(){

	}

}