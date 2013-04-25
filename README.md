WatchTestJavaProcess
====================

Measures for carrying out the test of Fluentd plugin, the performance of the Java VM, it is a test program.

要は、JVMWatcher Fluentdプラグインをテストする際に計測する対象のJavaプログラム。
このプログラムは、メモリ使用量の増減や、使用スレッド数、CPU負荷を、定義で設定可能なJavaプログラム。

[Windows]
JavaTestProc.bat [block size(byte)] [max block num] [count up time(msec)] [thread num]
ex:JavaTestProc.bat 4096 1024 5 10
