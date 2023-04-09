// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** List all clusters */
public class List {
  /**
   * Filter clusters based on what type of client it can be used for. Could be either NOTEBOOKS or
   * JOBS. No input for this field will get all clusters in the workspace without filtering on its
   * supported client
   */
  @QueryParam("can_use_client")
  private String canUseClient;

  public List setCanUseClient(String canUseClient) {
    this.canUseClient = canUseClient;
    return this;
  }

  public String getCanUseClient() {
    return canUseClient;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    List that = (List) o;
    return Objects.equals(canUseClient, that.canUseClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canUseClient);
  }

  @Override
  public String toString() {
    return new ToStringer(List.class).add("canUseClient", canUseClient).toString();
  }
}
