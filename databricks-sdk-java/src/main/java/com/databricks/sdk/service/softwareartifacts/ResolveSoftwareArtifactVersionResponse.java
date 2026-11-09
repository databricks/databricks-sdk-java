// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.softwareartifacts;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Response containing the resolved software artifact version. */
@Generated
public class ResolveSoftwareArtifactVersionResponse {
  /** The software artifact version selected by the alias. */
  @JsonProperty("software_artifact_version")
  private SoftwareArtifactVersion softwareArtifactVersion;

  public ResolveSoftwareArtifactVersionResponse setSoftwareArtifactVersion(
      SoftwareArtifactVersion softwareArtifactVersion) {
    this.softwareArtifactVersion = softwareArtifactVersion;
    return this;
  }

  public SoftwareArtifactVersion getSoftwareArtifactVersion() {
    return softwareArtifactVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolveSoftwareArtifactVersionResponse that = (ResolveSoftwareArtifactVersionResponse) o;
    return Objects.equals(softwareArtifactVersion, that.softwareArtifactVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(softwareArtifactVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolveSoftwareArtifactVersionResponse.class)
        .add("softwareArtifactVersion", softwareArtifactVersion)
        .toString();
  }
}
