#!/bin/bash
mvn clean
mvn dependency:sources
mvn dependency:resolve -Dclassifier=javadoc
mvn eclipse:eclipse
mvn idea:idea
