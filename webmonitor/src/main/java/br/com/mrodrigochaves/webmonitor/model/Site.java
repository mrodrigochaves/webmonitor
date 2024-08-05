package br.com.mrodrigochaves.webmonitor.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;


@Data
@Entity
public class Site {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @JsonProperty("_id")
    private Long id;

    @NotEmpty(message = "URL cannot be empty")
    private String url;

    private String description;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}