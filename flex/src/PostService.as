package
{
  import org.spicefactory.cinnamon.service.ServiceRequest;
  
  public interface PostService
  {
    function addComment(postId:int, author:String, content:String):ServiceRequest
  }
}
