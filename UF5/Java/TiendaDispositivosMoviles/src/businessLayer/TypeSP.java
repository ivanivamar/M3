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
public enum TypeSP {
    ANDROID, IOS, WINDOWS, NO_SMART;
        @Override
        public String toString() {
            String s = "";
            switch(this) {
                case ANDROID: 
                    s="Android";
                    break;
                case IOS: 
                    s="IOS";
                    break;
                case WINDOWS: 
                    s = "Windows";
                    break;
                case NO_SMART: 
                    s = "No Smart";
                    break;
            }
            return s;
        }
}
