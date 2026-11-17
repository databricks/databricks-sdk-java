// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * A Databricks-authored parser, shared by every customer.
 *
 * <p>Same container-plus-versions shape as the custom `Parser`, and addressed the same way, by
 * UUID. Built-ins are global rather than catalog-scoped, so they carry no owning catalog or schema.
 */
@Generated
public class BuiltinParser {
  /** Newest published version number. */
  @JsonProperty("latest_version")
  private Long latestVersion;

  /** Resource name. Format: `builtin-parsers/{parser_id}`. */
  @JsonProperty("name")
  private String name;

  /**
   * The parser's UUID, authored into the built-in's published definition rather than minted per
   * customer, so every workspace addresses the same built-in by the same id. It is the leaf of
   * `name`.
   */
  @JsonProperty("parser_id")
  private String parserId;

  /**
   * The built-in's own leaf name, as published in content-marketplace. Stable and human-readable,
   * which is what a UI shows; `name` addresses the resource by id.
   */
  @JsonProperty("parser_name")
  private String parserName;

  /**
   * Key/value tags describing this parser, e.g. `cloud_provider=aws` or `log_source=cloudtrail`. A
   * parser may carry up to 32. Filterable on list.
   */
  @JsonProperty("tags")
  private Collection<ParserTag> tags;

  public BuiltinParser setLatestVersion(Long latestVersion) {
    this.latestVersion = latestVersion;
    return this;
  }

  public Long getLatestVersion() {
    return latestVersion;
  }

  public BuiltinParser setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public BuiltinParser setParserId(String parserId) {
    this.parserId = parserId;
    return this;
  }

  public String getParserId() {
    return parserId;
  }

  public BuiltinParser setParserName(String parserName) {
    this.parserName = parserName;
    return this;
  }

  public String getParserName() {
    return parserName;
  }

  public BuiltinParser setTags(Collection<ParserTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ParserTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BuiltinParser that = (BuiltinParser) o;
    return Objects.equals(latestVersion, that.latestVersion)
        && Objects.equals(name, that.name)
        && Objects.equals(parserId, that.parserId)
        && Objects.equals(parserName, that.parserName)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestVersion, name, parserId, parserName, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(BuiltinParser.class)
        .add("latestVersion", latestVersion)
        .add("name", name)
        .add("parserId", parserId)
        .add("parserName", parserName)
        .add("tags", tags)
        .toString();
  }
}
