// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/**
 * Properties of the new private endpoint rule. Note that you must approve the endpoint in Azure
 * portal after initialization.
 */
@Generated
@JsonSerialize(using = UpdatePrivateEndpointRule.UpdatePrivateEndpointRuleSerializer.class)
@JsonDeserialize(using = UpdatePrivateEndpointRule.UpdatePrivateEndpointRuleDeserializer.class)
public class UpdatePrivateEndpointRule {
  /**
   * Only used by private endpoints to customer-managed private endpoint services.
   *
   * <p>Domain names of target private link service. When updating this field, the full list of
   * target domain_names must be specified.
   */
  private Collection<String> domainNames;

  /**
   * Only used by private endpoints towards an AWS S3 service.
   *
   * <p>Update this field to activate/deactivate this private endpoint to allow egress access from
   * serverless compute resources.
   */
  private Boolean enabled;

  /**
   * Only used by private endpoints towards AWS S3 service.
   *
   * <p>The globally unique S3 bucket names that will be accessed via the VPC endpoint. The bucket
   * names must be in the same region as the NCC/endpoint service. When updating this field, we
   * perform full update on this field. Please ensure a full list of desired resource_names is
   * provided.
   */
  private Collection<String> resourceNames;

  public UpdatePrivateEndpointRule setDomainNames(Collection<String> domainNames) {
    this.domainNames = domainNames;
    return this;
  }

  public Collection<String> getDomainNames() {
    return domainNames;
  }

  public UpdatePrivateEndpointRule setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public UpdatePrivateEndpointRule setResourceNames(Collection<String> resourceNames) {
    this.resourceNames = resourceNames;
    return this;
  }

  public Collection<String> getResourceNames() {
    return resourceNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdatePrivateEndpointRule that = (UpdatePrivateEndpointRule) o;
    return Objects.equals(domainNames, that.domainNames)
        && Objects.equals(enabled, that.enabled)
        && Objects.equals(resourceNames, that.resourceNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainNames, enabled, resourceNames);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePrivateEndpointRule.class)
        .add("domainNames", domainNames)
        .add("enabled", enabled)
        .add("resourceNames", resourceNames)
        .toString();
  }

  UpdatePrivateEndpointRulePb toPb() {
    UpdatePrivateEndpointRulePb pb = new UpdatePrivateEndpointRulePb();
    pb.setDomainNames(domainNames);
    pb.setEnabled(enabled);
    pb.setResourceNames(resourceNames);

    return pb;
  }

  static UpdatePrivateEndpointRule fromPb(UpdatePrivateEndpointRulePb pb) {
    UpdatePrivateEndpointRule model = new UpdatePrivateEndpointRule();
    model.setDomainNames(pb.getDomainNames());
    model.setEnabled(pb.getEnabled());
    model.setResourceNames(pb.getResourceNames());

    return model;
  }

  public static class UpdatePrivateEndpointRuleSerializer
      extends JsonSerializer<UpdatePrivateEndpointRule> {
    @Override
    public void serialize(
        UpdatePrivateEndpointRule value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdatePrivateEndpointRulePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdatePrivateEndpointRuleDeserializer
      extends JsonDeserializer<UpdatePrivateEndpointRule> {
    @Override
    public UpdatePrivateEndpointRule deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdatePrivateEndpointRulePb pb = mapper.readValue(p, UpdatePrivateEndpointRulePb.class);
      return UpdatePrivateEndpointRule.fromPb(pb);
    }
  }
}
