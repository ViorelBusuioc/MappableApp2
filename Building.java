package dev.lpa;

public class Building implements Mappable{

    private String name;
    private UsageType type;

    public Building(String name, UsageType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
               , "name": "%s", "usage": "%s """.formatted(name,type);
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case GOVERNMENT -> Color.RED + " " + PointMarkers.STAR;
            case SPORTS -> Color.BLUE + " " + PointMarkers.DIAMOND;
            case MARKET -> Color.PINK + " " + PointMarkers.SQUARE;
            default -> Color.BLACK + " " + PointMarkers.CIRCLE;
        };
    }

    @Override
    public String getShape() {
        return String.valueOf(PointMarkers.POINT);

    }

    @Override
    public String toString() {
        return "\"name\": \"" + name +
                "\", \"type\": \"" + type + "\"}";
    }
}
