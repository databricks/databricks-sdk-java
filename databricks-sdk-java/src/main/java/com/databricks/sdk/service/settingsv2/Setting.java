// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Setting {
  /**
   * Setting value for aibi_dashboard_embedding_access_policy setting. This is the setting value set
   * by consumers, check effective_aibi_dashboard_embedding_access_policy for final setting value.
   */
  @JsonProperty("aibi_dashboard_embedding_access_policy")
  private AibiDashboardEmbeddingAccessPolicy aibiDashboardEmbeddingAccessPolicy;

  /**
   * Setting value for aibi_dashboard_embedding_approved_domains setting. This is the setting value
   * set by consumers, check effective_aibi_dashboard_embedding_approved_domains for final setting
   * value.
   */
  @JsonProperty("aibi_dashboard_embedding_approved_domains")
  private AibiDashboardEmbeddingApprovedDomains aibiDashboardEmbeddingApprovedDomains;

  /**
   * Setting value for automatic_cluster_update_workspace setting. This is the setting value set by
   * consumers, check effective_automatic_cluster_update_workspace for final setting value.
   */
  @JsonProperty("automatic_cluster_update_workspace")
  private ClusterAutoRestartMessage automaticClusterUpdateWorkspace;

  /**
   * Setting value for boolean type setting. This is the setting value set by consumers, check
   * effective_boolean_val for final setting value.
   */
  @JsonProperty("boolean_val")
  private BooleanMessage booleanVal;

  /**
   * Effective setting value for aibi_dashboard_embedding_access_policy setting. This is the final
   * effective value of setting. To set a value use aibi_dashboard_embedding_access_policy.
   */
  @JsonProperty("effective_aibi_dashboard_embedding_access_policy")
  private AibiDashboardEmbeddingAccessPolicy effectiveAibiDashboardEmbeddingAccessPolicy;

  /**
   * Effective setting value for aibi_dashboard_embedding_approved_domains setting. This is the
   * final effective value of setting. To set a value use aibi_dashboard_embedding_approved_domains.
   */
  @JsonProperty("effective_aibi_dashboard_embedding_approved_domains")
  private AibiDashboardEmbeddingApprovedDomains effectiveAibiDashboardEmbeddingApprovedDomains;

  /**
   * Effective setting value for automatic_cluster_update_workspace setting. This is the final
   * effective value of setting. To set a value use automatic_cluster_update_workspace.
   */
  @JsonProperty("effective_automatic_cluster_update_workspace")
  private ClusterAutoRestartMessage effectiveAutomaticClusterUpdateWorkspace;

  /**
   * Effective setting value for boolean type setting. This is the final effective value of setting.
   * To set a value use boolean_val.
   */
  @JsonProperty("effective_boolean_val")
  private BooleanMessage effectiveBooleanVal;

  /**
   * Effective setting value for integer type setting. This is the final effective value of setting.
   * To set a value use integer_val.
   */
  @JsonProperty("effective_integer_val")
  private IntegerMessage effectiveIntegerVal;

  /**
   * Effective setting value for personal_compute setting. This is the final effective value of
   * setting. To set a value use personal_compute.
   */
  @JsonProperty("effective_personal_compute")
  private PersonalComputeMessage effectivePersonalCompute;

  /**
   * Effective setting value for restrict_workspace_admins setting. This is the final effective
   * value of setting. To set a value use restrict_workspace_admins.
   */
  @JsonProperty("effective_restrict_workspace_admins")
  private RestrictWorkspaceAdminsMessage effectiveRestrictWorkspaceAdmins;

  /**
   * Effective setting value for string type setting. This is the final effective value of setting.
   * To set a value use string_val.
   */
  @JsonProperty("effective_string_val")
  private StringMessage effectiveStringVal;

  /**
   * Setting value for integer type setting. This is the setting value set by consumers, check
   * effective_integer_val for final setting value.
   */
  @JsonProperty("integer_val")
  private IntegerMessage integerVal;

  /** Name of the setting. */
  @JsonProperty("name")
  private String name;

  /**
   * Setting value for personal_compute setting. This is the setting value set by consumers, check
   * effective_personal_compute for final setting value.
   */
  @JsonProperty("personal_compute")
  private PersonalComputeMessage personalCompute;

  /**
   * Setting value for restrict_workspace_admins setting. This is the setting value set by
   * consumers, check effective_restrict_workspace_admins for final setting value.
   */
  @JsonProperty("restrict_workspace_admins")
  private RestrictWorkspaceAdminsMessage restrictWorkspaceAdmins;

  /**
   * Setting value for string type setting. This is the setting value set by consumers, check
   * effective_string_val for final setting value.
   */
  @JsonProperty("string_val")
  private StringMessage stringVal;

  public Setting setAibiDashboardEmbeddingAccessPolicy(
      AibiDashboardEmbeddingAccessPolicy aibiDashboardEmbeddingAccessPolicy) {
    this.aibiDashboardEmbeddingAccessPolicy = aibiDashboardEmbeddingAccessPolicy;
    return this;
  }

  public AibiDashboardEmbeddingAccessPolicy getAibiDashboardEmbeddingAccessPolicy() {
    return aibiDashboardEmbeddingAccessPolicy;
  }

  public Setting setAibiDashboardEmbeddingApprovedDomains(
      AibiDashboardEmbeddingApprovedDomains aibiDashboardEmbeddingApprovedDomains) {
    this.aibiDashboardEmbeddingApprovedDomains = aibiDashboardEmbeddingApprovedDomains;
    return this;
  }

  public AibiDashboardEmbeddingApprovedDomains getAibiDashboardEmbeddingApprovedDomains() {
    return aibiDashboardEmbeddingApprovedDomains;
  }

  public Setting setAutomaticClusterUpdateWorkspace(
      ClusterAutoRestartMessage automaticClusterUpdateWorkspace) {
    this.automaticClusterUpdateWorkspace = automaticClusterUpdateWorkspace;
    return this;
  }

  public ClusterAutoRestartMessage getAutomaticClusterUpdateWorkspace() {
    return automaticClusterUpdateWorkspace;
  }

  public Setting setBooleanVal(BooleanMessage booleanVal) {
    this.booleanVal = booleanVal;
    return this;
  }

  public BooleanMessage getBooleanVal() {
    return booleanVal;
  }

  public Setting setEffectiveAibiDashboardEmbeddingAccessPolicy(
      AibiDashboardEmbeddingAccessPolicy effectiveAibiDashboardEmbeddingAccessPolicy) {
    this.effectiveAibiDashboardEmbeddingAccessPolicy = effectiveAibiDashboardEmbeddingAccessPolicy;
    return this;
  }

  public AibiDashboardEmbeddingAccessPolicy getEffectiveAibiDashboardEmbeddingAccessPolicy() {
    return effectiveAibiDashboardEmbeddingAccessPolicy;
  }

  public Setting setEffectiveAibiDashboardEmbeddingApprovedDomains(
      AibiDashboardEmbeddingApprovedDomains effectiveAibiDashboardEmbeddingApprovedDomains) {
    this.effectiveAibiDashboardEmbeddingApprovedDomains =
        effectiveAibiDashboardEmbeddingApprovedDomains;
    return this;
  }

  public AibiDashboardEmbeddingApprovedDomains getEffectiveAibiDashboardEmbeddingApprovedDomains() {
    return effectiveAibiDashboardEmbeddingApprovedDomains;
  }

  public Setting setEffectiveAutomaticClusterUpdateWorkspace(
      ClusterAutoRestartMessage effectiveAutomaticClusterUpdateWorkspace) {
    this.effectiveAutomaticClusterUpdateWorkspace = effectiveAutomaticClusterUpdateWorkspace;
    return this;
  }

  public ClusterAutoRestartMessage getEffectiveAutomaticClusterUpdateWorkspace() {
    return effectiveAutomaticClusterUpdateWorkspace;
  }

  public Setting setEffectiveBooleanVal(BooleanMessage effectiveBooleanVal) {
    this.effectiveBooleanVal = effectiveBooleanVal;
    return this;
  }

  public BooleanMessage getEffectiveBooleanVal() {
    return effectiveBooleanVal;
  }

  public Setting setEffectiveIntegerVal(IntegerMessage effectiveIntegerVal) {
    this.effectiveIntegerVal = effectiveIntegerVal;
    return this;
  }

  public IntegerMessage getEffectiveIntegerVal() {
    return effectiveIntegerVal;
  }

  public Setting setEffectivePersonalCompute(PersonalComputeMessage effectivePersonalCompute) {
    this.effectivePersonalCompute = effectivePersonalCompute;
    return this;
  }

  public PersonalComputeMessage getEffectivePersonalCompute() {
    return effectivePersonalCompute;
  }

  public Setting setEffectiveRestrictWorkspaceAdmins(
      RestrictWorkspaceAdminsMessage effectiveRestrictWorkspaceAdmins) {
    this.effectiveRestrictWorkspaceAdmins = effectiveRestrictWorkspaceAdmins;
    return this;
  }

  public RestrictWorkspaceAdminsMessage getEffectiveRestrictWorkspaceAdmins() {
    return effectiveRestrictWorkspaceAdmins;
  }

  public Setting setEffectiveStringVal(StringMessage effectiveStringVal) {
    this.effectiveStringVal = effectiveStringVal;
    return this;
  }

  public StringMessage getEffectiveStringVal() {
    return effectiveStringVal;
  }

  public Setting setIntegerVal(IntegerMessage integerVal) {
    this.integerVal = integerVal;
    return this;
  }

  public IntegerMessage getIntegerVal() {
    return integerVal;
  }

  public Setting setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Setting setPersonalCompute(PersonalComputeMessage personalCompute) {
    this.personalCompute = personalCompute;
    return this;
  }

  public PersonalComputeMessage getPersonalCompute() {
    return personalCompute;
  }

  public Setting setRestrictWorkspaceAdmins(
      RestrictWorkspaceAdminsMessage restrictWorkspaceAdmins) {
    this.restrictWorkspaceAdmins = restrictWorkspaceAdmins;
    return this;
  }

  public RestrictWorkspaceAdminsMessage getRestrictWorkspaceAdmins() {
    return restrictWorkspaceAdmins;
  }

  public Setting setStringVal(StringMessage stringVal) {
    this.stringVal = stringVal;
    return this;
  }

  public StringMessage getStringVal() {
    return stringVal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Setting that = (Setting) o;
    return Objects.equals(
            aibiDashboardEmbeddingAccessPolicy, that.aibiDashboardEmbeddingAccessPolicy)
        && Objects.equals(
            aibiDashboardEmbeddingApprovedDomains, that.aibiDashboardEmbeddingApprovedDomains)
        && Objects.equals(automaticClusterUpdateWorkspace, that.automaticClusterUpdateWorkspace)
        && Objects.equals(booleanVal, that.booleanVal)
        && Objects.equals(
            effectiveAibiDashboardEmbeddingAccessPolicy,
            that.effectiveAibiDashboardEmbeddingAccessPolicy)
        && Objects.equals(
            effectiveAibiDashboardEmbeddingApprovedDomains,
            that.effectiveAibiDashboardEmbeddingApprovedDomains)
        && Objects.equals(
            effectiveAutomaticClusterUpdateWorkspace, that.effectiveAutomaticClusterUpdateWorkspace)
        && Objects.equals(effectiveBooleanVal, that.effectiveBooleanVal)
        && Objects.equals(effectiveIntegerVal, that.effectiveIntegerVal)
        && Objects.equals(effectivePersonalCompute, that.effectivePersonalCompute)
        && Objects.equals(effectiveRestrictWorkspaceAdmins, that.effectiveRestrictWorkspaceAdmins)
        && Objects.equals(effectiveStringVal, that.effectiveStringVal)
        && Objects.equals(integerVal, that.integerVal)
        && Objects.equals(name, that.name)
        && Objects.equals(personalCompute, that.personalCompute)
        && Objects.equals(restrictWorkspaceAdmins, that.restrictWorkspaceAdmins)
        && Objects.equals(stringVal, that.stringVal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aibiDashboardEmbeddingAccessPolicy,
        aibiDashboardEmbeddingApprovedDomains,
        automaticClusterUpdateWorkspace,
        booleanVal,
        effectiveAibiDashboardEmbeddingAccessPolicy,
        effectiveAibiDashboardEmbeddingApprovedDomains,
        effectiveAutomaticClusterUpdateWorkspace,
        effectiveBooleanVal,
        effectiveIntegerVal,
        effectivePersonalCompute,
        effectiveRestrictWorkspaceAdmins,
        effectiveStringVal,
        integerVal,
        name,
        personalCompute,
        restrictWorkspaceAdmins,
        stringVal);
  }

  @Override
  public String toString() {
    return new ToStringer(Setting.class)
        .add("aibiDashboardEmbeddingAccessPolicy", aibiDashboardEmbeddingAccessPolicy)
        .add("aibiDashboardEmbeddingApprovedDomains", aibiDashboardEmbeddingApprovedDomains)
        .add("automaticClusterUpdateWorkspace", automaticClusterUpdateWorkspace)
        .add("booleanVal", booleanVal)
        .add(
            "effectiveAibiDashboardEmbeddingAccessPolicy",
            effectiveAibiDashboardEmbeddingAccessPolicy)
        .add(
            "effectiveAibiDashboardEmbeddingApprovedDomains",
            effectiveAibiDashboardEmbeddingApprovedDomains)
        .add("effectiveAutomaticClusterUpdateWorkspace", effectiveAutomaticClusterUpdateWorkspace)
        .add("effectiveBooleanVal", effectiveBooleanVal)
        .add("effectiveIntegerVal", effectiveIntegerVal)
        .add("effectivePersonalCompute", effectivePersonalCompute)
        .add("effectiveRestrictWorkspaceAdmins", effectiveRestrictWorkspaceAdmins)
        .add("effectiveStringVal", effectiveStringVal)
        .add("integerVal", integerVal)
        .add("name", name)
        .add("personalCompute", personalCompute)
        .add("restrictWorkspaceAdmins", restrictWorkspaceAdmins)
        .add("stringVal", stringVal)
        .toString();
  }
}
