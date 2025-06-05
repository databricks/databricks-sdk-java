// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PartitionValuePb {
  @JsonProperty("name")
  private String name;

  @JsonProperty("op")
  private PartitionValueOp op;

  @JsonProperty("recipient_property_key")
  private String recipientPropertyKey;

  @JsonProperty("value")
  private String value;

  public PartitionValuePb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PartitionValuePb setOp(PartitionValueOp op) {
    this.op = op;
    return this;
  }

  public PartitionValueOp getOp() {
    return op;
  }

  public PartitionValuePb setRecipientPropertyKey(String recipientPropertyKey) {
    this.recipientPropertyKey = recipientPropertyKey;
    return this;
  }

  public String getRecipientPropertyKey() {
    return recipientPropertyKey;
  }

  public PartitionValuePb setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PartitionValuePb that = (PartitionValuePb) o;
    return Objects.equals(name, that.name)
        && Objects.equals(op, that.op)
        && Objects.equals(recipientPropertyKey, that.recipientPropertyKey)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, op, recipientPropertyKey, value);
  }

  @Override
  public String toString() {
    return new ToStringer(PartitionValuePb.class)
        .add("name", name)
        .add("op", op)
        .add("recipientPropertyKey", recipientPropertyKey)
        .add("value", value)
        .toString();
  }
}
