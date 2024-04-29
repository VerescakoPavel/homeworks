package lesson20.classwork2404.example2;

public enum TrafficLightColor {


    RED("Red", false),
    YELLOW("Yellow", false),
    GREEN("Green", true);
    private String colorName;
    private boolean canGo;

    private TrafficLightColor(String colorName, boolean canGo) {
        this.colorName = colorName;
        this.canGo = canGo;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public boolean CanGo() {
        return canGo;
    }


}
