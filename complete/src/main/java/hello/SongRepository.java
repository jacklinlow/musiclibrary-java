
package hello;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "song", path = "song")
public interface SongRepository extends MongoRepository<Song, String> {

	List<Song> findByArtist(@Param("artist") String artist);

}
