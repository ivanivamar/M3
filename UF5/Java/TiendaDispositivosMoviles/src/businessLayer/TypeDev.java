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
public enum TypeDev {
    
        SMARTPHONE, LAPTOP, TABLET;
        
        @Override
        public String toString() {
            String s = "";
            switch(this) {
                case SMARTPHONE: 
                    s="Movil";
                    break;
                case LAPTOP: 
                    s="Laptop";
                    break;
                case TABLET: 
                    s = "Tablet";
                    break;
            }
            return s;
        }
}
