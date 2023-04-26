// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>User class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>email</code>.</p>
   *
   * @param email a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.User} object
   */
  public User setEmail(String email) {
    this.email = email;
    return this;
  }

  /**
   * <p>Getter for the field <code>email</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getEmail() {
    return email;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.User} object
   */
  public User setId(Long id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>isDbAdmin</code>.</p>
   *
   * @param isDbAdmin a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.User} object
   */
  public User setIsDbAdmin(Boolean isDbAdmin) {
    this.isDbAdmin = isDbAdmin;
    return this;
  }

  /**
   * <p>Getter for the field <code>isDbAdmin</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsDbAdmin() {
    return isDbAdmin;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.User} object
   */
  public User setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>profileImageUrl</code>.</p>
   *
   * @param profileImageUrl a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.User} object
   */
  public User setProfileImageUrl(String profileImageUrl) {
    this.profileImageUrl = profileImageUrl;
    return this;
  }

  /**
   * <p>Getter for the field <code>profileImageUrl</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getProfileImageUrl() {
    return profileImageUrl;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(email, id, isDbAdmin, name, profileImageUrl);
  }

  /** {@inheritDoc} */
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
