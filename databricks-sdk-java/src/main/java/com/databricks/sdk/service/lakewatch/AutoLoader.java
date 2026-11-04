// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * Ingests files from cloud storage with Auto Loader. Mutually exclusive with
 * `unity_catalog_connection` and `existing_table`.
 */
@Generated
public class AutoLoader {
  /**
   * Name of the workspace secret scope that holds the AWS access key ID and secret access key,
   * under the keys `awsAccessKeyId` and `awsSecretAccessKey`.
   */
  @JsonProperty("aws_secret_scope")
  private String awsSecretScope;

  /**
   * Whether ingestion started with the files already present at `location`. Populated on get,
   * create, and update responses.
   */
  @JsonProperty("effective_include_existing_files")
  private Boolean effectiveIncludeExistingFiles;

  /**
   * The table that the raw data is written to: `raw_table` in the datasource's catalog and schema,
   * under their current Unity Catalog names. Populated on get, create, and update responses.
   */
  @JsonProperty("effective_raw_table")
  private TableName effectiveRawTable;

  /**
   * How to unwrap a transport envelope around the source records before parsing. Supported only for
   * the JSON and JSONL formats. If unset, each source record is treated as one event.
   */
  @JsonProperty("envelope")
  private Envelope envelope;

  /** File format of the source files. Required. */
  @JsonProperty("format")
  private AutoLoaderFormat format;

  /**
   * Format-specific parsing options, passed to Auto Loader. Supported for the CSV, JSON, JSONL, and
   * XML formats, each of which accepts a fixed set of options. The XML format requires the `rowTag`
   * option.
   */
  @JsonProperty("format_options")
  private Map<String, String> formatOptions;

  /**
   * Whether to ingest the files already present at `location` when ingestion first starts. Set true
   * to ingest the existing files and then every new file. Set false, or leave unset, to ingest only
   * files that arrive after the datasource starts. Defaults to false. Cannot be changed after
   * creation. Reads return the value as supplied; the setting in effect is reported in
   * `effective_include_existing_files`.
   */
  @JsonProperty("include_existing_files")
  private Boolean includeExistingFiles;

  /**
   * URI of the source files: a path in a Unity Catalog volume or external location, or a cloud
   * storage URL such as an Amazon S3 path. Required, including when new files are discovered
   * through `queue_url`. Cannot be changed after creation.
   */
  @JsonProperty("location")
  private String location;

  /**
   * Hive-style partition columns to derive from the source file paths. If unset, no partition
   * columns are derived.
   */
  @JsonProperty("override_partition_columns")
  private Collection<String> overridePartitionColumns;

  /**
   * URL of a customer-managed Amazon SQS queue that receives file-arrival notifications. Set it to
   * discover new files through the queue. If unset, new files are discovered through the file
   * events of the source's Unity Catalog external location when it has them configured, and by
   * directory listing otherwise. Cannot be changed after creation.
   */
  @JsonProperty("queue_url")
  private String queueUrl;

  /**
   * Table that stores the raw data before parsers schematize it. Every Auto Loader datasource
   * writes its raw rows to this table before any parser reads them. The table must be in the
   * datasource's catalog and schema; an omitted `catalog_name` or `schema_name` defaults to them.
   * Cannot be changed after creation. Reads return the value as supplied; the table the data is
   * written to is reported in `effective_raw_table`.
   */
  @JsonProperty("raw_table")
  private TableName rawTable;

  /** Name of the Unity Catalog service credential to use. */
  @JsonProperty("service_credentials")
  private String serviceCredentials;

  public AutoLoader setAwsSecretScope(String awsSecretScope) {
    this.awsSecretScope = awsSecretScope;
    return this;
  }

  public String getAwsSecretScope() {
    return awsSecretScope;
  }

  public AutoLoader setEffectiveIncludeExistingFiles(Boolean effectiveIncludeExistingFiles) {
    this.effectiveIncludeExistingFiles = effectiveIncludeExistingFiles;
    return this;
  }

  public Boolean getEffectiveIncludeExistingFiles() {
    return effectiveIncludeExistingFiles;
  }

  public AutoLoader setEffectiveRawTable(TableName effectiveRawTable) {
    this.effectiveRawTable = effectiveRawTable;
    return this;
  }

  public TableName getEffectiveRawTable() {
    return effectiveRawTable;
  }

  public AutoLoader setEnvelope(Envelope envelope) {
    this.envelope = envelope;
    return this;
  }

  public Envelope getEnvelope() {
    return envelope;
  }

  public AutoLoader setFormat(AutoLoaderFormat format) {
    this.format = format;
    return this;
  }

  public AutoLoaderFormat getFormat() {
    return format;
  }

  public AutoLoader setFormatOptions(Map<String, String> formatOptions) {
    this.formatOptions = formatOptions;
    return this;
  }

  public Map<String, String> getFormatOptions() {
    return formatOptions;
  }

  public AutoLoader setIncludeExistingFiles(Boolean includeExistingFiles) {
    this.includeExistingFiles = includeExistingFiles;
    return this;
  }

  public Boolean getIncludeExistingFiles() {
    return includeExistingFiles;
  }

  public AutoLoader setLocation(String location) {
    this.location = location;
    return this;
  }

  public String getLocation() {
    return location;
  }

  public AutoLoader setOverridePartitionColumns(Collection<String> overridePartitionColumns) {
    this.overridePartitionColumns = overridePartitionColumns;
    return this;
  }

  public Collection<String> getOverridePartitionColumns() {
    return overridePartitionColumns;
  }

  public AutoLoader setQueueUrl(String queueUrl) {
    this.queueUrl = queueUrl;
    return this;
  }

  public String getQueueUrl() {
    return queueUrl;
  }

  public AutoLoader setRawTable(TableName rawTable) {
    this.rawTable = rawTable;
    return this;
  }

  public TableName getRawTable() {
    return rawTable;
  }

  public AutoLoader setServiceCredentials(String serviceCredentials) {
    this.serviceCredentials = serviceCredentials;
    return this;
  }

  public String getServiceCredentials() {
    return serviceCredentials;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AutoLoader that = (AutoLoader) o;
    return Objects.equals(awsSecretScope, that.awsSecretScope)
        && Objects.equals(effectiveIncludeExistingFiles, that.effectiveIncludeExistingFiles)
        && Objects.equals(effectiveRawTable, that.effectiveRawTable)
        && Objects.equals(envelope, that.envelope)
        && Objects.equals(format, that.format)
        && Objects.equals(formatOptions, that.formatOptions)
        && Objects.equals(includeExistingFiles, that.includeExistingFiles)
        && Objects.equals(location, that.location)
        && Objects.equals(overridePartitionColumns, that.overridePartitionColumns)
        && Objects.equals(queueUrl, that.queueUrl)
        && Objects.equals(rawTable, that.rawTable)
        && Objects.equals(serviceCredentials, that.serviceCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsSecretScope,
        effectiveIncludeExistingFiles,
        effectiveRawTable,
        envelope,
        format,
        formatOptions,
        includeExistingFiles,
        location,
        overridePartitionColumns,
        queueUrl,
        rawTable,
        serviceCredentials);
  }

  @Override
  public String toString() {
    return new ToStringer(AutoLoader.class)
        .add("awsSecretScope", awsSecretScope)
        .add("effectiveIncludeExistingFiles", effectiveIncludeExistingFiles)
        .add("effectiveRawTable", effectiveRawTable)
        .add("envelope", envelope)
        .add("format", format)
        .add("formatOptions", formatOptions)
        .add("includeExistingFiles", includeExistingFiles)
        .add("location", location)
        .add("overridePartitionColumns", overridePartitionColumns)
        .add("queueUrl", queueUrl)
        .add("rawTable", rawTable)
        .add("serviceCredentials", serviceCredentials)
        .toString();
  }
}
