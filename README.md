Reproducer for https://github.com/eclipse-ee4j/mojarra/issues/5041

Steps to reproduce:

1. Run `./gradlew war` to build the war files.
2. Deploy `application-omnifaces/build/libs/application-omnifaces.war` or `application-custom/build/libs/application-custom.war` to a plain Tomcat 10
3. Deployment fails