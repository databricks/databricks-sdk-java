package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.integration.framework.CollectionUtils;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.provisioning.CustomerManagedKey;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@DisabledIfEnvironmentVariable(named = "ARM_CLIENT_ID", matches = ".*")
@ExtendWith(EnvTest.class)
public class EncryptionKeysIT {
  @Test
  void lists(AccountClient a) {
    Iterable<CustomerManagedKey> list = a.encryptionKeys().list();

    java.util.List<CustomerManagedKey> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }
}
