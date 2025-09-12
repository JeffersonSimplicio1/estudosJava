package ExercicioDeFixacao;

public class ImportedProduct extends Product{
    private Double customsFee;
    private Double totalPrice;

    public ImportedProduct(String name, Double price, double customsFee){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee, Double totalPrice) {
        super(name, price);
        this.customsFee = customsFee;
        this.totalPrice = totalPrice;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = customsFee + getPrice();
    }
    @Override
    public String priceTag(){
        return getName() + " $ " + totalPrice + "Customs fee: $ " + getCustomsFee();

    }

}
