/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 */
import java.util.Calendar;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class Class_bb {
    private static Class_bb a;
    private static int[] b;

    private static boolean a(int n, int n2) {
        return n < n2;
    }

    public final void a(String object, String string) {
        String string2;
        String string3;
        Calendar calendar = Calendar.getInstance();
        int n = calendar.get(b[0]);
        int n2 = calendar.get(b[1]) + b[2];
        int n3 = calendar.get(b[2]);
        StringBuffer stringBuffer = new StringBuffer();
        if (Class_bb.a(n, b[3])) {
            string3 = "0" + n;
            "".length();
            if (((0x3F ^ 0xC ^ (4 ^ 0x24)) & (0x21 ^ 5 ^ (0x63 ^ 0x54) ^ -" ".length())) != 0) {
                return;
            }
        } else {
            string3 = String.valueOf(n);
        }
        StringBuffer stringBuffer2 = stringBuffer.append(string3).append("-");
        if (Class_bb.a(n2, b[3])) {
            string2 = "0" + n2;
            "".length();
            if (null != null) {
                return;
            }
        } else {
            string2 = String.valueOf(n2);
        }
        Object object2 = stringBuffer2.append(string2).append("-").append(n3).toString();
        object = object2 + "_" + (String)object;
        try {
            object2 = RecordStore.openRecordStore((String)"SaveFileNTGT", (boolean)b[2]);
            object = (String)object + ":" + string;
            object = ((String)object).getBytes();
            object2.addRecord((byte[])object, b[4], ((Object)object).length);
            "".length();
            object2.closeRecordStore();
            return;
        }
        catch (RecordStoreException recordStoreException) {
            object2 = recordStoreException;
            recordStoreException.printStackTrace();
            return;
        }
    }

    public static Class_bb a() {
        if (Class_bb.a(a)) {
            a = new Class_bb();
        }
        return a;
    }

    private static boolean a(Object object) {
        return object == null;
    }

    private static void b() {
        b = new int[5];
        Class_bb.b[0] = 0 + 50 - -34 + 49 ^ 103 + 24 - 116 + 117;
        Class_bb.b[1] = "  ".length();
        Class_bb.b[2] = " ".length();
        Class_bb.b[3] = 155 + 64 - 179 + 128 ^ 99 + 137 - 173 + 99;
        Class_bb.b[4] = (0x55 ^ 0x37) & ~(0x39 ^ 0x5B);
    }

    static {
        Class_bb.b();
    }
}

