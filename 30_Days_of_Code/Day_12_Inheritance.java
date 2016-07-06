class Student extends Person{
	private int[] testScores;
	Student(String firstName, String lastName, int identification, int[] testScores){
		super(firstName, lastName, identification);
        this.testScores = testScores;
	}
    public char calculate() {
        char res = 'T';
        if (testScores.length>0) {
            int a = 0;
            for (int s: testScores) a += s;
            a = a/testScores.length;
            if ((a>=90) &&(a<=100)) {
                res = 'O';
            } else if ((a>=80) &&(a<90)) {
                res = 'E';
            } else if ((a>=70) &&(a<80)) {
                res = 'A';
            } else if ((a>=55) &&(a<70)) {
                res = 'P';
            } else if ((a>=40) &&(a<55)) {
                res = 'D';
            }
        }
        return res;
    }
}
