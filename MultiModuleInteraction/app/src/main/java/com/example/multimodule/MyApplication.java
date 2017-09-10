package com.example.multimodule;

import com.example.aninterface.delegate.ModuleDelegate;
import com.example.aninterface.module.submodule2.Submodule2DelegateConsts;
import com.example.aninterface.module.app.AppDelegateConsts;
import com.example.basemodule.BaseApplication;
import com.example.multimodule.delegateimp.AppDelegateFactory;
import com.example.boost.delegateimp.SubmoduleDelegateFactory;

/**
 * Created by Administrator on 2017/7/10.
 */

public class MyApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        initCleanDelegate();
    }
    private void initCleanDelegate() {
        ModuleDelegate.register(AppDelegateConsts.FACTORY, new AppDelegateFactory());
        ModuleDelegate.register(Submodule2DelegateConsts.FACTORY, new SubmoduleDelegateFactory());
    }
}
