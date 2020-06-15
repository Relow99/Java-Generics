public class ClassMain {
    public static void main (String[] args)
    {
        // instance of String type
        Integer[] intArray = { 6, 321, 96, 9009 };
        String[] stringArray = {"Though", "I", "Walk", "Through", "The" , "Valley", "Of", "Shadow" };

        System.out.println("Integer Array Contains:");
        GenericClass.ArrayContent(intArray);

        System.out.println("String Array Contains:");
        GenericClass.ArrayContent(stringArray);

        GenericClass<String> string = new GenericClass<String>("Test");
        System.out.println(string.obj);
        // instance of Integer type
        GenericClass<Integer> number = new GenericClass<Integer>(1000);
        System.out.println(number.obj);
    }
}
