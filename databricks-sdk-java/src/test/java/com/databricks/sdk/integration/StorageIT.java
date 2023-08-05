package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.framework.CollectionUtils;
import com.databricks.sdk.framework.EnvContext;
import com.databricks.sdk.framework.EnvTest;
import com.databricks.sdk.service.provisioning.StorageConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@DisabledIfEnvironmentVariable(named = "ARM_CLIENT_ID", matches = ".*")
@ExtendWith(EnvTest.class)
public class StorageIT {
  @Test
  void lists(AccountClient a) {
    Iterable<StorageConfiguration> list = a.storage().list();

    java.util.List<StorageConfiguration> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }
}
