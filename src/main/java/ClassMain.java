public class ClassMain {
    public static void main (String[] args)
    {
        // instance of Integer type
        Integer[] intArray = { 6, 321, 96, 9009 };
        System.out.println("Integer Array Contains:");
        GenericClass.ArrayContent(intArray);

        // instance of Integer type
        String[] stringArray = {"Though", "I", "Walk", "Through", "The" , "Valley", "Of", "Shadow" };
        System.out.println("String Array Contains:");
        GenericClass.ArrayContent(stringArray);

        GenericClass<String> string = new GenericClass<String>("Test");
        System.out.println(string.obj);
        GenericClass<Integer> number = new GenericClass<Integer>(1000);
        System.out.println(number.obj);
    }
}
