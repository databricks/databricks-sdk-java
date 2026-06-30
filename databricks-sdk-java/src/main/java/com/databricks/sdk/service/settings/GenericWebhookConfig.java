// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenericWebhookConfig {
  /** [Input-Only][Optional] Password for webhook. */
  @JsonProperty("password")
  private String password;

  /** [Output-Only] Whether password is set. */
  @JsonProperty("password_set")
  private Boolean passwordSet;

  /** [Input-Only] URL for webhook. */
  @JsonProperty("url")
  private String url;

  /** [Output-Only] Whether URL is set. */
  @JsonProperty("url_set")
  private Boolean urlSet;

  /** [Input-Only][Optional] Username for webhook. */
  @JsonProperty("username")
  private String username;

  /** [Output-Only] Whether username is set. */
  @JsonProperty("username_set")
  private Boolean usernameSet;

  public GenericWebhookConfig setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public GenericWebhookConfig setPasswordSet(Boolean passwordSet) {
    this.passwordSet = passwordSet;
    return this;
  }

  public Boolean getPasswordSet() {
    return passwordSet;
  }

  public GenericWebhookConfig setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public GenericWebhookConfig setUrlSet(Boolean urlSet) {
    this.urlSet = urlSet;
    return this;
  }

  public Boolean getUrlSet() {
    return urlSet;
  }

  public GenericWebhookConfig setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getUsername() {
    return username;
  }

  public GenericWebhookConfig setUsernameSet(Boolean usernameSet) {
    this.usernameSet = usernameSet;
    return this;
  }

  public Boolean getUsernameSet() {
    return usernameSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenericWebhookConfig that = (GenericWebhookConfig) o;
    return Objects.equals(password, that.password)
        && Objects.equals(passwordSet, that.passwordSet)
        && Objects.equals(url, that.url)
        && Objects.equals(urlSet, that.urlSet)
        && Objects.equals(username, that.username)
        && Objects.equals(usernameSet, that.usernameSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, passwordSet, url, urlSet, username, usernameSet);
  }

  @Override
  public String toString() {
    return new ToStringer(GenericWebhookConfig.class)
        .add("password", password)
        .add("passwordSet", passwordSet)
        .add("url", url)
        .add("urlSet", urlSet)
        .add("username", username)
        .add("usernameSet", usernameSet)
        .toString();
  }
}
