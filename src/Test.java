import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {

    public static void main(String[] args) {
        IAnimal animals[] = new IAnimal[]{new Cat("Kitty"), new Dog("Brutus", 5)};
        Gson gsonExt = null;
        {
            GsonBuilder builder = new GsonBuilder();
            builder.registerTypeAdapter(IAnimal.class   , new IAnimalAdapter());
            gsonExt = builder.create();
        }
        for (IAnimal animal : animals) {
            String animalJson = gsonExt.toJson(animal, IAnimal.class);
            System.out.println("serialized with the custom serializer:"  +animalJson);
            IAnimal animal2 = gsonExt.fromJson(animalJson, IAnimal.class);
            System.out.println(animal2.sound());
        }
    }
}