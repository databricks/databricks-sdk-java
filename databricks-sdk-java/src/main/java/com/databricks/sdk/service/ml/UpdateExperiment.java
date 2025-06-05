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
@JsonSerialize(using = UpdateExperiment.UpdateExperimentSerializer.class)
@JsonDeserialize(using = UpdateExperiment.UpdateExperimentDeserializer.class)
public class UpdateExperiment {
  /** ID of the associated experiment. */
  private String experimentId;

  /** If provided, the experiment's name is changed to the new name. The new name must be unique. */
  private String newName;

  public UpdateExperiment setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public UpdateExperiment setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateExperiment that = (UpdateExperiment) o;
    return Objects.equals(experimentId, that.experimentId) && Objects.equals(newName, that.newName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, newName);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateExperiment.class)
        .add("experimentId", experimentId)
        .add("newName", newName)
        .toString();
  }

  UpdateExperimentPb toPb() {
    UpdateExperimentPb pb = new UpdateExperimentPb();
    pb.setExperimentId(experimentId);
    pb.setNewName(newName);

    return pb;
  }

  static UpdateExperiment fromPb(UpdateExperimentPb pb) {
    UpdateExperiment model = new UpdateExperiment();
    model.setExperimentId(pb.getExperimentId());
    model.setNewName(pb.getNewName());

    return model;
  }

  public static class UpdateExperimentSerializer extends JsonSerializer<UpdateExperiment> {
    @Override
    public void serialize(UpdateExperiment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateExperimentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateExperimentDeserializer extends JsonDeserializer<UpdateExperiment> {
    @Override
    public UpdateExperiment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateExperimentPb pb = mapper.readValue(p, UpdateExperimentPb.class);
      return UpdateExperiment.fromPb(pb);
    }
  }
}
