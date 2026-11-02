// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetWorkspaceAccessDetailLocalRequest {
  /**
   * The resource name of the workspace access detail. Format:
   * workspace-access-details/{principal_id}
   */
  @JsonIgnore private String name;

  /** Controls what fields are returned. */
  @JsonIgnore
  @QueryParam("view")
  private WorkspaceAccessDetailView view;

  public GetWorkspaceAccessDetailLocalRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetWorkspaceAccessDetailLocalRequest setView(WorkspaceAccessDetailView view) {
    this.view = view;
    return this;
  }

  public WorkspaceAccessDetailView getView() {
    return view;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetWorkspaceAccessDetailLocalRequest that = (GetWorkspaceAccessDetailLocalRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(view, that.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, view);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceAccessDetailLocalRequest.class)
        .add("name", name)
        .add("view", view)
        .toString();
  }
}
