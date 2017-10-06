public class People {

    private String name = "default";
    private int age = 27;
    private int height = 175;

    public People(){}

    public People(String name){
        this();
        this.name = name;
    }

    public People(String name, int age){
        this(name);
        this.age = age;
    }

    public People(String name, int age, int height){
        this(name, age);
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
