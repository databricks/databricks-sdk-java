// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class PartitionValue {
  /** The name of the partition column. */
  @JsonProperty("name")
  private String name;

  /** The operator to apply for the value. */
  @JsonProperty("op")
  private PartitionValueOp op;

  /**
   * The key of a Delta Sharing recipient's property. For example `databricks-account-id`. When this
   * field is set, field `value` can not be set.
   */
  @JsonProperty("recipient_property_key")
  private String recipientPropertyKey;

  /**
   * The value of the partition column. When this value is not set, it means `null` value. When this
   * field is set, field `recipient_property_key` can not be set.
   */
  @JsonProperty("value")
  private String value;

  public PartitionValue setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PartitionValue setOp(PartitionValueOp op) {
    this.op = op;
    return this;
  }

  public PartitionValueOp getOp() {
    return op;
  }

  public PartitionValue setRecipientPropertyKey(String recipientPropertyKey) {
    this.recipientPropertyKey = recipientPropertyKey;
    return this;
  }

  public String getRecipientPropertyKey() {
    return recipientPropertyKey;
  }

  public PartitionValue setValue(String value) {
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
    PartitionValue that = (PartitionValue) o;
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
    return new ToStringer(PartitionValue.class)
        .add("name", name)
        .add("op", op)
        .add("recipientPropertyKey", recipientPropertyKey)
        .add("value", value)
        .toString();
  }
}
