/**
 * @author Iván Ivanov Marín
 * @date 18/09/2018
 * @Title Practica Laptop:
 **/
/**
 * @Title Practica Laptop:
 **/

package businessLayer;

public class Laptop extends Device {

    private double hddGB;
    private double sddGB;
    private String gpu;
    private double bateryCells;
    private TypeLaptop typeLaptop;

    public Laptop() {
    }

    public Laptop(double hddGB, double sddGB, String gpu, double bateryCells, TypeLaptop typeLaptop) {
        this.hddGB = hddGB;
        this.sddGB = sddGB;
        this.gpu = gpu;
        this.bateryCells = bateryCells;
        this.typeLaptop = typeLaptop;
    }

    public Laptop(String brand, String model, String desc, String color, String processor, double buyPrice, double sellPrice, double inches, double RAM_GB, businessLayer.TypeDev typeDev, double hddGB, double sddGB, String gpu, double bateryCells, TypeLaptop typeLaptop) {
        super(brand, model, desc, color, processor, buyPrice, sellPrice, inches, RAM_GB, typeDev);
        this.hddGB = hddGB;
        this.sddGB = sddGB;
        this.gpu = gpu;
        this.bateryCells = bateryCells;
        this.typeLaptop = typeLaptop;
    }

    public double getHddGB() {
        return hddGB;
    }

    public void setHddGB(double hddGB) {
        this.hddGB = hddGB;
    }

    public double getSddGB() {
        return sddGB;
    }

    public void setSddGB(double sddGB) {
        this.sddGB = sddGB;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public double getBateryCells() {
        return bateryCells;
    }

    public void setBateryCells(double bateryCells) {
        this.bateryCells = bateryCells;
    }

    public TypeLaptop getTypeLaptop() {
        return typeLaptop;
    }

    public void setTypeLaptop(TypeLaptop typeLaptop) {
        this.typeLaptop = typeLaptop;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type of device:" + this.getTypeDev() + "\r\n");
        sb.append("------------------------------------------------" + "\r\n");
        sb.append("Brand: " + this.getBrand() + "\r\n");
        sb.append("Model: " + this.getModel() + "\r\n");
        sb.append("Description: " + this.getdesc() + "\r\n");
        sb.append("Color: " + this.getColor() + "\r\n");
        sb.append("------------------------------------------------" + "\r\n");
        sb.append("OS:" + this.getTypeLaptop() + "\r\n");
        sb.append("Processor: " + this.getProcessor() + "\r\n");
        sb.append("Inches: " + this.getInches() + "\"" + "\r\n");
        sb.append("------------------------------------------------" + "\r\n");
        sb.append("Buying price: " + this.getBuyPrice() + "€" + "\r\n");
        sb.append("Selling price: " + this.getSellPrice() + "€" + "\r\n");
        sb.append("------------------------------------------------" + "\r\n");
        sb.append("HDD GB : " + this.getHddGB() + " GB" + "\r\n");
        sb.append("SDD GB : " + this.getSddGB() + " GB" + "\r\n");
        sb.append("Graphic Card : " + this.getGpu() + "\r\n");
        sb.append("Battery Cells : " + this.getBateryCells() + "\r\n");

        return sb.toString();
    }
}
