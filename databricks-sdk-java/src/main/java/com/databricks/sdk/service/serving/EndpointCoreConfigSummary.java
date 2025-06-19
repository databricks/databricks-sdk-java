// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
@JsonSerialize(using = EndpointCoreConfigSummary.EndpointCoreConfigSummarySerializer.class)
@JsonDeserialize(using = EndpointCoreConfigSummary.EndpointCoreConfigSummaryDeserializer.class)
public class EndpointCoreConfigSummary {
  /** The list of served entities under the serving endpoint config. */
  private Collection<ServedEntitySpec> servedEntities;

  /**
   * (Deprecated, use served_entities instead) The list of served models under the serving endpoint
   * config.
   */
  private Collection<ServedModelSpec> servedModels;

  public EndpointCoreConfigSummary setServedEntities(Collection<ServedEntitySpec> servedEntities) {
    this.servedEntities = servedEntities;
    return this;
  }

  public Collection<ServedEntitySpec> getServedEntities() {
    return servedEntities;
  }

  public EndpointCoreConfigSummary setServedModels(Collection<ServedModelSpec> servedModels) {
    this.servedModels = servedModels;
    return this;
  }

  public Collection<ServedModelSpec> getServedModels() {
    return servedModels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointCoreConfigSummary that = (EndpointCoreConfigSummary) o;
    return Objects.equals(servedEntities, that.servedEntities)
        && Objects.equals(servedModels, that.servedModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servedEntities, servedModels);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointCoreConfigSummary.class)
        .add("servedEntities", servedEntities)
        .add("servedModels", servedModels)
        .toString();
  }

  EndpointCoreConfigSummaryPb toPb() {
    EndpointCoreConfigSummaryPb pb = new EndpointCoreConfigSummaryPb();
    pb.setServedEntities(servedEntities);
    pb.setServedModels(servedModels);

    return pb;
  }

  static EndpointCoreConfigSummary fromPb(EndpointCoreConfigSummaryPb pb) {
    EndpointCoreConfigSummary model = new EndpointCoreConfigSummary();
    model.setServedEntities(pb.getServedEntities());
    model.setServedModels(pb.getServedModels());

    return model;
  }

  public static class EndpointCoreConfigSummarySerializer
      extends JsonSerializer<EndpointCoreConfigSummary> {
    @Override
    public void serialize(
        EndpointCoreConfigSummary value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EndpointCoreConfigSummaryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EndpointCoreConfigSummaryDeserializer
      extends JsonDeserializer<EndpointCoreConfigSummary> {
    @Override
    public EndpointCoreConfigSummary deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EndpointCoreConfigSummaryPb pb = mapper.readValue(p, EndpointCoreConfigSummaryPb.class);
      return EndpointCoreConfigSummary.fromPb(pb);
    }
  }
}
