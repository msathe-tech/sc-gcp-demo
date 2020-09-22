This is a simple project to demonstrate how to use SpringBoot integrations with Google Cloud Datastore.
Following are the key dependencies in the [POM](https://github.com/msathe-tech/sc-gcp-demo/blob/master/pom.xml)
```XML
<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-gcp-starter</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-gcp-starter-data-datastore</artifactId>
<!--			<version>1.2.2.RELEASE</version>-->
		</dependency>
```

Datastore repository interface is [PersonRepository](https://github.com/msathe-tech/sc-gcp-demo/blob/master/src/main/java/com/example/scgcpdemo/repo/PersonRepository.java)

Run following to ensure Spring Boot picks up default GCP credentials

`gcloud auth application-default login`

Read [call persons.http](https://github.com/msathe-tech/sc-gcp-demo/blob/master/call%20persons.http) to see how to generate load.

Take a look at [Spring Cloud GCP](https://spring.io/projects/spring-cloud-gcp) for more information. 
