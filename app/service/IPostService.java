package service;

import org.spicefactory.cinnamon.config.annotation.*;

@CinnamonService 
public interface IPostService {

	void addComment(Long postId, String author, String content);
}