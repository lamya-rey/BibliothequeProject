

@RepositoryRestResource(collectionResourceRel = "user"
        , path = "users")
public interface UserRepository extends CrudRepository<Utilisateur, Integer> {
}