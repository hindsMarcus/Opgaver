import java.util.Arrays;

public class Datamatik {

	public static Student[] studentArray = new Student[10]; 



	public static void main(String[] args) {
		studentArray[0] = new Student("Marcus", 24, false, 'E', 0);
		studentArray[1] = new Student("Lucas", 26, false, 'E', 1);
		studentArray[2] = new Student("Palle", 22, false, 'E', 2);
		studentArray[3] = new Student("Jan", 29, false, 'E', 3);
		studentArray[4] = new Student("Louise", 30, false, 'E', 4);
		studentArray[5] = new Student("Ida", 25, false, 'E', 5);
		studentArray[6] = new Student("Andreas", 23, false, 'E', 6);
		studentArray[7] = new Student("Caroline", 20, false, 'E', 7);
		studentArray[8] = new Student("Sofie", 19, false, 'E', 8);
		studentArray[9] = new Student("Jens", 20, false, 'E', 9);


		findStudent(3);
		findStudent(6);
		findStudent(8);

		findStudentString(studentArray, "Marcus");
		findStudentString(studentArray, "Caroline");
		findStudentString(studentArray, "Ida");
	}

	//Had problems with using array as the parameter here
	public static String findStudent(int tmpUniqueID) {
	int uniqueID = tmpUniqueID;
	System.out.println(studentArray[uniqueID].name);
	return studentArray[uniqueID].name;
}

	public static int findStudentString(Student[] tmpStudArray, String tmpStudName) {
	Student[] studArray = tmpStudArray;
	String studName = tmpStudName;
	for(int i = 0; i < studArray.length; i++){
		if(studArray[i].name == studName){
			System.out.println("Index number: " + i);
			return i;
		}
	}
	return 1;
}
}