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

@Generated
@JsonSerialize(using = DeleteExperiment.DeleteExperimentSerializer.class)
@JsonDeserialize(using = DeleteExperiment.DeleteExperimentDeserializer.class)
public class DeleteExperiment {
  /** ID of the associated experiment. */
  private String experimentId;

  public DeleteExperiment setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteExperiment that = (DeleteExperiment) o;
    return Objects.equals(experimentId, that.experimentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteExperiment.class).add("experimentId", experimentId).toString();
  }

  DeleteExperimentPb toPb() {
    DeleteExperimentPb pb = new DeleteExperimentPb();
    pb.setExperimentId(experimentId);

    return pb;
  }

  static DeleteExperiment fromPb(DeleteExperimentPb pb) {
    DeleteExperiment model = new DeleteExperiment();
    model.setExperimentId(pb.getExperimentId());

    return model;
  }

  public static class DeleteExperimentSerializer extends JsonSerializer<DeleteExperiment> {
    @Override
    public void serialize(DeleteExperiment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteExperimentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteExperimentDeserializer extends JsonDeserializer<DeleteExperiment> {
    @Override
    public DeleteExperiment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteExperimentPb pb = mapper.readValue(p, DeleteExperimentPb.class);
      return DeleteExperiment.fromPb(pb);
    }
  }
}
