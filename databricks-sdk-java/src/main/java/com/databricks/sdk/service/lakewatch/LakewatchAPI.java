// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * Manage Lakewatch: security-analytics data sources, detection rules, and per-catalog
 * configuration.
 */
@Generated
public class LakewatchAPI {
  private static final Logger LOG = LoggerFactory.getLogger(LakewatchAPI.class);

  private final LakewatchService impl;

  /** Regular-use constructor */
  public LakewatchAPI(ApiClient apiClient) {
    impl = new LakewatchImpl(apiClient);
  }

  /** Constructor for mocks */
  public LakewatchAPI(LakewatchService mock) {
    impl = mock;
  }

  /** Creates a new datasource. */
  public Datasource createDatasource(CreateDatasourceRequest request) {
    return impl.createDatasource(request);
  }

  /** Creates a parser and its first version in one call. */
  public Parser createParser(CreateParserRequest request) {
    return impl.createParser(request);
  }

  /**
   * Appends a new immutable version, advancing the parser's latest-version pointer. This is how a
   * parser is edited; versions are never changed in place.
   */
  public ParserVersion createParserVersion(CreateParserVersionRequest request) {
    return impl.createParserVersion(request);
  }

  /** Creates a new rule. */
  public Rule createRule(CreateRuleRequest request) {
    return impl.createRule(request);
  }

  public void deleteDatasource(String name) {
    deleteDatasource(new DeleteDatasourceRequest().setName(name));
  }

  /** Deletes a datasource by its resource name. */
  public void deleteDatasource(DeleteDatasourceRequest request) {
    impl.deleteDatasource(request);
  }

  public void deleteParser(String name) {
    deleteParser(new DeleteParserRequest().setName(name));
  }

  /** Deletes a parser and all of its versions. Refused while any data source references it. */
  public void deleteParser(DeleteParserRequest request) {
    impl.deleteParser(request);
  }

  public void deleteParserVersion(String name) {
    deleteParserVersion(new DeleteParserVersionRequest().setName(name));
  }

  /**
   * Deletes one version of a parser. Returns NOT_FOUND when the parser or the version does not
   * exist, and a conflict (HTTP 409) only while a data source references the version. Deleting the
   * last version leaves the parser in place with no versions.
   */
  public void deleteParserVersion(DeleteParserVersionRequest request) {
    impl.deleteParserVersion(request);
  }

  public void deleteRule(String name) {
    deleteRule(new DeleteRuleRequest().setName(name));
  }

  /** Deletes a rule by its resource name. */
  public void deleteRule(DeleteRuleRequest request) {
    impl.deleteRule(request);
  }

  public AlertConfig getAlertConfig(String name) {
    return getAlertConfig(new GetAlertConfigRequest().setName(name));
  }

  /** Returns the alert delivery configuration for a catalog. */
  public AlertConfig getAlertConfig(GetAlertConfigRequest request) {
    return impl.getAlertConfig(request);
  }

  public BuiltinParser getBuiltinParser(String name) {
    return getBuiltinParser(new GetBuiltinParserRequest().setName(name));
  }

  /** Returns a built-in parser's identity and latest-version pointer. Does not return the spec. */
  public BuiltinParser getBuiltinParser(GetBuiltinParserRequest request) {
    return impl.getBuiltinParser(request);
  }

  public BuiltinParserVersion getBuiltinParserVersion(String name) {
    return getBuiltinParserVersion(new GetBuiltinParserVersionRequest().setName(name));
  }

  /** Returns one version of a built-in parser, including its spec. */
  public BuiltinParserVersion getBuiltinParserVersion(GetBuiltinParserVersionRequest request) {
    return impl.getBuiltinParserVersion(request);
  }

  public CommonConfig getCommonConfig(String name) {
    return getCommonConfig(new GetCommonConfigRequest().setName(name));
  }

  /** Returns the common Lakewatch configuration for a catalog. */
  public CommonConfig getCommonConfig(GetCommonConfigRequest request) {
    return impl.getCommonConfig(request);
  }

  public Datasource getDatasource(String name) {
    return getDatasource(new GetDatasourceRequest().setName(name));
  }

  /** Returns a single datasource by its resource name. */
  public Datasource getDatasource(GetDatasourceRequest request) {
    return impl.getDatasource(request);
  }

  public DatasourceConfig getDatasourceConfig(String name) {
    return getDatasourceConfig(new GetDatasourceConfigRequest().setName(name));
  }

  /** Returns the datasource ingestion configuration for a catalog. */
  public DatasourceConfig getDatasourceConfig(GetDatasourceConfigRequest request) {
    return impl.getDatasourceConfig(request);
  }

  public Parser getParser(String name) {
    return getParser(new GetParserRequest().setName(name));
  }

  /**
   * Returns a parser's identity and latest-version pointer. Does not return the spec; read a spec
   * with GetParserVersion.
   */
  public Parser getParser(GetParserRequest request) {
    return impl.getParser(request);
  }

  public ParserVersion getParserVersion(String name) {
    return getParserVersion(new GetParserVersionRequest().setName(name));
  }

  /** Returns one version of a parser, including its spec. */
  public ParserVersion getParserVersion(GetParserVersionRequest request) {
    return impl.getParserVersion(request);
  }

  public Rule getRule(String name) {
    return getRule(new GetRuleRequest().setName(name));
  }

  /** Returns a single rule by its resource name. */
  public Rule getRule(GetRuleRequest request) {
    return impl.getRule(request);
  }

  public RuleConfig getRuleConfig(String name) {
    return getRuleConfig(new GetRuleConfigRequest().setName(name));
  }

  /** Returns the detection-rule configuration for a catalog. */
  public RuleConfig getRuleConfig(GetRuleConfigRequest request) {
    return impl.getRuleConfig(request);
  }

  public Iterable<BuiltinParserVersion> listBuiltinParserVersions(String parent) {
    return listBuiltinParserVersions(new ListBuiltinParserVersionsRequest().setParent(parent));
  }

  /**
   * Lists a built-in parser's published versions, oldest first (ascending 1..resource_revision),
   * without their specs.
   */
  public Iterable<BuiltinParserVersion> listBuiltinParserVersions(
      ListBuiltinParserVersionsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listBuiltinParserVersions,
        ListBuiltinParserVersionsResponse::getBuiltinParserVersions,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Lists the built-in parsers Databricks publishes, without their specs. */
  public Iterable<BuiltinParser> listBuiltinParsers(ListBuiltinParsersRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listBuiltinParsers,
        ListBuiltinParsersResponse::getBuiltinParsers,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Datasource> listDatasources(String catalogName) {
    return listDatasources(new ListDatasourcesRequest().setCatalogName(catalogName));
  }

  /**
   * Lists the datasources in a Unity Catalog catalog, optionally narrowed to one schema or filtered
   * by name. Results are paginated. Datasources that are still being created or deleted are not
   * listed.
   */
  public Iterable<Datasource> listDatasources(ListDatasourcesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listDatasources,
        ListDatasourcesResponse::getDatasources,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<ParserVersion> listParserVersions(String parent) {
    return listParserVersions(new ListParserVersionsRequest().setParent(parent));
  }

  /** Lists a parser's versions, oldest first, without their specs. */
  public Iterable<ParserVersion> listParserVersions(ListParserVersionsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listParserVersions,
        ListParserVersionsResponse::getParserVersions,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Parser> listParsers(String catalogName) {
    return listParsers(new ListParsersRequest().setCatalogName(catalogName));
  }

  /** Lists parsers in a catalog, without their specs. */
  public Iterable<Parser> listParsers(ListParsersRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listParsers,
        ListParsersResponse::getParsers,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Rule> listRules(String catalogName) {
    return listRules(new ListRulesRequest().setCatalogName(catalogName));
  }

  /** Lists rules, with optional filtering and pagination. */
  public Iterable<Rule> listRules(ListRulesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listRules,
        ListRulesResponse::getRules,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Updates the alert delivery configuration for a catalog. */
  public AlertConfig updateAlertConfig(UpdateAlertConfigRequest request) {
    return impl.updateAlertConfig(request);
  }

  /** Updates the common Lakewatch configuration for a catalog. */
  public CommonConfig updateCommonConfig(UpdateCommonConfigRequest request) {
    return impl.updateCommonConfig(request);
  }

  /** Updates an existing datasource. */
  public Datasource updateDatasource(UpdateDatasourceRequest request) {
    return impl.updateDatasource(request);
  }

  /** Updates the datasource ingestion configuration for a catalog. */
  public DatasourceConfig updateDatasourceConfig(UpdateDatasourceConfigRequest request) {
    return impl.updateDatasourceConfig(request);
  }

  /** Updates an existing rule. */
  public Rule updateRule(UpdateRuleRequest request) {
    return impl.updateRule(request);
  }

  /** Updates the detection-rule configuration for a catalog. */
  public RuleConfig updateRuleConfig(UpdateRuleConfigRequest request) {
    return impl.updateRuleConfig(request);
  }

  public LakewatchService impl() {
    return impl;
  }
}
