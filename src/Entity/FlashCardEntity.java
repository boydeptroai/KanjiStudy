package Entity;

public class FlashCardEntity {
	private int flcard_id;
	private String flcard_name;
	private String flcard_img;
	private int flctopic_id;
	private String flcard_question1;
	private String flcard_question2;

	public FlashCardEntity() {
		super();
	}

	public FlashCardEntity(int flcard_id, String flcard_name, String flcard_img, int flctopic_id,
			String flcard_question1, String flcard_question2) {
		super();
		this.flcard_id = flcard_id;
		this.flcard_name = flcard_name;
		this.flcard_img = flcard_img;
		this.flctopic_id = flctopic_id;
		this.flcard_question1 = flcard_question1;
		this.flcard_question2 = flcard_question2;
	}

	public int getFlcard_id() {
		return flcard_id;
	}

	public void setFlcard_id(int flcard_id) {
		this.flcard_id = flcard_id;
	}

	public String getFlcard_name() {
		return flcard_name;
	}

	public void setFlcard_name(String flcard_name) {
		this.flcard_name = flcard_name;
	}

	public String getFlcard_img() {
		return flcard_img;
	}

	public void setFlcard_img(String flcard_img) {
		this.flcard_img = flcard_img;
	}

	public int getFlctopic_id() {
		return flctopic_id;
	}

	public void setFlctopic_id(int flctopic_id) {
		this.flctopic_id = flctopic_id;
	}

	public String getFlcard_question1() {
		return flcard_question1;
	}

	public void setFlcard_question1(String flcard_question1) {
		this.flcard_question1 = flcard_question1;
	}

	public String getFlcard_question2() {
		return flcard_question2;
	}

	public void setFlcard_question2(String flcard_question2) {
		this.flcard_question2 = flcard_question2;
	}

}
