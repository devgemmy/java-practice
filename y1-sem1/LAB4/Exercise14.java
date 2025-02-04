import java.util.ArrayList;

public class Exercise14 {

    public static void main(String[] args) {
        System.out.println("Lab 4 - Exercise 14 \n");

        ArrayList<Member> mylistA = new ArrayList<Member>();

        Member member1 = new Member("Fiona", 10);
        Member member2 = new Member("Racheal", 32);
        Member member3 = new Member("George", 17);
        mylistA.add(member1);
        mylistA.add(member2);
        mylistA.add(member3);

        ArrayList<Member> mylistB = new ArrayList<Member>();

        printMemberData(mylistA);
        System.out.println();
        mylistB = mylistA;
        printMemberData(mylistB);
        System.out.println();
        mylistA.remove(1);
        printMemberData(mylistB);
        // The mylistA and mylistB point to the same space in memory

        System.out.println("\n\n\n");

        ArrayList<Member> mylistC = new ArrayList<Member>();
        ArrayList<Member> mylistD = new ArrayList<Member>();

        Member member4 = new Member("Thistle", 45);
        Member member5 = new Member("Heiress", 30);
        Member member6 = new Member("Anthonia", 22);
        mylistC.add(member4);
        mylistC.add(member5);
        mylistC.add(member6);

        printMemberData(mylistC);
        System.out.println();
        mylistD = (ArrayList<Member>) mylistC.clone();

        // The ArrayList (and arrays too) has some inherent behavior that can result in
        // some odd runtime errors.
        mylistC.remove(1);
        printMemberData(mylistC);
        System.out.println();
        printMemberData(mylistD);
        System.out.println();
    }

    private static void printMemberData(ArrayList<Member> mylist) {
        for (int i = 0; i < mylist.size(); i++) {
            Member person = mylist.get(i);
            person.printInfo();
        }
    }
}
