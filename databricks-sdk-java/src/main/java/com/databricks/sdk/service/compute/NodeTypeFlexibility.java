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
import java.util.Objects;

/**
 * For Fleet-V2 using classic clusters, this object contains the information about the alternate
 * node type ids to use when attempting to launch a cluster. It can be used with both the driver and
 * worker node types.
 */
@Generated
@JsonSerialize(using = NodeTypeFlexibility.NodeTypeFlexibilitySerializer.class)
@JsonDeserialize(using = NodeTypeFlexibility.NodeTypeFlexibilityDeserializer.class)
public class NodeTypeFlexibility {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(NodeTypeFlexibility.class).toString();
  }

  NodeTypeFlexibilityPb toPb() {
    NodeTypeFlexibilityPb pb = new NodeTypeFlexibilityPb();

    return pb;
  }

  static NodeTypeFlexibility fromPb(NodeTypeFlexibilityPb pb) {
    NodeTypeFlexibility model = new NodeTypeFlexibility();

    return model;
  }

  public static class NodeTypeFlexibilitySerializer extends JsonSerializer<NodeTypeFlexibility> {
    @Override
    public void serialize(NodeTypeFlexibility value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NodeTypeFlexibilityPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NodeTypeFlexibilityDeserializer
      extends JsonDeserializer<NodeTypeFlexibility> {
    @Override
    public NodeTypeFlexibility deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NodeTypeFlexibilityPb pb = mapper.readValue(p, NodeTypeFlexibilityPb.class);
      return NodeTypeFlexibility.fromPb(pb);
    }
  }
}
