// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * A customer-authored, versioned contract describing the fields of an ingested log source.
 *
 * <p>The parser is a container: it carries the identity and a pointer to the newest version. Specs
 * live on the immutable `ParserVersion` children, so one parser can be attached to many data
 * sources and each attachment pins a version.
 */
@Generated
public class Parser {
  /**
   * Name of the parent UC catalog, set on create. Reads return the value as supplied; the current
   * UC catalog name is reported in `effective_catalog_name`.
   */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** When the parser was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The principal that created this parser. Each version records its own `created_by`. */
  @JsonProperty("created_by")
  private Principal createdBy;

  /**
   * Description of version 1. Accepted only by `CreateParser`; read a version's description with
   * `GetParserVersion`.
   */
  @JsonProperty("description")
  private String description;

  /**
   * The current name of the parser's UC catalog. Tracks UC renames; when the current name cannot be
   * looked up, the name as of the parser's last write.
   */
  @JsonProperty("effective_catalog_name")
  private String effectiveCatalogName;

  /**
   * The current name of the parser's UC schema. Tracks UC renames; when the current name cannot be
   * looked up, the name as of the parser's last write.
   */
  @JsonProperty("effective_schema_name")
  private String effectiveSchemaName;

  /**
   * Newest version of this parser. Read its spec by passing this to `GetParserVersion`, or by using
   * the `latest` alias. Absent when every version has been deleted.
   */
  @JsonProperty("latest_version")
  private Long latestVersion;

  /**
   * Resource name. Format: `parsers/{parser_id}`, where the leaf is the immutable server-assigned
   * UUID. Create-time placement names are stored separately and do not affect the resource name.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The principal that owns this parser. Server-set from the authenticated creator, never supplied
   * by the client. Beta reads by UUID perform no authorization. Owner-gated write RPCs are outside
   * this API's current implementation scope.
   */
  @JsonProperty("owner")
  private Principal owner;

  /**
   * The parser's server-assigned UUID. It is not currently a UC securable ID, is immutable for the
   * life of the resource, is the leaf of `name`, and is returned by CreateParser.
   */
  @JsonProperty("parser_id")
  private String parserId;

  /**
   * Client-supplied parser name, stored as supplied and fixed at create time. Must be a valid UC
   * identifier. A custom parser is not currently a UC securable and this field has no rename path.
   */
  @JsonProperty("parser_name")
  private String parserName;

  /**
   * Name of the parent UC schema, set on create. Reads return the value as supplied; the current UC
   * schema name is reported in `effective_schema_name`.
   */
  @JsonProperty("schema_name")
  private String schemaName;

  /**
   * Spec of version 1, as a YAML document. Accepted only by `CreateParser`; read a version's spec
   * with `GetParserVersion`.
   */
  @JsonProperty("spec")
  private String spec;

  public Parser setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public Parser setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Parser setCreatedBy(Principal createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public Principal getCreatedBy() {
    return createdBy;
  }

  public Parser setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Parser setEffectiveCatalogName(String effectiveCatalogName) {
    this.effectiveCatalogName = effectiveCatalogName;
    return this;
  }

  public String getEffectiveCatalogName() {
    return effectiveCatalogName;
  }

  public Parser setEffectiveSchemaName(String effectiveSchemaName) {
    this.effectiveSchemaName = effectiveSchemaName;
    return this;
  }

  public String getEffectiveSchemaName() {
    return effectiveSchemaName;
  }

  public Parser setLatestVersion(Long latestVersion) {
    this.latestVersion = latestVersion;
    return this;
  }

  public Long getLatestVersion() {
    return latestVersion;
  }

  public Parser setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Parser setOwner(Principal owner) {
    this.owner = owner;
    return this;
  }

  public Principal getOwner() {
    return owner;
  }

  public Parser setParserId(String parserId) {
    this.parserId = parserId;
    return this;
  }

  public String getParserId() {
    return parserId;
  }

  public Parser setParserName(String parserName) {
    this.parserName = parserName;
    return this;
  }

  public String getParserName() {
    return parserName;
  }

  public Parser setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public Parser setSpec(String spec) {
    this.spec = spec;
    return this;
  }

  public String getSpec() {
    return spec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Parser that = (Parser) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(description, that.description)
        && Objects.equals(effectiveCatalogName, that.effectiveCatalogName)
        && Objects.equals(effectiveSchemaName, that.effectiveSchemaName)
        && Objects.equals(latestVersion, that.latestVersion)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(parserId, that.parserId)
        && Objects.equals(parserName, that.parserName)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(spec, that.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        catalogName,
        createTime,
        createdBy,
        description,
        effectiveCatalogName,
        effectiveSchemaName,
        latestVersion,
        name,
        owner,
        parserId,
        parserName,
        schemaName,
        spec);
  }

  @Override
  public String toString() {
    return new ToStringer(Parser.class)
        .add("catalogName", catalogName)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("description", description)
        .add("effectiveCatalogName", effectiveCatalogName)
        .add("effectiveSchemaName", effectiveSchemaName)
        .add("latestVersion", latestVersion)
        .add("name", name)
        .add("owner", owner)
        .add("parserId", parserId)
        .add("parserName", parserName)
        .add("schemaName", schemaName)
        .add("spec", spec)
        .toString();
  }
}
