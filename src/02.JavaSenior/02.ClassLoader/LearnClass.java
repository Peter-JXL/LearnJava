public class LearnClass {
  public static void main(String[] args) {
    Class strClass = String.class;
    System.out.println("strClass.getName(): " + strClass.getName());
    System.out.println("strClass.getSimpleName(): " + strClass.getSimpleName());
    System.out.println("strClass.getPackage(): " + strClass.getPackage());
    System.out.println("strClass.getPackage().getName(): " + strClass.getPackage().getName());
    System.out.println("strClass.isInterface(): " + strClass.isInterface());
    System.out.println("strClass.isEnum(): " + strClass.isEnum());
    System.out.println("strClass.isArray(): " + strClass.isArray());
    System.out.println("strClass.isPrimitive(): " + strClass.isPrimitive());
  }
}
