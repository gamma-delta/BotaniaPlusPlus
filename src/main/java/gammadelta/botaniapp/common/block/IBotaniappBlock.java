package gammadelta.botaniapp.common.block;

import gammadelta.botaniapp.common.lib.ModNames;
import vazkii.arl.interf.IModBlock;

public interface IBotaniappBlock extends IModBlock {
    //This isn't copy-pasted! I typed it by hand!

    @Override
    default String getModNamespace() {
        return ModNames.MODID;
    }
}
