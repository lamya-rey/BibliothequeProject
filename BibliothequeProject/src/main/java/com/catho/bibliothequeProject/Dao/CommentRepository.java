

@RepositoryRestResource(collectionResourceRel = "comment"
        , path = "comments")
public interface CommentRepository extends CrudRepository<Comment, Integer> {
}

