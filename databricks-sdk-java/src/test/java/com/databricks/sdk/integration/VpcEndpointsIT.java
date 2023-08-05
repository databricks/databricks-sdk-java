package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.framework.CollectionUtils;
import com.databricks.sdk.framework.EnvContext;
import com.databricks.sdk.framework.EnvTest;
import com.databricks.sdk.service.provisioning.VpcEndpoint;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@DisabledIfEnvironmentVariable(named = "ARM_CLIENT_ID", matches = ".*")
@ExtendWith(EnvTest.class)
public class VpcEndpointsIT {
  @Test
  void lists(AccountClient a) {
    Iterable<VpcEndpoint> list = a.vpcEndpoints().list();

    java.util.List<VpcEndpoint> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }
}
