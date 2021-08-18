package _10_interfaces.examples.ex04_hotel;

import java.time.LocalDateTime;

public class SixSeasonsHotel {

    public static void main(String[] args) {
        Room[] reservations = new Room[6];

        reservations[0] = new GuestRoom("STUDIO SUITE", 430, 7, 1138);
        reservations[0].setBathroom(Room.ONE_FULL_MARBLE_BATHROOM);
        reservations[0].setBedOption(Room.ONE_KING_BED);
        reservations[0].setExtraBeds(Room.ONE_ROLLING_OR_ONE_CRIB);
        reservations[0].setOccupancy(Room.ADULTS_OR_2_ADULTS_AND_1_CHILD);

        reservations[1] = new GuestRoom("PREMIER BALCONY ROOM", 403, 4, 1088);
        reservations[1].setBathroom(Room.ONE_FULL_MARBLE_BATHROOM);
        reservations[1].setBedOption(Room.ONE_KING_BED);
        reservations[1].setExtraBeds(Room.ONE_ROLLING_OR_ONE_CRIB);
        reservations[1].setOccupancy(Room.ADULTS_OR_2_ADULTS_AND_1_CHILD);

        reservations[2] = new GuestRoom("DELUXE BALCONY ROOM", 380, 2, 845);
        reservations[2].setBathroom(Room.MARBLE_BATHROOM_WITH_BATHTUB_SEPARATE_GLASS_WALLED_SHOWER);
        reservations[2].setBedOption(Room.ONE_KING_BED);
        reservations[2].setExtraBeds(Room.ONE_ROLLING_OR_ONE_CRIB);
        reservations[2].setOccupancy(Room.KING_BED_3_ADULTS_OR_2_ADULTS_AND_1_CHILD_TWIN_BEDS_2_ADULTS_OR_1_ADULT_AND_1_CHILD);

        reservations[3] = new Suite("HOLLYWOOD SUITE", 630, 14, 1260);
        reservations[3].setBathroom(Room.TWO_FULL_MARBLE_BATHROOMS);
        reservations[3].setBedOption(Room.ONE_KING_BED);
        reservations[3].setExtraBeds(Room.TWO_ROLLING_OR_ONE_SOFA_BED_AND_ONE_CRIB);
        reservations[3].setOccupancy(Room.ADULTS_OR_2_ADULTS_AND_2_CHILDREN);

        reservations[4] = new Suite("ROYAL SUITE", 1809, 16, 3600);
        reservations[4].setBathroom(Room.ONE_FULL_MARBLE_BATHROOM_PLUS_GUEST_POWDER_ROOM);
        reservations[4].setBedOption(Room.KING_OR_TWO_TWIN_SIZE_BEDS_UPON_REQUEST_WITH_NON_ALLERGENIC_MATTRESSES);
        reservations[4].setExtraBeds(Room.TWO_ROLLING_OR_ONE_SOFA_BED_AND_ONE_CRIB);
        reservations[4].setOccupancy(Room.ADULTS_OR_2_ADULTS_AND_2_CHILDREN);
        ((Suite) reservations[4]).secretarialServices(1);
        ((Suite) reservations[4]).faxServices();
        ((Suite) reservations[4]).privateChefService(LocalDateTime.now());
        System.out.println(reservations[4]);

        reservations[5] = new Bungalow("Superior Bungalow", 310, 0, 950, 150);
        reservations[5].setBathroom(Room.ONE_FULL_MARBLE_BATHROOM_WC_WITH_TELEPHONE_IN_A_SEPARATE_ALCOVE);
        reservations[5].setBedOption(Room.KING_OR_TWO_TWIN_SIZE_BEDS_UPON_REQUEST_WITH_NON_ALLERGENIC_MATTRESSES);
        reservations[5].setExtraBeds(Room.DAYBED_SUNBED_OR_SOFA_BED);
        reservations[5].setOccupancy(Room.ADULTS_OR_2_ADULTS_AND_2_CHILDREN);
        System.out.println(reservations[5]);
    }
}
