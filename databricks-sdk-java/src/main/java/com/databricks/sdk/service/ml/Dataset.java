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

/**
 * Dataset. Represents a reference to data used for training, testing, or evaluation during the
 * model development process.
 */
@Generated
@JsonSerialize(using = Dataset.DatasetSerializer.class)
@JsonDeserialize(using = Dataset.DatasetDeserializer.class)
public class Dataset {
  /**
   * Dataset digest, e.g. an md5 hash of the dataset that uniquely identifies it within datasets of
   * the same name.
   */
  private String digest;

  /** The name of the dataset. E.g. “my.uc.table@2” “nyc-taxi-dataset”, “fantastic-elk-3” */
  private String name;

  /**
   * The profile of the dataset. Summary statistics for the dataset, such as the number of rows in a
   * table, the mean / std / mode of each column in a table, or the number of elements in an array.
   */
  private String profile;

  /**
   * The schema of the dataset. E.g., MLflow ColSpec JSON for a dataframe, MLflow TensorSpec JSON
   * for an ndarray, or another schema format.
   */
  private String schema;

  /**
   * Source information for the dataset. Note that the source may not exactly reproduce the dataset
   * if it was transformed / modified before use with MLflow.
   */
  private String source;

  /** The type of the dataset source, e.g. ‘databricks-uc-table’, ‘DBFS’, ‘S3’, ... */
  private String sourceType;

  public Dataset setDigest(String digest) {
    this.digest = digest;
    return this;
  }

  public String getDigest() {
    return digest;
  }

  public Dataset setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Dataset setProfile(String profile) {
    this.profile = profile;
    return this;
  }

  public String getProfile() {
    return profile;
  }

  public Dataset setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public Dataset setSource(String source) {
    this.source = source;
    return this;
  }

  public String getSource() {
    return source;
  }

  public Dataset setSourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  public String getSourceType() {
    return sourceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dataset that = (Dataset) o;
    return Objects.equals(digest, that.digest)
        && Objects.equals(name, that.name)
        && Objects.equals(profile, that.profile)
        && Objects.equals(schema, that.schema)
        && Objects.equals(source, that.source)
        && Objects.equals(sourceType, that.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digest, name, profile, schema, source, sourceType);
  }

  @Override
  public String toString() {
    return new ToStringer(Dataset.class)
        .add("digest", digest)
        .add("name", name)
        .add("profile", profile)
        .add("schema", schema)
        .add("source", source)
        .add("sourceType", sourceType)
        .toString();
  }

  DatasetPb toPb() {
    DatasetPb pb = new DatasetPb();
    pb.setDigest(digest);
    pb.setName(name);
    pb.setProfile(profile);
    pb.setSchema(schema);
    pb.setSource(source);
    pb.setSourceType(sourceType);

    return pb;
  }

  static Dataset fromPb(DatasetPb pb) {
    Dataset model = new Dataset();
    model.setDigest(pb.getDigest());
    model.setName(pb.getName());
    model.setProfile(pb.getProfile());
    model.setSchema(pb.getSchema());
    model.setSource(pb.getSource());
    model.setSourceType(pb.getSourceType());

    return model;
  }

  public static class DatasetSerializer extends JsonSerializer<Dataset> {
    @Override
    public void serialize(Dataset value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DatasetPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DatasetDeserializer extends JsonDeserializer<Dataset> {
    @Override
    public Dataset deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DatasetPb pb = mapper.readValue(p, DatasetPb.class);
      return Dataset.fromPb(pb);
    }
  }
}
