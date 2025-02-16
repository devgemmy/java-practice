import java.util.ArrayList;

public class ex11_and_12 {

	// ex 5

	public static void main(String[] args) {

		Member member1 = new Member("Tony", 41);

		// ex 6

		ArrayList<Member> memberList = new ArrayList<Member>();
		Member member2 = new Member("Leonardo", 21);
		Member member3 = new Member("Michelangelo", 43);
		Member member4 = new Member("Rafaelo", 37);
		memberList.add(member2);// b
		memberList.add(member3);
		memberList.add(member4);

		Member member5 = new Member("Donatelo", 58);// e
		memberList.add(1, member5);
		printMemberData(memberList);// d
	}

	private static void printMemberData(ArrayList<Member> myList)// c
	{
		for (int i = 0; i < myList.size(); i++) {
			Member person = myList.get(i);
			person.printInfo();
		}
	}

}
