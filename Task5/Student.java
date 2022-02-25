public class Student {
	String name;
	int age;
	boolean isFemale;
	char datamatikerTeam;
	int uniqueID;

	public Student(String tmpName, int tmpAge, boolean tmpIsFemale, char tmpDatamatikerTeam, int tmpUniqueID){
		this.name = tmpName;
		this.age = tmpAge;
		this.isFemale = tmpIsFemale;
		this.datamatikerTeam = tmpDatamatikerTeam;
		this.uniqueID = tmpUniqueID;
	}
}