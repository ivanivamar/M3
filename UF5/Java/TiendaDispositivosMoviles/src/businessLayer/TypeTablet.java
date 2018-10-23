package businessLayer;

public enum TypeTablet {
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
