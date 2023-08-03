package dev.lpa;

interface Mappable {

    String JSON_PROPERTY = """
            "properties": {"%s"}""";


    static void mapIt(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }

    default String toJSON() {
        return """
                type": "%s", "label": "%s", "marker": "%s" """.formatted(getShape(), getLabel(), getMarker());
    }
    String getLabel();
    String getMarker();
    String getShape();
}
