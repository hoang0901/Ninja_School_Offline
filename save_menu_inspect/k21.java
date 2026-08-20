/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 */
import javax.microedition.rms.RecordStore;

final class k21 {
    static final String a = "ninja_school_offline_v3";
    private static final String b = "nso_offline_e72_v2";

    private k21() {
    }

    static byte[] a() throws Exception {
        byte[] byArray = k21.a(a, true);
        if (byArray != null) {
            return byArray;
        }
        byte[] byArray2 = k21.a(b, false);
        if (byArray2 != null) {
            k21.a(byArray2);
        }
        return byArray2;
    }

    static void a(byte[] byArray) throws Exception {
        if (byArray == null) {
            return;
        }
        RecordStore recordStore = null;
        try {
            recordStore = RecordStore.openRecordStore((String)a, (boolean)true);
            if (recordStore.getNumRecords() == 0) {
                recordStore.addRecord(byArray, 0, byArray.length);
            } else {
                recordStore.setRecord(1, byArray, 0, byArray.length);
            }
        }
        finally {
            k21.a(recordStore);
        }
    }

    private static byte[] a(String string, boolean bl) throws Exception {
        RecordStore recordStore = null;
        try {
            recordStore = RecordStore.openRecordStore((String)string, (boolean)bl);
            byte[] byArray = recordStore.getNumRecords() == 0 ? null : recordStore.getRecord(1);
            return byArray;
        }
        catch (Throwable throwable) {
            if (!bl) {
                return null;
            }
            if (throwable instanceof Exception) {
                throw (Exception)throwable;
            }
            throw new Exception(throwable.toString());
        }
        finally {
            k21.a(recordStore);
        }
    }

    private static void a(RecordStore recordStore) {
        if (recordStore == null) {
            return;
        }
        try {
            recordStore.closeRecordStore();
        }
        catch (Throwable throwable) {}
    }
}

