/**
 * @author Iván Ivanov Marín
 * @date 18/09/2018
 */
/**
 * @Title Practica SmartPhone:
 */
package businessLayer;

public class SmartPhone extends Device {

    private double SIM_Cards;
    private TypeSP typeSP;
    private double numCameras;
    private double ROM;
    private double mAh;

    public SmartPhone() {
    }

    public SmartPhone(double SIM_Cards, TypeSP typeSP, double numCameras, double ROM, double mAh) {
        this.SIM_Cards = SIM_Cards;
        this.typeSP = typeSP;
        this.numCameras = numCameras;
        this.ROM = ROM;
        this.mAh = mAh;
    }

    public SmartPhone(String brand, String model, String desc, String color, String processor, double buyPrice, double sellPrice, double inches, double RAM_GB, businessLayer.TypeDev typeDev, double SIM_Cards, TypeSP typeSP, double numCameras, double ROM, double mAh) {
        super(brand, model, desc, color, processor, buyPrice, sellPrice, inches, RAM_GB, typeDev);
        this.SIM_Cards = SIM_Cards;
        this.typeSP = typeSP;
        this.numCameras = numCameras;
        this.ROM = ROM;
        this.mAh = mAh;
    }

    public double getmAh() { return mAh; }

    public void setmAh(double mAh) { this.mAh = mAh; }

    public double getSIM_Cards() {
        return SIM_Cards;
    }

    public void setSIM_Cards(double SIM_Cards) {
        this.SIM_Cards = SIM_Cards;
    }

    public TypeSP getTypeSP() {
        return typeSP;
    }

    public void setTypeSP(TypeSP typeSP) {
        this.typeSP = typeSP;
    }

    public double getNumCameras() {
        return numCameras;
    }

    public void setNumCameras(double numCameras) {
        this.numCameras = numCameras;
    }

    public double getROM() {
        return ROM;
    }

    public void setROM(double ROM) {
        this.ROM = ROM;
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
        sb.append("OS:" + this.getTypeSP()+ "\r\n");
        sb.append("Processor: " + this.getProcessor()+ "\r\n");
        sb.append("Inches: " + this.getInches() + "\"" + "\r\n");
        sb.append("Camera: " + this.getNumCameras() + "\r\n");
        sb.append("------------------------------------------------" + "\r\n");
        sb.append("Buying price: " + this.getBuyPrice() + "€" + "\r\n");
        sb.append("Selling price: " + this.getSellPrice() + "€" + "\r\n");
        sb.append("------------------------------------------------" + "\r\n");
        sb.append("SIM Cards: " + this.getSIM_Cards() + "\r\n");
        sb.append("ROM: " + this.getROM() + "GB" + "\r\n");
        sb.append("RAM: " + this.getRAM_GB()+ "GB" + "\r\n");
        sb.append("Mili Amperios: " + this.getmAh()+ " mAh" + "\r\n");

        return sb.toString();
    }
}
