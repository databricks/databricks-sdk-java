// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>PrivateAccessSettings class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PrivateAccessSettings {
  /** The Databricks account ID that hosts the credential. */
  @JsonProperty("account_id")
  private String accountId;

  /** An array of Databricks VPC endpoint IDs. */
  @JsonProperty("allowed_vpc_endpoint_ids")
  private Collection<String> allowedVpcEndpointIds;

  /**
   * The private access level controls which VPC endpoints can connect to the UI or API of any
   * workspace that attaches this private access settings object. * `ACCOUNT` level access (the
   * default) allows only VPC endpoints that are registered in your Databricks account connect to
   * your workspace. * `ENDPOINT` level access allows only specified VPC endpoints connect to your
   * workspace. For details, see `allowed_vpc_endpoint_ids`.
   */
  @JsonProperty("private_access_level")
  private PrivateAccessLevel privateAccessLevel;

  /** Databricks private access settings ID. */
  @JsonProperty("private_access_settings_id")
  private String privateAccessSettingsId;

  /** The human-readable name of the private access settings object. */
  @JsonProperty("private_access_settings_name")
  private String privateAccessSettingsName;

  /**
   * Determines if the workspace can be accessed over public internet. For fully private workspaces,
   * you can optionally specify `false`, but only if you implement both the front-end and the
   * back-end PrivateLink connections. Otherwise, specify `true`, which means that public access is
   * enabled.
   */
  @JsonProperty("public_access_enabled")
  private Boolean publicAccessEnabled;

  /** The cloud region for workspaces attached to this private access settings object. */
  @JsonProperty("region")
  private String region;

  /**
   * <p>Setter for the field <code>accountId</code>.</p>
   *
   * @param accountId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.PrivateAccessSettings} object
   */
  public PrivateAccessSettings setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>Getter for the field <code>accountId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * <p>Setter for the field <code>allowedVpcEndpointIds</code>.</p>
   *
   * @param allowedVpcEndpointIds a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.provisioning.PrivateAccessSettings} object
   */
  public PrivateAccessSettings setAllowedVpcEndpointIds(Collection<String> allowedVpcEndpointIds) {
    this.allowedVpcEndpointIds = allowedVpcEndpointIds;
    return this;
  }

  /**
   * <p>Getter for the field <code>allowedVpcEndpointIds</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getAllowedVpcEndpointIds() {
    return allowedVpcEndpointIds;
  }

  /**
   * <p>Setter for the field <code>privateAccessLevel</code>.</p>
   *
   * @param privateAccessLevel a {@link com.databricks.sdk.service.provisioning.PrivateAccessLevel} object
   * @return a {@link com.databricks.sdk.service.provisioning.PrivateAccessSettings} object
   */
  public PrivateAccessSettings setPrivateAccessLevel(PrivateAccessLevel privateAccessLevel) {
    this.privateAccessLevel = privateAccessLevel;
    return this;
  }

  /**
   * <p>Getter for the field <code>privateAccessLevel</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.PrivateAccessLevel} object
   */
  public PrivateAccessLevel getPrivateAccessLevel() {
    return privateAccessLevel;
  }

  /**
   * <p>Setter for the field <code>privateAccessSettingsId</code>.</p>
   *
   * @param privateAccessSettingsId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.PrivateAccessSettings} object
   */
  public PrivateAccessSettings setPrivateAccessSettingsId(String privateAccessSettingsId) {
    this.privateAccessSettingsId = privateAccessSettingsId;
    return this;
  }

  /**
   * <p>Getter for the field <code>privateAccessSettingsId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPrivateAccessSettingsId() {
    return privateAccessSettingsId;
  }

  /**
   * <p>Setter for the field <code>privateAccessSettingsName</code>.</p>
   *
   * @param privateAccessSettingsName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.PrivateAccessSettings} object
   */
  public PrivateAccessSettings setPrivateAccessSettingsName(String privateAccessSettingsName) {
    this.privateAccessSettingsName = privateAccessSettingsName;
    return this;
  }

  /**
   * <p>Getter for the field <code>privateAccessSettingsName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPrivateAccessSettingsName() {
    return privateAccessSettingsName;
  }

  /**
   * <p>Setter for the field <code>publicAccessEnabled</code>.</p>
   *
   * @param publicAccessEnabled a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.provisioning.PrivateAccessSettings} object
   */
  public PrivateAccessSettings setPublicAccessEnabled(Boolean publicAccessEnabled) {
    this.publicAccessEnabled = publicAccessEnabled;
    return this;
  }

  /**
   * <p>Getter for the field <code>publicAccessEnabled</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getPublicAccessEnabled() {
    return publicAccessEnabled;
  }

  /**
   * <p>Setter for the field <code>region</code>.</p>
   *
   * @param region a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.PrivateAccessSettings} object
   */
  public PrivateAccessSettings setRegion(String region) {
    this.region = region;
    return this;
  }

  /**
   * <p>Getter for the field <code>region</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRegion() {
    return region;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateAccessSettings that = (PrivateAccessSettings) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(allowedVpcEndpointIds, that.allowedVpcEndpointIds)
        && Objects.equals(privateAccessLevel, that.privateAccessLevel)
        && Objects.equals(privateAccessSettingsId, that.privateAccessSettingsId)
        && Objects.equals(privateAccessSettingsName, that.privateAccessSettingsName)
        && Objects.equals(publicAccessEnabled, that.publicAccessEnabled)
        && Objects.equals(region, that.region);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        allowedVpcEndpointIds,
        privateAccessLevel,
        privateAccessSettingsId,
        privateAccessSettingsName,
        publicAccessEnabled,
        region);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PrivateAccessSettings.class)
        .add("accountId", accountId)
        .add("allowedVpcEndpointIds", allowedVpcEndpointIds)
        .add("privateAccessLevel", privateAccessLevel)
        .add("privateAccessSettingsId", privateAccessSettingsId)
        .add("privateAccessSettingsName", privateAccessSettingsName)
        .add("publicAccessEnabled", publicAccessEnabled)
        .add("region", region)
        .toString();
  }
}
