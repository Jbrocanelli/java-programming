package Warehousing;

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
    }

    public String history(){
        return changeHistory.toString();
    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        changeHistory.add(this.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double removedAmount = super.takeFromWarehouse(amount);
        changeHistory.add(this.getBalance());
        return removedAmount;
    }

    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.changeHistory);
        System.out.println("Largest Amount of Product: " + changeHistory.maxValue());
        System.out.println("Smallest Amount of Product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
    }

}
