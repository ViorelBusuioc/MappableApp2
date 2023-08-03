package dev.lpa;

public class UtilityLine implements Mappable{

    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    public String toJSON() {
        return Mappable.super.toJSON() + """
               , "name": "%s", "utility": "%s """.formatted(name,type);
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case FIBER_OPTICS -> Color.GREEN + " " + PointMarkers.DOTTED;
            case ELECTRICAL -> Color.BLUE + " " + PointMarkers.DOTTED;
            case GAS -> Color.RED + " " + PointMarkers.DOTTED;
            case WATER -> Color.WHITE + " " + PointMarkers.DOTTED;
        };
    }

    @Override
    public String getShape() {
        return String.valueOf(PointMarkers.LINE);
    }

    @Override
    public String toString() {
        return "\"name\": \"" + name +
                "\", \"type\": \"" + type + "\"}";
    }
}
