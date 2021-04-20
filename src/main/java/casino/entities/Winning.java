package casino.entities;

import javax.persistence.*;

@Entity
public class Winning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long winningId;
    @Column
    private String photoLocation;
    @Column
    private String videoLocation;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Long getWinningId() {
        return winningId;
    }


    public void setWinningId(Long winningId) {
        this.winningId = winningId;
    }

    public String getPhotoLocation() {
        return photoLocation;
    }

    public void setPhotoLocation(String photoLocation) {
        this.photoLocation = photoLocation;
    }

    public String getVideoLocation() {
        return videoLocation;
    }

    public void setVideoLocation(String videoLocation) {
        this.videoLocation = videoLocation;
    }

    public casino.entities.User getUser() {
        return user;
    }

    public void setUser(casino.entities.User user) {
        this.user = user;
    }
}


