// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ForEachTaskErrorMessageStats {
  /** Describes the count of such error message encountered during the iterations. */
  @JsonProperty("count")
  private Long count;

  /** Describes the error message occured during the iterations. */
  @JsonProperty("error_message")
  private String errorMessage;

  /** Describes the termination reason for the error message. */
  @JsonProperty("termination_category")
  private String terminationCategory;

  public ForEachTaskErrorMessageStats setCount(Long count) {
    this.count = count;
    return this;
  }

  public Long getCount() {
    return count;
  }

  public ForEachTaskErrorMessageStats setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public ForEachTaskErrorMessageStats setTerminationCategory(String terminationCategory) {
    this.terminationCategory = terminationCategory;
    return this;
  }

  public String getTerminationCategory() {
    return terminationCategory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForEachTaskErrorMessageStats that = (ForEachTaskErrorMessageStats) o;
    return Objects.equals(count, that.count)
        && Objects.equals(errorMessage, that.errorMessage)
        && Objects.equals(terminationCategory, that.terminationCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, errorMessage, terminationCategory);
  }

  @Override
  public String toString() {
    return new ToStringer(ForEachTaskErrorMessageStats.class)
        .add("count", count)
        .add("errorMessage", errorMessage)
        .add("terminationCategory", terminationCategory)
        .toString();
  }
}
