package Entity;

public class NoteEntity {
	private int note_id;
	private String note_content;
	private int member_id;
	private int word_id;

	public NoteEntity() {
		super();
	}

	public NoteEntity(int note_id, String note_content, int member_id, int word_id) {
		super();
		this.note_id = note_id;
		this.note_content = note_content;
		this.member_id = member_id;
		this.word_id = word_id;
	}

	public int getNote_id() {
		return note_id;
	}

	public void setNote_id(int note_id) {
		this.note_id = note_id;
	}

	public String getNote_content() {
		return note_content;
	}

	public void setNote_content(String note_content) {
		this.note_content = note_content;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public int getWord_id() {
		return word_id;
	}

	public void setWord_id(int word_id) {
		this.word_id = word_id;
	}
}
