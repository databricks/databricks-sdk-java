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
@JsonSerialize(
    using = UpsertPrivateAccessSettingsRequest.UpsertPrivateAccessSettingsRequestSerializer.class)
@JsonDeserialize(
    using = UpsertPrivateAccessSettingsRequest.UpsertPrivateAccessSettingsRequestDeserializer.class)
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
  private Collection<String> allowedVpcEndpointIds;

  /**
   * The private access level controls which VPC endpoints can connect to the UI or API of any
   * workspace that attaches this private access settings object. * `ACCOUNT` level access (the
   * default) allows only VPC endpoints that are registered in your Databricks account connect to
   * your workspace. * `ENDPOINT` level access allows only specified VPC endpoints connect to your
   * workspace. For details, see `allowed_vpc_endpoint_ids`.
   */
  private PrivateAccessLevel privateAccessLevel;

  /** Databricks Account API private access settings ID. */
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

  /** The cloud region for workspaces associated with this private access settings object. */
  private String region;

  public UpsertPrivateAccessSettingsRequest setAllowedVpcEndpointIds(
      Collection<String> allowedVpcEndpointIds) {
    this.allowedVpcEndpointIds = allowedVpcEndpointIds;
    return this;
  }

  public Collection<String> getAllowedVpcEndpointIds() {
    return allowedVpcEndpointIds;
  }

  public UpsertPrivateAccessSettingsRequest setPrivateAccessLevel(
      PrivateAccessLevel privateAccessLevel) {
    this.privateAccessLevel = privateAccessLevel;
    return this;
  }

  public PrivateAccessLevel getPrivateAccessLevel() {
    return privateAccessLevel;
  }

  public UpsertPrivateAccessSettingsRequest setPrivateAccessSettingsId(
      String privateAccessSettingsId) {
    this.privateAccessSettingsId = privateAccessSettingsId;
    return this;
  }

  public String getPrivateAccessSettingsId() {
    return privateAccessSettingsId;
  }

  public UpsertPrivateAccessSettingsRequest setPrivateAccessSettingsName(
      String privateAccessSettingsName) {
    this.privateAccessSettingsName = privateAccessSettingsName;
    return this;
  }

  public String getPrivateAccessSettingsName() {
    return privateAccessSettingsName;
  }

  public UpsertPrivateAccessSettingsRequest setPublicAccessEnabled(Boolean publicAccessEnabled) {
    this.publicAccessEnabled = publicAccessEnabled;
    return this;
  }

  public Boolean getPublicAccessEnabled() {
    return publicAccessEnabled;
  }

  public UpsertPrivateAccessSettingsRequest setRegion(String region) {
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
    UpsertPrivateAccessSettingsRequest that = (UpsertPrivateAccessSettingsRequest) o;
    return Objects.equals(allowedVpcEndpointIds, that.allowedVpcEndpointIds)
        && Objects.equals(privateAccessLevel, that.privateAccessLevel)
        && Objects.equals(privateAccessSettingsId, that.privateAccessSettingsId)
        && Objects.equals(privateAccessSettingsName, that.privateAccessSettingsName)
        && Objects.equals(publicAccessEnabled, that.publicAccessEnabled)
        && Objects.equals(region, that.region);
  }

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

  UpsertPrivateAccessSettingsRequestPb toPb() {
    UpsertPrivateAccessSettingsRequestPb pb = new UpsertPrivateAccessSettingsRequestPb();
    pb.setAllowedVpcEndpointIds(allowedVpcEndpointIds);
    pb.setPrivateAccessLevel(privateAccessLevel);
    pb.setPrivateAccessSettingsId(privateAccessSettingsId);
    pb.setPrivateAccessSettingsName(privateAccessSettingsName);
    pb.setPublicAccessEnabled(publicAccessEnabled);
    pb.setRegion(region);

    return pb;
  }

  static UpsertPrivateAccessSettingsRequest fromPb(UpsertPrivateAccessSettingsRequestPb pb) {
    UpsertPrivateAccessSettingsRequest model = new UpsertPrivateAccessSettingsRequest();
    model.setAllowedVpcEndpointIds(pb.getAllowedVpcEndpointIds());
    model.setPrivateAccessLevel(pb.getPrivateAccessLevel());
    model.setPrivateAccessSettingsId(pb.getPrivateAccessSettingsId());
    model.setPrivateAccessSettingsName(pb.getPrivateAccessSettingsName());
    model.setPublicAccessEnabled(pb.getPublicAccessEnabled());
    model.setRegion(pb.getRegion());

    return model;
  }

  public static class UpsertPrivateAccessSettingsRequestSerializer
      extends JsonSerializer<UpsertPrivateAccessSettingsRequest> {
    @Override
    public void serialize(
        UpsertPrivateAccessSettingsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpsertPrivateAccessSettingsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpsertPrivateAccessSettingsRequestDeserializer
      extends JsonDeserializer<UpsertPrivateAccessSettingsRequest> {
    @Override
    public UpsertPrivateAccessSettingsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpsertPrivateAccessSettingsRequestPb pb =
          mapper.readValue(p, UpsertPrivateAccessSettingsRequestPb.class);
      return UpsertPrivateAccessSettingsRequest.fromPb(pb);
    }
  }
}
