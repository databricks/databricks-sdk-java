// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = ListNodeTypesResponse.ListNodeTypesResponseSerializer.class)
@JsonDeserialize(using = ListNodeTypesResponse.ListNodeTypesResponseDeserializer.class)
public class ListNodeTypesResponse {
  /** The list of available Spark node types. */
  private Collection<NodeType> nodeTypes;

  public ListNodeTypesResponse setNodeTypes(Collection<NodeType> nodeTypes) {
    this.nodeTypes = nodeTypes;
    return this;
  }

  public Collection<NodeType> getNodeTypes() {
    return nodeTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListNodeTypesResponse that = (ListNodeTypesResponse) o;
    return Objects.equals(nodeTypes, that.nodeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeTypes);
  }

  @Override
  public String toString() {
    return new ToStringer(ListNodeTypesResponse.class).add("nodeTypes", nodeTypes).toString();
  }

  ListNodeTypesResponsePb toPb() {
    ListNodeTypesResponsePb pb = new ListNodeTypesResponsePb();
    pb.setNodeTypes(nodeTypes);

    return pb;
  }

  static ListNodeTypesResponse fromPb(ListNodeTypesResponsePb pb) {
    ListNodeTypesResponse model = new ListNodeTypesResponse();
    model.setNodeTypes(pb.getNodeTypes());

    return model;
  }

  public static class ListNodeTypesResponseSerializer
      extends JsonSerializer<ListNodeTypesResponse> {
    @Override
    public void serialize(
        ListNodeTypesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListNodeTypesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListNodeTypesResponseDeserializer
      extends JsonDeserializer<ListNodeTypesResponse> {
    @Override
    public ListNodeTypesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListNodeTypesResponsePb pb = mapper.readValue(p, ListNodeTypesResponsePb.class);
      return ListNodeTypesResponse.fromPb(pb);
    }
  }
}
