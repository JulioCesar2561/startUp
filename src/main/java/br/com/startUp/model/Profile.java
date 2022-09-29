package br.com.startUp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "youtube_channel")
    private String youtubeChannel;
    @Column(name = "facebook")
    private String facebook;
    @Column(name = "linkedin")
    private String linkedin;
    public Profile() {

    }
    public Profile(String youtubeChannel, String facebook, String linkedin) {
        this.youtubeChannel = youtubeChannel;
        this.facebook = facebook;
        this.linkedin = linkedin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYoutubeChannel() {
        return youtubeChannel;
    }

    public void setYoutubeChannel(String youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return Objects.equals(id, profile.id) && Objects.equals(youtubeChannel, profile.youtubeChannel) && Objects.equals(facebook, profile.facebook) && Objects.equals(linkedin, profile.linkedin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, youtubeChannel, facebook, linkedin);
    }
}