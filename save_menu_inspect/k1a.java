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

final class k1a {
    private static final int a = 33;
    private static final int b = 34;
    private static final int c = 99;
    private static final int d = 3;
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 3;
    private static final int i = 4;
    private static final int j = 5;
    private static final int k = 6;
    private static final int l = 7;
    private static final int m = 8;
    private static final int n = 9;
    private static final int o = 1056;
    private static final int p = 1057;
    private static final int q = 1058;
    private static final int r = 1060;
    private static final int s = 1062;
    private static final int t = 1063;
    private static final int u = 1064;
    private static final int v = 1065;
    private static final int w = 1066;
    private static final int x = 1067;
    private static final int y = 1068;
    private static final int z = 1069;
    private static final int A = 1070;
    private static final int B = 665;
    private static final int C = 308;
    private static final int D = 309;
    private static final int E = 799;
    private static final int F = 800;
    private static final int G = 850;
    private static final int H = 919;
    private static final int I = 920;
    private static final int[] J = new int[]{1056, 1057, 1058, 1060};
    private static final int[] K = new int[]{10, 5, 5, 5};
    private static final int[] L = new int[]{1062, 1063, 1064, 1065};
    private static final long M = 86400000L;
    private static final long N = 604800000L;
    private static final long O = 2592000000L;
    private static final long P = 2592000000L;
    private static final long Q = 15000000L;
    private static final int R = 10;
    private static final int S = 9999;
    private static final int T = 49001;
    private static final int U = 49002;
    private static final int V = 49003;
    private static final int W = 49004;
    private static final int X = 49005;
    private static final int Y = 49006;
    private static final int Z = 49007;
    private static final int aa = 49008;
    private static final int ab = 49009;
    private static final int ac = 49010;
    private static final int ad = 49011;
    private static final int ae = 49012;
    private static final int af = 49013;
    private static final int ag = 49014;
    private static final int ah = 49015;
    private static final int ai = 49016;
    private static final int aj = 49017;
    private static final int ak = 49018;
    private static final int al = 49019;
    private static final int am = 49020;
    private static final int an = 49021;
    private static final int ao = 49022;
    private static final int ap = 49023;
    private static final int aq = 49024;
    private static final int ar = 49025;
    private static final int as = 49026;
    private static final int at = 49027;
    private static final int au = 49028;
    private static final int av = 0;
    private static final int aw = 1;
    private static final int ax = 2;
    private static final int ay = 3;
    private static final int az = 9;
    private static final int aA = 1296127316;
    private static final int aB = 1;
    private static final String aC = "nso_offline_mid_autumn_v1";
    private static final k4 aD = new k4("event_wire");
    private static int[] aE;
    private static boolean aF;
    private static int aG;
    private static int aH;
    private static int aI;
    private static short aJ;
    private static short aK;
    private static boolean aL;

    static {
        aG = -1;
        aH = -1;
        aI = -1;
    }

    private k1a() {
    }

    static void a(int n) throws Exception {
        if (!ke.u()) {
            return;
        }
        k1d.a(n, new String[]{"L\u00e0m b\u00e1nh", "L\u00e0m h\u1ed9p b\u00e1nh", "\u0110\u1ed5i qu\u00e0", "\u0110\u1ed5i l\u1ed3ng \u0111\u00e8n", "Hoa ph\u1ee5c sinh", "\u0110ua Top", "H\u01b0\u1edbng d\u1eabn"}, new int[]{49001, 49006, 49009, 49013, 49016, 49020, 49027});
    }

    static boolean a(int n, int n2) throws Exception {
        if (n == 34 && n2 == 49028) {
            k1a.i();
            return true;
        }
        if (n != 33 || !ke.u()) {
            return false;
        }
        switch (n2) {
            case 49001: {
                k1d.a(n, new String[]{"B\u00e1nh Th\u1eadp C\u1ea9m", "B\u00e1nh D\u1ebbo", "B\u00e1nh \u0110\u1eadu xanh", "B\u00e1nh P\u00eda"}, new int[]{49002, 49003, 49004, 49005});
                return true;
            }
            case 49002: {
                k1a.b(3, "B\u00e1nh Th\u1eadp C\u1ea9m");
                return true;
            }
            case 49003: {
                k1a.b(4, "B\u00e1nh D\u1ebbo");
                return true;
            }
            case 49004: {
                k1a.b(5, "B\u00e1nh \u0110\u1eadu xanh");
                return true;
            }
            case 49005: {
                k1a.b(6, "B\u00e1nh P\u00eda");
                return true;
            }
            case 49006: {
                k1d.a(n, new String[]{"H\u1ed9p b\u00e1nh th\u01b0\u1eddng", "H\u1ed9p b\u00e1nh th\u01b0\u1ee3ng h\u1ea1ng"}, new int[]{49007, 49008});
                return true;
            }
            case 49007: {
                k1a.b(7, "H\u1ed9p b\u00e1nh th\u01b0\u1eddng");
                return true;
            }
            case 49008: {
                k1a.b(8, "H\u1ed9p b\u00e1nh th\u01b0\u1ee3ng h\u1ea1ng");
                return true;
            }
            case 49009: {
                k1d.a(n, new String[]{"B\u1ea1ch h\u1ed5 30 ng\u00e0y", "V\u0169 kh\u00ed th\u1eddi trang 7 ng\u00e0y", "V\u0169 kh\u00ed th\u1eddi trang 30 ng\u00e0y"}, new int[]{49010, 49011, 49012});
                return true;
            }
            case 49010: {
                k1a.b(0, 1);
                return true;
            }
            case 49011: {
                k1a.b(1, 1);
                return true;
            }
            case 49012: {
                k1a.b(2, 1);
                return true;
            }
            case 49013: {
                k1d.a(n, new String[]{"10.000.000 xu", "25000 l\u01b0\u1ee3ng"}, new int[]{49014, 49015});
                return true;
            }
            case 49014: {
                k19.a(false, "\u0110\u1ed5i l\u1ed3ng \u0111\u00e8n 10 tri\u1ec7u xu", "\u0110\u1ed5i");
                return true;
            }
            case 49015: {
                k19.a(true, "\u0110\u1ed5i l\u1ed3ng \u0111\u00e8n 25000 l\u01b0\u1ee3ng", "\u0110\u1ed5i");
                return true;
            }
            case 49016: {
                k1d.a(n, new String[]{"Hoa thi\u00ean di\u1ec7u", "Hoa d\u1ea1 y\u1ebfn", "\u0110i\u1ec3m s\u1ef1 ki\u1ec7n"}, new int[]{49017, 49018, 49019});
                return true;
            }
            case 49017: {
                k1a.e(1);
                return true;
            }
            case 49018: {
                k1a.e(2);
                return true;
            }
            case 49019: {
                DoHoang091.a("H\u01b0\u1edbng d\u1eabn", "- \u0110i\u1ec3m s\u1ef1 ki\u1ec7n: " + k1a.j(k1a.i(0)) + "\n\nB\u1ea1n c\u00f3 th\u1ec3 quy \u0111\u1ed5i \u0111i\u1ec3m s\u1ef1 ki\u1ec7n nh\u01b0 sau\n- Hoa thi\u00ean di\u1ec7u: 10.000 \u0111i\u1ec3m" + "\n- Hoa d\u1ea1 y\u1ebfn: 10.000 \u0111i\u1ec3m\n");
                return true;
            }
            case 49020: {
                k1d.a(n, new String[]{"Th\u1ea3 L\u1ed3ng \u0110\u00e8n", "B\u00e1nh Trung Thu"}, new int[]{49021, 49022});
                return true;
            }
            case 49021: {
                k1d.a(n, new String[]{"B\u1ea3ng x\u1ebfp h\u1ea1ng", "Ph\u1ea7n th\u01b0\u1edfng"}, new int[]{49023, 49024});
                return true;
            }
            case 49022: {
                k1d.a(n, new String[]{"B\u1ea3ng x\u1ebfp h\u1ea1ng", "Ph\u1ea7n th\u01b0\u1edfng"}, new int[]{49025, 49026});
                return true;
            }
            case 49023: {
                k1a.a(2, "Th\u1ea3 L\u1ed3ng \u0110\u00e8n", "%d. %s \u0111\u00e3 th\u1ea3 %s l\u1ed3ng \u0111\u00e8n");
                return true;
            }
            case 49024: {
                DoHoang091.a("Ph\u1ea7n th\u01b0\u1edfng", k1a.s());
                return true;
            }
            case 49025: {
                k1a.a(1, "B\u00e1nh Trung Thu", "%d. %s \u0111\u00e3 l\u00e0m %s h\u1ed9p b\u00e1nh");
                return true;
            }
            case 49026: {
                DoHoang091.a("Ph\u1ea7n th\u01b0\u1edfng", k1a.t());
                return true;
            }
            case 49027: {
                DoHoang091.a("H\u01b0\u1edbng d\u1eabn", k1a.u());
                return true;
            }
        }
        return false;
    }

    static void b(int n) throws Exception {
        k1d.a(n, new String[]{"R\u01b0\u1edbc \u0111\u00e8n"}, new int[]{49028});
    }

    static boolean a(int n, String string) throws Exception {
        if (n != 9999 || aG < 0) {
            return false;
        }
        int n2 = aG;
        int n3 = aH;
        aG = -1;
        aH = -1;
        if (!ke.u() || n3 != DoHoang091.s() || string == null || string.length() == 0) {
            return true;
        }
        try {
            k1a.b(n2, Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            DoHoang091.a("D\u1eef li\u1ec7u nh\u1eadp kh\u00f4ng h\u1ee3p l\u1ec7.");
        }
        return true;
    }

    static void b(int n, int n2) throws Exception {
        if (!ke.u()) {
            return;
        }
        switch (n) {
            case 3: {
                k1a.d(n2, 1062);
                break;
            }
            case 4: {
                k1a.d(n2, 1063);
                break;
            }
            case 5: {
                k1a.d(n2, 1064);
                break;
            }
            case 6: {
                k1a.d(n2, 1065);
                break;
            }
            case 7: {
                k1a.a(n2, false);
                break;
            }
            case 8: {
                k1a.a(n2, true);
                break;
            }
            case 9: {
                k1a.f(n2);
                break;
            }
            case 0: {
                k1a.h();
                break;
            }
            case 1: {
                k1a.a(308, 10, 604800000L);
                break;
            }
            case 2: {
                k1a.a(309, 20, 2592000000L);
                break;
            }
        }
    }

    static boolean c(int n, int n2) throws Exception {
        if (!ke.u()) {
            return false;
        }
        if (n2 == 1066) {
            if (k19.b("EVENT_COIN")) {
                k19.a(n, n2, "EVENT_COIN");
            }
            return true;
        }
        if (n2 == 1067) {
            k1a.a(n, n2, "EVENT_GOLD2");
            return true;
        }
        if (n2 == 1070) {
            if (k1a.a(n, n2, "EVENT_GOLD2")) {
                DoHoang091.a(7, DoHoang091.u(), DoHoang091.v(), 0, 1);
            }
            return true;
        }
        if (n2 == 919 || n2 == 920) {
            k1a.f(n2);
            return true;
        }
        return false;
    }

    static void a(int n, short s, short s2) throws Exception {
        if (!k10.d(n)) {
            return;
        }
        int n2 = k1a.a("MID_AUTUMN_MONSTER");
        if (n2 < 0) {
            return;
        }
        if (k2e.s() == 0 || k16.a(n2, 1, false, (byte)0, (byte)0) < 0) {
            kb.b(n2, s, s2);
        }
    }

    static void b(int n, short s, short s2) {
    }

    static int c(int n) {
        return ke.u() && n == 1 ? 1 : 0;
    }

    static int d(int n) {
        if (k1a.c(n) == 0) {
            return 0;
        }
        DoHoang091.k0 k02 = DoHoang091.z();
        return k02.r >= 20 && !k1a.l() ? 1 : 0;
    }

    static void a(DataOutputStream dataOutputStream, int n) throws Exception {
        if (k1a.c(n) == 0) {
            return;
        }
        dataOutputStream.writeByte(k1a.d(n));
        dataOutputStream.writeShort(1307);
        dataOutputStream.writeShort(168);
        dataOutputStream.writeByte(34);
    }

    static void a() throws Exception {
        if (!k1a.l()) {
            return;
        }
        aJ = (short)(DoHoang091.u() + DoHoang091.g(101) - 50);
        aK = (short)DoHoang091.v();
        k1a.n();
        k1a.j();
    }

    static void b() throws Exception {
        if (!k1a.l() || !aL) {
            return;
        }
        k1a.o();
        aL = false;
    }

    static void c() throws Exception {
        if (!k1a.l()) {
            return;
        }
        aJ = (short)DoHoang091.u();
        aK = (short)DoHoang091.v();
        k1a.m();
        aL = true;
    }

    static void d() throws Exception {
        if (k1a.l()) {
            k1a.k();
        }
    }

    static void e() {
        try {
            if (aI < 0) {
                return;
            }
            if (!ke.u() || aI != DoHoang091.s()) {
                k1a.a(true);
                return;
            }
            k1a.j();
        }
        catch (Exception exception) {}
    }

    static void f() {
        aG = -1;
        aH = -1;
        aF = false;
        aE = null;
        aI = -1;
        aL = false;
    }

    static void g() {
        try {
            k1a.a(true);
        }
        catch (Exception exception) {
            aL = false;
            aI = -1;
        }
    }

    private static void b(int n, String string) throws Exception {
        aG = n;
        aH = DoHoang091.s();
        DoHoang091.a(string, 9999);
    }

    private static boolean d(int n, int n2) throws Exception {
        return k1a.a(n, J, K, n2, false);
    }

    private static boolean a(int n, boolean bl) throws Exception {
        int[] nArray = new int[5];
        int[] nArray2 = new int[]{1, 1, 1, 1, 1};
        nArray[0] = bl ? 1069 : 1068;
        System.arraycopy(L, 0, nArray, 1, L.length);
        boolean bl2 = k1a.a(n, nArray, nArray2, bl ? 1067 : 1066, false);
        if (bl2 && bl) {
            k1a.f(1, n);
            k1a.f(0, n);
        }
        return bl2;
    }

    private static boolean a(int n, int[] nArray, int[] nArray2, int n2, boolean bl) throws Exception {
        if (n < 1) {
            k1d.b(33, "S\u1ed1 l\u01b0\u1ee3ng t\u1ed1i thi\u1ec3u l\u00e0 1.");
            return false;
        }
        if (n > 1000) {
            k1d.b(33, "S\u1ed1 l\u01b0\u1ee3ng t\u1ed1i \u0111a l\u00e0 1.000.");
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
            k1a.f(0, 1);
        }
        return true;
    }

    private static void h() throws Exception {
        int[] nArray = k1a.e(308, 10);
        if (nArray == null) {
            k1d.b(33, "Kh\u00f4ng \u0111\u1ee7 B\u00e1nh trung thu phong l\u00f4i");
            return;
        }
        int n = 0;
        while (n < nArray.length) {
            if (k16.c(nArray[n], 1) != 1) {
                return;
            }
            ++n;
        }
        k16.a(850, 1, false, (byte)0, (byte)0, System.currentTimeMillis() + 2592000000L, null, null);
    }

    private static void a(int n, int n2, long l) throws Exception {
        int[] nArray = k1a.e(n, n2);
        if (nArray == null) {
            k1d.b(33, "Kh\u00f4ng \u0111\u1ee7 " + k16.A(n));
            return;
        }
        int n3 = 0;
        while (n3 < nArray.length) {
            if (k16.c(nArray[n3], 1) != 1) {
                return;
            }
            ++n3;
        }
        int n4 = DoHoang091.z().p == 1 ? 799 : 800;
        k16.a(n4, 1, false, (byte)0, (byte)0, System.currentTimeMillis() + l, new byte[]{94, 92, 86}, new int[]{15, 100, 200});
    }

    private static void e(int n) throws Exception {
        int n2 = 10000;
        if (k1a.i(0) < n2) {
            k1d.b(33, "B\u1ea1n c\u1ea7n t\u1ed1i thi\u1ec3u " + k1a.j(n2) + " \u0111i\u1ec3m s\u1ef1 ki\u1ec7n m\u1edbi c\u00f3 th\u1ec3 \u0111\u1ed5i \u0111\u01b0\u1ee3c v\u1eadt n\u00e0y.");
            return;
        }
        if (k2e.s() < 1) {
            k1d.b(33, "H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return;
        }
        if (k16.a(n == 1 ? 919 : 920, 1, false, (byte)0, (byte)0) >= 0) {
            k1a.f(0, -n2);
        }
    }

    private static void f(int n) throws Exception {
        if (k2e.s() < 1) {
            DoHoang091.a("H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return;
        }
        int n2 = k1a.g(n);
        if (n2 < 0) {
            k1d.b(3, "H\u00e3y t\u00ecm \u0111\u00fang lo\u00e0i hoa r\u1ed3i \u0111\u1ebfn g\u1eb7p ta");
            return;
        }
        int n3 = kb.a("LINH_VAT");
        if (n3 < 0) {
            return;
        }
        int n4 = n == 919 ? 1 : 2;
        int n5 = 1 + DoHoang091.g(n4 == 2 ? 3 : 2);
        long l = (long)n5 * 2592000000L / 3L;
        long l2 = System.currentTimeMillis() + l;
        if (n4 == 2 && DoHoang091.g(35) == 0) {
            l2 += l;
        }
        if (k19.a(n3, l2)) {
            k16.c(n2, 1);
        }
    }

    private static boolean a(int n, int n2, String string) throws Exception {
        if (k19.b(string)) {
            return k19.a(n, n2, string);
        }
        DoHoang091.k0 k02 = DoHoang091.z();
        if (n < 0 || n >= k02.K.length || (k02.K[n] & 0xFFFF) != n2) {
            return false;
        }
        if (k2e.s() < 1) {
            DoHoang091.a("H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return false;
        }
        DoHoang091.b("Ph\u1ea7n th\u01b0\u1edfng " + k16.A(n2) + " hi\u1ec7n ch\u01b0a \u0111\u01b0\u1ee3c m\u1edf.");
        return true;
    }

    private static int[] e(int n, int n2) {
        DoHoang091.k0 k02 = DoHoang091.z();
        int[] nArray = new int[n2];
        int n3 = 0;
        int n4 = 0;
        while (n4 < k02.K.length && n3 < n2) {
            if ((k02.K[n4] & 0xFFFF) == n && (k02.L[n4] & 0xFFFF) > 0) {
                nArray[n3++] = n4;
            }
            ++n4;
        }
        return (int[])(n3 == n2 ? nArray : null);
    }

    private static int g(int n) {
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
        byte[] byArray = aD.find(string.hashCode());
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

    private static void i() throws Exception {
        if (!ke.u() || k1a.l()) {
            return;
        }
        if (DoHoang091.z().r < 20) {
            return;
        }
        int n = k1a.g(665);
        if (n < 0) {
            DoHoang091.a("B\u1ea1n kh\u00f4ng c\u00f3 gi\u1ea5y th\u00f4ng h\u00e0nh!");
            return;
        }
        if (k16.c(n, 1) != 1) {
            return;
        }
        aI = DoHoang091.s();
        aJ = (short)1307;
        aK = (short)168;
        k1a.h(15);
        k1a.m();
        aL = true;
        k1a.f(0, 1);
    }

    private static void j() throws Exception {
        if (!k1a.l()) {
            return;
        }
        int n = DoHoang091.r();
        int n2 = 0;
        int n3 = 0;
        if (n == 1) {
            n2 = 828;
            n3 = 312;
        } else if (n == 27) {
            n2 = 1241;
            n3 = 360;
        } else if (n == 72) {
            n2 = 848;
            n3 = 648;
        } else {
            return;
        }
        int n4 = aJ - n2;
        int n5 = aK - n3;
        if ((long)n4 * (long)n4 + (long)n5 * (long)n5 >= 10000L) {
            return;
        }
        if (aL) {
            k1a.o();
        }
        aL = false;
        aI = -1;
        DoHoang091.b("H\u1ed9 t\u1ed1ng L\u1ed3ng \u0111\u00e8n th\u00e0nh c\u00f4ng!");
        DoHoang091.c(150000000L);
    }

    private static void k() throws Exception {
        if (!k1a.l()) {
            return;
        }
        if (aL) {
            k1a.o();
        }
        aL = false;
        aI = -1;
        DoHoang091.b("H\u1ed9 t\u1ed1ng L\u1ed3ng \u0111\u00e8n th\u1ea5t b\u1ea1i!");
    }

    private static void a(boolean bl) throws Exception {
        if (bl && aL) {
            k1a.o();
        }
        aL = false;
        aI = -1;
    }

    private static boolean l() {
        return aI >= 0 && aI == DoHoang091.s();
    }

    private static void h(int n) {
        DoHoang091.a((byte)-30, new byte[]{-94, 99, (byte)n});
    }

    private static void m() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(96);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(-aI);
        dataOutputStream.writeUTF("");
        dataOutputStream.writeBoolean(false);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeShort(220);
        dataOutputStream.writeUTF("L\u1ed3ng \u0111\u00e8n");
        dataOutputStream.writeInt(2000);
        dataOutputStream.writeInt(2000);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeShort(-1);
        dataOutputStream.writeShort(221);
        dataOutputStream.writeShort(222);
        dataOutputStream.writeByte(-1);
        dataOutputStream.writeShort(aJ);
        dataOutputStream.writeShort(aK);
        dataOutputStream.writeShort(0);
        dataOutputStream.writeShort(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeBoolean(false);
        dataOutputStream.writeShort(220);
        dataOutputStream.writeShort(-1);
        dataOutputStream.writeShort(221);
        dataOutputStream.writeShort(222);
        int n = 0;
        while (n < 10) {
            dataOutputStream.writeShort(-1);
            ++n;
        }
        dataOutputStream.flush();
        DoHoang091.a((byte)3, byteArrayOutputStream.toByteArray());
    }

    private static void n() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(-aI);
        dataOutputStream.writeShort(aJ);
        dataOutputStream.writeShort(aK);
        dataOutputStream.flush();
        DoHoang091.a((byte)1, byteArrayOutputStream.toByteArray());
    }

    private static void o() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(-aI);
        dataOutputStream.flush();
        DoHoang091.a((byte)2, byteArrayOutputStream.toByteArray());
    }

    private static int i(int n) {
        k1a.q();
        if (n < 0 || n >= 3) {
            return 0;
        }
        return aE[k1a.p() + n];
    }

    private static void f(int n, int n2) {
        k1a.q();
        if (n < 0 || n >= 3) {
            return;
        }
        long l = (long)aE[k1a.p() + n] + (long)n2;
        if (l < 0L) {
            l = 0L;
        }
        if (l > Integer.MAX_VALUE) {
            l = Integer.MAX_VALUE;
        }
        k1a.aE[k1a.p() + n] = (int)l;
        k1a.r();
    }

    private static int p() {
        int n = DoHoang091.s() - 1;
        if (n < 0) {
            n = 0;
        }
        if (n >= 9) {
            n = 8;
        }
        return n * 3;
    }

    private static void q() {
        if (aF && aE != null) {
            return;
        }
        aE = new int[27];
        RecordStore recordStore = null;
        try {
            try {
                recordStore = RecordStore.openRecordStore((String)aC, (boolean)true);
                if (recordStore.getNumRecords() > 0) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(recordStore.getRecord(1)));
                    if (dataInputStream.readInt() == 1296127316 && dataInputStream.readUnsignedByte() == 1 && dataInputStream.readUnsignedByte() == 9 && dataInputStream.readUnsignedByte() == 3) {
                        int n = 0;
                        while (n < aE.length) {
                            int n2 = dataInputStream.readInt();
                            k1a.aE[n] = n2 < 0 ? 0 : n2;
                            ++n;
                        }
                        if (dataInputStream.available() != 0) {
                            aE = new int[27];
                        }
                    }
                    dataInputStream.close();
                }
            }
            catch (Exception exception) {
                aE = new int[27];
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
        aF = true;
    }

    private static void r() {
        RecordStore recordStore;
        block12: {
            k1a.q();
            recordStore = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8 + aE.length * 4);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(1296127316);
                    dataOutputStream.writeByte(1);
                    dataOutputStream.writeByte(9);
                    dataOutputStream.writeByte(3);
                    int n = 0;
                    while (n < aE.length) {
                        dataOutputStream.writeInt(aE[n]);
                        ++n;
                    }
                    dataOutputStream.flush();
                    byte[] byArray = byteArrayOutputStream.toByteArray();
                    recordStore = RecordStore.openRecordStore((String)aC, (boolean)true);
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

    private static void a(int n, String string, String string2) throws Exception {
        k1a.q();
        int[] nArray = new int[9];
        int n2 = 0;
        int n3 = 0;
        while (n3 < 9) {
            DoHoang091.k0 k02 = DoHoang091.v(n3);
            if (k02 != null && k02.a != null && k02.a.length() != 0 && aE[n3 * 3 + n] > 0) {
                nArray[n2++] = n3;
            }
            ++n3;
        }
        int n4 = 0;
        while (n4 < n2) {
            int n5 = n4;
            int n6 = n4 + 1;
            while (n6 < n2) {
                if (aE[nArray[n6] * 3 + n] > aE[nArray[n5] * 3 + n]) {
                    n5 = n6;
                }
                ++n6;
            }
            int n7 = nArray[n4];
            nArray[n4] = nArray[n5];
            nArray[n5] = n7;
            ++n4;
        }
        StringBuffer stringBuffer = new StringBuffer();
        n4 = 0;
        while (n4 < n2 && n4 < 10) {
            DoHoang091.k0 k03 = DoHoang091.v(nArray[n4]);
            stringBuffer.append(k1a.a(string2, n4 + 1, k03.a, k1a.j(aE[nArray[n4] * 3 + n])));
            if (n4 + 1 < n2 && n4 < 9) {
                stringBuffer.append('\n');
            }
            ++n4;
        }
        DoHoang091.a(string, stringBuffer.toString());
    }

    private static String a(String string, int n, String string2, String string3) {
        int n2 = string.indexOf("%d");
        int n3 = string.indexOf("%s", n2 + 2);
        int n4 = string.indexOf("%s", n3 + 2);
        if (n2 < 0 || n3 < 0 || n4 < 0) {
            return String.valueOf(n) + ". " + string2 + " " + string3;
        }
        return String.valueOf(string.substring(0, n2)) + n + string.substring(n2 + 2, n3) + string2 + string.substring(n3 + 2, n4) + string3 + string.substring(n4 + 2);
    }

    private static String j(int n) {
        String string = String.valueOf(n < 0 ? 0 : n);
        StringBuffer stringBuffer = new StringBuffer(string.length() + string.length() / 3);
        int n2 = 0;
        while (n2 < string.length()) {
            if (n2 > 0 && (string.length() - n2) % 3 == 0) {
                stringBuffer.append('.');
            }
            stringBuffer.append(string.charAt(n2));
            ++n2;
        }
        return stringBuffer.toString();
    }

    private static String s() {
        return "TOP 1:\n- 1 th\u1ebb \u0111\u1ed5i t\u00ean\n- Th\u00fa C\u01b0\u1ee1i v.v MCS (t\u1ef1 ch\u1ecdn: B\u1ea1ch H\u1ed5, Ph\u01b0\u1ee3ng Ho\u00e0ng B\u0103ng, H\u1ecfa K\u1ef3 L\u00e2n)\n- M\u1eb7t n\u1ea1 th\u1ecf v.v\n- Nh\u1eadt t\u1ee7 lam phong/Thi\u00ean nguy\u1ec7t chi n\u1eef v.v MCS\n- L\u1ed3ng \u0110\u00e8n Th\u1eddi Trang v.v Ramdom\n- 1 C\u00fap L\u01b0u Ni\u1ec7m\n\nTOP 2:\n- Th\u00fa C\u01b0\u1ee1i v.v MCS\n- L\u1ed3ng \u0110\u00e8n Th\u1eddi Trang v.v Ramdom\n- 1 C\u00fap L\u01b0u Ni\u1ec7m\n\nTOP 3:\n- Th\u00fa C\u01b0\u1ee1i v.v Ramdom\n- L\u1ed3ng \u0110\u00e8n Th\u1eddi Trang v.v Ramdom\n- 1 C\u00fap L\u01b0u Ni\u1ec7m\n\nTOP 4 - 5:\n- L\u1ed3ng \u0110\u00e8n Th\u1eddi Trang v.v Ramdom\n- Nh\u1eadt t\u1ee7 lam phong/Thi\u00ean nguy\u1ec7t chi n\u1eef 1 th\u00e1ng\n\nTop 6 - 10:\n- L\u1ed3ng \u0110\u00e8n Th\u1eddi Trang 2 th\u00e1ng Ramdom\n- Nh\u1eadt t\u1ee7 lam phong/Thi\u00ean nguy\u1ec7t chi n\u1eef 1 th\u00e1ng";
    }

    private static String t() {
        return "TOP 1:\n- 1 th\u1ebb \u0111\u1ed5i t\u00ean\n- L\u1ed3ng \u0110\u00e8n Th\u1eddi Trang v.v Ramdom\n- M\u1eb7t n\u1ea1 oni v.v\n- 500.000 l\u01b0\u1ee3ng\n- C\u00fap L\u01b0u Ni\u1ec7m\n\nTOP 2:\n- L\u1ed3ng \u0110\u00e8n Th\u1eddi Trang v.v Ramdom\n- M\u1eb7t n\u1ea1 oni v.v\n- 300.000 l\u01b0\u1ee3ng\n- C\u00fap L\u01b0u Ni\u1ec7m\n\nTOP 3:\n- L\u1ed3ng \u0110\u00e8n Th\u1eddi Trang v.v Ramdom\n- 300.000 l\u01b0\u1ee3ng\n- C\u00fap L\u01b0u Ni\u1ec7m\n\nTOP 4 - 5:\n- L\u1ed3ng \u0110\u00e8n Th\u1eddi Trang 2 th\u00e1ng Ramdom\n- 100.000 l\u01b0\u1ee3ng\n\nTop 6 - 10:\n- L\u1ed3ng \u0110\u00e8n Th\u1eddi Trang 1 th\u00e1ng Ramdom";
    }

    private static String u() {
        return "* L\u00e0m b\u00e1nh trung thu\n\n- Trong qu\u00e1 tr\u00ecnh di\u1ec5n ra s\u1ef1 ki\u1ec7n c\u00e1c ninja c\u00f3 level t\u1eeb 30 tr\u1edf l\u00ean \u0111\u00e1nh qu\u00e1i +- 7 level s\u1ebd c\u00f3 t\u1ec9 l\u1ec7 nh\u1eadn \u0111\u01b0\u1ee3c c\u00e1c nguy\u00ean li\u1ec7u sau:\n+ B\u1ed9t m\u00ec, tr\u1ee9ng, h\u1ea1t sen, \u0111\u01b0\u1eddng, \u0111\u1eadu xanh, m\u1ee9t\n- D\u00f9ng Thi\u00ean nh\u00e3n ph\u00f9 hay Khai nh\u00e3n ph\u00f9 c\u00f3 th\u1ec3 t\u0103ng t\u1ec9 l\u1ec7 r\u01a1i nguy\u00ean li\u1ec7u\n- Khi \u0111\u00e3 c\u00f3 \u0111\u1ee7 nguy\u00ean li\u1ec7u c\u00e1c b\u1ea1n c\u00f3 th\u1ec3 \u0111\u1ebfn c\u00e1c l\u00e0ng g\u1eb7p NPC Ti\u00ean N\u1eef \u0111\u1ec3 l\u00e0m ra nh\u1eefng chi\u1ebfc b\u00e1nh trung thu th\u01a1m ngon v\u1edbi c\u00f4ng th\u1ee9c nh\u01b0 sau:\n+ B\u00e1nh Th\u1eadp C\u1ea9m = 10 B\u1ed9t + 5 Tr\u1ee9ng + 5 H\u1ea1t sen + 5 \u0110\u01b0\u1eddng + 5 M\u1ee9t.\n+ B\u00e1nh D\u1ebbo = 10 B\u1ed9t + 5 H\u1ea1t sen + 5 \u0110\u01b0\u1eddng + 5 M\u1ee9t.\n+ B\u00e1nh \u0110\u1eadu xanh = 10 B\u1ed9t + 5 Tr\u1ee9ng + 5 \u0110\u01b0\u1eddng + 5 \u0110\u1eadu xanh.\n+ B\u00e1nh P\u00eda = 10 B\u1ed9t + 5 Tr\u1ee9ng + 5 \u0110\u01b0\u1eddng + 5 \u0110\u1eadu xanh.\n\n* L\u00e0m h\u1ed9p b\u00e1nh\n\n+ H\u1ed9p b\u00e1nh th\u01b0\u1eddng = 4 lo\u1ea1i b\u00e1nh + 1 gi\u1ea5y g\u00f3i th\u01b0\u1eddng.\n+ H\u1ed9p b\u00e1nh th\u01b0\u1ee3ng h\u1ea1ng = 4 lo\u1ea1i b\u00e1nh + 1 gi\u1ea5y g\u00f3i cao c\u1ea5p. C\u00f3 th\u1ec3 giao d\u1ecbch. Khi l\u00e0m s\u1ebd t\u0103ng 1 \u0111i\u1ec3m TOP s\u1ef1 ki\u1ec7n\ngi\u1ea5y g\u00f3i th\u01b0\u1eddng v\u00e0 gi\u1ea5y g\u00f3i cao c\u1ea5p b\u00e1n \u1edf NPC Goosho . C\u00f3 th\u1ec3 giao d\u1ecbch\n\n* Th\u1ea3 l\u1ed3ng \u0111\u00e8n\n\n- L\u1ed3ng \u0111\u00e8n \u0111\u01b0\u1ee3c b\u00e1n t\u1ea1i NPC Goosho\n- Khi th\u1ea3 l\u1ed3ng \u0111\u00e8n s\u1ebd nh\u1eadn \u0111\u01b0\u1ee3c vp ng\u00e2u nhi\u00ean. C\u00f3 th\u1ec3 giao d\u1ecbch. Khi s\u1eed d\u1ee5ng s\u1ebd t\u0103ng 1 \u0111i\u1ec3m TOP s\u1ef1 ki\u1ec7n\n\n* R\u01b0\u1edbc \u0111\u00e8n trung thu\n\n- T\u1ea1i tr\u01b0\u1eddng v\u00e0 c\u00e1c map s\u1ebd xu\u1ea5t hi\u1ec7n l\u1ed3ng \u0111\u00e8n.\n- C\u00e1c ninja hay d\u00f9ng Gi\u1ea5y th\u00f4ng h\u00e0nh mua t\u1ea1i NPC Goosho \u0111\u1ec3 r\u01b0\u1edbc \u0111\u00e8n v\u1ec1 g\u1eb7p Hi\u1ec7u tr\u01b0\u1eddng v\u00e0 nh\u1eadn th\u01b0\u1edfng";
    }
}

