public class ClassMain {
    public static void main (String[] args)
    {
        // instance of String type
        GenericClass <String> sObj =
                new GenericClass<>("Test");
        System.out.println(sObj.getObject());

        // instance of Integer type
        GenericClass <Integer> iObj = new GenericClass<>(1000);
        System.out.println(iObj.getObject());


    }
}
