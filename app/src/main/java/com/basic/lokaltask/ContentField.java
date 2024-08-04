package com.basic.lokaltask;

import java.util.List;

public class ContentField {
    private List<ContentFieldV3> V3;

    // Getter and Setter for V3
    public List<ContentFieldV3> getV3() {
        return V3;
    }

    public void setV3(List<ContentFieldV3> V3) {
        this.V3 = V3;
    }

    // Nested static class for individual content fields
    public static class ContentFieldV3 {
        private String field_key;
        private String field_name;
        private String field_value;

        // Getter and Setter for field_key
        public String getField_key() {
            return field_key;
        }

        public void setField_key(String field_key) {
            this.field_key = field_key;
        }

        // Getter and Setter for field_name
        public String getField_name() {
            return field_name;
        }

        public void setField_name(String field_name) {
            this.field_name = field_name;
        }

        // Getter and Setter for field_value
        public String getField_value() {
            return field_value;
        }

        public void setField_value(String field_value) {
            this.field_value = field_value;
        }
    }
}
