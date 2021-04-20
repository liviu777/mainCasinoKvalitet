package casino.entities;

import javax.persistence.*;

@Entity
public class Feed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //specificam strategia de generarea a primary key-ului prin auto-increment
    private Long feedId;
    @Column //specificam numele coloanei obisnuite (name="numele coloane")
    private String description;
    @ManyToOne
    @JoinColumn(name = "casino_id") // specificam numele coloanei de legatura prin proprietatea name din @JoinColumn
    private Casino casino;

    public Long getFeedId() {
        return feedId;
    }

    public void setFeedId(Long feedId) {
        this.feedId = feedId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public casino.entities.Casino getCasino() {
        return casino;
    }

    public void setCasino(casino.entities.Casino casino) {
        this.casino = casino;
    }



}
