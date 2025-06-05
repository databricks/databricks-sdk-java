// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
@JsonSerialize(using = RuleSetUpdateRequest.RuleSetUpdateRequestSerializer.class)
@JsonDeserialize(using = RuleSetUpdateRequest.RuleSetUpdateRequestDeserializer.class)
public class RuleSetUpdateRequest {
  /**
   * Identifies the version of the rule set returned. Etag used for versioning. The response is at
   * least as fresh as the eTag provided. Etag is used for optimistic concurrency control as a way
   * to help prevent simultaneous updates of a rule set from overwriting each other. It is strongly
   * suggested that systems make use of the etag in the read -> modify -> write pattern to perform
   * rule set updates in order to avoid race conditions that is get an etag from a GET rule set
   * request, and pass it with the PUT update request to identify the rule set version you are
   * updating.
   */
  private String etag;

  /** */
  private Collection<GrantRule> grantRules;

  /** Name of the rule set. */
  private String name;

  public RuleSetUpdateRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public RuleSetUpdateRequest setGrantRules(Collection<GrantRule> grantRules) {
    this.grantRules = grantRules;
    return this;
  }

  public Collection<GrantRule> getGrantRules() {
    return grantRules;
  }

  public RuleSetUpdateRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RuleSetUpdateRequest that = (RuleSetUpdateRequest) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(grantRules, that.grantRules)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, grantRules, name);
  }

  @Override
  public String toString() {
    return new ToStringer(RuleSetUpdateRequest.class)
        .add("etag", etag)
        .add("grantRules", grantRules)
        .add("name", name)
        .toString();
  }

  RuleSetUpdateRequestPb toPb() {
    RuleSetUpdateRequestPb pb = new RuleSetUpdateRequestPb();
    pb.setEtag(etag);
    pb.setGrantRules(grantRules);
    pb.setName(name);

    return pb;
  }

  static RuleSetUpdateRequest fromPb(RuleSetUpdateRequestPb pb) {
    RuleSetUpdateRequest model = new RuleSetUpdateRequest();
    model.setEtag(pb.getEtag());
    model.setGrantRules(pb.getGrantRules());
    model.setName(pb.getName());

    return model;
  }

  public static class RuleSetUpdateRequestSerializer extends JsonSerializer<RuleSetUpdateRequest> {
    @Override
    public void serialize(
        RuleSetUpdateRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RuleSetUpdateRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RuleSetUpdateRequestDeserializer
      extends JsonDeserializer<RuleSetUpdateRequest> {
    @Override
    public RuleSetUpdateRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RuleSetUpdateRequestPb pb = mapper.readValue(p, RuleSetUpdateRequestPb.class);
      return RuleSetUpdateRequest.fromPb(pb);
    }
  }
}
