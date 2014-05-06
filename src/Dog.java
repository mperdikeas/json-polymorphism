public class Dog implements IAnimal {

    public String name;
    public int ferocity;


    public Dog(String name, int ferocity) {
        super();
        this.name = name;
        this.ferocity = ferocity;
    }

@Override
    public String sound() {
    return name+" : \"bark\" (ferocity level:"+ferocity + ")";

}
}