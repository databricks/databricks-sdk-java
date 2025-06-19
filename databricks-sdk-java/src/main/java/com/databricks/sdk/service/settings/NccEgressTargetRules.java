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

/** Target rule controls the egress rules that are dedicated to specific resources. */
@Generated
@JsonSerialize(using = NccEgressTargetRules.NccEgressTargetRulesSerializer.class)
@JsonDeserialize(using = NccEgressTargetRules.NccEgressTargetRulesDeserializer.class)
public class NccEgressTargetRules {
  /** AWS private endpoint rule controls the AWS private endpoint based egress rules. */
  private Collection<CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRule>
      awsPrivateEndpointRules;

  /** */
  private Collection<NccAzurePrivateEndpointRule> azurePrivateEndpointRules;

  public NccEgressTargetRules setAwsPrivateEndpointRules(
      Collection<CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRule>
          awsPrivateEndpointRules) {
    this.awsPrivateEndpointRules = awsPrivateEndpointRules;
    return this;
  }

  public Collection<CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRule>
      getAwsPrivateEndpointRules() {
    return awsPrivateEndpointRules;
  }

  public NccEgressTargetRules setAzurePrivateEndpointRules(
      Collection<NccAzurePrivateEndpointRule> azurePrivateEndpointRules) {
    this.azurePrivateEndpointRules = azurePrivateEndpointRules;
    return this;
  }

  public Collection<NccAzurePrivateEndpointRule> getAzurePrivateEndpointRules() {
    return azurePrivateEndpointRules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NccEgressTargetRules that = (NccEgressTargetRules) o;
    return Objects.equals(awsPrivateEndpointRules, that.awsPrivateEndpointRules)
        && Objects.equals(azurePrivateEndpointRules, that.azurePrivateEndpointRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsPrivateEndpointRules, azurePrivateEndpointRules);
  }

  @Override
  public String toString() {
    return new ToStringer(NccEgressTargetRules.class)
        .add("awsPrivateEndpointRules", awsPrivateEndpointRules)
        .add("azurePrivateEndpointRules", azurePrivateEndpointRules)
        .toString();
  }

  NccEgressTargetRulesPb toPb() {
    NccEgressTargetRulesPb pb = new NccEgressTargetRulesPb();
    pb.setAwsPrivateEndpointRules(awsPrivateEndpointRules);
    pb.setAzurePrivateEndpointRules(azurePrivateEndpointRules);

    return pb;
  }

  static NccEgressTargetRules fromPb(NccEgressTargetRulesPb pb) {
    NccEgressTargetRules model = new NccEgressTargetRules();
    model.setAwsPrivateEndpointRules(pb.getAwsPrivateEndpointRules());
    model.setAzurePrivateEndpointRules(pb.getAzurePrivateEndpointRules());

    return model;
  }

  public static class NccEgressTargetRulesSerializer extends JsonSerializer<NccEgressTargetRules> {
    @Override
    public void serialize(
        NccEgressTargetRules value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NccEgressTargetRulesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NccEgressTargetRulesDeserializer
      extends JsonDeserializer<NccEgressTargetRules> {
    @Override
    public NccEgressTargetRules deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NccEgressTargetRulesPb pb = mapper.readValue(p, NccEgressTargetRulesPb.class);
      return NccEgressTargetRules.fromPb(pb);
    }
  }
}
