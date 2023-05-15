package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.integration.framework.CollectionUtils;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.iam.Group;
import com.databricks.sdk.service.iam.ListAccountGroupsRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@ExtendWith(EnvTest.class)
public class AccountGroupsIT {
  @Test
  void lists(AccountClient a) {
    Iterable<Group> list =
        a.groups().list(new ListAccountGroupsRequest().setAttributes("displayName"));

    java.util.List<Group> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }
}
