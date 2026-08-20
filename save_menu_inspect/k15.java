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

final class k15 {
    private static final int v = 33;
    static final int a = 0;
    static final int b = 1;
    static final int c = 2;
    static final int d = 3;
    static final int e = 4;
    static final int f = 0;
    static final int g = 1;
    static final int h = 2;
    static final int i = 3;
    static final int j = 4;
    static final int k = 5;
    static final int l = 6;
    static final int m = 7;
    static final int n = 8;
    static final int o = 9;
    static final int p = 10;
    static final int q = 11;
    static final int r = 12;
    static final int s = 13;
    static final int t = 14;
    static final int u = 15;
    private static final int w = 43001;
    private static final int x = 43002;
    private static final int y = 43003;
    private static final int z = 43004;
    private static final int A = 43005;
    private static final int B = 43006;
    private static final int C = 43007;
    private static final int D = 43008;
    private static final int E = 43009;
    private static final int F = 43010;
    private static final int G = 43011;
    private static final int H = 43012;
    private static final int I = 43013;
    private static final int J = 43014;
    private static final int K = 43015;
    private static final int L = 9999;
    private static final int M = 1071;
    private static final int N = 1072;
    private static final int O = 1073;
    private static final int P = 1076;
    private static final int Q = 606;
    private static final int R = 607;
    private static final int S = 608;
    private static final int T = 609;
    private static final int U = 610;
    private static final int V = 611;
    private static final int W = 612;
    private static final int X = 617;
    private static final int Y = 819;
    private static final int Z = 805;
    private static final int aa = 806;
    private static final int ab = 807;
    private static final int ac = 808;
    private static final int ad = 809;
    private static final int ae = 810;
    private static final int af = 811;
    private static final int ag = 812;
    private static final int ah = 813;
    private static final int ai = 814;
    private static final int aj = 818;
    private static final long ak = 3600000L;
    private static final long al = 86400000L;
    private static final String am = "nso_offline_halloween_v1";
    private static final int an = 1212238924;
    private static final int ao = 1;
    private static final int ap = 9;
    private static final int aq = 16;
    private static final k4 ar = new k4("event_wire");
    private static int[] as;
    private static boolean at;
    private static int au;
    private static int av;

    static {
        au = -1;
        av = -1;
    }

    private k15() {
    }

    static void a(int n) throws Exception {
        k1d.a(n, new String[]{"L\u00e0m h\u1ed9p ma qu\u1ef7", "L\u00e0m k\u1eb9o t\u00e1o", "\u0110\u1ed5i \u0111\u1ed3 th\u1eddi trang", "\u0110\u1ed5i l\u1ed3ng \u0111\u00e8n", "Top s\u1ef1 ki\u1ec7n", "Hang Nymoz", "H\u01b0\u1edbng d\u1eabn"}, new int[]{43001, 43002, 43003, 43004, 43007, 43015, 43014});
    }

    static boolean a(int n, int n2) throws Exception {
        if (n != 33) {
            return false;
        }
        switch (n2) {
            case 43001: {
                k15.b(0, "H\u1ed9p ma qu\u1ef7");
                return true;
            }
            case 43002: {
                k15.b(1, "K\u1eb9o t\u00e1o");
                return true;
            }
            case 43003: {
                k15.b(4, 1);
                return true;
            }
            case 43004: {
                k1d.a(n, new String[]{"2 tri\u1ec7u xu", "500 l\u01b0\u1ee3ng"}, new int[]{43005, 43006});
                return true;
            }
            case 43005: {
                k19.b(false);
                return true;
            }
            case 43006: {
                k19.b(true);
                return true;
            }
            case 43007: {
                k1d.a(n, new String[]{"Bxh h\u1ed9p ma qu\u1ef7", "Bxh k\u1eb9o t\u00e1o", "Nh\u1eadn top 5k", "Nh\u1eadn top 50k", "Qu\u00e0 50K to\u00e0n server", "Qu\u00e0 \u0111ua top"}, new int[]{43008, 43009, 43010, 43011, 43012, 43013});
                return true;
            }
            case 43008: {
                k15.c(1, "Top h\u1ed9p ma qu\u1ef7");
                return true;
            }
            case 43009: {
                k15.c(2, "Top k\u1eb9o t\u00e1o");
                return true;
            }
            case 43010: {
                k15.a(5000, false);
                return true;
            }
            case 43011: {
                k15.a(50000, false);
                return true;
            }
            case 43012: {
                k15.a(50000, true);
                return true;
            }
            case 43013: {
                DoHoang091.a("Ph\u1ea7n th\u01b0\u1edfng", k15.g());
                return true;
            }
            case 43015: {
                k3.g();
                return true;
            }
            case 43014: {
                k15.f();
                return true;
            }
        }
        return false;
    }

    static boolean a(int n, String string) throws Exception {
        if (n != 9999 || au < 0) {
            return false;
        }
        int n2 = au;
        int n3 = av;
        au = -1;
        av = -1;
        if (n3 != DoHoang091.s()) {
            return true;
        }
        if (string == null || string.length() == 0) {
            return true;
        }
        try {
            k15.b(n2, Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            DoHoang091.a("D\u1eef li\u1ec7u nh\u1eadp kh\u00f4ng h\u1ee3p l\u1ec7.");
        }
        return true;
    }

    static void b(int n, int n2) throws Exception {
        switch (n) {
            case 0: {
                k15.f(n2);
                break;
            }
            case 1: {
                k15.g(n2);
                break;
            }
            case 2: {
                k15.h(n2);
                break;
            }
            case 3: {
                k15.i(n2);
                break;
            }
            case 4: {
                k15.b();
                break;
            }
        }
    }

    static boolean c(int n, int n2) throws Exception {
        switch (n2) {
            case 1071: {
                k15.a(0, 0, 0, 1);
                DoHoang091.b("S\u1ed1 l\u01b0\u1ee3t tham gia l\u1ec5 h\u1ed9i ho\u00e1 trang: " + k15.b(3));
                k16.c(n, 1);
                return true;
            }
            case 606: {
                kd.b(43, 28800000L, 2, 606);
                k16.c(n, 1);
                return true;
            }
            case 611: {
                if (k2e.s() == 0) {
                    DoHoang091.a("H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
                    return true;
                }
                if (k15.a(n, n2, "HALLOWEEN_COIN")) {
                    k15.a(0, 0, 1, 0);
                }
                return true;
            }
            case 612: {
                int n3 = k15.k(819);
                if (n3 < 0) {
                    DoHoang091.b("H\u00e3y mua ch\u00eca kh\u00f3a \u1edf npc Goosho \u0111\u1ec3 m\u1edf h\u1ed9p ma qu\u1ef7");
                    return true;
                }
                if (k2e.s() == 0) {
                    DoHoang091.a("H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
                    return true;
                }
                k15.d(n, n3);
                k15.a(0, 1, 0, 0);
                return true;
            }
            case 1072: 
            case 1073: {
                if (k2e.s() == 0) {
                    DoHoang091.a("H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
                    return true;
                }
                k15.j(n2);
                return true;
            }
        }
        return false;
    }

    static void a(int n, short s, short s2) throws Exception {
        if (!k10.d(n)) {
            return;
        }
        int n2 = k15.a("HALLOWEEN_MONSTER");
        if (n2 < 0) {
            return;
        }
        if (k2e.s() > 0 && k16.a(n2, 1, false, (byte)0, (byte)0) >= 0) {
            return;
        }
        kb.b(n2, s, s2);
    }

    static void b(int n, short s, short s2) {
    }

    static int b(int n) {
        if (n < 0 || n >= 16) {
            return 0;
        }
        k15.d();
        return as[k15.c() + n];
    }

    static int c(int n) {
        if (n < 0 || n >= 4) {
            return 0;
        }
        k15.d();
        int n2 = 0;
        int n3 = 0;
        while (n3 < 9) {
            long l = (long)n2 + (long)as[n3 * 16 + n];
            n2 = l > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l;
            ++n3;
        }
        return n2;
    }

    static void a() {
        au = -1;
        av = -1;
        at = false;
        as = null;
    }

    private static void b(int n, String string) throws Exception {
        au = n;
        av = DoHoang091.s();
        DoHoang091.a(string, 9999);
    }

    private static boolean e(int n) throws Exception {
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

    private static void f(int n) throws Exception {
        int[] nArray = new int[]{607, 608, 617};
        int[] nArray2 = new int[]{5, 2, 1};
        if (k15.a(n, nArray, nArray2, 612)) {
            k15.a(n, 0, 0, 0);
        }
    }

    private static void g(int n) throws Exception {
        int[] nArray = new int[]{609, 610};
        int[] nArray2 = new int[]{2, 3};
        k15.a(n, nArray, nArray2, 611);
    }

    private static void h(int n) throws Exception {
        int[] nArray = new int[]{807, 808, 809, 810, 811, 812, 813};
        int[] nArray2 = new int[]{1, 1, 2, 1, 1, 2, 1};
        k15.a(n, nArray, nArray2, 819);
    }

    private static void i(int n) throws Exception {
        int[] nArray = new int[]{807, 808, 809, 810, 811, 812, 813};
        int[] nArray2 = new int[]{1, 1, 2, 1, 1, 2, 1};
        k15.a(n, nArray, nArray2, 617);
    }

    private static boolean a(int n, int[] nArray, int[] nArray2, int n2) throws Exception {
        if (!k15.e(n)) {
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

    private static void b() throws Exception {
        if (!k16.g(611, 100)) {
            k1d.b(33, "Kh\u00f4ng \u0111\u1ee7 k\u1eb9o t\u00e1o.");
            return;
        }
        if (!k16.d(611, 100)) {
            return;
        }
        int n = DoHoang091.z().p == 1 ? 806 : 805;
        k16.a(n, 1, true, (byte)0, (byte)0, System.currentTimeMillis() + 604800000L, null, null);
    }

    static void d(int n) throws Exception {
        int n2;
        int n3;
        int n4 = n3 = n == 1 ? 5000 : 20000;
        if (k15.b(0) < n3) {
            k1d.b(33, "B\u1ea1n c\u1ea7n t\u1ed1i thi\u1ec3u " + n3 + " \u0111i\u1ec3m s\u1ef1 ki\u1ec7n m\u1edbi c\u00f3 th\u1ec3 \u0111\u1ed5i \u0111\u01b0\u1ee3c v\u1eadt n\u00e0y.");
            return;
        }
        if (k2e.s() == 0) {
            DoHoang091.a("H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return;
        }
        int n5 = n2 = n == 1 ? 1073 : 1072;
        if (k16.a(n2, 1, false, (byte)0, (byte)0) >= 0) {
            k15.a(-n3, 0, 0, 0);
        }
    }

    private static boolean a(int n, int n2, String string) throws Exception {
        if (!k19.b(string)) {
            k15.j(n2);
            return false;
        }
        return k19.a(n, n2, string);
    }

    private static void d(int n, int n2) throws Exception {
        if (!k19.b("HALLOWEEN_GOLD")) {
            k15.j(612);
            return;
        }
        if (k16.c(n, 1) != 1) {
            return;
        }
        if (k16.c(n2, 1) != 1) {
            return;
        }
        k19.a("HALLOWEEN_GOLD");
    }

    private static void j(int n) throws Exception {
        DoHoang091.b("Ph\u1ea7n th\u01b0\u1edfng " + k16.A(n) + " hi\u1ec7n ch\u01b0a \u0111\u01b0\u1ee3c m\u1edf.");
    }

    private static int k(int n) {
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
        byte[] byArray = ar.find(string.hashCode());
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

    private static void a(int n, boolean bl) throws Exception {
        long l;
        if (bl) {
            if (k15.c(1) < n) {
                DoHoang091.a("To\u00e0n server ch\u01b0a \u0111\u1ee7 \u0111i\u1ec3m s\u1ef1 ki\u1ec7n.");
                return;
            }
            if (k15.b(6) == 1) {
                DoHoang091.a("B\u1ea1n \u0111\u00e3 nh\u1eadn th\u01b0\u1edfng r\u1ed3i");
                return;
            }
            if (k2e.s() < 6) {
                DoHoang091.a("H\u00e3y ch\u1eeba 6 \u00f4 tr\u1ed1ng trong h\u00e0nh trang \u0111\u1ec3 nh\u1eadn qu\u00e0.");
                return;
            }
            if (k16.a(1076, 1, false, (byte)0, (byte)0, System.currentTimeMillis() + 259200000L, null, null) >= 0) {
                k15.e(6, 1);
            }
            return;
        }
        int n2 = n == 5000 ? 4 : 5;
        int n3 = k15.b(1);
        if (k15.b(n2) == 1) {
            DoHoang091.a("B\u1ea1n \u0111\u00e3 nh\u1eadn th\u01b0\u1edfng m\u1ed1c n\u00e0y r\u1ed3i");
            return;
        }
        if (n3 < n) {
            DoHoang091.a("B\u1ea1n ch\u1ec9 c\u00f3 " + n3 + " \u0111i\u1ec3m, c\u1ea7n th\u00eam " + (n - n3) + " \u0111i\u1ec3m n\u1eefa");
            return;
        }
        if (k2e.s() < 6) {
            DoHoang091.a("H\u00e3y ch\u1eeba 6 \u00f4 tr\u1ed1ng trong h\u00e0nh trang \u0111\u1ec3 nh\u1eadn qu\u00e0.");
            return;
        }
        int n4 = 814 + DoHoang091.g(5);
        byte[] byArray = new byte[12];
        byArray[1] = 1;
        byArray[2] = 2;
        byArray[3] = 3;
        byArray[4] = 4;
        byArray[5] = 5;
        byArray[6] = 6;
        byArray[7] = 8;
        byArray[8] = 9;
        byArray[9] = 57;
        byArray[10] = 58;
        byArray[11] = 87;
        byte[] byArray2 = byArray;
        int[] nArray = new int[]{500, 500, 150, 150, 150, 100, 2000, 200, 200, 120, 30, 5000};
        int[] nArray2 = new int[]{200, 200, 100, 100, 100, 50, 1000, 50, 50, 80, 20, 1000};
        byte[] byArray3 = new byte[7];
        int[] nArray3 = new int[7];
        int n5 = byArray2.length;
        int n6 = 0;
        while (n6 < 7) {
            int n7 = DoHoang091.g(n5);
            byArray3[n6] = byArray2[n7];
            int n8 = nArray2[n7];
            int n9 = nArray[n7];
            nArray3[n6] = n8 + DoHoang091.g(n9 - n8 + 1);
            int n10 = n7;
            while (n10 < n5 - 1) {
                byArray2[n10] = byArray2[n10 + 1];
                nArray[n10] = nArray[n10 + 1];
                nArray2[n10] = nArray2[n10 + 1];
                ++n10;
            }
            --n5;
            ++n6;
        }
        long l2 = l = n == 5000 ? System.currentTimeMillis() + 1296000000L : -1L;
        if (k16.a(n4, 1, false, (byte)0, (byte)0, l, byArray3, nArray3) >= 0) {
            k15.e(n2, 1);
        }
    }

    private static void c(int n, String string) throws Exception {
        int n2 = k15.b(n);
        DoHoang091.a(string, n2 <= 0 ? "" : "1. " + DoHoang091.z().a + " \u0111\u00e3 \u0111\u1ea1t " + n2);
    }

    private static void e(int n, int n2) {
        k15.d();
        k15.as[k15.c() + n] = n2 < 0 ? 0 : n2;
        k15.e();
    }

    private static void a(int n, int n2, int n3, int n4) {
        k15.d();
        int n5 = k15.c();
        k15.as[n5 + 0] = k15.f(as[n5 + 0], n);
        k15.as[n5 + 1] = k15.f(as[n5 + 1], n2);
        k15.as[n5 + 2] = k15.f(as[n5 + 2], n3);
        k15.as[n5 + 3] = k15.f(as[n5 + 3], n4);
        k15.e();
    }

    private static int f(int n, int n2) {
        long l = (long)n + (long)n2;
        if (l < 0L) {
            return 0;
        }
        return l > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l;
    }

    private static int c() {
        int n = DoHoang091.s() - 1;
        if (n < 0) {
            n = 0;
        }
        if (n >= 9) {
            n = 8;
        }
        return n * 16;
    }

    private static void d() {
        if (at && as != null) {
            return;
        }
        as = new int[144];
        RecordStore recordStore = null;
        try {
            try {
                recordStore = RecordStore.openRecordStore((String)am, (boolean)true);
                if (recordStore.getNumRecords() > 0) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(recordStore.getRecord(1)));
                    if (dataInputStream.readInt() == 1212238924 && dataInputStream.readUnsignedByte() == 1 && dataInputStream.readUnsignedByte() == 9 && dataInputStream.readUnsignedByte() == 16) {
                        int n = 0;
                        while (n < as.length) {
                            int n2 = dataInputStream.readInt();
                            k15.as[n] = n2 < 0 ? 0 : n2;
                            ++n;
                        }
                        if (dataInputStream.available() != 0) {
                            as = new int[144];
                        }
                    }
                    dataInputStream.close();
                }
            }
            catch (Exception exception) {
                as = new int[144];
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
        at = true;
    }

    private static void e() {
        RecordStore recordStore;
        block12: {
            k15.d();
            recordStore = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8 + as.length * 4);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(1212238924);
                    dataOutputStream.writeByte(1);
                    dataOutputStream.writeByte(9);
                    dataOutputStream.writeByte(16);
                    int n = 0;
                    while (n < as.length) {
                        dataOutputStream.writeInt(as[n]);
                        ++n;
                    }
                    dataOutputStream.flush();
                    byte[] byArray = byteArrayOutputStream.toByteArray();
                    recordStore = RecordStore.openRecordStore((String)am, (boolean)true);
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

    private static void f() throws Exception {
        DoHoang091.a("H\u01b0\u1edbng D\u1eabn", "- \u0110\u1ed5i k\u1eb9o t\u00e1o : 2 qu\u1ea3 t\u00e1o + 3 m\u1eadt ong + 100k xu\n- \u0110\u1ed5i h\u1ed9p ma qu\u1ef7 : 5 x\u01b0\u01a1ng th\u00fa + 2 t\u00e0n linh + 1 ma v\u1eadt\n- M\u1edf h\u1ed9p ma qu\u1ef7 c\u1ea7n c\u00f3 ch\u00eca kh\u00f3a mua t\u1ea1i goosho\n- \u0110\u1ed5i \u0111\u1ed3 th\u1eddi trang : 1000 l\u01b0\u1ee3ng + 100 k\u1eb9o t\u00e1o\n\n- Top 10 \u0103n k\u1eb9o t\u00e1o c\u01a1 h\u1ed9i nh\u1eadn h\u1ecfa k\u00ec l\u00e2n 5* xem t\u1ea1i m\u1ee5c Top s\u1ef1 ki\u1ec7n\n\n- C\u00e1 nh\u00e2n c\u00e1n m\u1ed1c m\u1edf 5k h\u1ed9p ma qu\u1ef7 : 1 m\u1eb7t n\u1ea1 trang b\u1ecb 2 v\u1edbi 7 d\u00f2ng random h\u1ea1n 15 ng\u00e0y\n\n- C\u00e1 nh\u00e2n c\u00e1n m\u1ed1c m\u1edf 50k h\u1ed9p ma qu\u1ef7 : 1 m\u1eb7t n\u1ea1 trang b\u1ecb 2 v\u1edbi 7 d\u00f2ng random v\u0129nh vi\u1ec5n\n\n- To\u00e0n server c\u00e1n m\u1ed1c 50k h\u1ed9p ma qu\u1ef7 : ai c\u0169ng nh\u1eadn \u0111\u01b0\u1ee3c 1 h\u1ecfa k\u00ec l\u00e2n 3 ng\u00e0y");
    }

    private static String g() {
        return "Top 1 : 1 Th\u00fa c\u01b0\u1ee1i H\u1ecfa k\u00ec l\u00e2n v\u0129nh vi\u1ec5n\nTop 2-10 : 1 Th\u00fa c\u01b0\u1ee1i H\u1ecfa k\u00ec l\u00e2n max 5* 30 ng\u00e0y\nT\u1ed1i thi\u1ec3u s\u1eed d\u1ee5ng 50,000 k\u1eb9o t\u00e1o \u0111\u01b0\u1ee3c x\u1ebfp top.";
    }
}

