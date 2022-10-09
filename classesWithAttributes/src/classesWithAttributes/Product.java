package classesWithAttributes;

public class Product {
	public Product(int _id,String _name,String _description,double _price,int _stockAmount,String _renk) {
		System.out.println("Yapıcı blok çalıştı.");
		this._id=_id;
		this._renk=_renk;
		this._name=_name;
		this._price=_price;
		this._description=_description;
		this._stockAmount=_stockAmount;
	}
public Product() {
	
}
	private int _id;
	 String _name;
	 String _description;
	 double _price;
	 int _stockAmount;
	 String _renk;
	 String _kod;
	
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		_id=id;
		//this.id=id;
	}
	//this.=> içinde bulunan class için
	/**
	 * @return the _name
	 */
	public String get_name() {
		return _name;
	}
	/**
	 * @param _name the _name to set
	 */
	public void set_name(String _name) {
		this._name = _name;
	}
	/**
	 * @return the _description
	 */
	public String get_description() {
		return _description;
	}
	/**
	 * @param _description the _description to set
	 */
	public void set_description(String _description) {
		this._description = _description;
	}
	/**
	 * @return the _price
	 */
	public double get_price() {
		return _price;
	}
	/**
	 * @param _price the _price to set
	 */
	public void set_price(double _price) {
		this._price = _price;
	}
	/**
	 * @return the _stockAmount
	 */
	public int get_stockAmount() {
		return _stockAmount;
	}
	/**
	 * @param _stockAmount the _stockAmount to set
	 */
	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}
	/**
	 * @return the _renk
	 */
	public String get_renk() {
		return _renk;
	}
	/**
	 * @param _renk the _renk to set
	 */
	public void set_renk(String _renk) {
		this._renk = _renk;
	}
	/**
	 * @return the _kod
	 */
	public String get_kod() {
		return this._name.substring(0,1)+_id;
	}
	
}
