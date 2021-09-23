package bg.softuni.mobilelele.modele.entity;


import bg.softuni.mobilelele.enumeration.Role;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    private String username;

    private String firstName;

    private String lastName;

    private boolean isActive;

    @ManyToOne
    private UserRoleEntity role;

    private String imageURL;

    private Instant created;

    private Instant modifier;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public UserRoleEntity getRole() {
        return role;
    }

    public void setRole(UserRoleEntity role) {
        this.role = role;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public Instant getCreated() {
        return created;
    }

    @Override
    public void setCreated(Instant created) {
        this.created = created;
    }

    public Instant getModifier() {
        return modifier;
    }

    public void setModifier(Instant modifier) {
        this.modifier = modifier;
    }
}
