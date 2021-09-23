package bg.softuni.mobilelele.modele.entity;


import bg.softuni.mobilelele.enumeration.Engine;
import bg.softuni.mobilelele.enumeration.Transmission;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "offers")
public class OfferEntity extends BaseEntity{

    private String description;

    @Enumerated(EnumType.STRING)
    private Engine engine;

    private String imageURL;

    private Integer mileage;

    private BigDecimal price;

    @Enumerated
    private Transmission transmission;

    private Instant year;

    @ManyToOne
    private ModelEntity model;

    @ManyToOne
    private UserEntity seller;

  /*seller – a user that sells the car.*/

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Instant getYear() {
        return year;
    }

    public void setYear(Instant year) {
        this.year = year;
    }

    public ModelEntity getModel() {
        return model;
    }

    public void setModel(ModelEntity model) {
        this.model = model;
    }

    public UserEntity getSeller() {
        return seller;
    }

    public void setSeller(UserEntity seller) {
        this.seller = seller;
    }
}
