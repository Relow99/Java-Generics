public class GenericClass<G>
{
    // An object of type T is declared
    G obj;
    GenericClass(G obj) {  this.obj = obj;  }  // constructor
    public G getObject() {
    return this.obj;
    }
}

