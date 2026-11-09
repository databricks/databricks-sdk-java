// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

/** Oldest active source transaction at assessment time. */
@Generated
public class LongTransactionDetails {
  /** Age of the oldest active transaction when assessed. Zero when none is active. */
  @JsonProperty("oldest_transaction_age")
  private Duration oldestTransactionAge;

  public LongTransactionDetails setOldestTransactionAge(Duration oldestTransactionAge) {
    this.oldestTransactionAge = oldestTransactionAge;
    return this;
  }

  public Duration getOldestTransactionAge() {
    return oldestTransactionAge;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LongTransactionDetails that = (LongTransactionDetails) o;
    return Objects.equals(oldestTransactionAge, that.oldestTransactionAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldestTransactionAge);
  }

  @Override
  public String toString() {
    return new ToStringer(LongTransactionDetails.class)
        .add("oldestTransactionAge", oldestTransactionAge)
        .toString();
  }
}
