// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = PrivateAccessSettings.PrivateAccessSettingsSerializer.class)
@JsonDeserialize(using = PrivateAccessSettings.PrivateAccessSettingsDeserializer.class)
public class PrivateAccessSettings {
  /** The Databricks account ID that hosts the credential. */
  private String accountId;

  /** An array of Databricks VPC endpoint IDs. */
  private Collection<String> allowedVpcEndpointIds;

  /**
   * The private access level controls which VPC endpoints can connect to the UI or API of any
   * workspace that attaches this private access settings object. * `ACCOUNT` level access (the
   * default) allows only VPC endpoints that are registered in your Databricks account connect to
   * your workspace. * `ENDPOINT` level access allows only specified VPC endpoints connect to your
   * workspace. For details, see `allowed_vpc_endpoint_ids`.
   */
  private PrivateAccessLevel privateAccessLevel;

  /** Databricks private access settings ID. */
  private String privateAccessSettingsId;

  /** The human-readable name of the private access settings object. */
  private String privateAccessSettingsName;

  /**
   * Determines if the workspace can be accessed over public internet. For fully private workspaces,
   * you can optionally specify `false`, but only if you implement both the front-end and the
   * back-end PrivateLink connections. Otherwise, specify `true`, which means that public access is
   * enabled.
   */
  private Boolean publicAccessEnabled;

  /** The cloud region for workspaces attached to this private access settings object. */
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

  PrivateAccessSettingsPb toPb() {
    PrivateAccessSettingsPb pb = new PrivateAccessSettingsPb();
    pb.setAccountId(accountId);
    pb.setAllowedVpcEndpointIds(allowedVpcEndpointIds);
    pb.setPrivateAccessLevel(privateAccessLevel);
    pb.setPrivateAccessSettingsId(privateAccessSettingsId);
    pb.setPrivateAccessSettingsName(privateAccessSettingsName);
    pb.setPublicAccessEnabled(publicAccessEnabled);
    pb.setRegion(region);

    return pb;
  }

  static PrivateAccessSettings fromPb(PrivateAccessSettingsPb pb) {
    PrivateAccessSettings model = new PrivateAccessSettings();
    model.setAccountId(pb.getAccountId());
    model.setAllowedVpcEndpointIds(pb.getAllowedVpcEndpointIds());
    model.setPrivateAccessLevel(pb.getPrivateAccessLevel());
    model.setPrivateAccessSettingsId(pb.getPrivateAccessSettingsId());
    model.setPrivateAccessSettingsName(pb.getPrivateAccessSettingsName());
    model.setPublicAccessEnabled(pb.getPublicAccessEnabled());
    model.setRegion(pb.getRegion());

    return model;
  }

  public static class PrivateAccessSettingsSerializer
      extends JsonSerializer<PrivateAccessSettings> {
    @Override
    public void serialize(
        PrivateAccessSettings value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PrivateAccessSettingsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PrivateAccessSettingsDeserializer
      extends JsonDeserializer<PrivateAccessSettings> {
    @Override
    public PrivateAccessSettings deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PrivateAccessSettingsPb pb = mapper.readValue(p, PrivateAccessSettingsPb.class);
      return PrivateAccessSettings.fromPb(pb);
    }
  }
}
