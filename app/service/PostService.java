package service;

import controllers.*;

import models.*;

public class PostService implements IPostService {
	
	public void addComment(Long postId, String author, String content)
	{
		Post post = Post.findById(postId);
		post.addComment(author, content);
	}
}