// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentbricks;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateCustomLlmRequest {
  /** The CustomLlm containing the fields which should be updated. */
  @JsonProperty("custom_llm")
  private CustomLlm customLlm;

  /** The id of the custom llm */
  @JsonIgnore private String id;

  /**
   * The list of the CustomLlm fields to update. These should correspond to the values (or lack
   * thereof) present in `custom_llm`.
   *
   * <p>The field mask must be a single string, with multiple fields separated by commas (no
   * spaces). The field path is relative to the resource object, using a dot (`.`) to navigate
   * sub-fields (e.g., `author.given_name`). Specification of elements in sequence or map fields is
   * not allowed, as only the entire collection field can be specified. Field names must exactly
   * match the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
   */
  @JsonProperty("update_mask")
  private String updateMask;

  public UpdateCustomLlmRequest setCustomLlm(CustomLlm customLlm) {
    this.customLlm = customLlm;
    return this;
  }

  public CustomLlm getCustomLlm() {
    return customLlm;
  }

  public UpdateCustomLlmRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateCustomLlmRequest setUpdateMask(String updateMask) {
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
    UpdateCustomLlmRequest that = (UpdateCustomLlmRequest) o;
    return Objects.equals(customLlm, that.customLlm)
        && Objects.equals(id, that.id)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customLlm, id, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCustomLlmRequest.class)
        .add("customLlm", customLlm)
        .add("id", id)
        .add("updateMask", updateMask)
        .toString();
  }
}
