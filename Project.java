public class Project {
	private String name;
	private String description;

	//Constructors
	public Project() {}

	public Project(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Project(String name) {
		this.name = name;
	}


	//Getters
	public String getName(){
		return name;
	}

	public String getDescription() {
		return description;
	}


	//Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	//Methods
	public void elevatorPitch(){
		System.out.println(this.name + ": " +  this.description);
	}





}