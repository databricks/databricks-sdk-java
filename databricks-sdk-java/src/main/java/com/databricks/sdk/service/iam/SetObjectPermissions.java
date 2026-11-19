// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SetObjectPermissions {
  /**
   * Permissions to apply to the object, with one entry per principal. Each entry names exactly one
   * principal through `user_name`, `group_name` or `service_principal_name` and the
   * `permission_level` for that principal.
   */
  @JsonProperty("access_control_list")
  private Collection<AccessControlRequest> accessControlList;

  /**
   * The id of the object. It is the id that the object's own API uses, for example the cluster id
   * for clusters, the job id for jobs, and the workspace object id for notebooks and directories.
   * For the `authorization` object type, use `tokens` to manage token permissions.
   */
  @JsonIgnore private String requestObjectId;

  /**
   * The type of the request object. Can be one of the following: alerts, alertsv2, authorization,
   * clusters, cluster-policies, dashboards, database-projects, dbsql-dashboards, directories,
   * experiments, files, genie, instance-pools, jobs, knowledge-assistants, notebooks, pipelines,
   * queries, registered-models, repos, serving-endpoints, supervisor-agents,
   * vector-search-endpoints, or warehouses.
   */
  @JsonIgnore private String requestObjectType;

  public SetObjectPermissions setAccessControlList(
      Collection<AccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<AccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public SetObjectPermissions setRequestObjectId(String requestObjectId) {
    this.requestObjectId = requestObjectId;
    return this;
  }

  public String getRequestObjectId() {
    return requestObjectId;
  }

  public SetObjectPermissions setRequestObjectType(String requestObjectType) {
    this.requestObjectType = requestObjectType;
    return this;
  }

  public String getRequestObjectType() {
    return requestObjectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SetObjectPermissions that = (SetObjectPermissions) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(requestObjectId, that.requestObjectId)
        && Objects.equals(requestObjectType, that.requestObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, requestObjectId, requestObjectType);
  }

  @Override
  public String toString() {
    return new ToStringer(SetObjectPermissions.class)
        .add("accessControlList", accessControlList)
        .add("requestObjectId", requestObjectId)
        .add("requestObjectType", requestObjectType)
        .toString();
  }
}
