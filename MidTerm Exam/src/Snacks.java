public class Snacks extends Food{

    public String SnackSize;

    public Snacks(String Name, Double Price, String Description, String SnackSize){
        super(Name, Price, Description);
        this.SnackSize = SnackSize;

    }
    public String PrintValue() {
        return("Drink Name = " + super.Name + "\nPrice = " + super.Price + "\nDescription = " + super.Description + "\nSnack Size = " + this.SnackSize);
    }

}
