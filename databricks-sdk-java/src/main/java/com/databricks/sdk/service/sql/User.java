// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class User {
    /**
     
     */
    @JsonProperty("email")
    private String email;
    
    /**
     
     */
    @JsonProperty("id")
    private Long id;
    
    /**
     * Whether this user is an admin in the Databricks workspace.
     */
    @JsonProperty("is_db_admin")
    private Boolean isDbAdmin;
    
    /**
     
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * The URL for the gravatar profile picture tied to this user's email
     * address.
     */
    @JsonProperty("profile_image_url")
    private String profileImageUrl;
    
    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }
    
    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getId() {
        return id;
    }
    
    public User setIsDbAdmin(Boolean isDbAdmin) {
        this.isDbAdmin = isDbAdmin;
        return this;
    }

    public Boolean getIsDbAdmin() {
        return isDbAdmin;
    }
    
    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public User setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
        return this;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }
    
}
