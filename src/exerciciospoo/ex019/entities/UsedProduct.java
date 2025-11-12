package exerciciospoo.ex019.entities;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class UsedProduct  extends Product{
    private LocalDate manuFactureDate;


    public UsedProduct(){
        super();
    }
    public UsedProduct(String name, Double price, LocalDate manuFactureDate){
        super(name, price);
        this.manuFactureDate = manuFactureDate;

    }

    public LocalDate getManuFactureDate() {
        return manuFactureDate;
    }

    public void setManuFactureDate(LocalDate manuFactureDate) {
        this.manuFactureDate = manuFactureDate;
    }

    public String priceTag() {
        return getName()
                + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + manuFactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + ")";
    }
}
