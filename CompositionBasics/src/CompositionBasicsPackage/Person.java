package CompositionBasicsPackage;

public class Person {
	// composition has-a relationship
	private Job job;
	private Education education;

	public Person() {
		this.job = new Job();
		job.setSalary(1000L);
		job.setRole("no role assigned");
		job.setId("NA");
		this.education = new Education();
		education.setCounter(0);
		education.setSchoolsAttended("none yet");
	}

	public long getSalary() {
		return job.getSalary();
	}

	public void setSchoolsAttended(String schoolName) {
		education.setSchoolsAttended(schoolName);
	}

	public String toString() {
		String personDetails;
		personDetails = job.toString();
		personDetails += "\n" + education.toString();
		return personDetails;
	}
}