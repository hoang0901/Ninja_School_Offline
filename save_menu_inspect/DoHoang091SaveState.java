/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 */
import javax.microedition.rms.RecordStore;

public final class DoHoang091SaveState {
    private static final String a = "ninja_school_offline_v3";
    private static final String b = "nso_offline_e72_v2";

    private DoHoang091SaveState() {
    }

    public static boolean hasSaveData() {
        return DoHoang091SaveState.a(a) || DoHoang091SaveState.a(b);
    }

    /*
     * Loose catch block
     */
    private static boolean a(String string) {
        boolean bl;
        RecordStore recordStore;
        block16: {
            block14: {
                block15: {
                    recordStore = null;
                    recordStore = RecordStore.openRecordStore((String)string, (boolean)false);
                    if (recordStore.getNumRecords() != 0) break block14;
                    if (recordStore == null) break block15;
                    try {
                        recordStore.closeRecordStore();
                    }
                    catch (Throwable throwable) {}
                }
                return false;
            }
            boolean bl2 = bl = recordStore.getRecord(1) != null;
            if (recordStore == null) break block16;
            try {
                recordStore.closeRecordStore();
            }
            catch (Throwable throwable) {}
        }
        return bl;
        catch (Throwable throwable) {
            block17: {
                try {
                    if (recordStore == null) break block17;
                }
                catch (Throwable throwable2) {
                    if (recordStore != null) {
                        try {
                            recordStore.closeRecordStore();
                        }
                        catch (Throwable throwable3) {}
                    }
                    throw throwable2;
                }
                try {
                    recordStore.closeRecordStore();
                }
                catch (Throwable throwable4) {}
            }
            return false;
        }
    }
}

