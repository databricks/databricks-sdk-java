// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = Continuous.ContinuousSerializer.class)
@JsonDeserialize(using = Continuous.ContinuousDeserializer.class)
public class Continuous {
  /**
   * Indicate whether the continuous execution of the job is paused or not. Defaults to UNPAUSED.
   */
  private PauseStatus pauseStatus;

  public Continuous setPauseStatus(PauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public PauseStatus getPauseStatus() {
    return pauseStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Continuous that = (Continuous) o;
    return Objects.equals(pauseStatus, that.pauseStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pauseStatus);
  }

  @Override
  public String toString() {
    return new ToStringer(Continuous.class).add("pauseStatus", pauseStatus).toString();
  }

  ContinuousPb toPb() {
    ContinuousPb pb = new ContinuousPb();
    pb.setPauseStatus(pauseStatus);

    return pb;
  }

  static Continuous fromPb(ContinuousPb pb) {
    Continuous model = new Continuous();
    model.setPauseStatus(pb.getPauseStatus());

    return model;
  }

  public static class ContinuousSerializer extends JsonSerializer<Continuous> {
    @Override
    public void serialize(Continuous value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ContinuousPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ContinuousDeserializer extends JsonDeserializer<Continuous> {
    @Override
    public Continuous deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ContinuousPb pb = mapper.readValue(p, ContinuousPb.class);
      return Continuous.fromPb(pb);
    }
  }
}
