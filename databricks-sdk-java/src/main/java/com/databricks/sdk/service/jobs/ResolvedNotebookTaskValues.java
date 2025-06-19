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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = ResolvedNotebookTaskValues.ResolvedNotebookTaskValuesSerializer.class)
@JsonDeserialize(using = ResolvedNotebookTaskValues.ResolvedNotebookTaskValuesDeserializer.class)
public class ResolvedNotebookTaskValues {
  /** */
  private Map<String, String> baseParameters;

  public ResolvedNotebookTaskValues setBaseParameters(Map<String, String> baseParameters) {
    this.baseParameters = baseParameters;
    return this;
  }

  public Map<String, String> getBaseParameters() {
    return baseParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedNotebookTaskValues that = (ResolvedNotebookTaskValues) o;
    return Objects.equals(baseParameters, that.baseParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseParameters);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedNotebookTaskValues.class)
        .add("baseParameters", baseParameters)
        .toString();
  }

  ResolvedNotebookTaskValuesPb toPb() {
    ResolvedNotebookTaskValuesPb pb = new ResolvedNotebookTaskValuesPb();
    pb.setBaseParameters(baseParameters);

    return pb;
  }

  static ResolvedNotebookTaskValues fromPb(ResolvedNotebookTaskValuesPb pb) {
    ResolvedNotebookTaskValues model = new ResolvedNotebookTaskValues();
    model.setBaseParameters(pb.getBaseParameters());

    return model;
  }

  public static class ResolvedNotebookTaskValuesSerializer
      extends JsonSerializer<ResolvedNotebookTaskValues> {
    @Override
    public void serialize(
        ResolvedNotebookTaskValues value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResolvedNotebookTaskValuesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResolvedNotebookTaskValuesDeserializer
      extends JsonDeserializer<ResolvedNotebookTaskValues> {
    @Override
    public ResolvedNotebookTaskValues deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResolvedNotebookTaskValuesPb pb = mapper.readValue(p, ResolvedNotebookTaskValuesPb.class);
      return ResolvedNotebookTaskValues.fromPb(pb);
    }
  }
}
