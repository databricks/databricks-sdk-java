// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class FileIngestionOptions {
  /** */
  @JsonProperty("corrupt_record_column")
  private String corruptRecordColumn;

  /** Generic options */
  @JsonProperty("file_filters")
  private Collection<FileFilter> fileFilters;

  /** required for TableSpec */
  @JsonProperty("format")
  private FileIngestionOptionsFileFormat format;

  /**
   * Format-specific options Based on
   * https://docs.databricks.com/aws/en/ingestion/cloud-object-storage/auto-loader/options#file-format-options
   */
  @JsonProperty("format_options")
  private Map<String, String> formatOptions;

  /** */
  @JsonProperty("ignore_corrupt_files")
  private Boolean ignoreCorruptFiles;

  /** */
  @JsonProperty("infer_column_types")
  private Boolean inferColumnTypes;

  /**
   * Column name case sensitivity
   * https://docs.databricks.com/aws/en/ingestion/cloud-object-storage/auto-loader/schema#change-case-sensitive-behavior
   */
  @JsonProperty("reader_case_sensitive")
  private Boolean readerCaseSensitive;

  /** */
  @JsonProperty("rescued_data_column")
  private String rescuedDataColumn;

  /** */
  @JsonProperty("schema_evolution_mode")
  private FileIngestionOptionsSchemaEvolutionMode schemaEvolutionMode;

  /**
   * Override inferred schema of specific columns Based on
   * https://docs.databricks.com/aws/en/ingestion/cloud-object-storage/auto-loader/schema#override-schema-inference-with-schema-hints
   */
  @JsonProperty("schema_hints")
  private String schemaHints;

  /** */
  @JsonProperty("single_variant_column")
  private String singleVariantColumn;

  public FileIngestionOptions setCorruptRecordColumn(String corruptRecordColumn) {
    this.corruptRecordColumn = corruptRecordColumn;
    return this;
  }

  public String getCorruptRecordColumn() {
    return corruptRecordColumn;
  }

  public FileIngestionOptions setFileFilters(Collection<FileFilter> fileFilters) {
    this.fileFilters = fileFilters;
    return this;
  }

  public Collection<FileFilter> getFileFilters() {
    return fileFilters;
  }

  public FileIngestionOptions setFormat(FileIngestionOptionsFileFormat format) {
    this.format = format;
    return this;
  }

  public FileIngestionOptionsFileFormat getFormat() {
    return format;
  }

  public FileIngestionOptions setFormatOptions(Map<String, String> formatOptions) {
    this.formatOptions = formatOptions;
    return this;
  }

  public Map<String, String> getFormatOptions() {
    return formatOptions;
  }

  public FileIngestionOptions setIgnoreCorruptFiles(Boolean ignoreCorruptFiles) {
    this.ignoreCorruptFiles = ignoreCorruptFiles;
    return this;
  }

  public Boolean getIgnoreCorruptFiles() {
    return ignoreCorruptFiles;
  }

  public FileIngestionOptions setInferColumnTypes(Boolean inferColumnTypes) {
    this.inferColumnTypes = inferColumnTypes;
    return this;
  }

  public Boolean getInferColumnTypes() {
    return inferColumnTypes;
  }

  public FileIngestionOptions setReaderCaseSensitive(Boolean readerCaseSensitive) {
    this.readerCaseSensitive = readerCaseSensitive;
    return this;
  }

  public Boolean getReaderCaseSensitive() {
    return readerCaseSensitive;
  }

  public FileIngestionOptions setRescuedDataColumn(String rescuedDataColumn) {
    this.rescuedDataColumn = rescuedDataColumn;
    return this;
  }

  public String getRescuedDataColumn() {
    return rescuedDataColumn;
  }

  public FileIngestionOptions setSchemaEvolutionMode(
      FileIngestionOptionsSchemaEvolutionMode schemaEvolutionMode) {
    this.schemaEvolutionMode = schemaEvolutionMode;
    return this;
  }

  public FileIngestionOptionsSchemaEvolutionMode getSchemaEvolutionMode() {
    return schemaEvolutionMode;
  }

  public FileIngestionOptions setSchemaHints(String schemaHints) {
    this.schemaHints = schemaHints;
    return this;
  }

  public String getSchemaHints() {
    return schemaHints;
  }

  public FileIngestionOptions setSingleVariantColumn(String singleVariantColumn) {
    this.singleVariantColumn = singleVariantColumn;
    return this;
  }

  public String getSingleVariantColumn() {
    return singleVariantColumn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileIngestionOptions that = (FileIngestionOptions) o;
    return Objects.equals(corruptRecordColumn, that.corruptRecordColumn)
        && Objects.equals(fileFilters, that.fileFilters)
        && Objects.equals(format, that.format)
        && Objects.equals(formatOptions, that.formatOptions)
        && Objects.equals(ignoreCorruptFiles, that.ignoreCorruptFiles)
        && Objects.equals(inferColumnTypes, that.inferColumnTypes)
        && Objects.equals(readerCaseSensitive, that.readerCaseSensitive)
        && Objects.equals(rescuedDataColumn, that.rescuedDataColumn)
        && Objects.equals(schemaEvolutionMode, that.schemaEvolutionMode)
        && Objects.equals(schemaHints, that.schemaHints)
        && Objects.equals(singleVariantColumn, that.singleVariantColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        corruptRecordColumn,
        fileFilters,
        format,
        formatOptions,
        ignoreCorruptFiles,
        inferColumnTypes,
        readerCaseSensitive,
        rescuedDataColumn,
        schemaEvolutionMode,
        schemaHints,
        singleVariantColumn);
  }

  @Override
  public String toString() {
    return new ToStringer(FileIngestionOptions.class)
        .add("corruptRecordColumn", corruptRecordColumn)
        .add("fileFilters", fileFilters)
        .add("format", format)
        .add("formatOptions", formatOptions)
        .add("ignoreCorruptFiles", ignoreCorruptFiles)
        .add("inferColumnTypes", inferColumnTypes)
        .add("readerCaseSensitive", readerCaseSensitive)
        .add("rescuedDataColumn", rescuedDataColumn)
        .add("schemaEvolutionMode", schemaEvolutionMode)
        .add("schemaHints", schemaHints)
        .add("singleVariantColumn", singleVariantColumn)
        .toString();
  }
}
