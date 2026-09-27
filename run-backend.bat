@echo off
set JAVA_HOME=C:\Program Files\Eclipse Adoptium\jdk-17.0.20.101-hotspot
set PATH=%JAVA_HOME%\bin;%PATH%
echo ================================
echo  RePlato Backend Launcher
echo ================================
echo.
echo Java version:
java -version
echo.
echo ================================
echo  Starting backend...
echo ================================
echo.
cd /d "%~dp0"
mvn spring-boot:run
pause