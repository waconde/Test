package Demo;

/**
 * @author zhangke
 * @version 1.0
 * @className buildList
 * @description TODO
 * @date 2019/8/8 10:15 PM
 **/
public class buildList {
	String build_numbber;
	String build_id;

	public String getBuild_numbber() {
		return build_numbber;
	}

	public void setBuild_numbber(String build_numbber) {
		this.build_numbber = build_numbber;
	}

	public String getBuild_id() {
		return build_id;
	}

	public void setBuild_id(String build_id) {
		this.build_id = build_id;
	}

	public buildList(String build_numbber, String build_id) {
		this.build_numbber = build_numbber;

		this.build_id = build_id;
	}
}