package CodersCampus;

public class RunnableClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Human trevorPage = new Human();
		trevorPage.setProperties("Male", "180", "5'10\"", "Brown");
		System.out.println(trevorPage.getDetails());

		Human elonMusk = new Human();
		elonMusk.setProperties("Male", "220", "6'0\"", "Blue");
		System.out.println(elonMusk.getDetails());

		Human christinaPage = new Human();
		christinaPage.setProperties("Female", "135", "5'2\"", "Brown");
		System.out.println(christinaPage.getDetails());

		// TODO Auto-generated method stub

	}
}
