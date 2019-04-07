package Entity;

public class ResultEntity {
	private int result_id;
	private String result;
	private String time;
	private int test_id;
	private int member_id;

	public ResultEntity() {
		super();
	}

	public ResultEntity(int result_id, String result, String time, int test_id, int member_id) {
		super();
		this.result_id = result_id;
		this.result = result;
		this.time = time;
		this.test_id = test_id;
		this.member_id = member_id;
	}

	public int getResult_id() {
		return result_id;
	}

	public void setResult_id(int result_id) {
		this.result_id = result_id;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getTest_id() {
		return test_id;
	}

	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
}
