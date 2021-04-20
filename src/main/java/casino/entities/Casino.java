package casino.entities;



import javax.persistence.*;
import java.util.List;

@Entity
public class Casino {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long casinoId;
    @Column
    private String name;
    @Column
    private String rate;
    @Column
    private String photoLocation;
    @OneToMany(mappedBy = "casino")
    private List<Feed> feedList;

    public List<Feed> getFeedList() {
        return feedList;
    }

    public void setFeedList(List<Feed> feedList) {
        this.feedList = feedList;
    }

    public Long getCasinoId() {
        return casinoId;
    }

    public void setCasinoId(Long casinoId) {
        this.casinoId = casinoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getPhotoLocation() {
        return photoLocation;
    }

    public void setPhotoLocation(String photoLocation) {
        this.photoLocation = photoLocation;
    }
}
