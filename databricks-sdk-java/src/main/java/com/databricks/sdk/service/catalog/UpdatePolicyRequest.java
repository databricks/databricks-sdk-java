// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdatePolicyRequest {
  /** Required. The name of the policy to update. */
  @JsonIgnore private String name;

  /** Required. The fully qualified name of the securable to update the policy for. */
  @JsonIgnore private String onSecurableFullname;

  /** Required. The type of the securable to update the policy for. */
  @JsonIgnore private String onSecurableType;

  /**
   * Optional fields to update. This is the request body for updating a policy. Use `update_mask`
   * field to specify which fields in the request is to be updated. - If `update_mask` is empty or
   * "*", all specified fields will be updated. - If `update_mask` is specified, only the fields
   * specified in the `update_mask` will be updated. If a field is specified in `update_mask` and
   * not set in the request, the field will be cleared. Users can use the update mask to explicitly
   * unset optional fields such as `exception_principals` and `when_condition`.
   */
  @JsonProperty("policy_info")
  private PolicyInfo policyInfo;

  /**
   * Optional. The update mask field for specifying user intentions on which fields to update in the
   * request.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdatePolicyRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdatePolicyRequest setOnSecurableFullname(String onSecurableFullname) {
    this.onSecurableFullname = onSecurableFullname;
    return this;
  }

  public String getOnSecurableFullname() {
    return onSecurableFullname;
  }

  public UpdatePolicyRequest setOnSecurableType(String onSecurableType) {
    this.onSecurableType = onSecurableType;
    return this;
  }

  public String getOnSecurableType() {
    return onSecurableType;
  }

  public UpdatePolicyRequest setPolicyInfo(PolicyInfo policyInfo) {
    this.policyInfo = policyInfo;
    return this;
  }

  public PolicyInfo getPolicyInfo() {
    return policyInfo;
  }

  public UpdatePolicyRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdatePolicyRequest that = (UpdatePolicyRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(onSecurableFullname, that.onSecurableFullname)
        && Objects.equals(onSecurableType, that.onSecurableType)
        && Objects.equals(policyInfo, that.policyInfo)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, onSecurableFullname, onSecurableType, policyInfo, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePolicyRequest.class)
        .add("name", name)
        .add("onSecurableFullname", onSecurableFullname)
        .add("onSecurableType", onSecurableType)
        .add("policyInfo", policyInfo)
        .add("updateMask", updateMask)
        .toString();
  }
}
