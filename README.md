# HookStartActivityDemo
启动没有在AndroidManifest中声明的Activity

# 适配到API25
step1：对ActivityManagerNative的getDefault()方法进行Hook，把TargetActivity替换为StubActivity。

step2：对ActivityThread的mInstrumentation字段进行Hook，把StubActivity再替换回TargetActivity。
