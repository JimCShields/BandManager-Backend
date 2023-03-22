package rcc.BandManager.Controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rcc.BandManager.Model.Song;
import rcc.BandManager.Service.SongService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/songs")
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping
    public ResponseEntity<List<Song>> getSongs() {
        return new ResponseEntity<List<Song>>(songService.findAllSongs(), HttpStatus.OK);
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<Optional<Song>> getSongByTitle(@PathVariable String title) {
        return new ResponseEntity<Optional<Song>>(songService.findSongByTitle(title), HttpStatus.OK);
    }

    @GetMapping("/artist/{artist}")
    public ResponseEntity<Optional<List<Song>>> getSongByArtist(@PathVariable String artist) {
        return new ResponseEntity<Optional<List<Song>>>(songService.findSongByArtist(artist), HttpStatus.OK);
    }

    @GetMapping("/album/{album}")
    public ResponseEntity<Optional<List<Song>>> getSongByAlbum(@PathVariable String album) {
        return new ResponseEntity<Optional<List<Song>>>(songService.findSongByAlbum(album), HttpStatus.OK);
    }

    @GetMapping("/genres/{genres}")
    public ResponseEntity<Optional<List<Song>>> getSongByGenres(@PathVariable String genres) {
        return new ResponseEntity<Optional<List<Song>>>(songService.findSongByGenres(genres), HttpStatus.OK);
    }

}

//    @GetMapping("/{imdbId}")
//    public ResponseEntity<Optional<Song>> getSingleMovie(@PathVariable String imdbId){
//        return new ResponseEntity<Optional<Song>>(service.findMovieByImdbId(imdbId), HttpStatus.OK);
//    }

