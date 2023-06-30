package rcc.BandManager.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Document(collection = "setlists")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Setlist {

    @Id
    private ObjectId id;
    private String setlistId = UUID.randomUUID().toString();
    private String setlistName;
    private ArrayList<String> songs;
}
