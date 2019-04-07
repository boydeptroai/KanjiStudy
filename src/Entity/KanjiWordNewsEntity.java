package Entity;

public class KanjiWordNewsEntity {
	private int word_id;
	private String word_name;
	private String word_img;
	private String word_info;
	private String word_animation;
	private int topic_id;

	public KanjiWordNewsEntity() {
		super();
	}

	public KanjiWordNewsEntity(int word_id, String word_name, String word_img, String word_info, String word_animation,
			int topic_id) {
		super();
		this.word_id = word_id;
		this.word_name = word_name;
		this.word_img = word_img;
		this.word_info = word_info;
		this.word_animation = word_animation;
		this.topic_id = topic_id;
	}

	public int getWord_id() {
		return word_id;
	}

	public void setWord_id(int word_id) {
		this.word_id = word_id;
	}

	public String getWord_name() {
		return word_name;
	}

	public void setWord_name(String word_name) {
		this.word_name = word_name;
	}

	public String getWord_img() {
		return word_img;
	}

	public void setWord_img(String word_img) {
		this.word_img = word_img;
	}

	public String getWord_info() {
		return word_info;
	}

	public void setWord_info(String word_info) {
		this.word_info = word_info;
	}

	public String getWord_animation() {
		return word_animation;
	}

	public void setWord_animation(String word_animation) {
		this.word_animation = word_animation;
	}

	public int getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}
}
