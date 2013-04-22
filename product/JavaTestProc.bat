@echo off
cd /d %~dp0

set CLASSPATH=%CLASSPATH%;watchtest.jar;

if "%1" == "" goto error
if "%2" == "" goto error
if "%3" == "" goto error
if "%4" == "" goto error

java jvmwatcher.test.TestJavaProcess %1 %2 %3 %4
goto end

:error

echo JavaTestProc.bat [block size(byte)] [max block num] [count up time(msec)] [thread num]
echo ex:JavaTestProc.bat 4096 1024 5 10

:end
