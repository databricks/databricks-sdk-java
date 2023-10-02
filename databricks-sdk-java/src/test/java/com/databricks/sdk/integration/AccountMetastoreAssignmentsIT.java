package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.integration.framework.CollectionUtils;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvOrSkip;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.catalog.AccountsMetastoreAssignment;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("ucacct")
@ExtendWith(EnvTest.class)
public class AccountMetastoreAssignmentsIT {
  @Test
  void getAccountMetastoreAssignment(
      AccountClient a,
      @EnvOrSkip("TEST_WORKSPACE_ID") String workspaceId,
      @EnvOrSkip("TEST_METASTORE_ID") String expectedMetastoreId) {
    AccountsMetastoreAssignment assignment =
        a.metastoreAssignments().get(Long.valueOf(workspaceId));
    String metastoreId = assignment.getMetastoreAssignment().getMetastoreId();
    Assertions.assertEquals(expectedMetastoreId, metastoreId);
  }

  @Test
  void listAccountMetastoreAssignments(
      AccountClient a,
      @EnvOrSkip("TEST_METASTORE_ID") String metastoreId,
      @EnvOrSkip("TEST_WORKSPACE_ID") String expectedWorkspaceId) {
    Iterable<Long> list = a.metastoreAssignments().list(metastoreId);
    List<Long> all = CollectionUtils.asList(list);
    List<Long> expected = Collections.singletonList(Long.valueOf(expectedWorkspaceId));
    Assertions.assertEquals(expected, all);
  }
}
