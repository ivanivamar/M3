/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

/**
 *
 * @author ivanivamar
 */
public enum TypeLaptop {
    CHROME_OS, OSX, WINDOWS, LINUX;
        @Override
        public String toString() {
            String s = "";
            switch(this) {
                case CHROME_OS:
                    s="Chrome OS";
                    break;
                case OSX:
                    s="OSX";
                    break;
                case WINDOWS: 
                    s = "Windows";
                    break;
                case LINUX:
                    s = "Linux";
                    break;
            }
            return s;
        }
}
