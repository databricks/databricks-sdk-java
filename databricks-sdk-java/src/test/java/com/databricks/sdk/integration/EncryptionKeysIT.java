package com.databricks.sdk.integration;

import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@DisabledIfEnvironmentVariable(named = "ARM_CLIENT_ID", matches = ".*")
@ExtendWith(EnvTest.class)
public class EncryptionKeysIT {
  // TODO: Enable this test when the test account is updated to support this.
  // Either by upgrading the test account tier to Enterprise or by adding this
  // feature to the test account.
  // @Test
  // void lists(AccountClient a) {
  //   Iterable<CustomerManagedKey> list = a.encryptionKeys().list();

  //   java.util.List<CustomerManagedKey> all = CollectionUtils.asList(list);

  //   CollectionUtils.assertUnique(all);
  // }
}
