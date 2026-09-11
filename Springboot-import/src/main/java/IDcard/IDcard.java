package IDcard;

public class IDcard {
    private String name;
    private String age;

    public IDcard() {
    }

    public IDcard(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "IDcard{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
