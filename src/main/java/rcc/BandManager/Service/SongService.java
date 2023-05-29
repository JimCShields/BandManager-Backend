package rcc.BandManager.Service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rcc.BandManager.Model.Song;
import rcc.BandManager.Repository.SongRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public List<Song> findAllSongs() {
        return songRepository.findAll();
    }

    public Optional<Song> findSongByTitle(String title) {
        return songRepository.findSongByTitle(title);
    }

    public Optional<List<Song>> findSongByArtist(String artist) {
        return songRepository.findSongByArtist(artist);
    }

    public Optional<List<Song>> findSongByAlbum(String album) {
        return songRepository.findSongByAlbum(album);
    }

    public Optional<List<Song>> findSongByGenres(String genres) {
        return songRepository.findSongByGenres(genres);
    }

    public Song addSong(Song song) {
        return songRepository.save(song);
    }

    public Optional<Song> findSongById(ObjectId id) {
        return songRepository.findSongById(id);
    }

    public Optional<Song> findSongBySongId(String songId) {
        return songRepository.findSongBySongId(songId);
    }
}
