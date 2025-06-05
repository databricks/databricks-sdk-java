// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
@JsonSerialize(
    using = RerankerConfigRerankerParameters.RerankerConfigRerankerParametersSerializer.class)
@JsonDeserialize(
    using = RerankerConfigRerankerParameters.RerankerConfigRerankerParametersDeserializer.class)
public class RerankerConfigRerankerParameters {
  /** */
  private Collection<String> columnsToRerank;

  public RerankerConfigRerankerParameters setColumnsToRerank(Collection<String> columnsToRerank) {
    this.columnsToRerank = columnsToRerank;
    return this;
  }

  public Collection<String> getColumnsToRerank() {
    return columnsToRerank;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RerankerConfigRerankerParameters that = (RerankerConfigRerankerParameters) o;
    return Objects.equals(columnsToRerank, that.columnsToRerank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnsToRerank);
  }

  @Override
  public String toString() {
    return new ToStringer(RerankerConfigRerankerParameters.class)
        .add("columnsToRerank", columnsToRerank)
        .toString();
  }

  RerankerConfigRerankerParametersPb toPb() {
    RerankerConfigRerankerParametersPb pb = new RerankerConfigRerankerParametersPb();
    pb.setColumnsToRerank(columnsToRerank);

    return pb;
  }

  static RerankerConfigRerankerParameters fromPb(RerankerConfigRerankerParametersPb pb) {
    RerankerConfigRerankerParameters model = new RerankerConfigRerankerParameters();
    model.setColumnsToRerank(pb.getColumnsToRerank());

    return model;
  }

  public static class RerankerConfigRerankerParametersSerializer
      extends JsonSerializer<RerankerConfigRerankerParameters> {
    @Override
    public void serialize(
        RerankerConfigRerankerParameters value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RerankerConfigRerankerParametersPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RerankerConfigRerankerParametersDeserializer
      extends JsonDeserializer<RerankerConfigRerankerParameters> {
    @Override
    public RerankerConfigRerankerParameters deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RerankerConfigRerankerParametersPb pb =
          mapper.readValue(p, RerankerConfigRerankerParametersPb.class);
      return RerankerConfigRerankerParameters.fromPb(pb);
    }
  }
}
