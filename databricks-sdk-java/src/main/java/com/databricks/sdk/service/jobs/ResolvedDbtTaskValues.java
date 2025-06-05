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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ResolvedDbtTaskValues.ResolvedDbtTaskValuesSerializer.class)
@JsonDeserialize(using = ResolvedDbtTaskValues.ResolvedDbtTaskValuesDeserializer.class)
public class ResolvedDbtTaskValues {
  /** */
  private Collection<String> commands;

  public ResolvedDbtTaskValues setCommands(Collection<String> commands) {
    this.commands = commands;
    return this;
  }

  public Collection<String> getCommands() {
    return commands;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedDbtTaskValues that = (ResolvedDbtTaskValues) o;
    return Objects.equals(commands, that.commands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commands);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedDbtTaskValues.class).add("commands", commands).toString();
  }

  ResolvedDbtTaskValuesPb toPb() {
    ResolvedDbtTaskValuesPb pb = new ResolvedDbtTaskValuesPb();
    pb.setCommands(commands);

    return pb;
  }

  static ResolvedDbtTaskValues fromPb(ResolvedDbtTaskValuesPb pb) {
    ResolvedDbtTaskValues model = new ResolvedDbtTaskValues();
    model.setCommands(pb.getCommands());

    return model;
  }

  public static class ResolvedDbtTaskValuesSerializer
      extends JsonSerializer<ResolvedDbtTaskValues> {
    @Override
    public void serialize(
        ResolvedDbtTaskValues value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResolvedDbtTaskValuesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResolvedDbtTaskValuesDeserializer
      extends JsonDeserializer<ResolvedDbtTaskValues> {
    @Override
    public ResolvedDbtTaskValues deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResolvedDbtTaskValuesPb pb = mapper.readValue(p, ResolvedDbtTaskValuesPb.class);
      return ResolvedDbtTaskValues.fromPb(pb);
    }
  }
}
