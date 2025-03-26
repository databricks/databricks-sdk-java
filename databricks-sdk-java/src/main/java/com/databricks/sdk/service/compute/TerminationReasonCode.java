// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/** The status code indicating why the cluster was terminated */
@Generated
public enum TerminationReasonCode {
  ABUSE_DETECTED,
  ACCESS_TOKEN_FAILURE,
  ALLOCATION_TIMEOUT,
  ALLOCATION_TIMEOUT_NODE_DAEMON_NOT_READY,
  ALLOCATION_TIMEOUT_NO_HEALTHY_CLUSTERS,
  ALLOCATION_TIMEOUT_NO_MATCHED_CLUSTERS,
  ALLOCATION_TIMEOUT_NO_READY_CLUSTERS,
  ALLOCATION_TIMEOUT_NO_UNALLOCATED_CLUSTERS,
  ALLOCATION_TIMEOUT_NO_WARMED_UP_CLUSTERS,
  ATTACH_PROJECT_FAILURE,
  AWS_AUTHORIZATION_FAILURE,
  AWS_INACCESSIBLE_KMS_KEY_FAILURE,
  AWS_INSTANCE_PROFILE_UPDATE_FAILURE,
  AWS_INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET_FAILURE,
  AWS_INSUFFICIENT_INSTANCE_CAPACITY_FAILURE,
  AWS_INVALID_KEY_PAIR,
  AWS_INVALID_KMS_KEY_STATE,
  AWS_MAX_SPOT_INSTANCE_COUNT_EXCEEDED_FAILURE,
  AWS_REQUEST_LIMIT_EXCEEDED,
  AWS_RESOURCE_QUOTA_EXCEEDED,
  AWS_UNSUPPORTED_FAILURE,
  AZURE_BYOK_KEY_PERMISSION_FAILURE,
  AZURE_EPHEMERAL_DISK_FAILURE,
  AZURE_INVALID_DEPLOYMENT_TEMPLATE,
  AZURE_OPERATION_NOT_ALLOWED_EXCEPTION,
  AZURE_PACKED_DEPLOYMENT_PARTIAL_FAILURE,
  AZURE_QUOTA_EXCEEDED_EXCEPTION,
  AZURE_RESOURCE_MANAGER_THROTTLING,
  AZURE_RESOURCE_PROVIDER_THROTTLING,
  AZURE_UNEXPECTED_DEPLOYMENT_TEMPLATE_FAILURE,
  AZURE_VM_EXTENSION_FAILURE,
  AZURE_VNET_CONFIGURATION_FAILURE,
  BOOTSTRAP_TIMEOUT,
  BOOTSTRAP_TIMEOUT_CLOUD_PROVIDER_EXCEPTION,
  BOOTSTRAP_TIMEOUT_DUE_TO_MISCONFIG,
  BUDGET_POLICY_LIMIT_ENFORCEMENT_ACTIVATED,
  BUDGET_POLICY_RESOLUTION_FAILURE,
  CLOUD_ACCOUNT_SETUP_FAILURE,
  CLOUD_OPERATION_CANCELLED,
  CLOUD_PROVIDER_DISK_SETUP_FAILURE,
  CLOUD_PROVIDER_INSTANCE_NOT_LAUNCHED,
  CLOUD_PROVIDER_LAUNCH_FAILURE,
  CLOUD_PROVIDER_LAUNCH_FAILURE_DUE_TO_MISCONFIG,
  CLOUD_PROVIDER_RESOURCE_STOCKOUT,
  CLOUD_PROVIDER_RESOURCE_STOCKOUT_DUE_TO_MISCONFIG,
  CLOUD_PROVIDER_SHUTDOWN,
  CLUSTER_OPERATION_THROTTLED,
  CLUSTER_OPERATION_TIMEOUT,
  COMMUNICATION_LOST,
  CONTAINER_LAUNCH_FAILURE,
  CONTROL_PLANE_REQUEST_FAILURE,
  CONTROL_PLANE_REQUEST_FAILURE_DUE_TO_MISCONFIG,
  DATABASE_CONNECTION_FAILURE,
  DATA_ACCESS_CONFIG_CHANGED,
  DBFS_COMPONENT_UNHEALTHY,
  DISASTER_RECOVERY_REPLICATION,
  DOCKER_IMAGE_PULL_FAILURE,
  DRIVER_EVICTION,
  DRIVER_LAUNCH_TIMEOUT,
  DRIVER_NODE_UNREACHABLE,
  DRIVER_OUT_OF_DISK,
  DRIVER_OUT_OF_MEMORY,
  DRIVER_POD_CREATION_FAILURE,
  DRIVER_UNEXPECTED_FAILURE,
  DRIVER_UNREACHABLE,
  DRIVER_UNRESPONSIVE,
  DYNAMIC_SPARK_CONF_SIZE_EXCEEDED,
  EOS_SPARK_IMAGE,
  EXECUTION_COMPONENT_UNHEALTHY,
  EXECUTOR_POD_UNSCHEDULED,
  GCP_API_RATE_QUOTA_EXCEEDED,
  GCP_FORBIDDEN,
  GCP_IAM_TIMEOUT,
  GCP_INACCESSIBLE_KMS_KEY_FAILURE,
  GCP_INSUFFICIENT_CAPACITY,
  GCP_IP_SPACE_EXHAUSTED,
  GCP_KMS_KEY_PERMISSION_DENIED,
  GCP_NOT_FOUND,
  GCP_QUOTA_EXCEEDED,
  GCP_RESOURCE_QUOTA_EXCEEDED,
  GCP_SERVICE_ACCOUNT_ACCESS_DENIED,
  GCP_SERVICE_ACCOUNT_DELETED,
  GCP_SERVICE_ACCOUNT_NOT_FOUND,
  GCP_SUBNET_NOT_READY,
  GCP_TRUSTED_IMAGE_PROJECTS_VIOLATED,
  GKE_BASED_CLUSTER_TERMINATION,
  GLOBAL_INIT_SCRIPT_FAILURE,
  HIVE_METASTORE_PROVISIONING_FAILURE,
  IMAGE_PULL_PERMISSION_DENIED,
  INACTIVITY,
  INIT_CONTAINER_NOT_FINISHED,
  INIT_SCRIPT_FAILURE,
  INSTANCE_POOL_CLUSTER_FAILURE,
  INSTANCE_POOL_MAX_CAPACITY_REACHED,
  INSTANCE_POOL_NOT_FOUND,
  INSTANCE_UNREACHABLE,
  INSTANCE_UNREACHABLE_DUE_TO_MISCONFIG,
  INTERNAL_CAPACITY_FAILURE,
  INTERNAL_ERROR,
  INVALID_ARGUMENT,
  INVALID_AWS_PARAMETER,
  INVALID_INSTANCE_PLACEMENT_PROTOCOL,
  INVALID_SPARK_IMAGE,
  INVALID_WORKER_IMAGE_FAILURE,
  IN_PENALTY_BOX,
  IP_EXHAUSTION_FAILURE,
  JOB_FINISHED,
  K8S_AUTOSCALING_FAILURE,
  K8S_DBR_CLUSTER_LAUNCH_TIMEOUT,
  LAZY_ALLOCATION_TIMEOUT,
  MAINTENANCE_MODE,
  METASTORE_COMPONENT_UNHEALTHY,
  NEPHOS_RESOURCE_MANAGEMENT,
  NETVISOR_SETUP_TIMEOUT,
  NETWORK_CONFIGURATION_FAILURE,
  NFS_MOUNT_FAILURE,
  NO_MATCHED_K8S,
  NO_MATCHED_K8S_TESTING_TAG,
  NPIP_TUNNEL_SETUP_FAILURE,
  NPIP_TUNNEL_TOKEN_FAILURE,
  POD_ASSIGNMENT_FAILURE,
  POD_SCHEDULING_FAILURE,
  REQUEST_REJECTED,
  REQUEST_THROTTLED,
  RESOURCE_USAGE_BLOCKED,
  SECRET_CREATION_FAILURE,
  SECRET_RESOLUTION_ERROR,
  SECURITY_DAEMON_REGISTRATION_EXCEPTION,
  SELF_BOOTSTRAP_FAILURE,
  SERVERLESS_LONG_RUNNING_TERMINATED,
  SKIPPED_SLOW_NODES,
  SLOW_IMAGE_DOWNLOAD,
  SPARK_ERROR,
  SPARK_IMAGE_DOWNLOAD_FAILURE,
  SPARK_IMAGE_DOWNLOAD_THROTTLED,
  SPARK_IMAGE_NOT_FOUND,
  SPARK_STARTUP_FAILURE,
  SPOT_INSTANCE_TERMINATION,
  SSH_BOOTSTRAP_FAILURE,
  STORAGE_DOWNLOAD_FAILURE,
  STORAGE_DOWNLOAD_FAILURE_DUE_TO_MISCONFIG,
  STORAGE_DOWNLOAD_FAILURE_SLOW,
  STORAGE_DOWNLOAD_FAILURE_THROTTLED,
  STS_CLIENT_SETUP_FAILURE,
  SUBNET_EXHAUSTED_FAILURE,
  TEMPORARILY_UNAVAILABLE,
  TRIAL_EXPIRED,
  UNEXPECTED_LAUNCH_FAILURE,
  UNEXPECTED_POD_RECREATION,
  UNKNOWN,
  UNSUPPORTED_INSTANCE_TYPE,
  UPDATE_INSTANCE_PROFILE_FAILURE,
  USER_INITIATED_VM_TERMINATION,
  USER_REQUEST,
  WORKER_SETUP_FAILURE,
  WORKSPACE_CANCELLED_ERROR,
  WORKSPACE_CONFIGURATION_ERROR,
  WORKSPACE_UPDATE,
}
