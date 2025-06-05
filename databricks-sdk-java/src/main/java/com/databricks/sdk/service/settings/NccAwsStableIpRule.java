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
 * The stable AWS IP CIDR blocks. You can use these to configure the firewall of your resources to
 * allow traffic from your Databricks workspace.
 */
@Generated
@JsonSerialize(using = NccAwsStableIpRule.NccAwsStableIpRuleSerializer.class)
@JsonDeserialize(using = NccAwsStableIpRule.NccAwsStableIpRuleDeserializer.class)
public class NccAwsStableIpRule {
  /**
   * The list of stable IP CIDR blocks from which Databricks network traffic originates when
   * accessing your resources.
   */
  private Collection<String> cidrBlocks;

  public NccAwsStableIpRule setCidrBlocks(Collection<String> cidrBlocks) {
    this.cidrBlocks = cidrBlocks;
    return this;
  }

  public Collection<String> getCidrBlocks() {
    return cidrBlocks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NccAwsStableIpRule that = (NccAwsStableIpRule) o;
    return Objects.equals(cidrBlocks, that.cidrBlocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrBlocks);
  }

  @Override
  public String toString() {
    return new ToStringer(NccAwsStableIpRule.class).add("cidrBlocks", cidrBlocks).toString();
  }

  NccAwsStableIpRulePb toPb() {
    NccAwsStableIpRulePb pb = new NccAwsStableIpRulePb();
    pb.setCidrBlocks(cidrBlocks);

    return pb;
  }

  static NccAwsStableIpRule fromPb(NccAwsStableIpRulePb pb) {
    NccAwsStableIpRule model = new NccAwsStableIpRule();
    model.setCidrBlocks(pb.getCidrBlocks());

    return model;
  }

  public static class NccAwsStableIpRuleSerializer extends JsonSerializer<NccAwsStableIpRule> {
    @Override
    public void serialize(NccAwsStableIpRule value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NccAwsStableIpRulePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NccAwsStableIpRuleDeserializer extends JsonDeserializer<NccAwsStableIpRule> {
    @Override
    public NccAwsStableIpRule deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NccAwsStableIpRulePb pb = mapper.readValue(p, NccAwsStableIpRulePb.class);
      return NccAwsStableIpRule.fromPb(pb);
    }
  }
}
