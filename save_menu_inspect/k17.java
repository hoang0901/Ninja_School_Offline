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

final class k17 {
    private static final int f = 33;
    private static final int g = 3;
    static final int a = 1;
    static final int b = 2;
    static final int c = 3;
    static final int d = 4;
    static final int e = 5;
    private static final int h = 47001;
    private static final int i = 47002;
    private static final int j = 47003;
    private static final int k = 47004;
    private static final int l = 47005;
    private static final int m = 47006;
    private static final int n = 47007;
    private static final int o = 47008;
    private static final int p = 47009;
    private static final int q = 47010;
    private static final int r = 47011;
    private static final int s = 47012;
    private static final int t = 20042;
    private static final int u = 20043;
    private static final int v = 20044;
    private static final int w = 20045;
    private static final int x = 411;
    private static final int y = 412;
    private static final int z = 413;
    private static final int A = 415;
    private static final int B = 417;
    private static final int C = 418;
    private static final int D = 769;
    private static final int E = 770;
    private static final int F = 911;
    private static final int G = 912;
    private static final int H = 915;
    private static final int I = 916;
    private static final int J = 919;
    private static final int K = 920;
    private static final int L = 921;
    private static final int M = 232;
    private static final int N = 9;
    private static final int O = 2;
    private static final int P = 0;
    private static final int Q = 1;
    private static final int R = 1263489615;
    private static final int S = 1;
    private static final String T = "nso_offline_koro_king_v1";
    private static final long U = 2592000000L;
    private static final k4 V = new k4("event_wire");
    private static int[] W;
    private static boolean X;
    private static int Y;
    private static int Z;

    static {
        Y = -1;
        Z = -1;
    }

    private k17() {
    }

    static void a(int n) throws Exception {
        if (!ke.t()) {
            return;
        }
        k1d.a(n, new String[]{"Tinh d\u1ea7u", "Ng\u00f4i sao may m\u1eafn", "\u0110ua Top", "Hoa ph\u1ee5c sinh"}, new int[]{47001, 47004, 47007, 47009});
    }

    static boolean a(int n, int n2) throws Exception {
        if (n != 33 || !ke.t()) {
            return false;
        }
        switch (n2) {
            case 47001: {
                k1d.a(n, new String[]{"Ng\u01b0 th\u1ea3o", "T\u00f4 di\u1ec7p"}, new int[]{47002, 47003});
                return true;
            }
            case 47002: {
                k17.a(1, 20042, "Tinh d\u1ea7u ng\u01b0 th\u1ea3o");
                return true;
            }
            case 47003: {
                k17.a(2, 20043, "Tinh d\u1ea7u t\u00f4 di\u1ec7p");
                return true;
            }
            case 47004: {
                k1d.a(n, new String[]{"Ng\u00f4i sao nh\u1ecf", "Ng\u00f4i sao may m\u1eafn"}, new int[]{47005, 47006});
                return true;
            }
            case 47005: {
                k17.a(3, 20044, "Ng\u00f4i sao nh\u1ecf");
                return true;
            }
            case 47006: {
                k17.a(4, 20045, "Ng\u00f4i sao may m\u1eafn");
                return true;
            }
            case 47007: {
                k1d.a(n, new String[]{"Ng\u00f4i sao may m\u1eafn"}, new int[]{47008});
                return true;
            }
            case 47008: {
                DoHoang091.a("Ng\u00f4i sao may m\u1eafn", "Ch\u01b0a c\u00f3 x\u1ebfp h\u1ea1ng.");
                return true;
            }
            case 47009: {
                k1d.a(n, new String[]{"Hoa thi\u00ean di\u1ec7u", "Hoa d\u1ea1 y\u1ebfn", "\u0110i\u1ec3m s\u1ef1 ki\u1ec7n"}, new int[]{47010, 47011, 47012});
                return true;
            }
            case 47010: {
                k17.i(1);
                return true;
            }
            case 47011: {
                k17.i(2);
                return true;
            }
            case 47012: {
                DoHoang091.a("H\u01b0\u1edbng d\u1eabn", "- \u0110i\u1ec3m s\u1ef1 ki\u1ec7n: " + k17.m(0) + "\n\nB\u1ea1n c\u00f3 th\u1ec3 quy \u0111\u1ed5i \u0111i\u1ec3m s\u1ef1 ki\u1ec7n nh\u01b0 sau\n- Hoa thi\u00ean di\u1ec7u: 5.000 \u0111i\u1ec3m" + "\n- Hoa d\u1ea1 y\u1ebfn: 20.000 \u0111i\u1ec3m\n");
                return true;
            }
        }
        return false;
    }

    static boolean a(int n, String string) throws Exception {
        int n2 = k17.g(n);
        if (n2 < 0) {
            return false;
        }
        int n3 = Y;
        int n4 = Z;
        Y = -1;
        Z = -1;
        if (n3 != n2 || n4 != DoHoang091.s() || !ke.t() || string == null || string.length() == 0) {
            return true;
        }
        try {
            k17.b(n2, Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            DoHoang091.a("D\u1eef li\u1ec7u nh\u1eadp kh\u00f4ng h\u1ee3p l\u1ec7.");
        }
        return true;
    }

    static void b(int n, int n2) throws Exception {
        if (!ke.t()) {
            return;
        }
        switch (n) {
            case 1: {
                k17.a(n2, new int[]{911}, new int[]{3}, 915, false);
                break;
            }
            case 2: {
                k17.a(n2, new int[]{912}, new int[]{3}, 916, true);
                break;
            }
            case 3: {
                k17.a(n2, new int[]{415, 411, 412, 413}, new int[]{1, 1, 1, 1}, 417, false);
                break;
            }
            case 4: {
                k17.a(n2, new int[]{415, 411, 412, 413}, new int[]{1, 1, 1, 1}, 418, true);
                break;
            }
            case 5: {
                k17.h(n2);
                break;
            }
        }
    }

    static void a() throws Exception {
        k17.b(1);
    }

    static void b(int n) throws Exception {
        if (n < 1) {
            return;
        }
        k16.a(415, n, false, (byte)0, (byte)0);
    }

    static boolean c(int n, int n2) throws Exception {
        String string;
        if (n2 == 769) {
            return k17.j(n);
        }
        if (!ke.t()) {
            return false;
        }
        if (n2 != 916 && n2 != 915 && n2 != 417 && n2 != 418) {
            return false;
        }
        if (k2e.s() < 1) {
            DoHoang091.a("H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return true;
        }
        if (n2 > 916 && !DoHoang091.c(3, 100)) {
            DoHoang091.b("Vui t\u00ecm Kiriko \u0111\u1ec3 giao v\u1eadt ph\u1ea9m n\u00e0y.");
            return true;
        }
        String string2 = n2 == 418 ? "EVENT_GOLD2" : (string = n2 == 916 ? "EVENT_GOLD" : "EVENT_COIN");
        if (!k19.b(string)) {
            DoHoang091.b("Ph\u1ea7n th\u01b0\u1edfng " + k16.A(n2) + " hi\u1ec7n ch\u01b0a \u0111\u01b0\u1ee3c m\u1edf.");
            return true;
        }
        k19.a(n, n2, string);
        return true;
    }

    static boolean c(int n) {
        return n != 232 || k16.d(770) > 0;
    }

    static boolean d(int n) {
        return n == 232;
    }

    static void e(int n) throws Exception {
        if (n != 232) {
            return;
        }
        if (k16.b(770, 1) != 1) {
            return;
        }
        DoHoang091.c(50000000L);
        if (k2e.s() <= 0) {
            return;
        }
        int n2 = kb.a("BUA_MAY_MAN");
        if (n2 >= 0) {
            k19.g(n2);
        }
    }

    static void a(int n, short s, short s2) throws Exception {
        int n2;
        int n3 = Math.abs(n - DoHoang091.z().r);
        if (k10.d(n) && (n2 = k17.a("KORO_MONSTER")) >= 0 && (k2e.s() == 0 || k16.a(n2, 1, false, (byte)0, (byte)0) < 0)) {
            kb.b(n2, s, s2);
        }
        if (n3 <= 10) {
            n2 = DoHoang091.g(2000);
            if (DoHoang091.g(2000) == 1) {
                k17.d();
            }
        }
    }

    static void b(int n, short s, short s2) {
    }

    static boolean b() {
        return k17.n(1) != 0;
    }

    static int f(int n) {
        if (!k17.b() || n <= 0) {
            return n;
        }
        return n - n * 80 / 100;
    }

    static void c() {
        Y = -1;
        Z = -1;
        X = false;
        W = null;
    }

    private static void a(int n, int n2, String string) throws Exception {
        Y = n;
        Z = DoHoang091.s();
        DoHoang091.a(string, n2);
    }

    private static int g(int n) {
        if (n == 20042) {
            return 1;
        }
        if (n == 20043) {
            return 2;
        }
        if (n == 20044) {
            return 3;
        }
        if (n == 20045) {
            return 4;
        }
        return -1;
    }

    private static boolean a(int n, int[] nArray, int[] nArray2, int n2, boolean bl) throws Exception {
        if (!k17.k(n)) {
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
        if (k16.a(n2, n, false, (byte)0, (byte)0) < 0) {
            return false;
        }
        if (bl) {
            k17.d(0, 1);
        }
        return true;
    }

    private static void h(int n) throws Exception {
        if (k2e.s() < 1) {
            DoHoang091.a("H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return;
        }
        int n2 = k17.l(n);
        if (n2 < 0) {
            k1d.b(3, "H\u00e3y t\u00ecm \u0111\u00fang lo\u00e0i hoa r\u1ed3i \u0111\u1ebfn g\u1eb7p ta");
            return;
        }
        int n3 = kb.a("LINH_VAT");
        if (n3 < 0) {
            return;
        }
        long l = (long)(1 + DoHoang091.g(3)) * 2592000000L / 3L;
        long l2 = System.currentTimeMillis() + l;
        if (DoHoang091.g(35) == 0) {
            l2 += l;
        }
        if (!k19.a(n3, l2)) {
            return;
        }
        k16.c(n2, 1);
    }

    private static void i(int n) throws Exception {
        int n2;
        int n3 = n2 = n == 1 ? 5000 : 20000;
        if (k17.m(0) < n2) {
            k1d.b(33, "B\u1ea1n c\u1ea7n t\u1ed1i thi\u1ec3u " + n2 + " \u0111i\u1ec3m s\u1ef1 ki\u1ec7n m\u1edbi c\u00f3 th\u1ec3 \u0111\u1ed5i \u0111\u01b0\u1ee3c v\u1eadt n\u00e0y.");
            return;
        }
        if (k2e.s() < 1) {
            k1d.b(33, "H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return;
        }
        if (k16.a(n == 1 ? 919 : 920, 1, false, (byte)0, (byte)0) >= 0) {
            k17.d(0, -n2);
        }
    }

    private static void d() throws Exception {
        boolean bl;
        DoHoang091.k0 k02 = DoHoang091.z();
        int n = DoHoang091.e(k02);
        boolean bl2 = bl = n == 921 || k02.aI.length > 11 && (k02.aI[11] & 0xFFFF) == 921;
        if (bl) {
            return;
        }
        k17.e(1, 1);
        DoHoang091.b("B\u1ea1n \u0111\u00e3 b\u1ecb d\u00ednh Virus");
    }

    private static boolean j(int n) throws Exception {
        int n2;
        if (!k17.b()) {
            DoHoang091.b("B\u1ea1n kh\u00f4ng b\u1ecb nhi\u1ec5m b\u1ec7nh");
            return true;
        }
        k17.e(1, 0);
        DoHoang091.c(50000000L);
        if (k2e.s() > 0 && (n2 = kb.a("TRE_XANH_TRAM_DOT")) >= 0 && k16.a(n2, 1, false, (byte)0, (byte)0) >= 0) {
            k16.c(n, 1);
        }
        return true;
    }

    private static boolean k(int n) throws Exception {
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

    private static int l(int n) {
        DoHoang091.k0 k02 = DoHoang091.z();
        int n2 = 0;
        while (n2 < k02.K.length) {
            if ((k02.K[n2] & 0xFFFF) == n && (k02.L[n2] & 0xFFFF) > 0) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    private static int a(String string) throws Exception {
        byte[] byArray = V.find(string.hashCode());
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

    private static int m(int n) {
        return k17.n(n);
    }

    private static int n(int n) {
        k17.f();
        if (n < 0 || n >= 2) {
            return 0;
        }
        return W[k17.e() + n];
    }

    private static void d(int n, int n2) {
        k17.a(n, (long)k17.n(n) + (long)n2);
    }

    private static void e(int n, int n2) {
        k17.a(n, (long)n2);
    }

    private static void a(int n, long l) {
        k17.f();
        if (n < 0 || n >= 2) {
            return;
        }
        if (l < 0L) {
            l = 0L;
        }
        if (l > Integer.MAX_VALUE) {
            l = Integer.MAX_VALUE;
        }
        k17.W[k17.e() + n] = (int)l;
        k17.g();
    }

    private static int e() {
        int n = DoHoang091.s() - 1;
        if (n < 0) {
            n = 0;
        }
        if (n >= 9) {
            n = 8;
        }
        return n * 2;
    }

    private static void f() {
        if (X && W != null) {
            return;
        }
        W = new int[18];
        RecordStore recordStore = null;
        try {
            try {
                recordStore = RecordStore.openRecordStore((String)T, (boolean)true);
                if (recordStore.getNumRecords() > 0) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(recordStore.getRecord(1)));
                    if (dataInputStream.readInt() == 1263489615 && dataInputStream.readUnsignedByte() == 1 && dataInputStream.readUnsignedByte() == 9 && dataInputStream.readUnsignedByte() == 2) {
                        int n = 0;
                        while (n < W.length) {
                            int n2 = dataInputStream.readInt();
                            k17.W[n] = n2 < 0 ? 0 : n2;
                            ++n;
                        }
                        if (dataInputStream.available() != 0) {
                            W = new int[18];
                        }
                    }
                    dataInputStream.close();
                }
            }
            catch (Exception exception) {
                W = new int[18];
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
        X = true;
    }

    private static void g() {
        RecordStore recordStore;
        block12: {
            k17.f();
            recordStore = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8 + W.length * 4);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(1263489615);
                    dataOutputStream.writeByte(1);
                    dataOutputStream.writeByte(9);
                    dataOutputStream.writeByte(2);
                    int n = 0;
                    while (n < W.length) {
                        dataOutputStream.writeInt(W[n]);
                        ++n;
                    }
                    dataOutputStream.flush();
                    byte[] byArray = byteArrayOutputStream.toByteArray();
                    recordStore = RecordStore.openRecordStore((String)T, (boolean)true);
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

