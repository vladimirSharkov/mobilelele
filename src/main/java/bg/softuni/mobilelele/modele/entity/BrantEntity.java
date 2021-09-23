package bg.softuni.mobilelele.modele.entity;


import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "brands")
public class BrantEntity  extends BaseEntity{

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
