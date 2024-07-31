package com.databricks.sdk.integration;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.integration.framework.CollectionUtils;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.sql.LegacyQuery;
import com.databricks.sdk.service.sql.ListQueriesLegacyRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
class QueriesIT {
  @Test
  void listsQueries(WorkspaceClient w) {
    Iterable<LegacyQuery> list =
        w.queriesLegacy().list(new ListQueriesLegacyRequest().setPageSize(1000L));
    java.util.List<LegacyQuery> all = CollectionUtils.asList(list);
    CollectionUtils.assertUnique(all);
  }
}
