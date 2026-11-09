// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Measurements observed when an assessment check ran. Unset for older assessments. */
@Generated
public class AssessmentCheckDetails {
  /** Output-only. Physical size of the source database observed by this check. */
  @JsonProperty("database_size")
  private DatabaseSizeDetails databaseSize;

  /** Output-only. Age of the oldest source transaction observed by this check. */
  @JsonProperty("long_transaction")
  private LongTransactionDetails longTransaction;

  public AssessmentCheckDetails setDatabaseSize(DatabaseSizeDetails databaseSize) {
    this.databaseSize = databaseSize;
    return this;
  }

  public DatabaseSizeDetails getDatabaseSize() {
    return databaseSize;
  }

  public AssessmentCheckDetails setLongTransaction(LongTransactionDetails longTransaction) {
    this.longTransaction = longTransaction;
    return this;
  }

  public LongTransactionDetails getLongTransaction() {
    return longTransaction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AssessmentCheckDetails that = (AssessmentCheckDetails) o;
    return Objects.equals(databaseSize, that.databaseSize)
        && Objects.equals(longTransaction, that.longTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseSize, longTransaction);
  }

  @Override
  public String toString() {
    return new ToStringer(AssessmentCheckDetails.class)
        .add("databaseSize", databaseSize)
        .add("longTransaction", longTransaction)
        .toString();
  }
}
