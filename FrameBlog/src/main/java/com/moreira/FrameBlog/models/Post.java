package com.moreira.FrameBlog.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "Post")

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postId;

    private String title;

    private String content;

    private Date date;

    @ManyToOne //Significa que as outras tabela, se relaciona com a tabela usuario.
    private User user;

    public Post() {
    }

    public Post(final Long postId, final String title, final String content,
                final Date date, final User user) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.date = date;
        this.user = user;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
