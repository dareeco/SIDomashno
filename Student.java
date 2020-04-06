class Student {
        grades=[10,9,8,7,6,7,8,9,10]
        String index;
        String firstName;
        String lastName;

        public Student(String index, String firstName, String lastName){
        	this.index=index;
		this.firstName=firstName;
		this.lastName=lastName;
	}//TODO constructor
	public String getIndex(){
		return this.index;
	}
	public String get firstName(){
		return this.firstName;
	}	
	public String get lastName(){
		return this.lastName;
	}

        public void setIndex(String index){
		this.index=index;
	}
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	public void setLastName(String lastName){
		this.lastName=lastName;
	}//TODO seters & getters

        public double getAverage() {
 		float prosek;
		for(int i=0;i<grades.len;++i)
			prosek+=grades[i];
		prosek=prosek*1.0/grades.len;
		return prosek;               //TODO
        }

        public int ECTSCredits() {
                return grades.len *6;
        }
}

