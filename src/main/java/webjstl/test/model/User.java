package webjstl.test.model;

public class User {
    private int id;
    private String login;
    private String password;
    private String firstName;
    private int age;
    private String gender;
    private String country;

    public User() {
    }

    public User(String firstName, int age, String gender, String country) {
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.country = country;
    }

    public User(int id, String login, String password, String firstName, int age, String gender) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
