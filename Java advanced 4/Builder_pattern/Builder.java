package Builder_pattern;

public class Builder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public Builder() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Builder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Builder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(this);
    }

}
