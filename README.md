# akka-quickstart-scala


A simple Akka based Scala project using the Colisweb library that facilitates the the Java tracer configuration for scala apps

### _Preliminary tasks_

**Spin up the Datadog Agent (Provide your API key in the below command)**

```
COMP10619:akka-quickstart-scala pejman.tabassomi$ DOCKER_CONTENT_TRUST=1 docker run -d --rm --name datadog_agent7 -h datadog -v /var/run/docker.sock:/var/run/docker.sock:ro -v /proc/:/host/proc/:ro -v /sys/fs/cgroup/:/host/sys/fs/cgroup:ro -p 8126:8126 -p 8125:8125/udp -e DD_API_KEY=******** -e DD_APM_ENABLED=true -e DD_APM_NON_LOCAL_TRAFFIC=true -e DD_PROCESS_AGENT_ENABLED=true -e DD_DOGSTATSD_NON_LOCAL_TRAFFIC="true" -e DD_LOG_LEVEL=debug datadog/agent:7
```
 

**Building the the spring application**

```
COMP10619:akka-quickstart-scala pejman.tabassomi$ ./sbt build
```


**Run the application**

Check target/universal directory, there is a zip file created having the same name as the project (Here akka-quickstart-scala)
  
```
COMP10619:akka-quickstart-scala pejman.tabassomi$ cd target/universal
COMP10619:universal pejman.tabassomi$ ls -lrt
total 55040
-rw-r--r--  1 pejman.tabassomi  staff  28178553 Jul 13  2019 akka-quickstart-scala-1.0.zip
```

 
Now copy the zip file to any place of your liking, unzip it and check the shell script that has the same name as the zip and can be launch as is
In fact the script contains all the parameters/system properties that need to be passed to jvm and is located in the ${app_home}/bin/akka-quickstart-scala 

Example:

```
COMP10619:universal pejman.tabassomi$ cp akka-quickstart-scala-1.0.zip /app
COMP10619:app pejman.tabassomi$ unzip akka-quickstart-scala-1.0.zip
COMP10619:app pejman.tabassomi$ ls -lrt
total 55040
-rw-r--r--  1 pejman.tabassomi  staff  28178553 Jul 22 14:16 akka-quickstart-scala-1.0.zip
drwxr-xr-x  5 pejman.tabassomi  staff       160 Jul 22 14:16 akka-quickstart-scala-1.0
```


### _Run the tests_


```
COMP10619:app pejman.tabassomi$ cd akka-quickstart-scala-1.0/bin/
COMP10619:bin pejman.tabassomi$ ls -lrt
total 40
-rw-r--r--  1 pejman.tabassomi  staff   5425 Jul 13  2019 akka-quickstart-scala.bat
-rwxr-xr-x  1 pejman.tabassomi  staff  10055 Jul 13  2019 akka-quickstart-scala
COMP10619:bin pejman.tabassomi$ ./akka-quickstart-scala
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[main] DEBUG datadog.trace.bootstrap.WeakMap$Provider - Weak map provider set to datadog.trace.agent.tooling.WeakMapSuppliers$WeakConcurrent@1b9e1916
[main] DEBUG datadog.trace.api.Config - New instance: Config(runtimeId=97770426-a91c-4960-9f48-baf659feec3c, serviceName=AkkaQuickStart, traceEnabled=true, integrationsEnabled=true, 
writerType=DDAgentWriter, agentHost=127.0.0.1, agentPort=8126, agentUnixDomainSocket=null, prioritySamplingEnabled=true, traceResolverEnabled=true, serviceMapping={}, globalTags={}, 
spanTags={env=staging}, jmxTags={}, excludedClasses=[], headerTags={}, httpServerErrorStatuses=[512, 513, 514, 515, 516, 517, 518, 519, 520, 521, 522, 523, 524, 525, 526, 527, 528, 
529, 530, 531, 532, 533, 534, 535, 536, 537, 538,

```



