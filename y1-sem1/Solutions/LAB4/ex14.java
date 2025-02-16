import java.util.ArrayList;

public class ex14 {

	public static void main(String[] args) {
		ArrayList<Member> myListA = new ArrayList<Member>();

		Member member2 = new Member("Leonardo", 21);
		Member member3 = new Member("Michelangelo", 43);
		Member member4 = new Member("Rafaelo", 37);

		myListA.add(member2);
		myListA.add(member3);
		myListA.add(member4);

		ArrayList<Member> myListB = new ArrayList<Member>();
		printMemberData(myListA);
		System.out.println("'''''''''''''''''''''");
		myListB = myListA;
		printMemberData(myListB);
		System.out.println("'''''''''''''''''''''");
		myListA.remove(1);
		printMemberData(myListB);

		ArrayList<Member> myListC = new ArrayList<Member>();
		ArrayList<Member> myListD = new ArrayList<Member>();
		myListC.add(member2);
		myListC.add(member3);
		myListC.add(member4);

		printMemberData(myListC);
		System.out.println("'''''''''''''''''''''");
		myListD = (ArrayList<Member>) myListC.clone();
		myListC.remove(1);
		printMemberData(myListC);
		System.out.println("'''''''''''''''''''''");
		printMemberData(myListD);
		System.out.println();

	}

	private static void printMemberData(ArrayList<Member> myList) {
		for (int i = 0; i < myList.size(); i++) {
			Member person = myList.get(i);
			person.printInfo();
		}
	}

}