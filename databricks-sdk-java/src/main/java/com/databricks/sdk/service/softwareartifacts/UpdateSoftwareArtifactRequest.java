// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.softwareartifacts;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateSoftwareArtifactRequest {
  /**
   * Resource name of the artifact, of the form `software-artifacts/{catalog}.{schema}.{artifact}`.
   */
  @JsonIgnore private String name;

  /**
   * The software artifact to update. Its name identifies the existing artifact; only owner may be
   * changed.
   */
  @JsonProperty("software_artifact")
  private SoftwareArtifact softwareArtifact;

  /**
   * Fields to update, relative to `software_artifact`. Accepts `owner` or `*`; owner is the only
   * mutable field, so both select the same update. Output-only values in the resource are ignored.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateSoftwareArtifactRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateSoftwareArtifactRequest setSoftwareArtifact(SoftwareArtifact softwareArtifact) {
    this.softwareArtifact = softwareArtifact;
    return this;
  }

  public SoftwareArtifact getSoftwareArtifact() {
    return softwareArtifact;
  }

  public UpdateSoftwareArtifactRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateSoftwareArtifactRequest that = (UpdateSoftwareArtifactRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(softwareArtifact, that.softwareArtifact)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, softwareArtifact, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSoftwareArtifactRequest.class)
        .add("name", name)
        .add("softwareArtifact", softwareArtifact)
        .add("updateMask", updateMask)
        .toString();
  }
}
