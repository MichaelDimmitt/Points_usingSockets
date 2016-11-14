import java.util.NoSuchElementException;

public class ClientTest {
	public static void main(String args[]) throws Exception {
		String Teacher;
		ParticularSocket question = new ParticularSocket("139.62.39.197");

		Teacher = question.getQuestion();
		try {
			Teacher = question.Teacher();
		} catch (NoSuchElementException e) {

		}
		boolean running = true;
		while (running) {
			ParticularSocket teacherPoint = new ParticularSocket("139.62.39.197");
			System.out.println("Enter teacher who would know");
			Teacher = teacherPoint.tagNextPerson(Teacher);
			if (Teacher.equals("resolved")){running = false;}
		}
	}

}
