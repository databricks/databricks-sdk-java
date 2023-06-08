// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PersonalComputeMessage {
  /** TBD */
  @JsonProperty("value")
  private PersonalComputeMessageEnum value;

  public PersonalComputeMessage setValue(PersonalComputeMessageEnum value) {
    this.value = value;
    return this;
  }

  public PersonalComputeMessageEnum getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PersonalComputeMessage that = (PersonalComputeMessage) o;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return new ToStringer(PersonalComputeMessage.class).add("value", value).toString();
  }
}
