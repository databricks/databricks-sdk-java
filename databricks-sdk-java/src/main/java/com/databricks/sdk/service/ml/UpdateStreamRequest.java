// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateStreamRequest {
  /** Full three-part (catalog.schema.stream) name of the stream. */
  @JsonIgnore private String name;

  /** The Stream to update. */
  @JsonProperty("stream")
  private Stream stream;

  /** The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateStreamRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateStreamRequest setStream(Stream stream) {
    this.stream = stream;
    return this;
  }

  public Stream getStream() {
    return stream;
  }

  public UpdateStreamRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateStreamRequest that = (UpdateStreamRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(stream, that.stream)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, stream, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateStreamRequest.class)
        .add("name", name)
        .add("stream", stream)
        .add("updateMask", updateMask)
        .toString();
  }
}
