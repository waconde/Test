package Demo;

import java.util.List;

/**
 * @author zhangke
 * @version 1.0
 * @className Node
 * @description TODO
 * @date 2019/8/8 10:09 PM
 **/
public class Node {
	String create_time;
	String project_id;
	String project_name;
	String getProject_url;
	String build_numbber;
	String build_id;
	List<buildList> build_list;

	public List<buildList> getBuild_list() {
		return build_list;
	}

	public void setBuild_list(List<buildList> build_list) {
		this.build_list = build_list;
	}

	public Node(String create_time, String project_id, String project_name, String getProject_url) {
		this.create_time = create_time;
		this.project_id = project_id;
		this.project_name = project_name;
		this.getProject_url = getProject_url;
	}

	public Node(String create_time, String project_id, String project_name, String getProject_url, String build_numbber, String build_id) {
		this.create_time = create_time;
		this.project_id = project_id;
		this.project_name = project_name;
		this.getProject_url = getProject_url;
		this.build_numbber = build_numbber;
		this.build_id = build_id;
	}

	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getGetProject_url() {
		return getProject_url;
	}

	public void setGetProject_url(String getProject_url) {
		this.getProject_url = getProject_url;
	}

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

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	@Override
	public String toString() {
		return "Node{" +
				"create_time='" + create_time + '\'' +
				", project_id='" + project_id + '\'' +
				", project_name='" + project_name + '\'' +
				", getProject_url='" + getProject_url + '\'' +
				", build_numbber='" + build_numbber + '\'' +
				", build_id='" + build_id + '\'' +
				", build_list=" + build_list +
				'}';
	}
}