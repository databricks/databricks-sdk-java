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

/** A single run. */
@Generated
@JsonSerialize(using = Run.RunSerializer.class)
@JsonDeserialize(using = Run.RunDeserializer.class)
public class Run {
  /** Run data. */
  private RunData data;

  /** Run metadata. */
  private RunInfo info;

  /** Run inputs. */
  private RunInputs inputs;

  public Run setData(RunData data) {
    this.data = data;
    return this;
  }

  public RunData getData() {
    return data;
  }

  public Run setInfo(RunInfo info) {
    this.info = info;
    return this;
  }

  public RunInfo getInfo() {
    return info;
  }

  public Run setInputs(RunInputs inputs) {
    this.inputs = inputs;
    return this;
  }

  public RunInputs getInputs() {
    return inputs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Run that = (Run) o;
    return Objects.equals(data, that.data)
        && Objects.equals(info, that.info)
        && Objects.equals(inputs, that.inputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, info, inputs);
  }

  @Override
  public String toString() {
    return new ToStringer(Run.class)
        .add("data", data)
        .add("info", info)
        .add("inputs", inputs)
        .toString();
  }

  RunPb toPb() {
    RunPb pb = new RunPb();
    pb.setData(data);
    pb.setInfo(info);
    pb.setInputs(inputs);

    return pb;
  }

  static Run fromPb(RunPb pb) {
    Run model = new Run();
    model.setData(pb.getData());
    model.setInfo(pb.getInfo());
    model.setInputs(pb.getInputs());

    return model;
  }

  public static class RunSerializer extends JsonSerializer<Run> {
    @Override
    public void serialize(Run value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RunPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RunDeserializer extends JsonDeserializer<Run> {
    @Override
    public Run deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RunPb pb = mapper.readValue(p, RunPb.class);
      return Run.fromPb(pb);
    }
  }
}
