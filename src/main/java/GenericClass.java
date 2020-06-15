public class GenericClass<G> {
    public G obj;
    // An object of type G is declared
    GenericClass(G obj) {this.obj = obj;  }  // constructor
    public static <G> void ArrayContent(G[] obj) {
    for (G i : obj){
        System.out.println(i);
    }
        System.out.println();
    }

}

