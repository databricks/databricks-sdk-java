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

  /** Creates a new rule. */
  Rule createRule(CreateRuleRequest createRuleRequest);

  /** Deletes a datasource by its resource name. */
  void deleteDatasource(DeleteDatasourceRequest deleteDatasourceRequest);

  /** Deletes a rule by its resource name. */
  void deleteRule(DeleteRuleRequest deleteRuleRequest);

  /** Returns the alert delivery configuration for a catalog. */
  AlertConfig getAlertConfig(GetAlertConfigRequest getAlertConfigRequest);

  /** Returns the common Lakewatch configuration for a catalog. */
  CommonConfig getCommonConfig(GetCommonConfigRequest getCommonConfigRequest);

  /** Returns a single datasource by its resource name. */
  Datasource getDatasource(GetDatasourceRequest getDatasourceRequest);

  /** Returns the datasource ingestion configuration for a catalog. */
  DatasourceConfig getDatasourceConfig(GetDatasourceConfigRequest getDatasourceConfigRequest);

  /** Returns a single rule by its resource name. */
  Rule getRule(GetRuleRequest getRuleRequest);

  /** Returns the detection-rule configuration for a catalog. */
  RuleConfig getRuleConfig(GetRuleConfigRequest getRuleConfigRequest);

  /**
   * Lists the datasources in a Unity Catalog catalog, optionally narrowed to one schema or filtered
   * by name. Results are paginated. Datasources that are still being created or deleted are not
   * listed.
   */
  ListDatasourcesResponse listDatasources(ListDatasourcesRequest listDatasourcesRequest);

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
