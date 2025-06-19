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
import java.util.Objects;

/** Get a rule set */
@Generated
@JsonSerialize(using = GetRuleSetRequest.GetRuleSetRequestSerializer.class)
@JsonDeserialize(using = GetRuleSetRequest.GetRuleSetRequestDeserializer.class)
public class GetRuleSetRequest {
  /**
   * Etag used for versioning. The response is at least as fresh as the eTag provided. Etag is used
   * for optimistic concurrency control as a way to help prevent simultaneous updates of a rule set
   * from overwriting each other. It is strongly suggested that systems make use of the etag in the
   * read -> modify -> write pattern to perform rule set updates in order to avoid race conditions
   * that is get an etag from a GET rule set request, and pass it with the PUT update request to
   * identify the rule set version you are updating.
   *
   * <p>Examples | Summary :--- | :--- `etag=` | An empty etag can only be used in GET to indicate
   * no freshness requirements. `etag=RENUAAABhSweA4NvVmmUYdiU717H3Tgy0UJdor3gE4a+mq/oj9NjAf8ZsQ==`
   * | An etag encoded a specific version of the rule set to get or to be updated.
   */
  private String etag;

  /**
   * The ruleset name associated with the request.
   *
   * <p>Examples | Summary :--- | :--- `name=accounts/<ACCOUNT_ID>/ruleSets/default` | A name for a
   * rule set on the account. `name=accounts/<ACCOUNT_ID>/groups/<GROUP_ID>/ruleSets/default` | A
   * name for a rule set on the group.
   * `name=accounts/<ACCOUNT_ID>/servicePrincipals/<SERVICE_PRINCIPAL_APPLICATION_ID>/ruleSets/default`
   * | A name for a rule set on the service principal.
   */
  private String name;

  public GetRuleSetRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public GetRuleSetRequest setName(String name) {
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
    GetRuleSetRequest that = (GetRuleSetRequest) o;
    return Objects.equals(etag, that.etag) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRuleSetRequest.class).add("etag", etag).add("name", name).toString();
  }

  GetRuleSetRequestPb toPb() {
    GetRuleSetRequestPb pb = new GetRuleSetRequestPb();
    pb.setEtag(etag);
    pb.setName(name);

    return pb;
  }

  static GetRuleSetRequest fromPb(GetRuleSetRequestPb pb) {
    GetRuleSetRequest model = new GetRuleSetRequest();
    model.setEtag(pb.getEtag());
    model.setName(pb.getName());

    return model;
  }

  public static class GetRuleSetRequestSerializer extends JsonSerializer<GetRuleSetRequest> {
    @Override
    public void serialize(GetRuleSetRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetRuleSetRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRuleSetRequestDeserializer extends JsonDeserializer<GetRuleSetRequest> {
    @Override
    public GetRuleSetRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRuleSetRequestPb pb = mapper.readValue(p, GetRuleSetRequestPb.class);
      return GetRuleSetRequest.fromPb(pb);
    }
  }
}
