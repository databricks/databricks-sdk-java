// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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

/** List transition requests */
@Generated
@JsonSerialize(using = ListTransitionRequestsRequest.ListTransitionRequestsRequestSerializer.class)
@JsonDeserialize(
    using = ListTransitionRequestsRequest.ListTransitionRequestsRequestDeserializer.class)
public class ListTransitionRequestsRequest {
  /** Name of the model. */
  private String name;

  /** Version of the model. */
  private String version;

  public ListTransitionRequestsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ListTransitionRequestsRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTransitionRequestsRequest that = (ListTransitionRequestsRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTransitionRequestsRequest.class)
        .add("name", name)
        .add("version", version)
        .toString();
  }

  ListTransitionRequestsRequestPb toPb() {
    ListTransitionRequestsRequestPb pb = new ListTransitionRequestsRequestPb();
    pb.setName(name);
    pb.setVersion(version);

    return pb;
  }

  static ListTransitionRequestsRequest fromPb(ListTransitionRequestsRequestPb pb) {
    ListTransitionRequestsRequest model = new ListTransitionRequestsRequest();
    model.setName(pb.getName());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class ListTransitionRequestsRequestSerializer
      extends JsonSerializer<ListTransitionRequestsRequest> {
    @Override
    public void serialize(
        ListTransitionRequestsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListTransitionRequestsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListTransitionRequestsRequestDeserializer
      extends JsonDeserializer<ListTransitionRequestsRequest> {
    @Override
    public ListTransitionRequestsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListTransitionRequestsRequestPb pb =
          mapper.readValue(p, ListTransitionRequestsRequestPb.class);
      return ListTransitionRequestsRequest.fromPb(pb);
    }
  }
}
