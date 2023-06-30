package rcc.BandManager.Service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rcc.BandManager.Model.Setlist;
import rcc.BandManager.Repository.SetlistRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SetlistService {

    @Autowired
    private SetlistRepository setlistRepository;

    public List<Setlist> findAllSetlists() {
        return setlistRepository.findAll();
    }

    public Optional<Setlist> findSetlistBySetlistId(String setlistId) {
        return setlistRepository.findBySetlistId(setlistId);
    }

    public Optional<Setlist> findSetlistBySetlistName(String setlistName) {
        return setlistRepository.findBySetlistName(setlistName);
    }

    public Setlist addSetlist(Setlist setlist) {
        return setlistRepository.save(setlist);
    }

    public Setlist updateSetlist(String setlistId, Setlist setlist) {
        Optional<Setlist> setlistToUpdate = setlistRepository.findBySetlistId(setlistId);
        if (setlistToUpdate.isPresent()) {
            setlistToUpdate.get().setSetlistName(setlist.getSetlistName());
            setlistToUpdate.get().setSongs(setlist.getSongs());
            return setlistRepository.save(setlistToUpdate.get());
        } else {
            return null;
        }
    }
}
