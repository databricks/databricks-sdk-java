package com.databricks.sdk.integration;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.framework.CollectionUtils;
import com.databricks.sdk.framework.EnvContext;
import com.databricks.sdk.framework.EnvTest;
import com.databricks.sdk.service.sql.ListQueriesRequest;
import com.databricks.sdk.service.sql.Query;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
class QueriesIT {
  @Test
  void listsQueries(WorkspaceClient w) {
    Iterable<Query> list = w.queries().list(new ListQueriesRequest().setPageSize(2L));

    java.util.List<Query> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }
}
