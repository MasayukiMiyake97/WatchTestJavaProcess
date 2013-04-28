#!/bin/bash

export CLASSPATH=$CLASSPATH:watchtest.jar

# check param num
if [ $# -ne 4 ]; then
  echo "JavaTestProc.sh [block size(byte)] [max block num] [count up time(msec)] [thread num]" 1>&2
  echo "ex:JavaTestProc.sh 4096 1024 5 10" 1>&2
  exit 1
fi

java jvmwatcher.test.TestJavaProcess $1 $2 $3 $4

exit 0
