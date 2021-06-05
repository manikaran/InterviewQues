
public interface Animal {

    String colour = "Red";

    default void play();
    default void eat();
    default int sleep(int hours);
}