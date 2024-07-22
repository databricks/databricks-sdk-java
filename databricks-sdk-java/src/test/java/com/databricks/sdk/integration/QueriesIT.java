package com.databricks.sdk.integration;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.integration.framework.CollectionUtils;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.sql.ListQueriesRequest;
import com.databricks.sdk.service.sql.ListQueryObjectsResponseQuery;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
class QueriesIT {
  @Test
  void listsQueries(WorkspaceClient w) {
    Iterator<ListQueryObjectsResponseQuery> list =
        w.queries().list(new ListQueriesRequest().setPageSize(1000L)).iterator();

    java.util.List<ListQueryObjectsResponseQuery> all = new ArrayList<>();
    list.forEachRemaining(all::add);

    CollectionUtils.assertUnique(all);
  }
}
