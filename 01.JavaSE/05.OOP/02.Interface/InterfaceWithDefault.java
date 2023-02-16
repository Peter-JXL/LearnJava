public interface InterfaceWithDefault {
  String getName();
  default void run(){
    System.out.println(getName() + " run ");
  };
}
