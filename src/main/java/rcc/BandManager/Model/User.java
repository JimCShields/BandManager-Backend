package rcc.BandManager.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "songs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private ObjectId id;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String primaryInstrument;
    private List<String> SecondaryInstruments;

}
