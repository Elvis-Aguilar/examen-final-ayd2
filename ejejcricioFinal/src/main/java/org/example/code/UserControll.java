package org.example.code;

/**
 * Esta necesita un contendor "Coman para el medoto createUser"
 * para no tener muchas variables en el metodo
 */
public class UserControll {
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

}
