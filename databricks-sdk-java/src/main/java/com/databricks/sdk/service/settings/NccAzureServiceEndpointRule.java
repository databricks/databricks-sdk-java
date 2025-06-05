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
 * The stable Azure service endpoints. You can configure the firewall of your Azure resources to
 * allow traffic from your Databricks serverless compute resources.
 */
@Generated
@JsonSerialize(using = NccAzureServiceEndpointRule.NccAzureServiceEndpointRuleSerializer.class)
@JsonDeserialize(using = NccAzureServiceEndpointRule.NccAzureServiceEndpointRuleDeserializer.class)
public class NccAzureServiceEndpointRule {
  /**
   * The list of subnets from which Databricks network traffic originates when accessing your Azure
   * resources.
   */
  private Collection<String> subnets;

  /** The Azure region in which this service endpoint rule applies.. */
  private String targetRegion;

  /** The Azure services to which this service endpoint rule applies to. */
  private Collection<EgressResourceType> targetServices;

  public NccAzureServiceEndpointRule setSubnets(Collection<String> subnets) {
    this.subnets = subnets;
    return this;
  }

  public Collection<String> getSubnets() {
    return subnets;
  }

  public NccAzureServiceEndpointRule setTargetRegion(String targetRegion) {
    this.targetRegion = targetRegion;
    return this;
  }

  public String getTargetRegion() {
    return targetRegion;
  }

  public NccAzureServiceEndpointRule setTargetServices(
      Collection<EgressResourceType> targetServices) {
    this.targetServices = targetServices;
    return this;
  }

  public Collection<EgressResourceType> getTargetServices() {
    return targetServices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NccAzureServiceEndpointRule that = (NccAzureServiceEndpointRule) o;
    return Objects.equals(subnets, that.subnets)
        && Objects.equals(targetRegion, that.targetRegion)
        && Objects.equals(targetServices, that.targetServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnets, targetRegion, targetServices);
  }

  @Override
  public String toString() {
    return new ToStringer(NccAzureServiceEndpointRule.class)
        .add("subnets", subnets)
        .add("targetRegion", targetRegion)
        .add("targetServices", targetServices)
        .toString();
  }

  NccAzureServiceEndpointRulePb toPb() {
    NccAzureServiceEndpointRulePb pb = new NccAzureServiceEndpointRulePb();
    pb.setSubnets(subnets);
    pb.setTargetRegion(targetRegion);
    pb.setTargetServices(targetServices);

    return pb;
  }

  static NccAzureServiceEndpointRule fromPb(NccAzureServiceEndpointRulePb pb) {
    NccAzureServiceEndpointRule model = new NccAzureServiceEndpointRule();
    model.setSubnets(pb.getSubnets());
    model.setTargetRegion(pb.getTargetRegion());
    model.setTargetServices(pb.getTargetServices());

    return model;
  }

  public static class NccAzureServiceEndpointRuleSerializer
      extends JsonSerializer<NccAzureServiceEndpointRule> {
    @Override
    public void serialize(
        NccAzureServiceEndpointRule value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NccAzureServiceEndpointRulePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NccAzureServiceEndpointRuleDeserializer
      extends JsonDeserializer<NccAzureServiceEndpointRule> {
    @Override
    public NccAzureServiceEndpointRule deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NccAzureServiceEndpointRulePb pb = mapper.readValue(p, NccAzureServiceEndpointRulePb.class);
      return NccAzureServiceEndpointRule.fromPb(pb);
    }
  }
}
