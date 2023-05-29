package rcc.BandManager.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import rcc.BandManager.Model.Song;

import java.util.List;
import java.util.Optional;

@Repository
public interface SongRepository extends MongoRepository<Song, ObjectId> {

    Optional<Song> findSongByTitle(String title);

    Optional<List<Song>> findSongByArtist(String artist);

    Optional<List<Song>> findSongByAlbum(String album);

    Optional<List<Song>> findSongByGenres(String genres);

    Optional<Song> findSongById(ObjectId id);

    Optional<Song> findSongBySongId(String songId);
}
