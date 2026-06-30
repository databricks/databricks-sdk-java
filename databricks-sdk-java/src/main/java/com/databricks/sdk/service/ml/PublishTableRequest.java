// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PublishTableRequest {
  /** The specification for publishing the online table from the source table. */
  @JsonProperty("publish_spec")
  private PublishSpec publishSpec;

  /** The full three-part (catalog, schema, table) name of the source table. */
  @JsonIgnore private String sourceTableName;

  public PublishTableRequest setPublishSpec(PublishSpec publishSpec) {
    this.publishSpec = publishSpec;
    return this;
  }

  public PublishSpec getPublishSpec() {
    return publishSpec;
  }

  public PublishTableRequest setSourceTableName(String sourceTableName) {
    this.sourceTableName = sourceTableName;
    return this;
  }

  public String getSourceTableName() {
    return sourceTableName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublishTableRequest that = (PublishTableRequest) o;
    return Objects.equals(publishSpec, that.publishSpec)
        && Objects.equals(sourceTableName, that.sourceTableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publishSpec, sourceTableName);
  }

  @Override
  public String toString() {
    return new ToStringer(PublishTableRequest.class)
        .add("publishSpec", publishSpec)
        .add("sourceTableName", sourceTableName)
        .toString();
  }
}
