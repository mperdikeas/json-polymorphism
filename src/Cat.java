public class Cat implements IAnimal {
    public String name;
    public Cat(String name) {
        super();
        this.name = name;
    }
   @Override
       public String sound() {
       return name+" : \"meaow\"";
   };
}