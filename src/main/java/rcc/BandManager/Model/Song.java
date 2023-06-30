package rcc.BandManager.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.UUID;

@Document(collection = "songs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song {
    @Id
    private ObjectId id;
    private String songId = UUID.randomUUID().toString();
    private String title;
    private String artist;
    private String album;
    private ArrayList<String> genres;
    private int usageCount;
    private Date lastUsed;

}
