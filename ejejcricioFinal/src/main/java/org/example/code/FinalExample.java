package org.example.code;

import java.util.ArrayList;
import java.util.List;

public class FinalExample {

    public List<String> processData(String input) {
        List<String> data = new ArrayList<>();
        String[] parts = input.split(",");
        for (String part : parts) {
            part = part.trim();
            if (part.length() > 0) {
                if (part.length() > 10) {
                    part = part.substring(0, 10);
                }
                if (part.matches("[a-zA-Z]+")) {
                    data.add(part.toUpperCase());
                }
            }
        }

        System.out.println("Data processed:");
        for (String item : data) {
            System.out.println("- " + item);
        }

        System.out.println("Total items:");
        for (String item : data) {
            System.out.println("- " + item);
        }

        return data;
    }

    public String createUser(String name, String email, String phone,
                             String address, String city, String zip) {
        // Validation logic mixed with creation
        if (name == null || name.isEmpty()) {
            return "Name cannot be empty";
        }
        if (email == null || !email.contains("@")) {
            return "Invalid email";
        }
        // ... more validations

        return "User created: " + name;
    }


    public double calculateArea(String shape, double... dimensions) {
        switch (shape) {
            case "circle":
                return Math.PI * dimensions[0] * dimensions[0];
            case "rectangle":
                return dimensions[0] * dimensions[1];
            case "triangle":
                return dimensions[0] * dimensions[1] / 2;
            default:
                throw new IllegalArgumentException("Unknown shape");
        }
    }
}
