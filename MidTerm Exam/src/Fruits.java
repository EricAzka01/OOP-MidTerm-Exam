public class Fruits extends Food{

    public String fruits;

    public Fruits(String Name, Double Price, String Description, String fruits){
        super(Name, Price, Description);
        this.fruits = fruits;
    }

    @Override
    public String PrintValue() {
        return("Food Name = " + super.Name + "\nPrice = " + super.Price + "\nDescription = " + super.Description + "\nFruits = " + this.fruits);
    }

    @Override
    public String PrintValueDiscount() {
        return("Food Name = " + super.Name + "\nPrice = " + super.Price + "\nDescription = " + super.Description + "Discount = " + super.Discount + "\nFruits = " + this.fruits);
    }
}
