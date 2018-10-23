package businessLayer;

/**
 * @author ivanivamar
 * @fecha: 18/09/2018
 */

/**
 * @clase: Device
 */
public class Device {

    // Variables:
    private String brand;
    private String model;
    private String desc;
    private String color;
    private String processor;
    private double buyPrice;
    private double sellPrice;
    private double inches;
    private double RAM_GB;
    private TypeDev TypeDev;

    // Constructors:
    public Device() {
    }

    public Device(String brand, String model, String desc, String color, String processor, double buyPrice, double sellPrice, double inches, double RAM_GB, businessLayer.TypeDev typeDev) {
        this.brand = brand;
        this.model = model;
        this.desc = desc;
        this.color = color;
        this.processor = processor;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.inches = inches;
        this.RAM_GB = RAM_GB;
        TypeDev = typeDev;
    }

    public TypeDev getTypeDev() {
        return TypeDev;
    }

    public void setTypeDev(TypeDev TypeDev) {
        this.TypeDev = TypeDev;
    }

    public double getBuyPrice() { return buyPrice; }

    public void setBuyPrice(double buyPrice) { this.buyPrice = buyPrice; }

    public double getSellPrice() { return sellPrice; }

    public void setSellPrice(double sellPrice) { this.sellPrice = sellPrice; }

    public double getRAM_GB() {
        return RAM_GB;
    }

    public void setRAM_GB(double RAM_GB) {
        this.RAM_GB = RAM_GB;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getdesc() {
        return desc;
    }

    public void setdesc(String desc) {
        this.desc = desc;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Brand: " + this.getBrand() + "\r\n");
        sb.append("Model: " + this.getModel() + "\r\n");
        sb.append("Description: " + this.getdesc() + "\r\n");
        sb.append("Processor: " + this.getProcessor());
        sb.append("Color: " + this.getColor() + "\r\n");
        sb.append("Inches: " + this.getInches() + "\r\n");
        sb.append("Buying price: " + this.getBuyPrice() + "€" + "\r\n");
        sb.append("Selling price: " + this.getSellPrice() + "€" + "\r\n");
        sb.append("RAM: " + this.getRAM_GB() + " GB");

        return sb.toString();
    }
}
