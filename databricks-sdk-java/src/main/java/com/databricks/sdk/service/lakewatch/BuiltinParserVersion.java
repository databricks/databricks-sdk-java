// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * One published version of a built-in parser, carrying the spec.
 *
 * <p>The content pipeline owns versioning, so unlike the custom version there is no authoring
 * principal and no append timestamp here.
 */
@Generated
public class BuiltinParserVersion {
  /** Free-form description of this parser, authored by Databricks. */
  @JsonProperty("description")
  private String description;

  /** Resource name. Format: `builtin-parsers/{parser_id}/versions/{version}`. */
  @JsonProperty("name")
  private String name;

  /**
   * The parent built-in's published leaf name, copied from the container on read. Denormalized so a
   * caller that needs identity alongside the spec reads the version alone rather than the container
   * as well. Populated by `GetBuiltinParserVersion`; List omits it, as List omits `spec`.
   */
  @JsonProperty("parser_name")
  private String parserName;

  /**
   * The parser spec: the field definitions for this log source, as a YAML document. Read-only;
   * built-in specs are authored by Databricks, so no client-facing size cap is enforced here.
   */
  @JsonProperty("spec")
  private String spec;

  /**
   * The parent built-in's tags, copied from the container on read. Rendering reads these for
   * connector-specific details, such as the source table a Lakeflow Connect parser reads.
   */
  @JsonProperty("tags")
  private Collection<ParserTag> tags;

  /** Version number. */
  @JsonProperty("version")
  private Long version;

  public BuiltinParserVersion setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public BuiltinParserVersion setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public BuiltinParserVersion setParserName(String parserName) {
    this.parserName = parserName;
    return this;
  }

  public String getParserName() {
    return parserName;
  }

  public BuiltinParserVersion setSpec(String spec) {
    this.spec = spec;
    return this;
  }

  public String getSpec() {
    return spec;
  }

  public BuiltinParserVersion setTags(Collection<ParserTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ParserTag> getTags() {
    return tags;
  }

  public BuiltinParserVersion setVersion(Long version) {
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
    BuiltinParserVersion that = (BuiltinParserVersion) o;
    return Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(parserName, that.parserName)
        && Objects.equals(spec, that.spec)
        && Objects.equals(tags, that.tags)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, parserName, spec, tags, version);
  }

  @Override
  public String toString() {
    return new ToStringer(BuiltinParserVersion.class)
        .add("description", description)
        .add("name", name)
        .add("parserName", parserName)
        .add("spec", spec)
        .add("tags", tags)
        .add("version", version)
        .toString();
  }
}
