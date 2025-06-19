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
import java.util.Collection;
import java.util.Objects;

/** Run inputs. */
@Generated
@JsonSerialize(using = RunInputs.RunInputsSerializer.class)
@JsonDeserialize(using = RunInputs.RunInputsDeserializer.class)
public class RunInputs {
  /** Run metrics. */
  private Collection<DatasetInput> datasetInputs;

  /** Model inputs to the Run. */
  private Collection<ModelInput> modelInputs;

  public RunInputs setDatasetInputs(Collection<DatasetInput> datasetInputs) {
    this.datasetInputs = datasetInputs;
    return this;
  }

  public Collection<DatasetInput> getDatasetInputs() {
    return datasetInputs;
  }

  public RunInputs setModelInputs(Collection<ModelInput> modelInputs) {
    this.modelInputs = modelInputs;
    return this;
  }

  public Collection<ModelInput> getModelInputs() {
    return modelInputs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunInputs that = (RunInputs) o;
    return Objects.equals(datasetInputs, that.datasetInputs)
        && Objects.equals(modelInputs, that.modelInputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetInputs, modelInputs);
  }

  @Override
  public String toString() {
    return new ToStringer(RunInputs.class)
        .add("datasetInputs", datasetInputs)
        .add("modelInputs", modelInputs)
        .toString();
  }

  RunInputsPb toPb() {
    RunInputsPb pb = new RunInputsPb();
    pb.setDatasetInputs(datasetInputs);
    pb.setModelInputs(modelInputs);

    return pb;
  }

  static RunInputs fromPb(RunInputsPb pb) {
    RunInputs model = new RunInputs();
    model.setDatasetInputs(pb.getDatasetInputs());
    model.setModelInputs(pb.getModelInputs());

    return model;
  }

  public static class RunInputsSerializer extends JsonSerializer<RunInputs> {
    @Override
    public void serialize(RunInputs value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RunInputsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RunInputsDeserializer extends JsonDeserializer<RunInputs> {
    @Override
    public RunInputs deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RunInputsPb pb = mapper.readValue(p, RunInputsPb.class);
      return RunInputs.fromPb(pb);
    }
  }
}
