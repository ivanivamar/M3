/**
 * Name: Ivan Ivanov Marín
 * Fecha:
 */
package commandLine;

import businessLayer.*;

import java.util.ArrayList;

import static businessLayer.Engine.*;
import static businessLayer.TypeDev.SMARTPHONE;

public class AplicationCommand {

    public static void main(String[] args) {
        int ch = 0;
        TypeDev tD = null;
        Device dV = null;
        do {
            System.out.println("Select the type of device you want to create. \n"
                    + "0. SmartPhone \n"
                    + "1. Laptop \n"
                    + "2. Tablet");
            ch = ((int) readNum());
            switch (ch) {

                case 0:
                    tD = SMARTPHONE;
                    clrscr();
                    break;

                case 1:
                    tD = TypeDev.LAPTOP;
                    break;

                case 2:
                    tD = TypeDev.TABLET;
                    System.exit(0);
                    break;
            }

        } while (ch < 0 && ch > 2);

        dV = askData(tD);

        System.out.println(dV.toString());
    }

    public static Device askData(TypeDev td) {
        Device dv = null;

        switch (td) {
            case SMARTPHONE:
                dv = askSP();
                clrscr();
                break;
            case LAPTOP:
                dv = askLaptop();
                clrscr();
                break;
            case TABLET:
                dv = askTablet();
                clrscr();
                break;
        }
        return dv;
    }

    private static SmartPhone askSP() {
        SmartPhone sp = new SmartPhone();
        sp.setTypeDev(TypeDev.SMARTPHONE);

        System.out.println("Brand:");
        sp.setBrand(scan.nextLine());
        clrscr();

        System.out.println("Model:");
        sp.setModel(scan.nextLine());
        clrscr();

        System.out.println("Description");
        sp.setdesc(scan.nextLine());
        clrscr();

        System.out.println("Processor:");
        sp.setProcessor(scan.nextLine());
        clrscr();

        System.out.println("Color:");
        sp.setColor(scan.nextLine());
        clrscr();

        System.out.println("Buying price:");
        sp.setBuyPrice(readNum());
        clrscr();

        System.out.println("Selling price:");
        sp.setSellPrice(readNum());
        clrscr();

        System.out.println("RAM:");
        sp.setRAM_GB(readNum());
        clrscr();

        System.out.println("Screen size:");
        sp.setInches(readNum());
        clrscr();

        System.out.println("SIM number:");
        sp.setSIM_Cards(readNum());
        clrscr();

        System.out.println("Camera number:");
        sp.setNumCameras(readNum());
        clrscr();

        System.out.println("ROM:");
        sp.setROM(readNum());
        clrscr();

        System.out.println("Battety mAh:");
        sp.setmAh(readNum());
        clrscr();

        System.out.println("Select the type of device you want to create. \n"
                + "0. Android \n"
                + "1. IOS \n"
                + "2. Windows"
                + "3. No Smart");
        sp.setTypeSP(TypeSP.values()[(int) readNum()]);
        clrscr();
        return sp;
    }

    private static Laptop askLaptop() {
        Laptop laptop = new Laptop();
        laptop.setTypeDev(TypeDev.LAPTOP);

        System.out.println("Brand:");
        laptop.setBrand(scan.nextLine());
        clrscr();

        System.out.println("Model:");
        laptop.setModel(scan.nextLine());
        clrscr();

        System.out.println("Description");
        laptop.setdesc(scan.nextLine());
        clrscr();

        System.out.println("Processor:");
        laptop.setProcessor(scan.nextLine());
        clrscr();

        System.out.println("Color:");
        laptop.setColor(scan.nextLine());
        clrscr();

        System.out.println("Buying price:");
        laptop.setBuyPrice(readNum());
        clrscr();

        System.out.println("Selling price:");
        laptop.setSellPrice(readNum());
        clrscr();

        System.out.println("RAM:");
        laptop.setRAM_GB(readNum());
        clrscr();

        System.out.println("Screen size:");
        laptop.setInches(readNum());
        clrscr();

        System.out.println("Graphic Card:");
        laptop.setGpu(scan.nextLine());
        clrscr();

        System.out.println("Battery Cells:");
        laptop.setBateryCells(readNum());
        clrscr();

        System.out.println("RAM:");
        laptop.setRAM_GB(readNum());
        clrscr();

        System.out.println("HHD GB:");
        laptop.setHddGB(readNum());
        clrscr();

        System.out.println("SSD GB:");
        laptop.setSddGB(readNum());
        clrscr();

        System.out.println("Select the type of device you want to create. \n"
                + "0. Chrome OS \n"
                + "1. Linux \n"
                + "2. Mac"
                + "3. Windows");
        laptop.setTypeLaptop(TypeLaptop.values()[(int) readNum()]);
        clrscr();
        return laptop;
    }

    private static Tablet askTablet() {
        Tablet tablet = new Tablet();
        tablet.setTypeDev(TypeDev.TABLET);
        System.out.println("Brand:");
        tablet.setBrand(scan.nextLine());
        clrscr();

        System.out.println("Model:");
        tablet.setModel(scan.nextLine());
        clrscr();

        System.out.println("Description:");
        tablet.setdesc(scan.nextLine());
        clrscr();

        System.out.println("Color:");
        String color = scan.nextLine();

        System.out.println("Processor:");
        tablet.setProcessor(scan.nextLine());
        clrscr();

        System.out.println("Buying price:");
        tablet.setBuyPrice(readNum());
        clrscr();

        System.out.println("Selling price:");
        tablet.setSellPrice(readNum());
        clrscr();

        System.out.println("RAM:");
        tablet.setRAM_GB(readNum());
        clrscr();

        System.out.println("ROM:");
        tablet.setROM((int) readNum());
        clrscr();

        System.out.println("Screen size:");
        tablet.setInches(readNum());
        clrscr();

        System.out.println("HDD GB size:");
        tablet.setHddGB(readNum());
        clrscr();

        System.out.println("SDD GB size:");
        tablet.setSddGB(readNum());

        System.out.println("Camera number:");
        tablet.setNumCameras((int) readNum());

        System.out.println("SD GB");
        tablet.setSdGB(readNum());

        return tablet;
    }
}