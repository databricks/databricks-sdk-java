// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A list of Kinesis stream ARNs to read from. */
@Generated
public class StreamArnList {
  /**
   * Kinesis stream ARNs to read from. For example,
   * 'arn:aws:kinesis:us-west-2:111122223333:stream/stream-a'.
   */
  @JsonProperty("arns")
  private Collection<String> arns;

  public StreamArnList setArns(Collection<String> arns) {
    this.arns = arns;
    return this;
  }

  public Collection<String> getArns() {
    return arns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StreamArnList that = (StreamArnList) o;
    return Objects.equals(arns, that.arns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arns);
  }

  @Override
  public String toString() {
    return new ToStringer(StreamArnList.class).add("arns", arns).toString();
  }
}
