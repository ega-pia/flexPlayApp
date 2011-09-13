package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Comment extends Model {
	
	public String author;
	public Date postedAt;
	
	@Lob
	public String content;

	@ManyToOne
	public Post post;

	public Comment(Post post, String author, String content) {
		this.post = post;
		this.author = author;
		this.content = content;
		this.postedAt = new Date();
	}

}

