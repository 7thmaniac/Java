public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age < 0||age > 100) {
            this.age = 0;
        }else {
            this.age = age;
        }
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

    public boolean isTeen(){
        return age > 12 && age < 20;
    }

    public String getFullName(){
        if(this.firstName.isEmpty()){
            return this.lastName;
        }else if(this.lastName.isEmpty()){
            return this.firstName;
        }else if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }
        return this.firstName + " " + this.lastName;
    }
}
