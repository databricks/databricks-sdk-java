// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = TableSpecificConfig.TableSpecificConfigSerializer.class)
@JsonDeserialize(using = TableSpecificConfig.TableSpecificConfigDeserializer.class)
public class TableSpecificConfig {
  /**
   * A list of column names to be excluded for the ingestion. When not specified, include_columns
   * fully controls what columns to be ingested. When specified, all other columns including future
   * ones will be automatically included for ingestion. This field in mutually exclusive with
   * `include_columns`.
   */
  private Collection<String> excludeColumns;

  /**
   * A list of column names to be included for the ingestion. When not specified, all columns except
   * ones in exclude_columns will be included. Future columns will be automatically included. When
   * specified, all other future columns will be automatically excluded from ingestion. This field
   * in mutually exclusive with `exclude_columns`.
   */
  private Collection<String> includeColumns;

  /** The primary key of the table used to apply changes. */
  private Collection<String> primaryKeys;

  /**
   * If true, formula fields defined in the table are included in the ingestion. This setting is
   * only valid for the Salesforce connector
   */
  private Boolean salesforceIncludeFormulaFields;

  /** The SCD type to use to ingest the table. */
  private TableSpecificConfigScdType scdType;

  /**
   * The column names specifying the logical order of events in the source data. Delta Live Tables
   * uses this sequencing to handle change events that arrive out of order.
   */
  private Collection<String> sequenceBy;

  public TableSpecificConfig setExcludeColumns(Collection<String> excludeColumns) {
    this.excludeColumns = excludeColumns;
    return this;
  }

  public Collection<String> getExcludeColumns() {
    return excludeColumns;
  }

  public TableSpecificConfig setIncludeColumns(Collection<String> includeColumns) {
    this.includeColumns = includeColumns;
    return this;
  }

  public Collection<String> getIncludeColumns() {
    return includeColumns;
  }

  public TableSpecificConfig setPrimaryKeys(Collection<String> primaryKeys) {
    this.primaryKeys = primaryKeys;
    return this;
  }

  public Collection<String> getPrimaryKeys() {
    return primaryKeys;
  }

  public TableSpecificConfig setSalesforceIncludeFormulaFields(
      Boolean salesforceIncludeFormulaFields) {
    this.salesforceIncludeFormulaFields = salesforceIncludeFormulaFields;
    return this;
  }

  public Boolean getSalesforceIncludeFormulaFields() {
    return salesforceIncludeFormulaFields;
  }

  public TableSpecificConfig setScdType(TableSpecificConfigScdType scdType) {
    this.scdType = scdType;
    return this;
  }

  public TableSpecificConfigScdType getScdType() {
    return scdType;
  }

  public TableSpecificConfig setSequenceBy(Collection<String> sequenceBy) {
    this.sequenceBy = sequenceBy;
    return this;
  }

  public Collection<String> getSequenceBy() {
    return sequenceBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableSpecificConfig that = (TableSpecificConfig) o;
    return Objects.equals(excludeColumns, that.excludeColumns)
        && Objects.equals(includeColumns, that.includeColumns)
        && Objects.equals(primaryKeys, that.primaryKeys)
        && Objects.equals(salesforceIncludeFormulaFields, that.salesforceIncludeFormulaFields)
        && Objects.equals(scdType, that.scdType)
        && Objects.equals(sequenceBy, that.sequenceBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        excludeColumns,
        includeColumns,
        primaryKeys,
        salesforceIncludeFormulaFields,
        scdType,
        sequenceBy);
  }

  @Override
  public String toString() {
    return new ToStringer(TableSpecificConfig.class)
        .add("excludeColumns", excludeColumns)
        .add("includeColumns", includeColumns)
        .add("primaryKeys", primaryKeys)
        .add("salesforceIncludeFormulaFields", salesforceIncludeFormulaFields)
        .add("scdType", scdType)
        .add("sequenceBy", sequenceBy)
        .toString();
  }

  TableSpecificConfigPb toPb() {
    TableSpecificConfigPb pb = new TableSpecificConfigPb();
    pb.setExcludeColumns(excludeColumns);
    pb.setIncludeColumns(includeColumns);
    pb.setPrimaryKeys(primaryKeys);
    pb.setSalesforceIncludeFormulaFields(salesforceIncludeFormulaFields);
    pb.setScdType(scdType);
    pb.setSequenceBy(sequenceBy);

    return pb;
  }

  static TableSpecificConfig fromPb(TableSpecificConfigPb pb) {
    TableSpecificConfig model = new TableSpecificConfig();
    model.setExcludeColumns(pb.getExcludeColumns());
    model.setIncludeColumns(pb.getIncludeColumns());
    model.setPrimaryKeys(pb.getPrimaryKeys());
    model.setSalesforceIncludeFormulaFields(pb.getSalesforceIncludeFormulaFields());
    model.setScdType(pb.getScdType());
    model.setSequenceBy(pb.getSequenceBy());

    return model;
  }

  public static class TableSpecificConfigSerializer extends JsonSerializer<TableSpecificConfig> {
    @Override
    public void serialize(TableSpecificConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TableSpecificConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TableSpecificConfigDeserializer
      extends JsonDeserializer<TableSpecificConfig> {
    @Override
    public TableSpecificConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TableSpecificConfigPb pb = mapper.readValue(p, TableSpecificConfigPb.class);
      return TableSpecificConfig.fromPb(pb);
    }
  }
}
