class Faculty {
	List<Student> studenti=new ArrayList<Student>();
	String imeFakultet;

	//TODO constructor

	//methods

	public void addStudent(Student s) {
		studenti.add(s);
	}
	
	public void removeStudent(int index) {
		studenti.remove(index);
	}
	

	public List<Student> getGrades() {
		return studenti;
	}

	public void setGrades(List<Student> studenti) {
		this.studenti = studenti;
	}

	public String getFacultyName() {
		return this.imeFakultet;
	}

	public void setFacultyName(String facultyName) {
		this.imeFakultet = imeFakultet;
	}

	public Faculty(List<Student> studenti, String imeFakultet) {
		super();
		this.studenti = studenti;
		this.imeFakultet = imeFakultet;
	}

}
