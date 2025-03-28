@echo off
call mvn clean -Preproducer || exit /b
call mvn package -Preproducer -Dnative -DskipTests=true ^
 -Dquarkus.jib.user=1001 ^
 || exit /b
