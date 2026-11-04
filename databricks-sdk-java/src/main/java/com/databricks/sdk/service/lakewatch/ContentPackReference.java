// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Reference to the ContentPack (and pack version) a resource was originally installed from. */
@Generated
public class ContentPackReference {
  /** UUID of the content pack. */
  @JsonProperty("uuid")
  private String uuid;

  /** Pack version the resource was installed from. */
  @JsonProperty("version")
  private String version;

  public ContentPackReference setUuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  public String getUuid() {
    return uuid;
  }

  public ContentPackReference setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContentPackReference that = (ContentPackReference) o;
    return Objects.equals(uuid, that.uuid) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, version);
  }

  @Override
  public String toString() {
    return new ToStringer(ContentPackReference.class)
        .add("uuid", uuid)
        .add("version", version)
        .toString();
  }
}
