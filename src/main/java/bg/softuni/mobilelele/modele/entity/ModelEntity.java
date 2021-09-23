package bg.softuni.mobilelele.modele.entity;


import bg.softuni.mobilelele.enumeration.Category;

import javax.persistence.*;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity {


    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String imageURL;

    private Integer startYear;

    private Integer endYear;

    @ManyToOne
    private BrantEntity brant;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public BrantEntity getBrant() {
        return brant;
    }

    public void setBrant(BrantEntity brant) {
        this.brant = brant;
    }
}
