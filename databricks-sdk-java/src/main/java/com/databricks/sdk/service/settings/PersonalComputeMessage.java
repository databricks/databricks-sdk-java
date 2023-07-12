// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PersonalComputeMessage {
  /**
   * ON: Grants all users in all workspaces access to the Personal Compute default policy, allowing
   * all users to create single-machine compute resources. DELEGATE: Moves access control for the
   * Personal Compute default policy to individual workspaces and requires a workspace’s users or
   * groups to be added to the ACLs of that workspace’s Personal Compute default policy before they
   * will be able to create compute resources through that policy.
   */
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
