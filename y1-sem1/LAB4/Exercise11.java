import java.util.ArrayList;

public class Exercise11 {

    public static void main(String[] args) {
        System.out.println("Lab 4 - Exercise 11 \n");

        Member member1 = new Member("Frances", 24);
        System.out.println("get name: " + member1.getName());
        System.out.println("get age: " + member1.getAge() + "\n-------------------");
        member1.setAge(12);
        member1.setName("Mirabel");
        member1.printInfo();

        Member member2 = new Member("Patricia", 20);
        System.out.println("get name: " + member2.getName());
        System.out.println("get age: " + member2.getAge() + "\n-------------------");
        member1.setAge(15);
        member1.setName("Alexis");
        member1.printInfo();

        System.out.println("\n\nLab 4 - Exercise 12 \n");
        // a)
        ArrayList<Member> memberList = new ArrayList<Member>();

        // b)
        Member member3 = new Member("Leonardo", 21);
        Member member4 = new Member("Michelangelo", 43);
        Member member5 = new Member("Rafaelo", 37);
        memberList.add(member3);
        memberList.add(member4);
        memberList.add(member5);

        // d)
        printMemberData(memberList);
        /*
         * The printMemberData method is a user-defined method that doesn't run by
         * itself,
         * and it has to be called inside the main because the main method is the
         * starting point for a Java class to run.
         */

        // e)
        Member member6 = new Member("Donatelo", 58);
        memberList.add(1, member6);
        System.out.println("\nCHECKING memberList ARRAY: ");
        printMemberData(memberList);
    }

    // c)
    private static void printMemberData(ArrayList<Member> mylist) {
        for (int i = 0; i < mylist.size(); i++) {
            Member person = mylist.get(i);
            person.printInfo();
        }
    }
}
