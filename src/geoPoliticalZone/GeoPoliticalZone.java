package geoPoliticalZone;

public class GeoPoliticalZone {

    public void checkZone(String state) {
        state = state.toLowerCase();

        if (isNorthCentral(state)) {
            System.out.println("Geo-Political Zone: North Central");

        } else if (isNorthEast(state)) {
            System.out.println("Geo-Political Zone: North East");

        } else if (isNorthWest(state)) {
            System.out.println("Geo-Political Zone: North West");

        } else if (isSouthEast(state)) {
            System.out.println("Geo-Political Zone: South East");

        } else if (isSouthSouth(state)) {
            System.out.println("Geo-Political Zone: South South");

        } else if (isSouthWest(state)) {
            System.out.println("Geo-Political Zone: South West");
        } else {
            System.out.println("Invalid state entered.");
        }

    }

    public boolean isNorthCentral(String state) {
        return state.equals("benue") || state.equals("fct") || state.equals("kogi")
                || state.equals("kwara") || state.equals("nasarawa")
                || state.equals("niger") || state.equals("plateau");
    }

    public boolean isNorthEast(String state) {
        return state.equals("adamawa") || state.equals("bauchi") || state.equals("borno")
            || state.equals("gombe") || state.equals("taraba")
            || state.equals("yobe");
    }

    public boolean isNorthWest(String state) {
        return state.equals("kaduna") || state.equals("katsina") || state.equals("kano")
            || state.equals("kebbi") || state.equals("sokoto")
            || state.equals("jigawa") || state.equals("zamfara");
    }

    public boolean isSouthEast(String state) {
        return state.equals("abia") || state.equals("anambra") || state.equals("ebonyi")
            || state.equals("enugu") || state.equals("imo");
    }

    public boolean isSouthSouth(String state) {
        return state.equals("akwa-ibom") || state.equals("bayelsa") || state.equals("cross-river")
            || state.equals("delta") || state.equals("edo")
            || state.equals("rivers");
    }

    public boolean isSouthWest(String state) {
        return state.equals("ekiti") || state.equals("lagos") || state.equals("osun")
            || state.equals("ondo") || state.equals("ogun")
            || state.equals("oyo");
    }
}
