// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;

/**
 * Manage Lakewatch: security-analytics data sources, detection rules, and per-catalog
 * configuration.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface LakewatchService {
  /** Creates a new datasource. */
  Datasource createDatasource(CreateDatasourceRequest createDatasourceRequest);

  /** Creates a parser and its first version in one call. */
  Parser createParser(CreateParserRequest createParserRequest);

  /**
   * Appends a new immutable version, advancing the parser's latest-version pointer. This is how a
   * parser is edited; versions are never changed in place.
   */
  ParserVersion createParserVersion(CreateParserVersionRequest createParserVersionRequest);

  /** Creates a new rule. */
  Rule createRule(CreateRuleRequest createRuleRequest);

  /** Deletes a datasource by its resource name. */
  void deleteDatasource(DeleteDatasourceRequest deleteDatasourceRequest);

  /** Deletes a parser and all of its versions. Refused while any data source references it. */
  void deleteParser(DeleteParserRequest deleteParserRequest);

  /**
   * Deletes one version of a parser. Returns NOT_FOUND when the parser or the version does not
   * exist, and a conflict (HTTP 409) only while a data source references the version. Deleting the
   * last version leaves the parser in place with no versions.
   */
  void deleteParserVersion(DeleteParserVersionRequest deleteParserVersionRequest);

  /** Deletes a rule by its resource name. */
  void deleteRule(DeleteRuleRequest deleteRuleRequest);

  /** Returns the alert delivery configuration for a catalog. */
  AlertConfig getAlertConfig(GetAlertConfigRequest getAlertConfigRequest);

  /** Returns a built-in parser's identity and latest-version pointer. Does not return the spec. */
  BuiltinParser getBuiltinParser(GetBuiltinParserRequest getBuiltinParserRequest);

  /** Returns one version of a built-in parser, including its spec. */
  BuiltinParserVersion getBuiltinParserVersion(
      GetBuiltinParserVersionRequest getBuiltinParserVersionRequest);

  /** Returns the common Lakewatch configuration for a catalog. */
  CommonConfig getCommonConfig(GetCommonConfigRequest getCommonConfigRequest);

  /** Returns a single datasource by its resource name. */
  Datasource getDatasource(GetDatasourceRequest getDatasourceRequest);

  /** Returns the datasource ingestion configuration for a catalog. */
  DatasourceConfig getDatasourceConfig(GetDatasourceConfigRequest getDatasourceConfigRequest);

  /**
   * Returns a parser's identity and latest-version pointer. Does not return the spec; read a spec
   * with GetParserVersion.
   */
  Parser getParser(GetParserRequest getParserRequest);

  /** Returns one version of a parser, including its spec. */
  ParserVersion getParserVersion(GetParserVersionRequest getParserVersionRequest);

  /** Returns a single rule by its resource name. */
  Rule getRule(GetRuleRequest getRuleRequest);

  /** Returns the detection-rule configuration for a catalog. */
  RuleConfig getRuleConfig(GetRuleConfigRequest getRuleConfigRequest);

  /**
   * Lists a built-in parser's published versions, oldest first (ascending 1..resource_revision),
   * without their specs.
   */
  ListBuiltinParserVersionsResponse listBuiltinParserVersions(
      ListBuiltinParserVersionsRequest listBuiltinParserVersionsRequest);

  /** Lists the built-in parsers Databricks publishes, without their specs. */
  ListBuiltinParsersResponse listBuiltinParsers(
      ListBuiltinParsersRequest listBuiltinParsersRequest);

  /**
   * Lists the datasources in a Unity Catalog catalog, optionally narrowed to one schema or filtered
   * by name. Results are paginated. Datasources that are still being created or deleted are not
   * listed.
   */
  ListDatasourcesResponse listDatasources(ListDatasourcesRequest listDatasourcesRequest);

  /** Lists a parser's versions, oldest first, without their specs. */
  ListParserVersionsResponse listParserVersions(
      ListParserVersionsRequest listParserVersionsRequest);

  /** Lists parsers in a catalog, without their specs. */
  ListParsersResponse listParsers(ListParsersRequest listParsersRequest);

  /** Lists rules, with optional filtering and pagination. */
  ListRulesResponse listRules(ListRulesRequest listRulesRequest);

  /** Updates the alert delivery configuration for a catalog. */
  AlertConfig updateAlertConfig(UpdateAlertConfigRequest updateAlertConfigRequest);

  /** Updates the common Lakewatch configuration for a catalog. */
  CommonConfig updateCommonConfig(UpdateCommonConfigRequest updateCommonConfigRequest);

  /** Updates an existing datasource. */
  Datasource updateDatasource(UpdateDatasourceRequest updateDatasourceRequest);

  /** Updates the datasource ingestion configuration for a catalog. */
  DatasourceConfig updateDatasourceConfig(
      UpdateDatasourceConfigRequest updateDatasourceConfigRequest);

  /** Updates an existing rule. */
  Rule updateRule(UpdateRuleRequest updateRuleRequest);

  /** Updates the detection-rule configuration for a catalog. */
  RuleConfig updateRuleConfig(UpdateRuleConfigRequest updateRuleConfigRequest);
}
