package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Galati City Hall",UsageType.GOVERNMENT));
        mappables.add(new Building("Galati Shopping City",UsageType.MARKET));
        mappables.add(new Building("Stadionul Otelul Galati",UsageType.SPORTS));
        mappables.add(new UtilityLine("DigiNet",UtilityType.FIBER_OPTICS));
        mappables.add(new UtilityLine("ApaNova",UtilityType.WATER));

        for (var m : mappables) {
            Mappable.mapIt(m);
        }

    }
}
