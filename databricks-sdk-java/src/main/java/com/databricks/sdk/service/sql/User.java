// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class User {
  /** */
  @JsonProperty("email")
  private String email;

  /** */
  @JsonProperty("id")
  private Long id;

  /** Whether this user is an admin in the Databricks workspace. */
  @JsonProperty("is_db_admin")
  private Boolean isDbAdmin;

  /** */
  @JsonProperty("name")
  private String name;

  /** The URL for the gravatar profile picture tied to this user's email address. */
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User that = (User) o;
    return Objects.equals(email, that.email)
        && Objects.equals(id, that.id)
        && Objects.equals(isDbAdmin, that.isDbAdmin)
        && Objects.equals(name, that.name)
        && Objects.equals(profileImageUrl, that.profileImageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, id, isDbAdmin, name, profileImageUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(User.class)
        .add("email", email)
        .add("id", id)
        .add("isDbAdmin", isDbAdmin)
        .add("name", name)
        .add("profileImageUrl", profileImageUrl)
        .toString();
  }
}
