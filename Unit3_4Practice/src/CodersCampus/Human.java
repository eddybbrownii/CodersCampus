package CodersCampus;

public class Human {

	String gender;
	String weight;
	String height;
	String eyeColor;

	public String getDetails() {

	return "Gender: " + gender +   ", weight: " + weight +  ", Height: " + height+", Eye Color: " + eyeColor ;
	}

	public void setProperties(String gender, String weight,
			String height, String eyeColor) {
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.eyeColor = eyeColor;
	}
}