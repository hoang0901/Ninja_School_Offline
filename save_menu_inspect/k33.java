/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.rms.RecordStore;

final class k33 {
    private static final int e = 33;
    static final int a = 0;
    static final int b = 1;
    static final int c = 2;
    static final int d = 3;
    private static final int f = 46001;
    private static final int g = 46002;
    private static final int h = 46003;
    private static final int i = 46004;
    private static final int j = 46005;
    private static final int k = 46006;
    private static final int l = 9999;
    private static final int m = 386;
    private static final int n = 388;
    private static final int o = 389;
    private static final int p = 390;
    private static final int q = 391;
    private static final int r = 393;
    private static final int s = 394;
    private static final int t = 9;
    private static final int u = 2;
    private static final int v = 0;
    private static final int w = 1;
    private static final int x = 1464681537;
    private static final int y = 1;
    private static final String z = "nso_offline_womens_day_v1";
    private static final k4 A = new k4("event_wire");
    private static int[] B;
    private static boolean C;
    private static int D;
    private static int E;
    private static int F;

    static {
        D = -1;
        E = -1;
        F = -1;
    }

    private k33() {
    }

    static void a(int n) throws Exception {
        k33.c(n, 0);
    }

    static void b(int n) throws Exception {
        k33.c(n, 1);
    }

    private static void c(int n, int n2) throws Exception {
        if (!k33.f(n2)) {
            return;
        }
        k1d.a(n, new String[]{"\u0110\u1ed5i Hoa H\u1ed3ng Xanh", "\u0110\u1ed5i B\u00f3 Hoa", "H\u01b0\u1edbng d\u1eabn"}, new int[]{46001, 46002, 46006});
    }

    static boolean a(int n, int n2) throws Exception {
        if (n != 33) {
            return false;
        }
        int n3 = k33.b();
        if (n3 < 0) {
            return false;
        }
        switch (n2) {
            case 46001: {
                k33.a(n3, 0, "Hoa H\u1ed3ng Xanh");
                return true;
            }
            case 46002: {
                k1d.a(n, new String[]{"B\u00f3 Hoa H\u1ed3ng \u0110\u1ecf", "B\u00f3 Hoa H\u1ed3ng V\u00e0ng", "B\u00f3 Hoa H\u1ed3ng Xanh"}, new int[]{46003, 46004, 46005});
                return true;
            }
            case 46003: {
                k33.a(n3, 1, "S\u1ed1 B\u00f3 Hoa H\u1ed3ng \u0110\u1ecf");
                return true;
            }
            case 46004: {
                k33.a(n3, 2, "S\u1ed1 B\u00f3 Hoa H\u1ed3ng V\u00e0ng");
                return true;
            }
            case 46005: {
                k33.a(n3, 3, "S\u1ed1 B\u00f3 Hoa H\u1ed3ng Xanh");
                return true;
            }
            case 46006: {
                DoHoang091.a("H\u01b0\u1edbng D\u1eabn", "- \u0110i\u1ec3m ti\u00eau x\u00e0i: " + k33.d(n3) + "\n- 10 \u0111i\u1ec3m ti\u00eau x\u00e0i = Hoa h\u1ed3ng xanh." + "\n- 50 Hoa H\u1ed3ng \u0110\u1ecf + 1 Gi\u1ea5y M\u00e0u = B\u00f3 Hoa H\u1ed3ng V\u00e0ng." + "\n- 30 Hoa H\u1ed3ng \u0110\u1ecf + 1 Ruy B\u0103ng = B\u00f3 Hoa H\u1ed3ng \u0110\u1ecf." + "\n- 50 Hoa H\u1ed3ng Xanh + 500.000 y\u00ean = B\u00f3 Hoa H\u1ed3ng Xanh.");
                return true;
            }
        }
        return false;
    }

    static boolean a(int n, String string) throws Exception {
        if (n != 9999 || D < 0) {
            return false;
        }
        int n2 = D;
        int n3 = E;
        int n4 = F;
        D = -1;
        E = -1;
        F = -1;
        if (n3 != DoHoang091.s() || !k33.f(n4) || string == null || string.length() == 0) {
            return true;
        }
        try {
            k33.a(n4, n2, Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            DoHoang091.a("D\u1eef li\u1ec7u nh\u1eadp kh\u00f4ng h\u1ee3p l\u1ec7.");
        }
        return true;
    }

    static void a(int n, int n2, int n3) throws Exception {
        if (!k33.f(n)) {
            return;
        }
        switch (n2) {
            case 0: {
                k33.d(n, n3);
                break;
            }
            case 1: {
                k33.a(n3, new int[]{386, 394}, new int[]{30, 1}, 389);
                break;
            }
            case 2: {
                k33.a(n3, new int[]{386, 393}, new int[]{50, 1}, 390);
                break;
            }
            case 3: {
                k33.a(n3, new int[]{388}, new int[]{50}, 391);
                break;
            }
        }
    }

    static boolean b(int n, int n2) throws Exception {
        String string;
        int n3 = k33.b();
        if (n3 < 0) {
            return false;
        }
        if (n2 == 390) {
            string = "EVENT_COIN";
        } else if (n2 == 389 || n2 == 391) {
            string = n3 == 0 ? "WOMEN_INTL_GOLD" : "EVENT_GOLD";
        } else {
            return false;
        }
        if (k2e.s() < 1) {
            DoHoang091.a("H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return true;
        }
        if (A.find(string.hashCode()) == null) {
            DoHoang091.b("Ph\u1ea7n th\u01b0\u1edfng " + k16.A(n2) + " hi\u1ec7n ch\u01b0a \u0111\u01b0\u1ee3c m\u1edf.");
            return true;
        }
        k19.a(n, n2, string);
        return true;
    }

    static void a(int n, short s, short s2) throws Exception {
        int n2 = k33.b();
        if (n2 < 0 || !k10.d(n)) {
            return;
        }
        String string = n2 == 0 ? "WOMEN_INTL_MONSTER" : "WOMEN_VN_MONSTER";
        int n3 = k33.a(string);
        if (n3 < 0) {
            return;
        }
        if (k2e.s() > 0 && k16.a(n3, 1, false, (byte)0, (byte)0) >= 0) {
            return;
        }
        kb.b(n3, s, s2);
    }

    static void a(short s, short s2) throws Exception {
        int n = k33.b();
        if (n < 0) {
            return;
        }
        String string = n == 0 ? "WOMEN_INTL_MONSTER" : "WOMEN_VN_MONSTER";
        int n2 = 0;
        while (n2 < 20) {
            int n3 = k33.a(string);
            if (n3 < 0) {
                return;
            }
            if (k2e.s() <= 0 || k16.a(n3, 1, false, (byte)0, (byte)0) < 0) {
                kb.b(n3, s, s2);
            }
            ++n2;
        }
    }

    static void b(int n, short s, short s2) {
    }

    static void a() {
        D = -1;
        E = -1;
        F = -1;
        C = false;
        B = null;
    }

    private static void a(int n, int n2, String string) throws Exception {
        F = n;
        D = n2;
        E = DoHoang091.s();
        DoHoang091.a(string, 9999);
    }

    private static void d(int n, int n2) throws Exception {
        if (!k33.c(n2)) {
            return;
        }
        int n3 = n2 * 10;
        if (k33.d(n) < n3) {
            k1d.b(33, "Kh\u00f4ng \u0111\u1ee7 \u0111i\u1ec3m ti\u00eau x\u00e0i.");
            return;
        }
        k33.e(n, -n3);
        k16.a(388, n2, false, (byte)0, (byte)0);
    }

    private static boolean a(int n, int[] nArray, int[] nArray2, int n2) throws Exception {
        if (!k33.c(n)) {
            return false;
        }
        int n3 = 0;
        while (n3 < nArray.length) {
            long l = (long)nArray2[n3] * (long)n;
            if (l > 32767L || !k16.g(nArray[n3], (int)l)) {
                k1d.b(33, "Kh\u00f4ng \u0111\u1ee7 " + k16.A(nArray[n3]));
                return false;
            }
            ++n3;
        }
        if (k2e.s() < 1) {
            k1d.b(33, "H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return false;
        }
        n3 = 0;
        while (n3 < nArray.length) {
            if (!k16.d(nArray[n3], nArray2[n3] * n)) {
                return false;
            }
            ++n3;
        }
        return k16.a(n2, n, false, (byte)0, (byte)0) >= 0;
    }

    private static boolean c(int n) throws Exception {
        if (n < 1) {
            k1d.b(33, "S\u1ed1 l\u01b0\u1ee3ng t\u1ed1i thi\u1ec3u l\u00e0 1.");
            return false;
        }
        if (n > 1000) {
            k1d.b(33, "S\u1ed1 l\u01b0\u1ee3ng t\u1ed1i \u0111a l\u00e0 1.000.");
            return false;
        }
        return true;
    }

    private static int d(int n) {
        k33.c();
        return B[k33.e(n)];
    }

    private static void e(int n, int n2) {
        k33.c();
        int n3 = k33.e(n);
        long l = (long)B[n3] + (long)n2;
        k33.B[n3] = l < 0L ? 0 : (l > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l);
        k33.d();
    }

    private static int e(int n) {
        int n2 = DoHoang091.s() - 1;
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 >= 9) {
            n2 = 8;
        }
        return n2 * 2 + n;
    }

    private static boolean f(int n) {
        return n == 0 ? ke.r() : n == 1 && ke.s();
    }

    private static int b() {
        if (ke.r()) {
            return 0;
        }
        if (ke.s()) {
            return 1;
        }
        return -1;
    }

    private static int a(String string) throws Exception {
        byte[] byArray = A.find(string.hashCode());
        if (byArray == null || byArray.length < 6) {
            return -1;
        }
        int n = byArray.length - 4;
        int n2 = (byArray[n] & 0xFF) << 24 | (byArray[n + 1] & 0xFF) << 16 | (byArray[n + 2] & 0xFF) << 8 | byArray[n + 3] & 0xFF;
        if (n2 <= 0) {
            return -1;
        }
        int n3 = DoHoang091.g(n2) + 1;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
        try {
            int n4 = dataInputStream.readUnsignedShort();
            int n5 = 0;
            while (n5 < n4) {
                int n6 = dataInputStream.readInt();
                int n7 = dataInputStream.readUnsignedShort();
                if (n3 <= n6) {
                    int n8 = n7;
                    return n8;
                }
                ++n5;
            }
            return -1;
        }
        finally {
            dataInputStream.close();
        }
    }

    private static void c() {
        if (C && B != null) {
            return;
        }
        B = new int[18];
        RecordStore recordStore = null;
        try {
            try {
                recordStore = RecordStore.openRecordStore((String)z, (boolean)true);
                if (recordStore.getNumRecords() > 0) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(recordStore.getRecord(1)));
                    if (dataInputStream.readInt() == 1464681537 && dataInputStream.readUnsignedByte() == 1 && dataInputStream.readUnsignedByte() == 9 && dataInputStream.readUnsignedByte() == 2) {
                        int n = 0;
                        while (n < B.length) {
                            int n2 = dataInputStream.readInt();
                            k33.B[n] = n2 < 0 ? 0 : n2;
                            ++n;
                        }
                        if (dataInputStream.available() != 0) {
                            B = new int[18];
                        }
                    }
                    dataInputStream.close();
                }
            }
            catch (Exception exception) {
                B = new int[18];
            }
        }
        catch (Throwable throwable) {
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                }
                catch (Exception exception) {}
            }
            throw throwable;
        }
        if (recordStore != null) {
            try {
                recordStore.closeRecordStore();
            }
            catch (Exception exception) {}
        }
        C = true;
    }

    private static void d() {
        RecordStore recordStore;
        block12: {
            k33.c();
            recordStore = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8 + B.length * 4);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(1464681537);
                    dataOutputStream.writeByte(1);
                    dataOutputStream.writeByte(9);
                    dataOutputStream.writeByte(2);
                    int n = 0;
                    while (n < B.length) {
                        dataOutputStream.writeInt(B[n]);
                        ++n;
                    }
                    dataOutputStream.flush();
                    byte[] byArray = byteArrayOutputStream.toByteArray();
                    recordStore = RecordStore.openRecordStore((String)z, (boolean)true);
                    if (recordStore.getNumRecords() == 0) {
                        recordStore.addRecord(byArray, 0, byArray.length);
                        break block12;
                    }
                    recordStore.setRecord(1, byArray, 0, byArray.length);
                }
                catch (Exception exception) {}
            }
            catch (Throwable throwable) {
                if (recordStore != null) {
                    try {
                        recordStore.closeRecordStore();
                    }
                    catch (Exception exception) {}
                }
                throw throwable;
            }
        }
        if (recordStore != null) {
            try {
                recordStore.closeRecordStore();
            }
            catch (Exception exception) {}
        }
    }
}

