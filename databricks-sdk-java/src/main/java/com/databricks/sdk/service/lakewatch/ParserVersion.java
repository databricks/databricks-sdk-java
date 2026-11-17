// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * One immutable version of a parser, carrying the spec.
 *
 * <p>Immutable: an edit creates a new version rather than mutating an existing one, so a data
 * source that pins a version is never affected. Version numbers are never reused, including after a
 * delete.
 */
@Generated
public class ParserVersion {
  /** When this version was appended. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The principal that appended this version. */
  @JsonProperty("created_by")
  private Principal createdBy;

  /** Free-form description of this version, set when the version is created. */
  @JsonProperty("description")
  private String description;

  /** Resource name. Format: `parsers/{parser_id}/versions/{version}`. */
  @JsonProperty("name")
  private String name;

  /**
   * The parent parser's name, copied from the container on read. Denormalized so a caller that
   * needs identity alongside the spec reads the version alone rather than the container as well.
   * Populated by `GetParserVersion`; List omits it, as List omits `spec`.
   */
  @JsonProperty("parser_name")
  private String parserName;

  /**
   * The field definitions for this log source, as a YAML document. Validated on write, so an
   * invalid spec is never stored.
   */
  @JsonProperty("spec")
  private String spec;

  /** Version number, assigned by the server when the version is appended. */
  @JsonProperty("version")
  private Long version;

  public ParserVersion setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public ParserVersion setCreatedBy(Principal createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public Principal getCreatedBy() {
    return createdBy;
  }

  public ParserVersion setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ParserVersion setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ParserVersion setParserName(String parserName) {
    this.parserName = parserName;
    return this;
  }

  public String getParserName() {
    return parserName;
  }

  public ParserVersion setSpec(String spec) {
    this.spec = spec;
    return this;
  }

  public String getSpec() {
    return spec;
  }

  public ParserVersion setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ParserVersion that = (ParserVersion) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(parserName, that.parserName)
        && Objects.equals(spec, that.spec)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, createdBy, description, name, parserName, spec, version);
  }

  @Override
  public String toString() {
    return new ToStringer(ParserVersion.class)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("description", description)
        .add("name", name)
        .add("parserName", parserName)
        .add("spec", spec)
        .add("version", version)
        .toString();
  }
}
