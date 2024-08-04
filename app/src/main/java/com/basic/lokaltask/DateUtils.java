package com.basic.lokaltask;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    private static final DateTimeFormatter INPUT_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSXXX");
    private static final DateTimeFormatter OUTPUT_FORMATTER = DateTimeFormatter.ofPattern("MMM dd, yyyy HH:mm:ss");

    public static String formatExpireOn(String expireOn) {
        try {
            // Parse the input date string
            OffsetDateTime dateTime = OffsetDateTime.parse(expireOn, INPUT_FORMATTER);
            // Format the OffsetDateTime object to a new format
            return dateTime.format(OUTPUT_FORMATTER);
        } catch (Exception e) {
            e.printStackTrace();
            return expireOn; // Return original string if parsing fails
        }
    }
}
