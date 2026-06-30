// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateTokenRequest {
  /**
   * Whether to enable autoscoping for this token. When true, the token will automatically collect
   * inferred API path scopes as it is used.
   */
  @JsonProperty("autoscope_enabled")
  private Boolean autoscopeEnabled;

  /** Optional description to attach to the token. */
  @JsonProperty("comment")
  private String comment;

  /**
   * The lifetime of the token, in seconds.
   *
   * <p>If the lifetime is not specified, this token remains valid for 2 years.
   */
  @JsonProperty("lifetime_seconds")
  private Long lifetimeSeconds;

  /** Optional scopes of the token. */
  @JsonProperty("scopes")
  private Collection<String> scopes;

  public CreateTokenRequest setAutoscopeEnabled(Boolean autoscopeEnabled) {
    this.autoscopeEnabled = autoscopeEnabled;
    return this;
  }

  public Boolean getAutoscopeEnabled() {
    return autoscopeEnabled;
  }

  public CreateTokenRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateTokenRequest setLifetimeSeconds(Long lifetimeSeconds) {
    this.lifetimeSeconds = lifetimeSeconds;
    return this;
  }

  public Long getLifetimeSeconds() {
    return lifetimeSeconds;
  }

  public CreateTokenRequest setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTokenRequest that = (CreateTokenRequest) o;
    return Objects.equals(autoscopeEnabled, that.autoscopeEnabled)
        && Objects.equals(comment, that.comment)
        && Objects.equals(lifetimeSeconds, that.lifetimeSeconds)
        && Objects.equals(scopes, that.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoscopeEnabled, comment, lifetimeSeconds, scopes);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTokenRequest.class)
        .add("autoscopeEnabled", autoscopeEnabled)
        .add("comment", comment)
        .add("lifetimeSeconds", lifetimeSeconds)
        .add("scopes", scopes)
        .toString();
  }
}
