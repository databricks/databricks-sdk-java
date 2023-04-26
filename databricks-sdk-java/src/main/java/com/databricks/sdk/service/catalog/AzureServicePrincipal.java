// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>AzureServicePrincipal class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AzureServicePrincipal {
  /** The application ID of the application registration within the referenced AAD tenant. */
  @JsonProperty("application_id")
  private String applicationId;

  /** The client secret generated for the above app ID in AAD. */
  @JsonProperty("client_secret")
  private String clientSecret;

  /**
   * The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application.
   */
  @JsonProperty("directory_id")
  private String directoryId;

  /**
   * <p>Setter for the field <code>applicationId</code>.</p>
   *
   * @param applicationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.AzureServicePrincipal} object
   */
  public AzureServicePrincipal setApplicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * <p>Getter for the field <code>applicationId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getApplicationId() {
    return applicationId;
  }

  /**
   * <p>Setter for the field <code>clientSecret</code>.</p>
   *
   * @param clientSecret a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.AzureServicePrincipal} object
   */
  public AzureServicePrincipal setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * <p>Getter for the field <code>clientSecret</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getClientSecret() {
    return clientSecret;
  }

  /**
   * <p>Setter for the field <code>directoryId</code>.</p>
   *
   * @param directoryId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.AzureServicePrincipal} object
   */
  public AzureServicePrincipal setDirectoryId(String directoryId) {
    this.directoryId = directoryId;
    return this;
  }

  /**
   * <p>Getter for the field <code>directoryId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDirectoryId() {
    return directoryId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureServicePrincipal that = (AzureServicePrincipal) o;
    return Objects.equals(applicationId, that.applicationId)
        && Objects.equals(clientSecret, that.clientSecret)
        && Objects.equals(directoryId, that.directoryId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(applicationId, clientSecret, directoryId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(AzureServicePrincipal.class)
        .add("applicationId", applicationId)
        .add("clientSecret", clientSecret)
        .add("directoryId", directoryId)
        .toString();
  }
}
