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

final class k2b {
    private static final int k = 33;
    private static final int l = 18;
    static final int a = 0;
    static final int b = 1;
    static final int c = 2;
    static final int d = 0;
    static final int e = 1;
    static final int f = 2;
    static final int g = 3;
    static final int h = 4;
    static final int i = 5;
    static final int j = 6;
    private static final int m = 45001;
    private static final int n = 45002;
    private static final int o = 45003;
    private static final int p = 45004;
    private static final int q = 45005;
    private static final int r = 45006;
    private static final int s = 45007;
    private static final int t = 45008;
    private static final int u = 45009;
    private static final int v = 45010;
    private static final int w = 45011;
    private static final int x = 45012;
    private static final int y = 45013;
    private static final int z = 45014;
    private static final int A = 45015;
    private static final int B = 45016;
    private static final int C = 45017;
    private static final int D = 45018;
    private static final int E = 45019;
    private static final int F = 45020;
    private static final int G = 45021;
    private static final int H = 9999;
    private static final int I = 20034;
    private static final int J = 20040;
    private static final int K = 428;
    private static final int L = 429;
    private static final int M = 430;
    private static final int N = 431;
    private static final int O = 434;
    private static final int P = 435;
    private static final int Q = 902;
    private static final int R = 903;
    private static final int S = 904;
    private static final int T = 905;
    private static final int U = 906;
    private static final int V = 907;
    private static final int W = 908;
    private static final int X = 909;
    private static final int Y = 910;
    private static final int Z = 1078;
    private static final int aa = 1079;
    private static final int ab = 830;
    private static final int ac = 851;
    private static final int ad = 799;
    private static final int ae = 800;
    private static final int af = 806;
    private static final int ag = 805;
    private static final int ah = 385;
    private static final int ai = 384;
    private static final long aj = 86400000L;
    private static final int[] ak = new int[]{895, 896, 899, 898, 897, 900, 901};
    private static final int[] al = new int[]{20, 20, 20, 20, 10, 5, 5};
    private static final int am = 100;
    private static final long an = 20L;
    private static final int ao = 5000000;
    private static final int ap = 10;
    private static final int aq = 9;
    private static final int ar = 7;
    private static final int as = 2;
    private static final int at = 4;
    private static final int au = 1;
    private static final int av = 1398099282;
    private static final String aw = "nso_offline_summer_v1";
    private static final k4 ax = new k4("event_wire");
    private static int[] ay;
    private static boolean az;
    private static int aA;
    private static int aB;
    private static int aC;
    private static int aD;
    private static boolean aE;
    private static long aF;
    private static int aG;

    static {
        aA = -1;
        aB = -1;
        aC = -1;
        aD = -1;
        aG = -1;
    }

    private k2b() {
    }

    static void a(int n) throws Exception {
        k1d.a(n, new String[]{"L\u00e0m di\u1ec1u gi\u1ea5y", "L\u00e0m di\u1ec1u v\u1ea3i", "L\u00e0m h\u0169 kem", "\u0110\u1ed5i \u0111i\u1ec3m ", "\u0110ua TOP", "H\u01b0\u1edbng d\u1eabn"}, new int[]{45001, 45002, 45003, 45004, 45008, 45018});
    }

    static boolean a(int n, int n2) throws Exception {
        if (n != 33) {
            return false;
        }
        switch (n2) {
            case 45001: {
                k2b.b(0, "L\u00e0m di\u1ec1u gi\u1ea5y");
                return true;
            }
            case 45002: {
                k2b.b(1, "l\u00e0m di\u1ec1u v\u1ea3i");
                return true;
            }
            case 45003: {
                k2b.b(2, "l\u00e0m h\u0169 kem");
                return true;
            }
            case 45004: {
                k1d.a(n, new String[]{"\u0110\u1ed5i d\u1ebf ng\u1ecdc", "\u0110\u1ed5i b\u1ecd v\u00e0ng", "\u0110i\u1ec3m s\u1ef1 ki\u1ec7n"}, new int[]{45005, 45006, 45007});
                return true;
            }
            case 45005: {
                k2b.c(1);
                return true;
            }
            case 45006: {
                k2b.d(1);
                return true;
            }
            case 45007: {
                DoHoang091.a("H\u01b0\u1edbng d\u1eabn", "- \u0110i\u1ec3m s\u1ef1 ki\u1ec7n: " + k2b.p(k2b.b(0)) + "\n\nB\u1ea1n c\u00f3 th\u1ec3 quy \u0111\u1ed5i \u0111i\u1ec3m s\u1ef1 ki\u1ec7n nh\u01b0 sau" + "\n- D\u1ebf ng\u1ecdc: 10.000 \u0111i\u1ec3m\n- B\u1ecd v\u00e0ng: 10.000 \u0111i\u1ec3m\n");
                return true;
            }
            case 45008: {
                k1d.a(n, new String[]{"C\u00e2u c\u00e1", "Top th\u1ea3 di\u1ec1u", "Top l\u00e0m kem"}, new int[]{45009, 45010, 45011});
                return true;
            }
            case 45009: {
                k2b.a(n, 1, 4, 45012, 45013, 45019);
                return true;
            }
            case 45010: {
                k2b.a(n, 2, 5, 45014, 45015, 45020);
                return true;
            }
            case 45011: {
                k2b.a(n, 3, 6, 45016, 45017, 45021);
                return true;
            }
            case 45012: {
                k2b.a(1, "C\u00e2u c\u00e1", "%d. %s \u0111\u00e3 c\u00e2u %s l\u1ea7n");
                return true;
            }
            case 45013: {
                DoHoang091.a("Ph\u1ea7n th\u01b0\u1edfng", k2b.f());
                return true;
            }
            case 45014: {
                k2b.a(2, "Top th\u1ea3 di\u1ec1u", "%d. %s \u0111\u00e3 th\u1ea3 %s di\u1ec1u");
                return true;
            }
            case 45015: {
                DoHoang091.a("Ph\u1ea7n th\u01b0\u1edfng", k2b.g());
                return true;
            }
            case 45016: {
                k2b.a(3, "Top l\u00e0m kem", "%d. %s \u0111\u00e3 l\u00e0m %s kem");
                return true;
            }
            case 45017: {
                DoHoang091.a("Ph\u1ea7n th\u01b0\u1edfng", k2b.g());
                return true;
            }
            case 45018: {
                k2b.e();
                return true;
            }
            case 45019: {
                k2b.a(1, 4, true);
                return true;
            }
            case 45020: {
                k2b.a(2, 5, false);
                return true;
            }
            case 45021: {
                k2b.a(3, 6, false);
                return true;
            }
        }
        return false;
    }

    static boolean a(int n, String string) throws Exception {
        if (n == 9999 && aA >= 0) {
            int n2 = aA;
            int n3 = aB;
            aA = -1;
            aB = -1;
            if (n3 != DoHoang091.s() || string == null || string.length() == 0) {
                return true;
            }
            try {
                k2b.b(n2, Integer.parseInt(string));
            }
            catch (NumberFormatException numberFormatException) {
                DoHoang091.a("D\u1eef li\u1ec7u nh\u1eadp kh\u00f4ng h\u1ee3p l\u1ec7.");
            }
            return true;
        }
        if (n < 20034 || n > 20040) {
            return false;
        }
        int n4 = k2b.o(n);
        int n5 = aC;
        int n6 = aD;
        aC = -1;
        aD = -1;
        if (n4 < 0 || n4 != n5 || n6 != DoHoang091.s() || string == null || string.length() == 0) {
            return true;
        }
        try {
            k2b.f(n4, Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            DoHoang091.a("D\u1eef li\u1ec7u nh\u1eadp kh\u00f4ng h\u1ee3p l\u1ec7.");
        }
        return true;
    }

    static void b(int n, int n2) throws Exception {
        if (n == 0) {
            if (k2b.a(n2, new int[]{428, 429, 430}, new int[]{5, 6, 5}, 434)) {
                k2b.a(n2, 0, 0, 0);
            }
        } else if (n == 1) {
            if (k2b.a(n2, new int[]{428, 429, 431}, new int[]{6, 6, 5}, 435)) {
                k2b.a(n2, 0, n2, 0);
            }
        } else if (n == 2 && k2b.a(n2, new int[]{902, 903, 904, 905}, new int[]{3, 2, 3, 2}, 906)) {
            k2b.a(n2, 0, 0, n2);
        }
    }

    static boolean c(int n, int n2) throws Exception {
        if (n2 == 908 || n2 == 907 || n2 == 909) {
            DoHoang091.a("H\u00e3y giao cho Hashimoto \u1edf B\u1edd Bi\u1ec3n Oura \u0111\u1ec3 nh\u1eadn \u0111u\u1ee3c v\u1eadt ph\u1ea9m qu\u00fd gi\u00e1");
            return true;
        }
        if (k2b.m(n2)) {
            if (!ke.q()) {
                DoHoang091.b("V\u1eadt ph\u1ea9m n\u00e0y ch\u1ec9 s\u1eed d\u1ee5ng \u0111\u01b0\u1ee3c trong s\u1ef1 ki\u1ec7n h\u00e8.");
                return true;
            }
            if (!DoHoang091.c(18, 100)) {
                DoHoang091.b("H\u00e3y l\u1ea1i g\u1ea7n g\u1eb7p b\u00e0 Rei \u0111\u1ec3 th\u01b0\u01a1ng th\u1ea3o v\u1ec1 m\u1eb7t h\u00e0ng n\u00e0y.");
                return true;
            }
            k2b.a(n2, 1, n);
            return true;
        }
        if (n2 == 434 || n2 == 435) {
            if (!ke.q()) {
                DoHoang091.b("V\u1eadt ph\u1ea9m n\u00e0y ch\u1ec9 s\u1eed d\u1ee5ng \u0111\u01b0\u1ee3c trong s\u1ef1 ki\u1ec7n h\u00e8.");
                return true;
            }
            String string = n2 == 434 ? "TRE_XANH_TRAM_DOT" : "TRE_VANG_TRAM_DOT";
            k2b.a(n, n2, string);
            return true;
        }
        if (n2 == 910) {
            if (!ke.q()) {
                DoHoang091.b("V\u1eadt ph\u1ea9m n\u00e0y ch\u1ec9 s\u1eed d\u1ee5ng \u0111\u01b0\u1ee3c trong s\u1ef1 ki\u1ec7n h\u00e8.");
                return true;
            }
            k2b.h(n);
            return true;
        }
        return false;
    }

    static void d(int n, int n2) throws Exception {
        if (n != 18 || !k2b.m(n2)) {
            return;
        }
        aC = n2;
        aD = DoHoang091.s();
        DoHoang091.a(k16.A(n2), k2b.n(n2));
    }

    static void a(int n, short s, short s2) throws Exception {
        if (!k10.d(n)) {
            return;
        }
        int n2 = k2b.a("HE_MONSTER");
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

    static void a() {
        if (!aE) {
            return;
        }
        if (aG != DoHoang091.s()) {
            k2b.k();
            return;
        }
        if (System.currentTimeMillis() < aF) {
            return;
        }
        try {
            k2b.c();
        }
        catch (Exception exception) {
            try {
                String string = exception.getMessage();
                DoHoang091.a(string == null ? exception.toString() : string);
            }
            catch (Exception exception2) {}
        }
        k2b.k();
    }

    static void b() {
        aA = -1;
        aB = -1;
        aC = -1;
        aD = -1;
        k2b.k();
        az = false;
        ay = null;
    }

    static int b(int n) {
        if (n < 0 || n >= 7) {
            return 0;
        }
        k2b.i();
        return ay[k2b.h() + n];
    }

    static void c(int n) throws Exception {
        k2b.e(n == 1 ? 10000 : 20000, 908);
    }

    static void d(int n) throws Exception {
        k2b.e(n == 1 ? 10000 : 20000, 909);
    }

    static void e(int n) throws Exception {
        k2b.e(n == 1 ? 5000 : 20000, n == 1 ? 1078 : 1079);
    }

    private static void b(int n, String string) throws Exception {
        aA = n;
        aB = DoHoang091.s();
        DoHoang091.a(string, 9999);
    }

    private static boolean a(int n, int[] nArray, int[] nArray2, int n2) throws Exception {
        if (!k2b.g(n)) {
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

    private static boolean g(int n) throws Exception {
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

    private static void e(int n, int n2) throws Exception {
        if (k2b.b(0) < n) {
            k1d.b(33, "B\u1ea1n c\u1ea7n t\u1ed1i thi\u1ec3u " + k2b.p(n) + " \u0111i\u1ec3m s\u1ef1 ki\u1ec7n m\u1edbi c\u00f3 th\u1ec3 \u0111\u1ed5i \u0111\u01b0\u1ee3c v\u1eadt n\u00e0y.");
            return;
        }
        if (k2e.s() < 1) {
            k1d.b(33, "H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return;
        }
        if (k16.a(n2, 1, false, (byte)0, (byte)0) >= 0) {
            k2b.a(-n, 0, 0, 0);
        }
    }

    private static void h(int n) throws Exception {
        if (aE) {
            return;
        }
        DoHoang091.k0 k02 = DoHoang091.z();
        if (!DoHoang091.d(k02.t, k02.u - 12)) {
            DoHoang091.a("H\u00e3y \u0111\u1ebfn ch\u1ed7 c\u00f3 c\u00e1 \u0111\u1ec3 c\u00e2u");
            return;
        }
        if (k2e.s() < 1) {
            DoHoang091.a("H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return;
        }
        if (k16.c(n, 1) != 1) {
            return;
        }
        aE = true;
        aG = DoHoang091.s();
        aF = System.currentTimeMillis() + 20L;
        DoHoang091.a(true);
        DoHoang091.b("\u0110ang th\u1ea3 c\u00e2u...");
        k2b.a(1, 1, 0, 0);
    }

    private static void c() throws Exception {
        int n = k2b.f(DoHoang091.g(100));
        if (n < 0 || n >= ak.length) {
            return;
        }
        int n2 = ak[n];
        k16.a(n2, 1, false, (byte)0, (byte)0);
        DoHoang091.c(50000000L);
        if (al[n] <= 10) {
            DoHoang091.b("t\u00f4i c\u00e2u \u0111\u01b0\u1ee3c v\u1eadt ph\u1ea9m " + n2 + " " + (DoHoang091.g(200) + 300) + " n\u00e8");
        }
    }

    static int f(int n) {
        int n2 = n;
        int n3 = 0;
        while (n3 < al.length) {
            if (n2 < al[n3]) {
                return n3;
            }
            n2 -= al[n3];
            ++n3;
        }
        return n3;
    }

    private static void f(int n, int n2) throws Exception {
        k2b.a(n, n2, -1);
    }

    private static void a(int n, int n2, int n3) throws Exception {
        if (!k2b.g(n2)) {
            return;
        }
        if (!k2b.m(n)) {
            return;
        }
        if (n3 >= 0) {
            DoHoang091.k0 k02 = DoHoang091.z();
            if (n3 >= k02.K.length || (k02.K[n3] & 0xFFFF) != n || (k02.L[n3] & 0xFFFF) < n2) {
                return;
            }
        } else if (!k16.g(n, n2)) {
            k1d.b(33, "Kh\u00f4ng \u0111\u1ee7 " + k16.A(n));
            return;
        }
        if (k2e.s() < n2) {
            k1d.b(33, "H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return;
        }
        if (n3 >= 0 ? k16.c(n3, n2) != n2 : !k16.d(n, n2)) {
            return;
        }
        int n4 = 0;
        while (n4 < n2) {
            DoHoang091.c(50000000L);
            int n5 = kb.a(n == 895 ? "TRE_XANH_TRAM_DOT" : "BUA_MAY_MAN");
            if (n5 >= 0) {
                k19.g(n5);
            }
            ++n4;
        }
    }

    private static void a(int n, int n2, String string) throws Exception {
        if (k2e.s() < 1) {
            DoHoang091.a("H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return;
        }
        DoHoang091.k0 k02 = DoHoang091.z();
        if (n < 0 || n >= k02.K.length || (k02.K[n] & 0xFFFF) != n2) {
            return;
        }
        if (k16.c(n, 1) != 1) {
            return;
        }
        DoHoang091.c(50000000L);
        int n3 = kb.a(string);
        if (n3 >= 0) {
            k19.g(n3);
        }
    }

    private static void a(int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = k2b.k(n2);
        if (n7 <= 10 && !k2b.l(n3)) {
            k1d.a(n, new String[]{"B\u1ea3ng x\u1ebfp h\u1ea1ng", "Ph\u1ea7n th\u01b0\u1edfng", "Nh\u1eadn Th\u01b0\u1edfng TOP " + n7}, new int[]{n4, n5, n6});
        } else {
            k1d.a(n, new String[]{"B\u1ea3ng x\u1ebfp h\u1ea1ng", "Ph\u1ea7n th\u01b0\u1edfng"}, new int[]{n4, n5});
        }
    }

    private static void a(int n, int n2, boolean bl) throws Exception {
        boolean bl2;
        int n3 = k2b.k(n);
        if (n3 > 10) {
            DoHoang091.a("B\u1ea1n kh\u00f4ng \u0111\u1ee7 \u0111i\u1ec1u ki\u1ec7n nh\u1eadn ph\u1ea7n th\u01b0\u1edfng");
            return;
        }
        if (k2b.l(n2)) {
            DoHoang091.a("B\u1ea1n \u0111\u00e3 nh\u1eadn ph\u1ea7n th\u01b0\u1edfng r\u1ed3i");
            return;
        }
        if (k2e.s() < 10) {
            DoHoang091.a("B\u1ea1n c\u1ea7n \u0111\u1ec3 h\u00e0nh trang tr\u1ed1ng t\u1ed1i thi\u1ec3u 10 \u00f4");
            return;
        }
        boolean bl3 = bl2 = bl ? k2b.i(n3) : k2b.j(n3);
        if (!bl2) {
            return;
        }
        int n4 = k2b.h();
        k2b.ay[n4 + n2] = 1;
        k2b.j();
        DoHoang091.a("Nh\u1eadn th\u01b0\u1edfng th\u00e0nh c\u00f4ng");
    }

    private static boolean i(int n) throws Exception {
        int n2;
        DoHoang091.k0 k02 = DoHoang091.z();
        long l = System.currentTimeMillis();
        long l2 = -1L;
        byte[] byArray = null;
        int[] nArray = null;
        if (n == 1) {
            byArray = new byte[]{68, 10, 67, 69};
            nArray = new int[]{200, 100, 100, 100};
            if (!(k2b.a(1079, 10, -1L, null, null) && k2b.a(385, 1, -1L, null, null) && k2b.a(385, 1, -1L, null, null) && k2b.a(385, 1, -1L, null, null))) {
                return false;
            }
        } else if (n == 2) {
            if (!k2b.a(1079, 5, -1L, null, null) || !k2b.a(385, 1, -1L, null, null)) {
                return false;
            }
        } else if (n <= 5) {
            l2 = l + 7776000000L;
            if (!(k2b.a(1079, 3, -1L, null, null) && k2b.a(384, 1, -1L, null, null) && k2b.a(384, 1, -1L, null, null))) {
                return false;
            }
        } else {
            l2 = l + 2592000000L;
            if (!k2b.a(384, 1, -1L, null, null)) {
                return false;
            }
        }
        int n3 = n2 = k02.p == 1 ? 799 : 800;
        return k2b.a(830, 1, l2, byArray, nArray) && k2b.a(n2, 1, l2, null, null);
    }

    private static boolean j(int n) throws Exception {
        int n2;
        DoHoang091.k0 k02 = DoHoang091.z();
        long l = System.currentTimeMillis();
        long l2 = -1L;
        long l3 = -1L;
        byte[] byArray = null;
        int[] nArray = null;
        if (n == 1) {
            byArray = new byte[]{6, 7, 114, 94, 119, 120, -119};
            nArray = new int[]{3000, 3000, 100, 10, 200, 200, 1};
            if (!(k2b.a(1079, 10, -1L, null, null) && k2b.a(385, 1, -1L, null, null) && k2b.a(385, 1, -1L, null, null) && k2b.a(385, 1, -1L, null, null))) {
                return false;
            }
        } else if (n == 2) {
            if (!k2b.a(1079, 5, -1L, null, null) || !k2b.a(385, 1, -1L, null, null)) {
                return false;
            }
        } else if (n <= 5) {
            l2 = l + 7776000000L;
            l3 = l + 7776000000L;
            if (!(k2b.a(1079, 3, -1L, null, null) && k2b.a(384, 1, -1L, null, null) && k2b.a(384, 1, -1L, null, null))) {
                return false;
            }
        } else {
            l2 = l + 2592000000L;
            l3 = l + 7776000000L;
            if (!k2b.a(384, 1, -1L, null, null)) {
                return false;
            }
        }
        int n3 = n2 = k02.p == 1 ? 806 : 805;
        return k2b.a(851, 1, l2, byArray, nArray) && k2b.a(n2, 1, l3, null, null);
    }

    private static boolean a(int n, int n2, long l, byte[] byArray, int[] nArray) throws Exception {
        return k16.a(n, n2, false, (byte)0, (byte)0, l, byArray, nArray) >= 0;
    }

    private static int k(int n) {
        k2b.i();
        int n2 = k2b.d();
        if (ay[n2 * 7 + n] <= 0) {
            return 99;
        }
        int[] nArray = new int[9];
        int n3 = 0;
        int n4 = 0;
        while (n4 < 9) {
            DoHoang091.k0 k02 = DoHoang091.v(n4);
            if (k02 != null && k02.a != null && k02.a.length() != 0 && ay[n4 * 7 + n] > 0) {
                nArray[n3++] = n4;
            }
            ++n4;
        }
        int n5 = 0;
        while (n5 < n3) {
            int n6 = n5;
            int n7 = n5 + 1;
            while (n7 < n3) {
                if (ay[nArray[n7] * 7 + n] > ay[nArray[n6] * 7 + n]) {
                    n6 = n7;
                }
                ++n7;
            }
            int n8 = nArray[n5];
            nArray[n5] = nArray[n6];
            nArray[n6] = n8;
            ++n5;
        }
        n5 = 0;
        while (n5 < n3 && n5 < 10) {
            if (nArray[n5] == n2) {
                return n5 + 1;
            }
            ++n5;
        }
        return 99;
    }

    private static boolean l(int n) {
        k2b.i();
        return ay[k2b.h() + n] != 0;
    }

    private static int d() {
        int n = DoHoang091.s() - 1;
        if (n < 0) {
            n = 0;
        }
        if (n >= 9) {
            n = 8;
        }
        return n;
    }

    private static void a(int n, String string, String string2) throws Exception {
        k2b.i();
        int[] nArray = new int[9];
        int n2 = 0;
        int n3 = 0;
        while (n3 < 9) {
            DoHoang091.k0 k02 = DoHoang091.v(n3);
            if (k02 != null && k02.a != null && k02.a.length() != 0 && ay[n3 * 7 + n] > 0) {
                nArray[n2++] = n3;
            }
            ++n3;
        }
        int n4 = 0;
        while (n4 < n2) {
            int n5 = n4;
            int n6 = n4 + 1;
            while (n6 < n2) {
                if (ay[nArray[n6] * 7 + n] > ay[nArray[n5] * 7 + n]) {
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
            String string3 = k2b.a(string2, n4 + 1, k03.a, k2b.p(ay[nArray[n4] * 7 + n]));
            stringBuffer.append(string3);
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

    private static void e() throws Exception {
        DoHoang091.a("H\u01b0\u1edbng D\u1eabn", "- S\u1ed1 l\u1ea7n c\u00e2u c\u00e1: " + k2b.p(k2b.b(1)) + "\n- S\u1ed1 di\u1ec1u \u0111\u00e3 l\u00e0m: " + k2b.p(k2b.b(2)) + "\n- S\u1ed1 kem \u0111\u00e3 l\u00e0m: " + k2b.p(k2b.b(3)) + "\n===H\u01af\u1edaNG D\u1eaaN===\n- Di\u1ec1u gi\u1ea5y: 5 tre + 6 d\u00e2y + 5 gi\u1ea5y + 30.000 Xu" + "\n- Di\u1ec1u v\u1ea3i: 6 tre + 6 d\u00e2y + 5 v\u1ea3i + 15 l\u01b0\u1ee3ng." + "\n- H\u0169 Kem D\u1ea7m: 3 Kem \u1ed1c qu\u1ebf + 2 Kem s\u1eefa + 3 Kem chocolate + 2 Kem d\u00e2u + 15 l\u01b0\u1ee3ng.");
    }

    private static String f() {
        return "Top 1:\n- Ph\u01b0\u1ee3ng Ho\u00e0ng B\u0103ng v.v MCS\n- G\u1eady th\u1eddi trang v.v\n- 3 R\u01b0\u01a1ng huy\u1ec1n b\u00ed\n- 10 Tr\u00fac b\u1ea1ch thi\u00ean l\u1eef\n\nTop 2:\n- Ph\u01b0\u1ee3ng Ho\u00e0ng B\u0103ng v.v\n- G\u1eady th\u1eddi trang v.v\n- 1 R\u01b0\u01a1ng huy\u1ec1n b\u00ed\n- 5 Tr\u00fac b\u1ea1ch thi\u00ean l\u1eef\n\nTop 3 - 5:\n- Ph\u01b0\u1ee3ng Ho\u00e0ng B\u0103ng 3 th\u00e1ng\n- G\u1eady th\u1eddi trang 3 th\u00e1ng\n- 2 R\u01b0\u01a1ng b\u1ea1ch ng\u00e2n\n- 3 Tr\u00fac b\u1ea1ch thi\u00ean l\u1eef\n\nTop 6 - 10:\n- Ph\u01b0\u1ee3ng Ho\u00e0ng B\u0103ng 1 th\u00e1ng\n- 1 r\u01b0\u01a1ng b\u1ea1ch ng\u00e2n";
    }

    private static String g() {
        return "Top 1:\n- Pet \u1ee9ng long v.v MCS\n- SHIRAIJI/HAJIRO v.v MCS\n- 3 r\u01b0\u01a1ng huy\u1ec1n b\u00ed\n- 10 Tr\u00fac b\u1ea1ch thi\u00ean l\u1eef\n\nTop 2:\n- Pet \u1ee9ng long v.v\n- SHIRAIJI/HAJIRO v.v\n- 1 r\u01b0\u01a1ng huy\u1ec1n b\u00ed\n- 5 Tr\u00fac b\u1ea1ch thi\u00ean l\u1eef\n\nTop 3 - 5:\n- Pet \u1ee9ng long 3 th\u00e1ng\n- SHIRAIJI/HAJIRO 3 th\u00e1ng\n- 2 r\u01b0\u01a1ng b\u1ea1ch ng\u00e2n\n- 3 Tr\u00fac b\u1ea1ch thi\u00ean l\u1eef\n\nTop 6 - 10:\n- Pet \u1ee9ng long 1 th\u00e1ng\n- 1 r\u01b0\u01a1ng b\u1ea1ch ng\u00e2n";
    }

    private static boolean m(int n) {
        int n2 = 0;
        while (n2 < ak.length) {
            if (ak[n2] == n) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private static int n(int n) {
        if (n == 895) {
            return 20034;
        }
        if (n == 896) {
            return 20035;
        }
        if (n == 897) {
            return 20036;
        }
        if (n == 898) {
            return 20037;
        }
        if (n == 899) {
            return 20038;
        }
        if (n == 900) {
            return 20039;
        }
        if (n == 901) {
            return 20040;
        }
        return -1;
    }

    private static int o(int n) {
        if (n == 20034) {
            return 895;
        }
        if (n == 20035) {
            return 896;
        }
        if (n == 20036) {
            return 897;
        }
        if (n == 20037) {
            return 898;
        }
        if (n == 20038) {
            return 899;
        }
        if (n == 20039) {
            return 900;
        }
        if (n == 20040) {
            return 901;
        }
        return -1;
    }

    private static int a(String string) throws Exception {
        byte[] byArray = ax.find(string.hashCode());
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

    private static void a(int n, int n2, int n3, int n4) {
        k2b.i();
        int n5 = k2b.h();
        k2b.g(n5 + 0, n);
        k2b.g(n5 + 1, n2);
        k2b.g(n5 + 2, n3);
        k2b.g(n5 + 3, n4);
        k2b.j();
    }

    private static void g(int n, int n2) {
        long l = (long)ay[n] + (long)n2;
        k2b.ay[n] = l < 0L ? 0 : (l > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l);
    }

    private static int h() {
        return k2b.d() * 7;
    }

    private static void i() {
        if (az && ay != null) {
            return;
        }
        ay = new int[63];
        RecordStore recordStore = null;
        try {
            try {
                recordStore = RecordStore.openRecordStore((String)aw, (boolean)true);
                if (recordStore.getNumRecords() > 0) {
                    boolean bl;
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(recordStore.getRecord(1)));
                    int n = dataInputStream.readInt();
                    int n2 = dataInputStream.readUnsignedByte();
                    int n3 = dataInputStream.readUnsignedByte();
                    int n4 = dataInputStream.readUnsignedByte();
                    boolean bl2 = n == 1398099282 && n2 == 2 && n3 == 9 && n4 == 7;
                    boolean bl3 = bl = n == 1398099282 && n2 == 1 && n3 == 9 && n4 == 4;
                    if (bl2 || bl) {
                        int n5 = bl2 ? 7 : 4;
                        int n6 = 0;
                        while (n6 < 9) {
                            int n7 = 0;
                            while (n7 < n5) {
                                int n8 = dataInputStream.readInt();
                                k2b.ay[n6 * 7 + n7] = n8 < 0 ? 0 : n8;
                                ++n7;
                            }
                            ++n6;
                        }
                        if (dataInputStream.available() != 0) {
                            ay = new int[63];
                        }
                    }
                    dataInputStream.close();
                }
            }
            catch (Exception exception) {
                ay = new int[63];
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
        az = true;
    }

    private static void j() {
        RecordStore recordStore;
        block12: {
            k2b.i();
            recordStore = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8 + ay.length * 4);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(1398099282);
                    dataOutputStream.writeByte(2);
                    dataOutputStream.writeByte(9);
                    dataOutputStream.writeByte(7);
                    int n = 0;
                    while (n < ay.length) {
                        dataOutputStream.writeInt(ay[n]);
                        ++n;
                    }
                    dataOutputStream.flush();
                    byte[] byArray = byteArrayOutputStream.toByteArray();
                    recordStore = RecordStore.openRecordStore((String)aw, (boolean)true);
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

    private static void k() {
        aE = false;
        aF = 0L;
        aG = -1;
    }

    private static String p(int n) {
        String string = String.valueOf(n);
        StringBuffer stringBuffer = new StringBuffer(string.length() + string.length() / 3);
        int n2 = string.length() % 3;
        if (n2 == 0) {
            n2 = 3;
        }
        stringBuffer.append(string.substring(0, n2));
        int n3 = n2;
        while (n3 < string.length()) {
            stringBuffer.append('.');
            stringBuffer.append(string.substring(n3, n3 + 3));
            n3 += 3;
        }
        return stringBuffer.toString();
    }
}

