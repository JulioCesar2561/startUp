package br.com.startUp.dto;

public class ProfileDTO {
    private Integer id;
    private String youtubeChannel;
    private String facebook;
    private String linkedin;

    public ProfileDTO(){

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

    public ProfileDTO(String youtubeChannel, String facebook, String linkedin) {
        this.youtubeChannel = youtubeChannel;
        this.facebook = facebook;
        this.linkedin = linkedin;
    }

    
}
