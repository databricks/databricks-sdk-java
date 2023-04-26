// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>UpsertPrivateAccessSettingsRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpsertPrivateAccessSettingsRequest {
  /**
   * An array of Databricks VPC endpoint IDs. This is the Databricks ID that is returned when
   * registering the VPC endpoint configuration in your Databricks account. This is not the ID of
   * the VPC endpoint in AWS.
   *
   * <p>Only used when `private_access_level` is set to `ENDPOINT`. This is an allow list of VPC
   * endpoints that in your account that can connect to your workspace over AWS PrivateLink.
   *
   * <p>If hybrid access to your workspace is enabled by setting `public_access_enabled` to `true`,
   * this control only works for PrivateLink connections. To control how your workspace is accessed
   * via public internet, see [IP access lists].
   *
   * <p>[IP access lists]: https://docs.databricks.com/security/network/ip-access-list.html
   */
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

  /** Databricks Account API private access settings ID. */
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

  /** The cloud region for workspaces associated with this private access settings object. */
  @JsonProperty("region")
  private String region;

  /**
   * <p>Setter for the field <code>allowedVpcEndpointIds</code>.</p>
   *
   * @param allowedVpcEndpointIds a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.provisioning.UpsertPrivateAccessSettingsRequest} object
   */
  public UpsertPrivateAccessSettingsRequest setAllowedVpcEndpointIds(
      Collection<String> allowedVpcEndpointIds) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.UpsertPrivateAccessSettingsRequest} object
   */
  public UpsertPrivateAccessSettingsRequest setPrivateAccessLevel(
      PrivateAccessLevel privateAccessLevel) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.UpsertPrivateAccessSettingsRequest} object
   */
  public UpsertPrivateAccessSettingsRequest setPrivateAccessSettingsId(
      String privateAccessSettingsId) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.UpsertPrivateAccessSettingsRequest} object
   */
  public UpsertPrivateAccessSettingsRequest setPrivateAccessSettingsName(
      String privateAccessSettingsName) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.UpsertPrivateAccessSettingsRequest} object
   */
  public UpsertPrivateAccessSettingsRequest setPublicAccessEnabled(Boolean publicAccessEnabled) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.UpsertPrivateAccessSettingsRequest} object
   */
  public UpsertPrivateAccessSettingsRequest setRegion(String region) {
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
    UpsertPrivateAccessSettingsRequest that = (UpsertPrivateAccessSettingsRequest) o;
    return Objects.equals(allowedVpcEndpointIds, that.allowedVpcEndpointIds)
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
    return new ToStringer(UpsertPrivateAccessSettingsRequest.class)
        .add("allowedVpcEndpointIds", allowedVpcEndpointIds)
        .add("privateAccessLevel", privateAccessLevel)
        .add("privateAccessSettingsId", privateAccessSettingsId)
        .add("privateAccessSettingsName", privateAccessSettingsName)
        .add("publicAccessEnabled", publicAccessEnabled)
        .add("region", region)
        .toString();
  }
}
