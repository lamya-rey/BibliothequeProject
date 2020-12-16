
@RepositoryRestResource(collectionResourceRel = "book"
        , path = "books")
public interface BookRepository extends CrudRepository<Book, Integer> {
}
