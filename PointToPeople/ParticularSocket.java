import java.util.Scanner;
import java.io.IOException;

public class ParticularSocket {
	String Teacher = "";
	SimpleSocket simpleSocket;
	Scanner scanner = new Scanner(System.in);

	public ParticularSocket(String s) {
		try {
			simpleSocket = new SimpleSocket(s, 8000);
		} catch (IOException e) {
		}
	}

	String getQuestion() {

		String Name = "";
		String nNumber = "";
		String Question = "";
		String Teacher = "";

		System.out.println(simpleSocket.readString());
		Name = scanner.nextLine();
		simpleSocket.writeString(Name);
		System.out.println(simpleSocket.readString());
		nNumber = scanner.nextLine();
		simpleSocket.writeString(nNumber);

		System.out.println(simpleSocket.readString());
		Question = scanner.nextLine();
		simpleSocket.writeString(Question);

		System.out.println(simpleSocket.readString());
		Teacher = Teacher + scanner.nextLine();
		simpleSocket.writeString(Teacher);

		return Teacher;

		// return Teacher;
	}

	String Teacher() {
		String Teacher = "";

		// System.out.println(simpleSocket.readString());
		//Teacher = Teacher + scanner.nextLine();
		//simpleSocket.writeString(Teacher);
		return Teacher;
	}

	String tagNextPerson(String Teacher) {

		System.out.println("these teachers have looked at the question");
		System.out.println(Teacher);
		System.out.println("do you know? or, suggest another teacher.");
		this.Teacher = scanner.nextLine();
		if(this.Teacher.equals("resolved")){return this.Teacher;}
		this.Teacher = this.Teacher + " " + Teacher;
		return this.Teacher;
	}
}