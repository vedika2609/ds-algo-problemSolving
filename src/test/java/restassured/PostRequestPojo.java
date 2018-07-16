package restassured;

import java.util.LinkedHashMap;

public class PostRequestPojo {

	private int id;
	private String author;
	private String title;

	public PostRequestPojo(LinkedHashMap<String, String> data){
		this.id = Integer.parseInt(data.get("id"));
		this.author = data.get("author");
		this.title = data.get("title");
	}

}
