package general_problems;

public class MainProgram {

    public static void main(String[] args){
//        System.out.println(general_problems.PrimeDecomp.factors(7775460));

        //Binary Search tree
        Person p1 = new Person("Rajesh", 25);
        Person p2 = new Person("Vinu", 22);
        Person p3 = new Person("Dinu", 23);
        Person p4 = new Person("Sekar", 19);
        Person p5 = new Person("Kumar", 17);

        CustomBinarySearchTree bst = new CustomBinarySearchTree();
        bst.insert(p1);
        bst.insert(p2);
        bst.insert(p3);
        bst.insert(p4);
        bst.insert(p5);

        bst.showAll(bst.findNode("Rajesh"));
        Person p = bst.getData(bst.findParent("Kumar"));
        System.out.println("parent is " + p.toString());
    }
}
