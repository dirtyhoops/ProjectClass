class ProjectTest {
	public static void main(String[] args) {
		Project project1 = new Project();
		Project project2 = new Project("iPhone12", "12th generation iPhone");
		Project project3 = new Project("zBox");
		
		project1.elevatorPitch();
		project1.setName("hoopFinder");
		project1.elevatorPitch();
		project1.setDescription("facebook meets yelp");

		String project2Name = project2.getName();
		String project2Description = project2.getDescription();

		String p3name = project3.getName();
		System.out.println("project3 name: " + p3name);

		project2.elevatorPitch();
		project1.elevatorPitch();

	}
}