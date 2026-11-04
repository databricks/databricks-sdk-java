// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** MITRE ATT&CK mapping for a detection rule. */
@Generated
public class RuleMitreMapping {
  /** Human-readable MITRE sub-technique name. */
  @JsonProperty("sub_technique")
  private String subTechnique;

  /** MITRE sub-technique ID, such as `T1078.001`. */
  @JsonProperty("sub_technique_id")
  private String subTechniqueId;

  /** Adversary objective during this attack, such as `Command and Control`. */
  @JsonProperty("tactic")
  private String tactic;

  /** Structured framework that organizes adversary behaviors, such as `mitre-attack`. */
  @JsonProperty("taxonomy")
  private String taxonomy;

  /** Human-readable MITRE technique name. */
  @JsonProperty("technique")
  private String technique;

  /** MITRE technique ID, such as `T1078`. */
  @JsonProperty("technique_id")
  private String techniqueId;

  public RuleMitreMapping setSubTechnique(String subTechnique) {
    this.subTechnique = subTechnique;
    return this;
  }

  public String getSubTechnique() {
    return subTechnique;
  }

  public RuleMitreMapping setSubTechniqueId(String subTechniqueId) {
    this.subTechniqueId = subTechniqueId;
    return this;
  }

  public String getSubTechniqueId() {
    return subTechniqueId;
  }

  public RuleMitreMapping setTactic(String tactic) {
    this.tactic = tactic;
    return this;
  }

  public String getTactic() {
    return tactic;
  }

  public RuleMitreMapping setTaxonomy(String taxonomy) {
    this.taxonomy = taxonomy;
    return this;
  }

  public String getTaxonomy() {
    return taxonomy;
  }

  public RuleMitreMapping setTechnique(String technique) {
    this.technique = technique;
    return this;
  }

  public String getTechnique() {
    return technique;
  }

  public RuleMitreMapping setTechniqueId(String techniqueId) {
    this.techniqueId = techniqueId;
    return this;
  }

  public String getTechniqueId() {
    return techniqueId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RuleMitreMapping that = (RuleMitreMapping) o;
    return Objects.equals(subTechnique, that.subTechnique)
        && Objects.equals(subTechniqueId, that.subTechniqueId)
        && Objects.equals(tactic, that.tactic)
        && Objects.equals(taxonomy, that.taxonomy)
        && Objects.equals(technique, that.technique)
        && Objects.equals(techniqueId, that.techniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subTechnique, subTechniqueId, tactic, taxonomy, technique, techniqueId);
  }

  @Override
  public String toString() {
    return new ToStringer(RuleMitreMapping.class)
        .add("subTechnique", subTechnique)
        .add("subTechniqueId", subTechniqueId)
        .add("tactic", tactic)
        .add("taxonomy", taxonomy)
        .add("technique", technique)
        .add("techniqueId", techniqueId)
        .toString();
  }
}
