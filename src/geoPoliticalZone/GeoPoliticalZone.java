package geoPoliticalZone;

public enum GeoPoliticalZone {

    NORTH_CENTRAL(new String[] {
            "Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"
    }),
    NORTH_EAST(new String[] {
            "Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"
    }),
    NORTH_WEST(new String[] {
            "Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"
    }),
    SOUTH_EAST(new String[] {
            "Abia", "Anambra", "Ebonyi", "Enugu", "Imo"
    }),
    SOUTH_SOUTH(new String[] {
            "Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"
    }),
    SOUTH_WEST(new String[] {
            "Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"
    });

    private final String[] states;

    private GeoPoliticalZone(String[] states) {
        this.states = states;
    }

    public boolean containsState(String state) {
        for (String stateName : states) {
            if (stateName != null && stateName.equalsIgnoreCase(state)) {
                return true;
            }
        }
        return false;
    }
}
