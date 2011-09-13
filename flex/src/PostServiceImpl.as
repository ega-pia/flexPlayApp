package
{
  import org.spicefactory.cinnamon.ns.cinnamon;
  import org.spicefactory.cinnamon.service.ServiceRequest;
  import org.spicefactory.cinnamon.service.support.AbstractServiceBase;
  
  use namespace cinnamon;
  
  public class PostServiceImpl extends AbstractServiceBase implements PostService
  {
    cinnamon override function initialize():void
    {
      addOperation("addComment");
    }
    
    public function addComment(postId:int, author:String, content:String):ServiceRequest
    {
      return cinnamon::getOperation("addComment").execute([postId, author, content]);
    
    }
  }
}
