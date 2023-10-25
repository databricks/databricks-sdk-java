// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DeployAppRequest {
  /** Manifest that specifies the application requirements */
  @JsonProperty("manifest")
  private AppManifest manifest;

  /** Information passed at app deployment time to fulfill app dependencies */
  @JsonProperty("resources")
  private Object resources;

  public DeployAppRequest setManifest(AppManifest manifest) {
    this.manifest = manifest;
    return this;
  }

  public AppManifest getManifest() {
    return manifest;
  }

  public DeployAppRequest setResources(Object resources) {
    this.resources = resources;
    return this;
  }

  public Object getResources() {
    return resources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeployAppRequest that = (DeployAppRequest) o;
    return Objects.equals(manifest, that.manifest) && Objects.equals(resources, that.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifest, resources);
  }

  @Override
  public String toString() {
    return new ToStringer(DeployAppRequest.class)
        .add("manifest", manifest)
        .add("resources", resources)
        .toString();
  }
}
