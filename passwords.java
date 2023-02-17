public class passwords {
	public static boolean checkPassword(char[] password) {
		if (password.length < 8) return false;

		int digits = 0;
		int chars = 0;

		for (int i = 0; i < password.length; i++) {
			if (Character.isDigit(password[i])) {
				digits++;
			} else if (Character.isLetter(password[i])) {
				chars++;
			} else {
				return false;
			}
		}
		return (digits > 1 && chars > 0);
	}

	public static void main(String args[]){
		char[] p1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		char[] p2 = {'1', '2', '3', '4', 'a', 'b', 'c', 'd'};
		char[] p3 = {'1', '2', '3', '4', '5', '6', '7', '8'};
		char[] p4 = {'1', '2', '3', '4', 'f'};
		char[] p5 = {'1', 'F', '3', '4', 'a', 'b', 'c', 'd'};


		boolean r1 = passwords.checkPassword(p1);
		boolean r2 = passwords.checkPassword(p2);
		boolean r3 = passwords.checkPassword(p3);
		boolean r4 = passwords.checkPassword(p4);
		boolean r5 = passwords.checkPassword(p5);

		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		System.out.println("r3: " + r3);
		System.out.println("r4: " + r4);
		System.out.println("r5: " + r5);

		// System.out.println("a is: " + Character.isLetter('a'));
		// System.out.println("1 is: " + Character.isDigit('f'));
		// System.out.println("@ is: " + Character.isLetter('$'));
		// System.out.println("a is: " + Character.isLetter('a'));
		// System.out.println("1 is: " + Character.isDigit('f'));
		// System.out.println("@ is: " + Character.isLetter('$'));
	}
}