package geoPoliticalZone;

public class GeoPoliticalZone {

    public void checkZone(String state) {
        state = state.toLowerCase();

        if (state.equals("benue") || state.equals("fct") || state.equals("kogi")
                || state.equals("kwara") || state.equals("nasarawa")
                || state.equals("niger") || state.equals("plateau")) {

            System.out.println("Geo-Political Zone: North Central");

        } else if (state.equals("adamawa") || state.equals("bauchi") || state.equals("borno")
                || state.equals("gombe") || state.equals("taraba")
                || state.equals("yobe")) {

            System.out.println("Geo-Political Zone: North East");

        } else if (state.equals("kaduna") || state.equals("katsina") || state.equals("kano")
                || state.equals("kebbi") || state.equals("sokoto")
                || state.equals("jigawa") || state.equals("zamfara")) {

            System.out.println("Geo-Political Zone: North West");

        } else if (state.equals("abia") || state.equals("anambra") || state.equals("ebonyi")
                || state.equals("enugu") || state.equals("imo")) {

            System.out.println("Geo-Political Zone: South East");

        } else if (state.equals("akwa-ibom") || state.equals("bayelsa") || state.equals("cross-river")
                || state.equals("delta") || state.equals("edo")
                || state.equals("rivers")) {

            System.out.println("Geo-Political Zone: South South");

        } else if (state.equals("ekiti") || state.equals("lagos") || state.equals("osun")
                || state.equals("ondo") || state.equals("ogun")
                || state.equals("oyo")) {

            System.out.println("Geo-Political Zone: South West");

        } else {
            System.out.println("Invalid state entered.");
        }
    }
}
