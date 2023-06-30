package rcc.BandManager.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import rcc.BandManager.Model.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface SongRepository extends MongoRepository<Song, ObjectId> {

    Optional<Song> findSongByTitle(String title);

    Optional<ArrayList<Song>> findSongByArtist(String artist);

    Optional<ArrayList<Song>> findSongByAlbum(String album);

    Optional<ArrayList<Song>> findSongByGenres(String genres);

    Optional<Song> findSongById(ObjectId id);

    Optional<Song> findSongBySongId(String songId);
}
