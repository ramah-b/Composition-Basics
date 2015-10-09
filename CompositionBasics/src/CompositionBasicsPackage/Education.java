package CompositionBasicsPackage;

import java.util.ArrayList;

public class Education {
	private ArrayList<String> schoolsAttended = new ArrayList<String>();
	private int counter;

	public Education() {
	}

	public void setSchoolsAttended(String schoolName) {
		this.schoolsAttended.add(counter, schoolName);
		counter++;
	}

	public String toString() {
		String schoolsListStr = "";
		for (int i = 0; i < this.schoolsAttended.size(); i++) {
			schoolsListStr += this.schoolsAttended.get(i);
		}
		return schoolsListStr;
	}
	public void setCounter(int counter){
		this.counter = counter;
	}
}
