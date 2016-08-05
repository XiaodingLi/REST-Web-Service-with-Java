package com;

import org.junit.Test;

import com.pojo.Response;
import com.pojo.Posts;
import com.service.impl.JsonService;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	@Test
	public void testPostModify() {

		String url = "http://jsonplaceholder.typicode.com/posts";
 
		JsonService service = new JsonService();

		Response response = null;
		try {
			response = service.parseJson(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int postCount = 0;
		for (Posts post : response.getPosts()) {

			if (postCount == 3) {
				assertTrue(post.getBody().equalsIgnoreCase("REST") && post.getTitle().equalsIgnoreCase("REST"));
			}
			postCount = postCount + 1;
		}
	}

	@Test
	public void testUserCount() {

		String url = "http://jsonplaceholder.typicode.com/posts";

		JsonService service = new JsonService();

		Response response = null;
		try {
			response = service.parseJson(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertTrue(response.getUserCount() == 10);

	}
}
