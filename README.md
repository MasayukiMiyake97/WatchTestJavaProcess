WatchTestJavaProcess
====================

WatchTestJavaProcess is the program for the test to do the test that the fluentd plug-in ( jvmwatcher ) and JVMWatcher which collects the operating status of JVM measure JVM.
When executing WatchTestJavaProcess, in the update time which was set by the argument, the memory size becomes the specification of increasing.
If finishing acquiring a memory of specifying for the number of times, it repeats the processing which opens a memory.

WatchTestJavaProcessは、JVMの稼働状態を収集するfluentdプラグイン（jvmwatcher）とJVMWatcherが、JVMを計測する試験を行うための、テスト用プログラムです。
WatchTestJavaProcessを実行すると、引数で設定した更新時間で、メモリサイズが増えていく仕様となっています。
指定した回数分のメモリを取得し終わったら、メモリを開放する処理を繰り返します。

In the WatchTestJavaProcess command, it is preparing two of the batch files of the Windows and the shell script files of the Linux.
The WatchTestJavaProcess command is under / product /.

The execution of the batch file of the Windows

>JavaTestProc.bat [block size(byte)] [max block num] [count up time(msec)] [thread num]

>Ex.$JavaTestProc.bat 4096 1024 5 10

The execution of the shell script file of the Linux

>./JavaTestProc.sh [block size(byte)] [max block num] [count up time(msec)] [thread num]

>Ex.$JavaTestProc.sh 4096 1024 5 10


