// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class UpdateWorkspaceBindingsParametersPb {
  @JsonProperty("add")
  private Collection<WorkspaceBinding> add;

  @JsonProperty("remove")
  private Collection<WorkspaceBinding> remove;

  @JsonIgnore private String securableName;

  @JsonIgnore private String securableType;

  public UpdateWorkspaceBindingsParametersPb setAdd(Collection<WorkspaceBinding> add) {
    this.add = add;
    return this;
  }

  public Collection<WorkspaceBinding> getAdd() {
    return add;
  }

  public UpdateWorkspaceBindingsParametersPb setRemove(Collection<WorkspaceBinding> remove) {
    this.remove = remove;
    return this;
  }

  public Collection<WorkspaceBinding> getRemove() {
    return remove;
  }

  public UpdateWorkspaceBindingsParametersPb setSecurableName(String securableName) {
    this.securableName = securableName;
    return this;
  }

  public String getSecurableName() {
    return securableName;
  }

  public UpdateWorkspaceBindingsParametersPb setSecurableType(String securableType) {
    this.securableType = securableType;
    return this;
  }

  public String getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateWorkspaceBindingsParametersPb that = (UpdateWorkspaceBindingsParametersPb) o;
    return Objects.equals(add, that.add)
        && Objects.equals(remove, that.remove)
        && Objects.equals(securableName, that.securableName)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, remove, securableName, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceBindingsParametersPb.class)
        .add("add", add)
        .add("remove", remove)
        .add("securableName", securableName)
        .add("securableType", securableType)
        .toString();
  }
}
