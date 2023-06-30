package rcc.BandManager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rcc.BandManager.Model.Setlist;
import rcc.BandManager.Service.SetlistService;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/setlists")
public class SetlistController {

    @Autowired
    private SetlistService setlistService;
    @GetMapping
    public ResponseEntity<List<Setlist>> getAllSetlists() {
        return new ResponseEntity<List<Setlist>>(setlistService.findAllSetlists(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public Setlist addSetlist(Setlist setlist) {
        return setlistService.addSetlist(setlist);
    }

    @GetMapping("/name/{setlistName}")
    public ResponseEntity<Optional<Setlist>> getSetlistBySetlistName(@PathVariable String setlistName) {
        return new ResponseEntity<Optional<Setlist>>(setlistService.findSetlistBySetlistName(setlistName), HttpStatus.OK);
    }

    @GetMapping("/{setlistId}")
    public ResponseEntity<Optional<Setlist>> getSetlistBySetlistId(@PathVariable String setlistId) {
        return new ResponseEntity<Optional<Setlist>>(setlistService.findSetlistBySetlistId(setlistId), HttpStatus.OK);
    }

    @PutMapping("/update/{setlistId}")
    public ResponseEntity<Setlist> updateSetlist(@PathVariable String setlistId, @RequestBody Setlist setlist) {
        return new ResponseEntity<Setlist>(setlistService.updateSetlist(setlistId, setlist), HttpStatus.OK);
    }
}
