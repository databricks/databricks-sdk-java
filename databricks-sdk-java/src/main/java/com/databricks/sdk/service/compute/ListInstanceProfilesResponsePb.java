// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListInstanceProfilesResponsePb {
  @JsonProperty("instance_profiles")
  private Collection<InstanceProfile> instanceProfiles;

  public ListInstanceProfilesResponsePb setInstanceProfiles(
      Collection<InstanceProfile> instanceProfiles) {
    this.instanceProfiles = instanceProfiles;
    return this;
  }

  public Collection<InstanceProfile> getInstanceProfiles() {
    return instanceProfiles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListInstanceProfilesResponsePb that = (ListInstanceProfilesResponsePb) o;
    return Objects.equals(instanceProfiles, that.instanceProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceProfiles);
  }

  @Override
  public String toString() {
    return new ToStringer(ListInstanceProfilesResponsePb.class)
        .add("instanceProfiles", instanceProfiles)
        .toString();
  }
}
