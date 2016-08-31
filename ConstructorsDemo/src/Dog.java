/**
 * Created by cerebro on 31/08/16.
 */
public class Dog extends Animal {
    public String name;

    public void introduce() {
        System.out.println("Wuff " + name);
    }

    // 1. same name as class name.

    // 2. non static

    // 3. no return type

    // 4. Only paramterless constructors can be inherited and that too only if
    //    child class has no constructor and parent has parameterless to give.

    // 5. First line in constrcutor should be call to parent constructor, directly
    //      or indirectly

    public Dog() {
        this("Donald"); //
        this.introduce(); //
        System.out.println("parameterless constructor");
        this.name = "Donald";
    }

    public Dog(String name) {
        super();
        System.out.println("paramter vala constructor");
        this.name = name;
    }


}
