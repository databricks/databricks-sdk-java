package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.integration.framework.CollectionUtils;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.provisioning.PrivateAccessSettings;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@DisabledIfEnvironmentVariable(named = "ARM_CLIENT_ID", matches = ".*")
// VPC Endpoints need to be enabled in our GCP E2 account.
@DisabledIfEnvironmentVariable(named = "GOOGLE_CREDENTIALS", matches = ".*")
@ExtendWith(EnvTest.class)
public class PrivateAccessIT {
  @Test
  void lists(AccountClient a) {
    Iterable<PrivateAccessSettings> list = a.privateAccess().list();

    java.util.List<PrivateAccessSettings> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }
}
