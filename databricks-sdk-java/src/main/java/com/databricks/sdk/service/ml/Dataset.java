// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class Dataset {
  /**
   * Dataset digest, e.g. an md5 hash of the dataset that uniquely identifies it
   * within datasets of the same name.
   */
  @JsonProperty("digest")
  private String digest;
  
  /**
   * The name of the dataset. E.g. “my.uc.table@2” “nyc-taxi-dataset”,
   * “fantastic-elk-3”
   */
  @JsonProperty("name")
  private String name;
  
  /**
   * The profile of the dataset. Summary statistics for the dataset, such as the
   * number of rows in a table, the mean / std / mode of each column in a table,
   * or the number of elements in an array.
   */
  @JsonProperty("profile")
  private String profile;
  
  /**
   * The schema of the dataset. E.g., MLflow ColSpec JSON for a dataframe,
   * MLflow TensorSpec JSON for an ndarray, or another schema format.
   */
  @JsonProperty("schema")
  private String schema;
  
  /**
   * The type of the dataset source, e.g. ‘databricks-uc-table’, ‘DBFS’,
   * ‘S3’, ...
   */
  @JsonProperty("source")
  private String source;
  
  /**
   * Source information for the dataset. Note that the source may not exactly
   * reproduce the dataset if it was transformed / modified before use with
   * MLflow.
   */
  @JsonProperty("source_type")
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
    && Objects.equals(sourceType, that.sourceType)
    ;
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
      .add("sourceType", sourceType).toString();
  }
}
