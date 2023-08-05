package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.framework.CollectionUtils;
import com.databricks.sdk.framework.EnvContext;
import com.databricks.sdk.framework.EnvTest;
import com.databricks.sdk.service.iam.ListAccountUsersRequest;
import com.databricks.sdk.service.iam.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@ExtendWith(EnvTest.class)
public class AccountUsersIT {
  @Test
  void lists(AccountClient a) {
    Iterable<User> list =
        a.users().list(new ListAccountUsersRequest().setAttributes("displayName"));

    java.util.List<User> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }
}
