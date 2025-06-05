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
import java.util.Objects;

/** Default rules don't have specific targets. */
@Generated
@JsonSerialize(using = NccEgressDefaultRules.NccEgressDefaultRulesSerializer.class)
@JsonDeserialize(using = NccEgressDefaultRules.NccEgressDefaultRulesDeserializer.class)
public class NccEgressDefaultRules {
  /**
   * The stable AWS IP CIDR blocks. You can use these to configure the firewall of your resources to
   * allow traffic from your Databricks workspace.
   */
  private NccAwsStableIpRule awsStableIpRule;

  /**
   * The stable Azure service endpoints. You can configure the firewall of your Azure resources to
   * allow traffic from your Databricks serverless compute resources.
   */
  private NccAzureServiceEndpointRule azureServiceEndpointRule;

  public NccEgressDefaultRules setAwsStableIpRule(NccAwsStableIpRule awsStableIpRule) {
    this.awsStableIpRule = awsStableIpRule;
    return this;
  }

  public NccAwsStableIpRule getAwsStableIpRule() {
    return awsStableIpRule;
  }

  public NccEgressDefaultRules setAzureServiceEndpointRule(
      NccAzureServiceEndpointRule azureServiceEndpointRule) {
    this.azureServiceEndpointRule = azureServiceEndpointRule;
    return this;
  }

  public NccAzureServiceEndpointRule getAzureServiceEndpointRule() {
    return azureServiceEndpointRule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NccEgressDefaultRules that = (NccEgressDefaultRules) o;
    return Objects.equals(awsStableIpRule, that.awsStableIpRule)
        && Objects.equals(azureServiceEndpointRule, that.azureServiceEndpointRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsStableIpRule, azureServiceEndpointRule);
  }

  @Override
  public String toString() {
    return new ToStringer(NccEgressDefaultRules.class)
        .add("awsStableIpRule", awsStableIpRule)
        .add("azureServiceEndpointRule", azureServiceEndpointRule)
        .toString();
  }

  NccEgressDefaultRulesPb toPb() {
    NccEgressDefaultRulesPb pb = new NccEgressDefaultRulesPb();
    pb.setAwsStableIpRule(awsStableIpRule);
    pb.setAzureServiceEndpointRule(azureServiceEndpointRule);

    return pb;
  }

  static NccEgressDefaultRules fromPb(NccEgressDefaultRulesPb pb) {
    NccEgressDefaultRules model = new NccEgressDefaultRules();
    model.setAwsStableIpRule(pb.getAwsStableIpRule());
    model.setAzureServiceEndpointRule(pb.getAzureServiceEndpointRule());

    return model;
  }

  public static class NccEgressDefaultRulesSerializer
      extends JsonSerializer<NccEgressDefaultRules> {
    @Override
    public void serialize(
        NccEgressDefaultRules value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NccEgressDefaultRulesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NccEgressDefaultRulesDeserializer
      extends JsonDeserializer<NccEgressDefaultRules> {
    @Override
    public NccEgressDefaultRules deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NccEgressDefaultRulesPb pb = mapper.readValue(p, NccEgressDefaultRulesPb.class);
      return NccEgressDefaultRules.fromPb(pb);
    }
  }
}
