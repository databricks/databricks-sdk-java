// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>RecipientProfile class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RecipientProfile {
  /** The token used to authorize the recipient. */
  @JsonProperty("bearer_token")
  private String bearerToken;

  /** The endpoint for the share to be used by the recipient. */
  @JsonProperty("endpoint")
  private String endpoint;

  /** The version number of the recipient's credentials on a share. */
  @JsonProperty("share_credentials_version")
  private Long shareCredentialsVersion;

  /**
   * <p>Setter for the field <code>bearerToken</code>.</p>
   *
   * @param bearerToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientProfile} object
   */
  public RecipientProfile setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>bearerToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getBearerToken() {
    return bearerToken;
  }

  /**
   * <p>Setter for the field <code>endpoint</code>.</p>
   *
   * @param endpoint a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientProfile} object
   */
  public RecipientProfile setEndpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * <p>Getter for the field <code>endpoint</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getEndpoint() {
    return endpoint;
  }

  /**
   * <p>Setter for the field <code>shareCredentialsVersion</code>.</p>
   *
   * @param shareCredentialsVersion a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientProfile} object
   */
  public RecipientProfile setShareCredentialsVersion(Long shareCredentialsVersion) {
    this.shareCredentialsVersion = shareCredentialsVersion;
    return this;
  }

  /**
   * <p>Getter for the field <code>shareCredentialsVersion</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getShareCredentialsVersion() {
    return shareCredentialsVersion;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RecipientProfile that = (RecipientProfile) o;
    return Objects.equals(bearerToken, that.bearerToken)
        && Objects.equals(endpoint, that.endpoint)
        && Objects.equals(shareCredentialsVersion, that.shareCredentialsVersion);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(bearerToken, endpoint, shareCredentialsVersion);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RecipientProfile.class)
        .add("bearerToken", bearerToken)
        .add("endpoint", endpoint)
        .add("shareCredentialsVersion", shareCredentialsVersion)
        .toString();
  }
}
