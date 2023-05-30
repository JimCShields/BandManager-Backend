package rcc.BandManager.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import rcc.BandManager.Model.Setlist;

import java.util.Optional;

@Repository
public interface SetlistRepository extends MongoRepository<Setlist, ObjectId> {

    Optional<Setlist> findById(ObjectId objectId);

    Optional<Setlist> findBySetlistId(String setlistId);

    Optional<Setlist> findBySetlistName(String setlistName);
}
