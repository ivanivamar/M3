/**
 * @author Iván Ivanov Marín
 * @date 18/09/2018
 */
/**
 * @Title Practica SmartPhone:
 */
package businessLayer;

public class Tablet extends Device {

    private int SIM_Cards;
    private int numCameras;
    private int ROM;
    private TypeTablet typeTablet;
    private double hddGB;
    private double sddGB;
    private double sdGB;

    public Tablet() {
    }

    public Tablet(int SIM_Cards, int numCameras, int ROM, TypeTablet typeTablet, double hddGB, double sddGB, double sdGB) {
        this.SIM_Cards = SIM_Cards;
        this.numCameras = numCameras;
        this.ROM = ROM;
        this.typeTablet = typeTablet;
        this.hddGB = hddGB;
        this.sddGB = sddGB;
        this.sdGB = sdGB;
    }

    public Tablet(String brand, String model, String desc, String color, String processor, double buyPrice, double sellPrice, double inches, double RAM_GB, businessLayer.TypeDev typeDev, int SIM_Cards, int numCameras, int ROM, TypeTablet typeTablet, double hddGB, double sddGB, double sdGB) {
        super(brand, model, desc, color, processor, buyPrice, sellPrice, inches, RAM_GB, typeDev);
        this.SIM_Cards = SIM_Cards;
        this.numCameras = numCameras;
        this.ROM = ROM;
        this.typeTablet = typeTablet;
        this.hddGB = hddGB;
        this.sddGB = sddGB;
        this.sdGB = sdGB;
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

    public double getSdGB() {
        return sdGB;
    }

    public void setSdGB(double sdGB) {
        this.sdGB = sdGB;
    }

    public TypeTablet getTypeTablet() {
        return typeTablet;
    }

    public void setTypeTablet(TypeTablet typeTablet) {
        this.typeTablet = typeTablet;
    }
    
    public int getSIM_Cards() {
        return SIM_Cards;
    }

    public void setSIM_Cards(int SIM_Cards) {
        this.SIM_Cards = SIM_Cards;
    }

    public int getNumCameras() {
        return numCameras;
    }

    public void setNumCameras(int numCameras) {
        this.numCameras = numCameras;
    }

    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type of device: " + this.getTypeDev() + "\r\n");
        sb.append("------------------------------------------------" + "\r\n");
        sb.append("Brand: " + this.getBrand() + "\r\n");
        sb.append("Model: " + this.getModel() + "\r\n");
        sb.append("Description: " + this.getdesc() + "\r\n");
        sb.append("Color: " + this.getColor() + "\r\n");
        sb.append("------------------------------------------------" + "\r\n");
        sb.append("OS:" + this.getTypeTablet()+ "\r\n");
        sb.append("Inches: " + this.getInches()+ "\"" + "\r\n");
        sb.append("Camera: " + this.getNumCameras() + "\r\n");
        sb.append("Processor: " + this.getProcessor() + "\r\n");
        sb.append("------------------------------------------------" + "\r\n");
        sb.append("Buying price: " + this.getBuyPrice() + "€" + "\r\n");
        sb.append("Selling price: " + this.getBuyPrice() + "€" + "\r\n");
        sb.append("------------------------------------------------" + "\r\n");
        sb.append("SIM Cards: " + this.getSIM_Cards() + "\r\n");
        sb.append("ROM: " + this.getROM() + "GB" + "\r\n");
        sb.append("RAM: " + this.getRAM_GB()+ "GB" + "\r\n");
        sb.append("HDD GB : " + this.getHddGB() + " GB" + "\r\n");
        sb.append("SDD GB : " + this.getSddGB() + " GB" + "\r\n");
        sb.append("SD GB : " + this.getSdGB() + " GB" + "\r\n");

        return sb.toString();
    }
}
