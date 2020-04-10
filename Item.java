class Item {
	int id;
	String name;
	double price;
	String tipDanok;

	//TODO add variable.

	//TODO constructor
	public Item(int id,String name, double price, String tipDanok){
		this.id=id;
		this.name=name;
		this.price=price;
		this.tipDanok=tipDanok;
	//TODO setters and getters
	int getId(){ return id; }
	String getName() { return name; }
	double price() { return price; }
	string tipDanok() {return tipDanok; }
	void setId(int id){ this.id=id; }
	void setName(String name) {this.name=name; }
	void setPrice(double price) { this.price=price; }
	void setTipDanok(String tipDanok) { this.tipDanok = tipDanok; }

	double taxReturn () {
		//TODO
	}
}
