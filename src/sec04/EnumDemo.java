package sec04;

public class EnumDemo {
	public static void main(String[] args) {
		Gender gender = Gender.FEMALE;
		if (gender == Gender.MALE)
			System.out.println(Gender.MALE + "는 병역 의무가 있다.");
		else

			System.out.println(Gender.FEMALE + "는 병역 의무가 없다.");
	}

	enum Gender {
		MALE, FEMALE
	}

	enum Direction {
		EAST, WEST, SOUTH, NORTH
	}
}
