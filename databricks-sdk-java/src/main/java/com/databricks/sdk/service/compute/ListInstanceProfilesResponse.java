// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListInstanceProfilesResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListInstanceProfilesResponse {
  /** A list of instance profiles that the user can access. */
  @JsonProperty("instance_profiles")
  private Collection<InstanceProfile> instanceProfiles;

  /**
   * <p>Setter for the field <code>instanceProfiles</code>.</p>
   *
   * @param instanceProfiles a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.ListInstanceProfilesResponse} object
   */
  public ListInstanceProfilesResponse setInstanceProfiles(
      Collection<InstanceProfile> instanceProfiles) {
    this.instanceProfiles = instanceProfiles;
    return this;
  }

  /**
   * <p>Getter for the field <code>instanceProfiles</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<InstanceProfile> getInstanceProfiles() {
    return instanceProfiles;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListInstanceProfilesResponse that = (ListInstanceProfilesResponse) o;
    return Objects.equals(instanceProfiles, that.instanceProfiles);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(instanceProfiles);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListInstanceProfilesResponse.class)
        .add("instanceProfiles", instanceProfiles)
        .toString();
  }
}
