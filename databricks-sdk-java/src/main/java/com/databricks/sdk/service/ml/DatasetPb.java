// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Dataset. Represents a reference to data used for training, testing, or evaluation during the
 * model development process.
 */
@Generated
class DatasetPb {
  @JsonProperty("digest")
  private String digest;

  @JsonProperty("name")
  private String name;

  @JsonProperty("profile")
  private String profile;

  @JsonProperty("schema")
  private String schema;

  @JsonProperty("source")
  private String source;

  @JsonProperty("source_type")
  private String sourceType;

  public DatasetPb setDigest(String digest) {
    this.digest = digest;
    return this;
  }

  public String getDigest() {
    return digest;
  }

  public DatasetPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DatasetPb setProfile(String profile) {
    this.profile = profile;
    return this;
  }

  public String getProfile() {
    return profile;
  }

  public DatasetPb setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public DatasetPb setSource(String source) {
    this.source = source;
    return this;
  }

  public String getSource() {
    return source;
  }

  public DatasetPb setSourceType(String sourceType) {
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
    DatasetPb that = (DatasetPb) o;
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
    return new ToStringer(DatasetPb.class)
        .add("digest", digest)
        .add("name", name)
        .add("profile", profile)
        .add("schema", schema)
        .add("source", source)
        .add("sourceType", sourceType)
        .toString();
  }
}
