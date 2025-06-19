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
@JsonSerialize(using = DirectAccessVectorIndexSpec.DirectAccessVectorIndexSpecSerializer.class)
@JsonDeserialize(using = DirectAccessVectorIndexSpec.DirectAccessVectorIndexSpecDeserializer.class)
public class DirectAccessVectorIndexSpec {
  /** The columns that contain the embedding source. The format should be array[double]. */
  private Collection<EmbeddingSourceColumn> embeddingSourceColumns;

  /** The columns that contain the embedding vectors. The format should be array[double]. */
  private Collection<EmbeddingVectorColumn> embeddingVectorColumns;

  /**
   * The schema of the index in JSON format. Supported types are `integer`, `long`, `float`,
   * `double`, `boolean`, `string`, `date`, `timestamp`. Supported types for vector column:
   * `array<float>`, `array<double>`,`.
   */
  private String schemaJson;

  public DirectAccessVectorIndexSpec setEmbeddingSourceColumns(
      Collection<EmbeddingSourceColumn> embeddingSourceColumns) {
    this.embeddingSourceColumns = embeddingSourceColumns;
    return this;
  }

  public Collection<EmbeddingSourceColumn> getEmbeddingSourceColumns() {
    return embeddingSourceColumns;
  }

  public DirectAccessVectorIndexSpec setEmbeddingVectorColumns(
      Collection<EmbeddingVectorColumn> embeddingVectorColumns) {
    this.embeddingVectorColumns = embeddingVectorColumns;
    return this;
  }

  public Collection<EmbeddingVectorColumn> getEmbeddingVectorColumns() {
    return embeddingVectorColumns;
  }

  public DirectAccessVectorIndexSpec setSchemaJson(String schemaJson) {
    this.schemaJson = schemaJson;
    return this;
  }

  public String getSchemaJson() {
    return schemaJson;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DirectAccessVectorIndexSpec that = (DirectAccessVectorIndexSpec) o;
    return Objects.equals(embeddingSourceColumns, that.embeddingSourceColumns)
        && Objects.equals(embeddingVectorColumns, that.embeddingVectorColumns)
        && Objects.equals(schemaJson, that.schemaJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddingSourceColumns, embeddingVectorColumns, schemaJson);
  }

  @Override
  public String toString() {
    return new ToStringer(DirectAccessVectorIndexSpec.class)
        .add("embeddingSourceColumns", embeddingSourceColumns)
        .add("embeddingVectorColumns", embeddingVectorColumns)
        .add("schemaJson", schemaJson)
        .toString();
  }

  DirectAccessVectorIndexSpecPb toPb() {
    DirectAccessVectorIndexSpecPb pb = new DirectAccessVectorIndexSpecPb();
    pb.setEmbeddingSourceColumns(embeddingSourceColumns);
    pb.setEmbeddingVectorColumns(embeddingVectorColumns);
    pb.setSchemaJson(schemaJson);

    return pb;
  }

  static DirectAccessVectorIndexSpec fromPb(DirectAccessVectorIndexSpecPb pb) {
    DirectAccessVectorIndexSpec model = new DirectAccessVectorIndexSpec();
    model.setEmbeddingSourceColumns(pb.getEmbeddingSourceColumns());
    model.setEmbeddingVectorColumns(pb.getEmbeddingVectorColumns());
    model.setSchemaJson(pb.getSchemaJson());

    return model;
  }

  public static class DirectAccessVectorIndexSpecSerializer
      extends JsonSerializer<DirectAccessVectorIndexSpec> {
    @Override
    public void serialize(
        DirectAccessVectorIndexSpec value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DirectAccessVectorIndexSpecPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DirectAccessVectorIndexSpecDeserializer
      extends JsonDeserializer<DirectAccessVectorIndexSpec> {
    @Override
    public DirectAccessVectorIndexSpec deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DirectAccessVectorIndexSpecPb pb = mapper.readValue(p, DirectAccessVectorIndexSpecPb.class);
      return DirectAccessVectorIndexSpec.fromPb(pb);
    }
  }
}
