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

final class k1c {
    private static final int o = 33;
    private static final int p = 38;
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
    private static final int q = 42001;
    private static final int r = 42002;
    private static final int s = 42003;
    private static final int t = 42004;
    private static final int u = 42005;
    private static final int v = 42006;
    private static final int w = 42007;
    private static final int x = 42008;
    private static final int y = 42009;
    private static final int z = 42010;
    private static final int A = 42011;
    private static final int B = 42012;
    private static final int C = 9999;
    private static final int D = 4;
    private static final int E = 224;
    private static final int F = 230;
    private static final int G = 666;
    private static final int H = 667;
    private static final int I = 668;
    private static final int J = 669;
    private static final int K = 670;
    private static final int L = 671;
    private static final int M = 672;
    private static final int N = 673;
    private static final int O = 394;
    private static final int P = 481;
    private static final int Q = 478;
    private static final int R = 831;
    private static final int S = 832;
    private static final int T = 1078;
    private static final int U = 1079;
    private static final int V = 1080;
    private static final String W = "nso_offline_noel_v1";
    private static final int X = 1313817932;
    private static final int Y = 1;
    private static final int Z = 9;
    private static final int aa = 9;
    private static final k4 ab = new k4("event_wire");
    private static int[] ac;
    private static boolean ad;
    private static int ae;
    private static int af;

    static {
        ae = -1;
        af = -1;
    }

    private k1c() {
    }

    static void a(int n) throws Exception {
        k1d.a(n, new String[]{"L\u00e0m b\u00e1nh", "\u0110\u1ed5i l\u1ed3ng \u0111\u00e8n", "\u0110ua TOP", "H\u01b0\u1edbng d\u1eabn"}, new int[]{42001, 42004, 42007, 42012});
    }

    static boolean a(int n, int n2) throws Exception {
        switch (n2) {
            case 42001: {
                if (n != 33) {
                    return false;
                }
                k1d.a(n, new String[]{"B\u00e1nh kh\u00fac d\u00e2u t\u00e2y", "B\u00e1nh kh\u00fac chocolate"}, new int[]{42002, 42003});
                return true;
            }
            case 42002: {
                if (n != 33) {
                    return false;
                }
                k1c.b(0, "B\u00e1nh kh\u00fac d\u00e2u t\u00e2y");
                return true;
            }
            case 42003: {
                if (n != 33) {
                    return false;
                }
                k1c.b(1, "B\u00e1nh kh\u00fac chocolate");
                return true;
            }
            case 42004: {
                if (n != 33) {
                    return false;
                }
                k1d.a(n, new String[]{"2 tri\u1ec7u xu", "500 l\u01b0\u1ee3ng"}, new int[]{42005, 42006});
                return true;
            }
            case 42005: {
                if (n != 33) {
                    return false;
                }
                k19.b(false);
                return true;
            }
            case 42006: {
                if (n != 33) {
                    return false;
                }
                k19.b(true);
                return true;
            }
            case 42007: {
                if (n != 33) {
                    return false;
                }
                k1d.a(n, new String[]{"BXH b\u00e1nh d\u00e2u", "Qu\u00e0 top b\u00e1nh d\u00e2u", "BXH b\u00e1nh chocolate", "Qu\u00e0 top chocolate"}, new int[]{42008, 42009, 42010, 42011});
                return true;
            }
            case 42008: {
                if (n != 33) {
                    return false;
                }
                k1c.c(1, "Top b\u00e1nh d\u00e2u");
                return true;
            }
            case 42009: {
                if (n != 33) {
                    return false;
                }
                DoHoang091.a("Ph\u1ea7n th\u01b0\u1edfng", k1c.f());
                return true;
            }
            case 42010: {
                if (n != 33) {
                    return false;
                }
                k1c.c(3, "Top b\u00e1nh chocolate");
                return true;
            }
            case 42011: {
                if (n != 33) {
                    return false;
                }
                DoHoang091.a("Ph\u1ea7n th\u01b0\u1edfng", k1c.g());
                return true;
            }
            case 42012: {
                if (n != 33) {
                    return false;
                }
                k1c.e();
                return true;
            }
        }
        return false;
    }

    static boolean a(int n, String string) throws Exception {
        if (n != 9999 || ae < 0) {
            return false;
        }
        int n2 = ae;
        int n3 = af;
        ae = -1;
        af = -1;
        if (n3 != DoHoang091.s()) {
            return true;
        }
        if (string == null || string.length() == 0) {
            return true;
        }
        try {
            k1c.b(n2, Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            DoHoang091.a("D\u1eef li\u1ec7u nh\u1eadp kh\u00f4ng h\u1ee3p l\u1ec7.");
        }
        return true;
    }

    static void b(int n, int n2) throws Exception {
        switch (n) {
            case 0: {
                k1c.a(n2, true);
                break;
            }
            case 1: {
                k1c.a(n2, false);
                break;
            }
            case 2: {
                k1c.g(n2);
                break;
            }
            case 3: {
                k1c.b(n2, false);
                break;
            }
            case 4: {
                k1c.b(n2, true);
            }
        }
    }

    static boolean c(int n, int n2) throws Exception {
        switch (n2) {
            case 671: {
                k1c.a(n, n2, "EVENT_GOLD");
                return true;
            }
            case 672: {
                k1c.a(n, n2, "EVENT_COIN");
                return true;
            }
            case 1078: 
            case 1079: {
                k1c.h(n2);
                return true;
            }
            case 1080: {
                kd.b(45, 21600000L, 2, 1080);
                k16.c(n, 1);
                return true;
            }
            case 673: 
            case 832: {
                if (k2e.s() < 1) {
                    DoHoang091.a("H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
                    return true;
                }
                if (!DoHoang091.c(38, 100)) {
                    DoHoang091.b("H\u00e3y l\u1ea1i g\u1ea7n C\u00e2y Th\u00f4ng \u0111\u1ec3 s\u1eed d\u1ee5ng.");
                    return true;
                }
                if (k1c.a(n, n2, "EVENT_COIN") && n2 == 673) {
                    k1c.a(1, 0, 0, 0, 0, 0);
                }
                return true;
            }
            case 478: {
                return true;
            }
        }
        return false;
    }

    static void a(int n, short s, short s2) throws Exception {
        boolean bl;
        if (!k10.d(n)) {
            return;
        }
        int n2 = k1c.a("NOEL_MONSTER");
        if (n2 < 0) {
            return;
        }
        boolean bl2 = bl = k16.E(n2) == 25;
        if (k2e.s() > 0 && k16.a(n2, 1, bl, (byte)0, (byte)0) >= 0) {
            return;
        }
        kb.b(n2, s, s2);
    }

    static int b(int n) {
        return n == 4 ? 1 : 0;
    }

    static int d(int n, int n2) {
        return n == 4 && n2 == 0 ? 224 : -1;
    }

    static int e(int n, int n2) {
        return k1c.d(n, n2) == 224 ? 3000 : 0;
    }

    static int f(int n, int n2) {
        return k1c.d(n, n2) == 224 ? 0 : 0;
    }

    static short g(int n, int n2) {
        return k1c.d(n, n2) == 224 ? (short)1928 : 0;
    }

    static short h(int n, int n2) {
        return k1c.d(n, n2) == 224 ? (short)240 : 0;
    }

    static int i(int n, int n2) {
        return 0;
    }

    static int j(int n, int n2) {
        return k1c.d(n, n2) == 224 ? 900 : 0;
    }

    static boolean c(int n) {
        return n == 224 || n == 230;
    }

    static boolean d(int n) {
        return n == 224;
    }

    static int k(int n, int n2) {
        if (n != 224) {
            return n2;
        }
        return DoHoang091.z().cb[0] > 0 ? 1 : 0;
    }

    static void b(int n, short s, short s2) throws Exception {
        if (n == 224) {
            if (DoHoang091.z().cb[0] > 0) {
                k1c.a(0, 0, 0, 0, 100, 0);
                DoHoang091.b(String.valueOf(DoHoang091.z().a) + " \u0111\u00e3 ti\u00eau di\u1ec7t ng\u01b0\u1eddi tuy\u1ebft");
            }
            return;
        }
        if (n == 230) {
            int n2;
            k1c.a(0, 0, 1, 0, 0, 0);
            DoHoang091.c(80000000L);
            if (k2e.s() > 0 && (n2 = kb.a("VUA_TUAN_LOC")) >= 0) {
                k16.a(n2, 1, false, (byte)0, (byte)0);
            }
        }
    }

    static int e(int n) {
        if (n < 0 || n >= 9) {
            return 0;
        }
        k1c.c();
        return ac[k1c.b() + n];
    }

    static void a() {
        ae = -1;
        af = -1;
        ad = false;
        ac = null;
    }

    private static void b(int n, String string) throws Exception {
        ae = n;
        af = DoHoang091.s();
        DoHoang091.a(string, 9999);
    }

    private static boolean f(int n) throws Exception {
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

    private static void a(int n, boolean bl) throws Exception {
        int n2;
        int[] nArray;
        int n3 = bl ? 670 : 669;
        int[] nArray2 = new int[]{666, 667, 668, n3};
        if (!k1c.a(n, nArray2, nArray = new int[]{2, 2, 2, 1}, n2 = bl ? 672 : 671)) {
            return;
        }
        if (bl) {
            k1c.a(n, n, 0, 0, 0, 0);
        } else {
            k1c.a(n, 0, 0, n, 0, 0);
        }
    }

    private static void g(int n) throws Exception {
        int[] nArray = new int[]{481, 394, 831};
        int[] nArray2 = new int[]{3, 3, 3};
        if (k1c.a(n, nArray, nArray2, 832)) {
            k1c.a(n + 1, 0, 0, 0, 0, 0);
        }
    }

    private static boolean a(int n, int[] nArray, int[] nArray2, int n2) throws Exception {
        if (!k1c.f(n)) {
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

    private static void b(int n, boolean bl) throws Exception {
        String string;
        if (!k1c.f(n)) {
            return;
        }
        long l = 20L * (long)n;
        if (l > Integer.MAX_VALUE || k1c.e(4) < (int)l) {
            k1d.b(33, "B\u1ea1n c\u1ea7n t\u1ed1i thi\u1ec3u " + k1c.i((int)l) + " \u0111i\u1ec3m ti\u00eau di\u1ec7t ng\u01b0\u1eddi tuy\u1ebft m\u1edbi c\u00f3 th\u1ec3 trao \u0111\u1ed5i.");
            return;
        }
        String string2 = string = bl ? "NOEL_GOLD2" : "EVENT_COIN";
        if (!k19.b(string)) {
            DoHoang091.b("Nh\u00f3m ph\u1ea7n th\u01b0\u1edfng n\u00e0y hi\u1ec7n ch\u01b0a \u0111\u01b0\u1ee3c m\u1edf.");
            return;
        }
        if (k2e.s() < n) {
            k1d.b(33, "H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return;
        }
        int n2 = 0;
        while (n2 < n) {
            if (!k19.a(string)) {
                return;
            }
            ++n2;
        }
        if (!bl && DoHoang091.g(1000) == 0 || bl && DoHoang091.g(2000) == 0) {
            k16.a(bl ? 1079 : 1078, 1, false, (byte)0, (byte)0);
        }
        k1c.a(0, 0, 0, 0, -((int)l), 0);
    }

    private static boolean a(int n, int n2, String string) throws Exception {
        if (!k19.b(string)) {
            k1c.h(n2);
            return false;
        }
        return k19.a(n, n2, string);
    }

    private static void h(int n) throws Exception {
        if (k2e.s() < 1) {
            DoHoang091.a("H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return;
        }
        DoHoang091.b("Ph\u1ea7n th\u01b0\u1edfng " + k16.A(n) + " hi\u1ec7n ch\u01b0a \u0111\u01b0\u1ee3c m\u1edf.");
    }

    private static void a(int n, int n2, int n3, int n4, int n5, int n6) {
        k1c.c();
        int n7 = k1c.b();
        k1c.ac[n7 + 0] = k1c.l(ac[n7 + 0], n);
        k1c.ac[n7 + 1] = k1c.l(ac[n7 + 1], n2);
        k1c.ac[n7 + 2] = k1c.l(ac[n7 + 2], n3);
        k1c.ac[n7 + 3] = k1c.l(ac[n7 + 3], n4);
        k1c.ac[n7 + 4] = k1c.l(ac[n7 + 4], n5);
        k1c.ac[n7 + 5] = k1c.l(ac[n7 + 5], n6);
        k1c.d();
    }

    private static int l(int n, int n2) {
        long l = (long)n + (long)n2;
        if (l < 0L) {
            return 0;
        }
        return l > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l;
    }

    private static int b() {
        int n = DoHoang091.s() - 1;
        if (n < 0) {
            n = 0;
        }
        if (n >= 9) {
            n = 8;
        }
        return n * 9;
    }

    private static void c() {
        if (ad && ac != null) {
            return;
        }
        ac = new int[81];
        RecordStore recordStore = null;
        try {
            try {
                recordStore = RecordStore.openRecordStore((String)W, (boolean)true);
                if (recordStore.getNumRecords() > 0) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(recordStore.getRecord(1)));
                    if (dataInputStream.readInt() == 1313817932 && dataInputStream.readUnsignedByte() == 1 && dataInputStream.readUnsignedByte() == 9 && dataInputStream.readUnsignedByte() == 9) {
                        int n = 0;
                        while (n < ac.length) {
                            int n2 = dataInputStream.readInt();
                            k1c.ac[n] = n2 < 0 ? 0 : n2;
                            ++n;
                        }
                        if (dataInputStream.available() != 0) {
                            ac = new int[81];
                        }
                    }
                    dataInputStream.close();
                }
            }
            catch (Exception exception) {
                ac = new int[81];
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
        ad = true;
    }

    private static void d() {
        RecordStore recordStore;
        block12: {
            k1c.c();
            recordStore = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8 + ac.length * 4);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(1313817932);
                    dataOutputStream.writeByte(1);
                    dataOutputStream.writeByte(9);
                    dataOutputStream.writeByte(9);
                    int n = 0;
                    while (n < ac.length) {
                        dataOutputStream.writeInt(ac[n]);
                        ++n;
                    }
                    dataOutputStream.flush();
                    byte[] byArray = byteArrayOutputStream.toByteArray();
                    recordStore = RecordStore.openRecordStore((String)W, (boolean)true);
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

    private static int a(String string) throws Exception {
        byte[] byArray = ab.find(string.hashCode());
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
            if (n4 == 0) {
                return -1;
            }
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

    private static void c(int n, String string) throws Exception {
        int n2 = k1c.e(n);
        DoHoang091.a(string, n2 <= 0 ? "" : "1. " + DoHoang091.z().a + " ");
    }

    private static void e() throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("- S\u1ed1 l\u1ea7n l\u00e0m b\u00e1nh d\u00e2u : ").append(k1c.i(k1c.e(1))).append("\n");
        stringBuffer.append("- S\u1ed1 l\u1ea7n l\u00e0m b\u00e1nh chocolate : ").append(k1c.i(k1c.e(3))).append("\n");
        stringBuffer.append("=== C\u00d4NG TH\u1ee8C ===\n");
        stringBuffer.append("- B\u00e1nh kh\u00fac D\u00e2u t\u00e2y: 2 B\u01a1 + 2 Kem + 2 \u0110\u01b0\u1eddng b\u1ed9t + 1 D\u00e2u t\u00e2y.\n");
        stringBuffer.append("- B\u00e1nh kh\u00fac Chocolate: 2 B\u01a1 + 2 Kem + 2 \u0110\u01b0\u1eddng b\u1ed9t + 1 Chocolate.\n");
        stringBuffer.append("- H\u1ed9p qu\u00e0 : mua t\u1ea1i goshoo\n");
        stringBuffer.append("Xem chi ti\u1ebft s\u1ef1 ki\u1ec7n t\u1ea1i : nsokiss.me");
        DoHoang091.a("H\u01b0\u1edbng D\u1eabn", stringBuffer.toString());
    }

    private static String f() {
        return "Top 1 : \n- 1 C\u1ea3i trang Santa +10 \n- Tu\u1ea7n l\u1ed9c v\u1edbi thu\u1ed9c t\u00ednh ch\u1ed1ng b\u1ecb PK v\u0129nh vi\u1ec5n\n- 5 r\u01b0\u01a1ng huy\u1ec1n b\u00ed\n\nTop 2 : \n- 2 C\u1ea3i trang Santa +10\n- Tu\u1ea7n l\u1ed9c v\u0129nh vi\u1ec5n\n- 3 r\u01b0\u01a1ng huy\u1ec1n b\u00ed\n\nTop 3 : \n- C\u1ea3i trang Santa +10 \n- Tu\u1ea7n l\u1ed9c v\u0129nh vi\u1ec5n \n- 1 r\u01b0\u01a1ng huy\u1ec1n b\u00ed\n\nTop 4-10 : \n- C\u1ea3i trang Santa +1\n- Tu\u1ea7n l\u1ed9c 6 th\u00e1ng";
    }

    private static String g() {
        return "Top 1\nH\u1ecfa k\u1ef3 L\u00e2n v\u0129nh vi\u1ec5n ch\u1ecdn ch\u1ec9 s\u1ed1\nTu\u1ea7n l\u1ed9c vv ch\u1ed1ng \u0111\u1ed3 s\u00e1t\nL\u1ed3ng \u0111\u00e8n trang b\u1ecb 2 v\u0129nh vi\u1ec5n 7 d\u00f2ng ch\u1ecdn ch\u1ec9 s\u1ed1\n\nTop 2\n3 H\u1ecfa k\u1ef3 l\u00e2n v\u0129nh vi\u1ec5n ( random ch\u1ec9 s\u1ed1 )\n3 m\u1eb7t n\u1ea1 trang b\u1ecb 2 v\u0129nh vi\u1ec5n random\n\nTop 3 \n2 H\u1ecfa k\u1ef3 l\u00e2n v\u0129nh vi\u1ec5n ( random )\n2 m\u1eb7t n\u1ea1 trang b\u1ecb 2 v\u0129nh vi\u1ec5n random\n\nTop 4 - 6\n3 m\u1eb7t n\u1ea1 2 v\u0129nh vi\u1ec5n ( random )\n2 r\u01b0\u01a1ng huy\u1ec1n b\u00ed\n\nTop 7 - 10\n2 m\u1eb7t n\u1ea1 2 v\u0129nh vi\u1ec5n ( random )\n1 r\u01b0\u01a1ng huy\u1ec1n b\u00ed";
    }

    private static String i(int n) {
        String string = String.valueOf(n);
        StringBuffer stringBuffer = new StringBuffer(string.length() + string.length() / 3);
        int n2 = 0;
        while (n2 < string.length()) {
            if (n2 > 0 && (string.length() - n2) % 3 == 0) {
                stringBuffer.append(',');
            }
            stringBuffer.append(string.charAt(n2));
            ++n2;
        }
        return stringBuffer.toString();
    }
}

