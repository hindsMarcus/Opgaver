public class Datamatik {


	public static void main(String[] args) {
		Teacher tobias = new Teacher("Tobias", 35, false);
		Student marcus = new Student("Marcus", 24, false, 'E');
		Student lucas = new Student("Lucas", 20, false, 'E');

		System.out.println(tobias.name);
		System.out.println(marcus.name + " is in group " + marcus.datamatikerTeam);
		System.out.println(lucas.name + " is in group " + lucas.datamatikerTeam);
	}
}