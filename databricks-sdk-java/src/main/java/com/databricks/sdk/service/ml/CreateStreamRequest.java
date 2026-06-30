// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateStreamRequest {
  /** The Stream to create. */
  @JsonProperty("stream")
  private Stream stream;

  public CreateStreamRequest setStream(Stream stream) {
    this.stream = stream;
    return this;
  }

  public Stream getStream() {
    return stream;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateStreamRequest that = (CreateStreamRequest) o;
    return Objects.equals(stream, that.stream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stream);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateStreamRequest.class).add("stream", stream).toString();
  }
}
