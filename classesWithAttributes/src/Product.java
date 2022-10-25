public class Product {

    //overloading = aşırı yükleme

    public Product(int id, String name, String _description, double _price, int _stockAmount, String _renk)
    {
        System.out.println("Yapıcı blok çalıştı");
        this._id=id;
        this._description=_description;
        this._name=name;
        this._price=_price;
        this._renk=_renk;
        this._stockAmount=_stockAmount;
    }

    public Product(){

    }

    //attribute | field
    private int _id;
    String _name;
    String _description;
    double _price;
    int _stockAmount;
    String _renk;
    String _kod;


    //getter
    public int getId() {
        return _id;
    }

    //this benim içinde bulunduğum class demek

    //setter
    public void setId(int id) {
        _id=id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = _name;
    }


    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        this._price = _price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String renk) {
        this._renk = _renk;
    }

    public String getKod() {
        return this._name.substring(0,1) + _id;
    }


}
