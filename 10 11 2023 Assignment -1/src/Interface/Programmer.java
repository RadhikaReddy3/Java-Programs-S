package Interface;

public class Programmer implements Recruitment{

	@Override
	public boolean screening(int score) {
		System.out.println("Attend screening test");
		int marks = 20;
		if(score >= marks) {
			System.out.println("Selected for interview----");
			return true;
			}
		else {
		return false;
		} 
	}

	@Override
	public boolean interview(boolean selected) {
		System.out.println("Attend interview");
		if(selected) {
			System.out.println("Congrats you have selected----");
			return true;
		}
		else {
		return false;
		}
	}

}
