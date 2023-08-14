public class User {

    String name;
    int age;

    public User(String someName, int currentAge){
        name = someName;
        age = currentAge;
    }

    public String getUserInfo() {
        return String.format("UserName is %s, and user age is %d", name, age);
    }
}
