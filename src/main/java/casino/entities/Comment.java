package casino.entities;



import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commentId;
    @Column
    private String description;
    @Column
    private int noOfLikes;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNoOfLikes() {
        return noOfLikes;
    }

    public void setNoOfLikes(int noOfLikes) {
        this.noOfLikes = noOfLikes;
    }

    public casino.entities.User getUser() {
        return user;
    }

    public void setUser(casino.entities.User user) {
        this.user = user;
    }

    public casino.entities.Topic getTopic() {
        return topic;
    }

    public void setTopic(casino.entities.Topic topic) {
        this.topic = topic;
    }
}
