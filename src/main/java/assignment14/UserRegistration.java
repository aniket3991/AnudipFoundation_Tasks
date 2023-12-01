package assignment14;

class UserRegistration {
    public void registerUser(String userName, String userCountry) throws InvalidCountryException {
        if (!userCountry.equals("India"))
            throw new InvalidCountryException("“User Outside India cannot be registered");
        else
            System.out.println("Successful");
    }

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.registerUser("name", "India");
        }catch (InvalidCountryException e){
            System.out.println("County should be India");
        }
    }
}
