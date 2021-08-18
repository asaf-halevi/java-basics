package _10_interfaces.examples.ex04_hotel;

abstract class Room {
    public static final String ONE_KING_BED = "One king bed";
    public static final String KING_OR_TWO_TWIN_SIZE_BEDS_UPON_REQUEST_WITH_NON_ALLERGENIC_MATTRESSES = "King or two twin size beds upon request with non-allergenic mattresses";
    public static final String ONE_ROLLING_OR_ONE_CRIB = "One rolling or one crib";
    public static final String ONE_FULL_MARBLE_BATHROOM = "One full marble bathroom";
    public static final String TWO_ROLLING_OR_ONE_SOFA_BED_AND_ONE_CRIB = "Two rolling, or one sofa-bed and one crib";
    public static final String DAYBED_SUNBED_OR_SOFA_BED = "Daybed, sunbed or sofa bed";
    public static final String MARBLE_BATHROOM_WITH_BATHTUB_SEPARATE_GLASS_WALLED_SHOWER = "Marble bathroom with bathtub, separate glass-walled shower";
    public static final String TWO_FULL_MARBLE_BATHROOMS = "Two full marble bathrooms";
    public static final String ONE_FULL_MARBLE_BATHROOM_PLUS_GUEST_POWDER_ROOM = "One full marble bathroom, plus guest powder room";
    public static final String ONE_FULL_MARBLE_BATHROOM_WC_WITH_TELEPHONE_IN_A_SEPARATE_ALCOVE = "One full marble bathroom, WC with telephone in a separate alcove";
    public static final String ADULTS_OR_2_ADULTS_AND_1_CHILD = "3 adults, or 2 adults and 1 child";
    public static final String ADULTS_OR_2_ADULTS_AND_2_CHILDREN = "3 adults, or 2 adults and 2 children";
    public static final String KING_BED_3_ADULTS_OR_2_ADULTS_AND_1_CHILD_TWIN_BEDS_2_ADULTS_OR_1_ADULT_AND_1_CHILD = "King bed: 3 adults, or 2 adults and 1 child, Twin beds: 2 adults, or 1 adult and 1 child";

    public static final float MILLISECONDS_IN_HOUR = (60 * 60 * 1000f);
    public final static float VAT = 1.18f;

    private final String type;
    private final int size;
    private final int location;
    private String bedOption;
    private String occupancy;
    private String extraBeds;
    private String bathroom;
    private double price;

    public Room(String type, int size, int location, double price) {
        this.type = type;
        this.size = size;
        this.location = location;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public int getLocation() {
        return location;
    }

    public double getVAT() {
        return VAT;
    }

    public String getBedOption() {
        return bedOption;
    }

    public void setBedOption(String bedOption) {
        this.bedOption = bedOption;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExtraBeds() {
        return extraBeds;
    }

    public void setExtraBeds(String extraBeds) {
        this.extraBeds = extraBeds;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    // methods
    public abstract double perNightPrice();

    public abstract double accommodationPeriodPrice(int days);

    @Override
    public String toString() {
        return "Room{" +
                "type='" + type + '\'' +
                ", size=" + size +
                ", location=" + location +
                ", bedOption='" + bedOption + '\'' +
                ", occupancy='" + occupancy + '\'' +
                ", extraBeds='" + extraBeds + '\'' +
                ", bathroom='" + bathroom + '\'' +
                ", price=" + price +
                ", VAT=" + VAT +
                "}\n";
    }
}
