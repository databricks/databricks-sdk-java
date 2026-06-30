// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreatePrivateAccessSettingsRequest {
  /**
   * An array of Databricks VPC endpoint IDs. This is the Databricks ID returned when registering
   * the VPC endpoint configuration in your Databricks account. This is not the ID of the VPC
   * endpoint in AWS. Only used when private_access_level is set to ENDPOINT. This is an allow list
   * of VPC endpoints registered in your Databricks account that can connect to your workspace over
   * AWS PrivateLink. Note: If hybrid access to your workspace is enabled by setting
   * public_access_enabled to true, this control only works for PrivateLink connections. To control
   * how your workspace is accessed via public internet, see IP access lists.
   */
  @JsonProperty("allowed_vpc_endpoint_ids")
  private Collection<String> allowedVpcEndpointIds;

  /**
   * The private access level controls which VPC endpoints can connect to the UI or API of any
   * workspace that attaches this private access settings object. `ACCOUNT` level access (the
   * default) allows only VPC endpoints that are registered in your Databricks account connect to
   * your workspace. `ENDPOINT` level access allows only specified VPC endpoints connect to your
   * workspace. For details, see allowed_vpc_endpoint_ids.
   */
  @JsonProperty("private_access_level")
  private PrivateAccessLevel privateAccessLevel;

  /** The human-readable name of the private access settings object. */
  @JsonProperty("private_access_settings_name")
  private String privateAccessSettingsName;

  /**
   * Determines if the workspace can be accessed over public internet. For fully private workspaces,
   * you can optionally specify false, but only if you implement both the front-end and the back-end
   * PrivateLink connections. Otherwise, specify true, which means that public access is enabled.
   */
  @JsonProperty("public_access_enabled")
  private Boolean publicAccessEnabled;

  /** The AWS region for workspaces attached to this private access settings object. */
  @JsonProperty("region")
  private String region;

  public CreatePrivateAccessSettingsRequest setAllowedVpcEndpointIds(
      Collection<String> allowedVpcEndpointIds) {
    this.allowedVpcEndpointIds = allowedVpcEndpointIds;
    return this;
  }

  public Collection<String> getAllowedVpcEndpointIds() {
    return allowedVpcEndpointIds;
  }

  public CreatePrivateAccessSettingsRequest setPrivateAccessLevel(
      PrivateAccessLevel privateAccessLevel) {
    this.privateAccessLevel = privateAccessLevel;
    return this;
  }

  public PrivateAccessLevel getPrivateAccessLevel() {
    return privateAccessLevel;
  }

  public CreatePrivateAccessSettingsRequest setPrivateAccessSettingsName(
      String privateAccessSettingsName) {
    this.privateAccessSettingsName = privateAccessSettingsName;
    return this;
  }

  public String getPrivateAccessSettingsName() {
    return privateAccessSettingsName;
  }

  public CreatePrivateAccessSettingsRequest setPublicAccessEnabled(Boolean publicAccessEnabled) {
    this.publicAccessEnabled = publicAccessEnabled;
    return this;
  }

  public Boolean getPublicAccessEnabled() {
    return publicAccessEnabled;
  }

  public CreatePrivateAccessSettingsRequest setRegion(String region) {
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
    CreatePrivateAccessSettingsRequest that = (CreatePrivateAccessSettingsRequest) o;
    return Objects.equals(allowedVpcEndpointIds, that.allowedVpcEndpointIds)
        && Objects.equals(privateAccessLevel, that.privateAccessLevel)
        && Objects.equals(privateAccessSettingsName, that.privateAccessSettingsName)
        && Objects.equals(publicAccessEnabled, that.publicAccessEnabled)
        && Objects.equals(region, that.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowedVpcEndpointIds,
        privateAccessLevel,
        privateAccessSettingsName,
        publicAccessEnabled,
        region);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePrivateAccessSettingsRequest.class)
        .add("allowedVpcEndpointIds", allowedVpcEndpointIds)
        .add("privateAccessLevel", privateAccessLevel)
        .add("privateAccessSettingsName", privateAccessSettingsName)
        .add("publicAccessEnabled", publicAccessEnabled)
        .add("region", region)
        .toString();
  }
}
