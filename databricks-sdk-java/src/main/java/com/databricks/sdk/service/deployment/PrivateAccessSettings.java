// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class PrivateAccessSettings {
  /** The Databricks account ID that hosts the credential. */
  @JsonProperty("account_id")
  private String accountId;

  /**
   * An array of Databricks VPC endpoint IDs. This is the Databricks ID returned when registering
   * the VPC endpoint configuration in your Databricks account. This is _not_ the ID of the VPC
   * endpoint in AWS.
   *
   * <p>Only used when `private_access_level` is set to `ENDPOINT`. This is an allow list of VPC
   * endpoints registered in your Databricks account that can connect to your workspace over AWS
   * PrivateLink.
   *
   * <p>**Note**: If hybrid access to your workspace is enabled by setting `public_access_enabled`
   * to `true`, this control only works for PrivateLink connections. To control how your workspace
   * is accessed via public internet, see [IP access lists].
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

  /** The AWS region for workspaces attached to this private access settings object. */
  @JsonProperty("region")
  private String region;

  public PrivateAccessSettings setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public PrivateAccessSettings setAllowedVpcEndpointIds(Collection<String> allowedVpcEndpointIds) {
    this.allowedVpcEndpointIds = allowedVpcEndpointIds;
    return this;
  }

  public Collection<String> getAllowedVpcEndpointIds() {
    return allowedVpcEndpointIds;
  }

  public PrivateAccessSettings setPrivateAccessLevel(PrivateAccessLevel privateAccessLevel) {
    this.privateAccessLevel = privateAccessLevel;
    return this;
  }

  public PrivateAccessLevel getPrivateAccessLevel() {
    return privateAccessLevel;
  }

  public PrivateAccessSettings setPrivateAccessSettingsId(String privateAccessSettingsId) {
    this.privateAccessSettingsId = privateAccessSettingsId;
    return this;
  }

  public String getPrivateAccessSettingsId() {
    return privateAccessSettingsId;
  }

  public PrivateAccessSettings setPrivateAccessSettingsName(String privateAccessSettingsName) {
    this.privateAccessSettingsName = privateAccessSettingsName;
    return this;
  }

  public String getPrivateAccessSettingsName() {
    return privateAccessSettingsName;
  }

  public PrivateAccessSettings setPublicAccessEnabled(Boolean publicAccessEnabled) {
    this.publicAccessEnabled = publicAccessEnabled;
    return this;
  }

  public Boolean getPublicAccessEnabled() {
    return publicAccessEnabled;
  }

  public PrivateAccessSettings setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

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
