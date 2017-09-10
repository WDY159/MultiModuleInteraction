package com.example.boost.delegateimp;


import com.example.aninterface.delegate.IDataDelegate;
import com.example.aninterface.delegate.IDelegateFactory;
import com.example.aninterface.module.submodule2.Submodule2DelegateConsts;

/**
 * @author chaohao.zhou
 * @Description:
 * @date 2017/1/12 11:18
 * @copyright TCL-MIG
 */
public class SubmoduleDelegateFactory implements IDelegateFactory {

    @Override
    public IDataDelegate getDataTransfer(int code) {
        switch (code) {

            case Submodule2DelegateConsts.DataCode.getTotalMemoryByte:
                return new GetTotalMemoryByte();
            case Submodule2DelegateConsts.DataCode.getSyncData:
                return new GetSyncData();

        }
        return null;
    }

}
