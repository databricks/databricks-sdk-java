// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class ListInstanceProfilesResponse {
  /**
   * A list of instance profiles that the user can access.
   */
  @JsonProperty("instance_profiles")
  private Collection<InstanceProfile> instanceProfiles;
  
  public ListInstanceProfilesResponse setInstanceProfiles(Collection<InstanceProfile> instanceProfiles) {
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
    ListInstanceProfilesResponse that = (ListInstanceProfilesResponse) o;
    return Objects.equals(instanceProfiles, that.instanceProfiles)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceProfiles);
  }

  @Override
  public String toString() {
    return new ToStringer(ListInstanceProfilesResponse.class)
      .add("instanceProfiles", instanceProfiles).toString();
  }
}
