// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

@Generated
@JsonSerialize(using = CreateQueryRequest.CreateQueryRequestSerializer.class)
@JsonDeserialize(using = CreateQueryRequest.CreateQueryRequestDeserializer.class)
public class CreateQueryRequest {
  /**
   * If true, automatically resolve query display name conflicts. Otherwise, fail the request if the
   * query's display name conflicts with an existing query's display name.
   */
  private Boolean autoResolveDisplayName;

  /** */
  private CreateQueryRequestQuery query;

  public CreateQueryRequest setAutoResolveDisplayName(Boolean autoResolveDisplayName) {
    this.autoResolveDisplayName = autoResolveDisplayName;
    return this;
  }

  public Boolean getAutoResolveDisplayName() {
    return autoResolveDisplayName;
  }

  public CreateQueryRequest setQuery(CreateQueryRequestQuery query) {
    this.query = query;
    return this;
  }

  public CreateQueryRequestQuery getQuery() {
    return query;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateQueryRequest that = (CreateQueryRequest) o;
    return Objects.equals(autoResolveDisplayName, that.autoResolveDisplayName)
        && Objects.equals(query, that.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoResolveDisplayName, query);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateQueryRequest.class)
        .add("autoResolveDisplayName", autoResolveDisplayName)
        .add("query", query)
        .toString();
  }

  CreateQueryRequestPb toPb() {
    CreateQueryRequestPb pb = new CreateQueryRequestPb();
    pb.setAutoResolveDisplayName(autoResolveDisplayName);
    pb.setQuery(query);

    return pb;
  }

  static CreateQueryRequest fromPb(CreateQueryRequestPb pb) {
    CreateQueryRequest model = new CreateQueryRequest();
    model.setAutoResolveDisplayName(pb.getAutoResolveDisplayName());
    model.setQuery(pb.getQuery());

    return model;
  }

  public static class CreateQueryRequestSerializer extends JsonSerializer<CreateQueryRequest> {
    @Override
    public void serialize(CreateQueryRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateQueryRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateQueryRequestDeserializer extends JsonDeserializer<CreateQueryRequest> {
    @Override
    public CreateQueryRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateQueryRequestPb pb = mapper.readValue(p, CreateQueryRequestPb.class);
      return CreateQueryRequest.fromPb(pb);
    }
  }
}
