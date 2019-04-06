package com.example.xydzjnq.hookstartactivitydemo.hook;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;

public class InstrumentationProxy extends Instrumentation {
    Instrumentation mInstrumentation;

    public InstrumentationProxy(Instrumentation instrumentation) {
        mInstrumentation = instrumentation;
    }

    public Activity newActivity(ClassLoader cl, String className,
                                Intent intent)
            throws InstantiationException, IllegalAccessException,
            ClassNotFoundException {

        // 把替身恢复成真身
        Intent rawIntent = intent.getParcelableExtra(HookHelper.EXTRA_TARGET_INTENT);
        if(rawIntent == null) {
            return mInstrumentation.newActivity(cl, className, intent);
        }

        String newClassName = rawIntent.getComponent().getClassName();
        return mInstrumentation.newActivity(cl, newClassName, rawIntent);
    }
}
