package br.com.startUp.model;

import javax.persistence.*;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "email")
    private String email;
    @Column(name = "youtube_channel")
    private String youtubeChannel;
    @Column(name = "facebook")
    private String facebook;
    @Column(name = "linkedin")
    private String linkedin;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessa_id")
    private Pessoa pessoa;

    public Profile(){

    }

    public Profile(String telefone, String email, String youtubeChannel, String facebook, String linkedin) {
        this.telefone = telefone;
        this.email = email;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
