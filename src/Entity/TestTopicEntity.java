package Entity;

public class TestTopicEntity {
	private int test_id;
	private String test_name;
	private String test_img;

	public TestTopicEntity() {
		super();
	}

	public TestTopicEntity(int test_id, String test_name, String test_img) {
		super();
		this.test_id = test_id;
		this.test_name = test_name;
		this.test_img = test_img;
	}

	public int getTest_id() {
		return test_id;
	}

	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}

	public String getTest_name() {
		return test_name;
	}

	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}

	public String getTest_img() {
		return test_img;
	}

	public void setTest_img(String test_img) {
		this.test_img = test_img;
	}
}
