// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ValidityCheckConfiguration {
  /** Can be set by system. Does not need to be user facing. */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("percent_null_validity_check")
  private PercentNullValidityCheck percentNullValidityCheck;

  /** */
  @JsonProperty("range_validity_check")
  private RangeValidityCheck rangeValidityCheck;

  /** */
  @JsonProperty("uniqueness_validity_check")
  private UniquenessValidityCheck uniquenessValidityCheck;

  public ValidityCheckConfiguration setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ValidityCheckConfiguration setPercentNullValidityCheck(
      PercentNullValidityCheck percentNullValidityCheck) {
    this.percentNullValidityCheck = percentNullValidityCheck;
    return this;
  }

  public PercentNullValidityCheck getPercentNullValidityCheck() {
    return percentNullValidityCheck;
  }

  public ValidityCheckConfiguration setRangeValidityCheck(RangeValidityCheck rangeValidityCheck) {
    this.rangeValidityCheck = rangeValidityCheck;
    return this;
  }

  public RangeValidityCheck getRangeValidityCheck() {
    return rangeValidityCheck;
  }

  public ValidityCheckConfiguration setUniquenessValidityCheck(
      UniquenessValidityCheck uniquenessValidityCheck) {
    this.uniquenessValidityCheck = uniquenessValidityCheck;
    return this;
  }

  public UniquenessValidityCheck getUniquenessValidityCheck() {
    return uniquenessValidityCheck;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidityCheckConfiguration that = (ValidityCheckConfiguration) o;
    return Objects.equals(name, that.name)
        && Objects.equals(percentNullValidityCheck, that.percentNullValidityCheck)
        && Objects.equals(rangeValidityCheck, that.rangeValidityCheck)
        && Objects.equals(uniquenessValidityCheck, that.uniquenessValidityCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        name, percentNullValidityCheck, rangeValidityCheck, uniquenessValidityCheck);
  }

  @Override
  public String toString() {
    return new ToStringer(ValidityCheckConfiguration.class)
        .add("name", name)
        .add("percentNullValidityCheck", percentNullValidityCheck)
        .add("rangeValidityCheck", rangeValidityCheck)
        .add("uniquenessValidityCheck", uniquenessValidityCheck)
        .toString();
  }
}
