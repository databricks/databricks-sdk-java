// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Adlsgen2Info {
  /**
   * abfss destination, e.g.
   * `abfss://<container-name>@<storage-account-name>.dfs.core.windows.net/<directory-name>`.
   */
  @JsonProperty("destination")
  private String destination;

  public Adlsgen2Info setDestination(String destination) {
    this.destination = destination;
    return this;
  }

  public String getDestination() {
    return destination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Adlsgen2Info that = (Adlsgen2Info) o;
    return Objects.equals(destination, that.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination);
  }

  @Override
  public String toString() {
    return new ToStringer(Adlsgen2Info.class).add("destination", destination).toString();
  }
}
