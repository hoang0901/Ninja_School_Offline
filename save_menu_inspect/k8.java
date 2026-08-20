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

final class k8 {
    private static final int h = 33;
    static final int a = 0;
    static final int b = 1;
    static final int c = 2;
    static final int d = 3;
    static final int e = 0;
    static final int f = 1;
    static final int g = 2;
    private static final int i = 44001;
    private static final int j = 44002;
    private static final int k = 44003;
    private static final int l = 44004;
    private static final int m = 44005;
    private static final int n = 44006;
    private static final int o = 44007;
    private static final int p = 44008;
    private static final int q = 44009;
    private static final int r = 44010;
    private static final int s = 44011;
    private static final int t = 44012;
    private static final int u = 9999;
    private static final int v = 1134;
    private static final int w = 1135;
    private static final int x = 1136;
    private static final int y = 1137;
    private static final int z = 1138;
    private static final int A = 1139;
    private static final int B = 1140;
    private static final int C = 1141;
    private static final int D = 1143;
    private static final int E = 1144;
    private static final String F = "nso_offline_cohon_v1";
    private static final int G = 1129269326;
    private static final int H = 1;
    private static final int I = 9;
    private static final int J = 3;
    private static final k4 K = new k4("event_wire");
    private static int[] L;
    private static boolean M;
    private static int N;
    private static int O;

    static {
        N = -1;
        O = -1;
    }

    private k8() {
    }

    static void a(int n) throws Exception {
        k1d.a(n, new String[]{"L\u00e0m M\u00e2m C\u00fang C\u00f4 H\u1ed3n Th\u01b0\u1eddng", "L\u00e0m M\u00e2m C\u00fang C\u00f4 H\u1ed3n B\u1ea1c", "L\u00e0m M\u00e2m C\u00fang C\u00f4 H\u1ed3n V\u00e0ng", "\u0110\u1ed5i h\u1ed3 l\u00f4", "\u0110ua TOP", "H\u01b0\u1edbng d\u1eabn"}, new int[]{44001, 44002, 44003, 44004, 44005, 44012});
    }

    static boolean a(int n, int n2) throws Exception {
        if (n != 33) {
            return false;
        }
        switch (n2) {
            case 44001: {
                k8.b(0, "L\u00e0m M\u00e2m C\u00fang C\u00f4 H\u1ed3n Th\u01b0\u1eddng");
                return true;
            }
            case 44002: {
                k8.b(1, "L\u00e0m M\u00e2m C\u00fang C\u00f4 H\u1ed3n B\u1ea1c");
                return true;
            }
            case 44003: {
                k8.b(2, "L\u00e0m M\u00e2m C\u00fang C\u00f4 H\u1ed3n V\u00e0ng");
                return true;
            }
            case 44004: {
                k8.b(3, "\u0110\u1ed5i h\u1ed3 l\u00f4");
                return true;
            }
            case 44005: {
                k1d.a(n, new String[]{"C\u00fang c\u00f4 h\u1ed3n", "Di\u1ec7t tr\u1eeb y\u00eau tinh"}, new int[]{44006, 44007});
                return true;
            }
            case 44006: {
                k1d.a(n, new String[]{"B\u1ea3ng x\u1ebfp h\u1ea1ng", "Ph\u1ea7n th\u01b0\u1edfng"}, new int[]{44008, 44009});
                return true;
            }
            case 44007: {
                k1d.a(n, new String[]{"B\u1ea3ng x\u1ebfp h\u1ea1ng", "Ph\u1ea7n th\u01b0\u1edfng"}, new int[]{44010, 44011});
                return true;
            }
            case 44008: {
                k8.a(1, "C\u00fang c\u00f4 h\u1ed3n", "\u0111\u00e3 c\u00fang");
                return true;
            }
            case 44010: {
                k8.a(2, "Di\u1ec7t tr\u1eeb y\u00eau tinh", "\u0111\u00e3 ti\u00eau di\u1ec7t");
                return true;
            }
            case 44009: {
                DoHoang091.a("Ph\u1ea7n th\u01b0\u1edfng", k8.f());
                return true;
            }
            case 44011: {
                DoHoang091.a("Ph\u1ea7n th\u01b0\u1edfng", k8.g());
                return true;
            }
            case 44012: {
                DoHoang091.a("H\u01b0\u1edbng D\u1eabn", k8.e());
                return true;
            }
        }
        return false;
    }

    static boolean a(int n, String string) throws Exception {
        if (n != 9999 || N < 0) {
            return false;
        }
        int n2 = N;
        int n3 = O;
        N = -1;
        O = -1;
        if (n3 != DoHoang091.s() || string == null || string.length() == 0) {
            return true;
        }
        try {
            k8.b(n2, Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            DoHoang091.a("D\u1eef li\u1ec7u nh\u1eadp kh\u00f4ng h\u1ee3p l\u1ec7.");
        }
        return true;
    }

    static void b(int n, int n2) throws Exception {
        switch (n) {
            case 0: {
                k8.a(n2, new int[]{1134, 1136, 1135, 1137}, new int[]{5, 5, 5, 5}, 1138, false);
                break;
            }
            case 1: {
                k8.a(n2, new int[]{1134, 1136, 1135, 1137}, new int[]{3, 4, 3, 4}, 1139, false);
                break;
            }
            case 2: {
                k8.a(n2, new int[]{1134, 1136, 1135, 1137}, new int[]{4, 3, 4, 3}, 1140, true);
                break;
            }
            case 3: {
                k8.a(n2, new int[]{1141}, new int[]{2}, 1143, false);
                break;
            }
        }
    }

    static boolean c(int n, int n2) throws Exception {
        switch (n2) {
            case 1138: {
                return k8.a(n, n2, "COHON_MAM");
            }
            case 1139: {
                return k8.a(n, n2, "EVENT_COIN");
            }
            case 1140: 
            case 1143: {
                return k8.a(n, n2, "COHON_GOLD2");
            }
            case 1144: {
                return k8.a(n, n2, "COHON_LUCKY");
            }
        }
        return false;
    }

    static void a(int n, short s, short s2) throws Exception {
        if (!k10.d(n)) {
            return;
        }
        int n2 = k8.a("COHON_MONSTER");
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
        if (n < 0 || n >= 3) {
            return 0;
        }
        k8.c();
        return L[k8.b() + n];
    }

    static void a() {
        N = -1;
        O = -1;
        L = null;
        M = false;
    }

    private static void b(int n, String string) throws Exception {
        N = n;
        O = DoHoang091.s();
        DoHoang091.a(string, 9999);
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

    private static void a(int n, int[] nArray, int[] nArray2, int n2, boolean bl) throws Exception {
        if (!k8.c(n)) {
            return;
        }
        int n3 = 0;
        while (n3 < nArray.length) {
            long l = (long)nArray2[n3] * (long)n;
            if (l > 32767L || !k16.g(nArray[n3], (int)l)) {
                k1d.b(33, "Kh\u00f4ng \u0111\u1ee7 " + k16.A(nArray[n3]));
                return;
            }
            ++n3;
        }
        if (k2e.s() < 1) {
            k1d.b(33, "H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return;
        }
        n3 = 0;
        while (n3 < nArray.length) {
            if (!k16.d(nArray[n3], nArray2[n3] * n)) {
                return;
            }
            ++n3;
        }
        if (k16.a(n2, n, false, (byte)0, (byte)0) >= 0 && bl) {
            k8.d(0, 1);
        }
    }

    private static boolean a(int n, int n2, String string) throws Exception {
        if (k2e.s() < 1) {
            DoHoang091.a("H\u00e0nh trang kh\u00f4ng c\u00f2n ch\u1ed7 tr\u1ed1ng.");
            return true;
        }
        if (!k19.b(string)) {
            DoHoang091.b("Ph\u1ea7n th\u01b0\u1edfng " + k16.A(n2) + " hi\u1ec7n ch\u01b0a \u0111\u01b0\u1ee3c m\u1edf.");
            return true;
        }
        k19.a(n, n2, string);
        return true;
    }

    private static int a(String string) throws Exception {
        byte[] byArray = K.find(string.hashCode());
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

    private static void a(int n, String string, String string2) throws Exception {
        int n2 = k8.b(n);
        String string3 = n2 <= 0 ? "" : "1. " + DoHoang091.z().a + " " + string2 + " " + n2 + " l\u1ea7n";
        DoHoang091.a(string, string3);
    }

    private static void d(int n, int n2) {
        k8.c();
        int n3 = k8.b() + n;
        long l = (long)L[n3] + (long)n2;
        k8.L[n3] = l < 0L ? 0 : (l > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l);
        k8.d();
    }

    private static int b() {
        int n = DoHoang091.s() - 1;
        if (n < 0) {
            n = 0;
        }
        if (n >= 9) {
            n = 8;
        }
        return n * 3;
    }

    private static void c() {
        if (M && L != null) {
            return;
        }
        L = new int[27];
        RecordStore recordStore = null;
        try {
            try {
                recordStore = RecordStore.openRecordStore((String)F, (boolean)true);
                if (recordStore.getNumRecords() > 0) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(recordStore.getRecord(1)));
                    if (dataInputStream.readInt() == 1129269326 && dataInputStream.readUnsignedByte() == 1 && dataInputStream.readUnsignedByte() == 9 && dataInputStream.readUnsignedByte() == 3) {
                        int n = 0;
                        while (n < L.length) {
                            int n2 = dataInputStream.readInt();
                            k8.L[n] = n2 < 0 ? 0 : n2;
                            ++n;
                        }
                        if (dataInputStream.available() != 0) {
                            L = new int[27];
                        }
                    }
                    dataInputStream.close();
                }
            }
            catch (Exception exception) {
                L = new int[27];
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
        M = true;
    }

    private static void d() {
        RecordStore recordStore;
        block12: {
            k8.c();
            recordStore = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8 + L.length * 4);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(1129269326);
                    dataOutputStream.writeByte(1);
                    dataOutputStream.writeByte(9);
                    dataOutputStream.writeByte(3);
                    int n = 0;
                    while (n < L.length) {
                        dataOutputStream.writeInt(L[n]);
                        ++n;
                    }
                    dataOutputStream.flush();
                    byte[] byArray = byteArrayOutputStream.toByteArray();
                    recordStore = RecordStore.openRecordStore((String)F, (boolean)true);
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

    private static String e() {
        return "-- H\u01af\u1edaNG D\u1eaaN --\n- M\u00e2m c\u00fang : 5 g\u1ea1o + 5 b\u00e1nh + 5 mu\u1ed1i + 5 ti\u1ec1n gi\u1ea5y + 30k y\u00ean.\n- M\u00e2m c\u00fang b\u1ea1c : 3 g\u1ea1o + 4 b\u00e1nh + 3 mu\u1ed1i + 4 ti\u1ec1n gi\u1ea5y + 30k xu.\n- M\u00e2m c\u00fang v\u00e0ng : 4 g\u1ea1o + 3 b\u00e1nh + 4 mu\u1ed1i + 3 ti\u1ec1n gi\u1ea5y + 15 l\u01b0\u1ee3ng.\n- H\u1ed3 l\u00f4 : 2 oan h\u1ed3n + 80k xu.\n- Oan H\u1ed3n r\u1edbt t\u1ea1i V\u0110MQ khi b\u1ea1n s\u1eed d\u1ee5ng th\u00eam M\u00e1y D\u00f2 Oan H\u1ed3n t\u1ea1i shop Ghoso.";
    }

    private static String f() {
        return "Top 1:\n- V\u0169 kh\u00ed th\u1eddi trang v.v\n- Pet Th\u1ea7n Ch\u1ebft v.v\n- 5 R\u01b0\u01a1ng huy\u1ec1n b\u00ed\n- C\u00fap L\u01b0u Ni\u1ec7m\n\nTop 2:\n- V\u0169 kh\u00ed th\u1eddi trang v.v\n- Pet B\u00f3ng Ma v.v\n- 3 R\u01b0\u01a1ng huy\u1ec1n b\u00ed\n- C\u00fap L\u01b0u Ni\u1ec7m\n\nTop 3:\n- Pet Th\u1ea7n Ch\u1ebft v.v\n- 2 R\u01b0\u01a1ng huy\u1ec1n b\u00ed\n\nTop 4 - 6:\n- Pet Th\u1ea7n Ch\u1ebft 2 th\u00e1ng\n\nTop 7 - 10:\n- Pet Th\u1ea7n Ch\u1ebft 1 th\u00e1ng";
    }

    private static String g() {
        return "Top 1:\n- H\u1ecfa K\u1ef3 L\u00e2n v.v MCS\n- M\u1eb7t N\u1ea1 H\u1ed5 v.v MCS\n- 5 r\u01b0\u01a1ng huy\u1ec1n b\u00ed\n- C\u00fap L\u01b0u Ni\u1ec7m\n\nTop 2:\n- H\u1ecfa K\u1ef3 L\u00e2n v.v MCS\n- M\u1eb7t N\u1ea1 H\u1ed5 v.v MCS\n- 3 r\u01b0\u01a1ng huy\u1ec1n b\u00ed\n- C\u00fap L\u01b0u Ni\u1ec7m\n\nTop 3:\n- H\u1ecfa K\u1ef3 L\u00e2n v.v MCS\n- M\u1eb7t N\u1ea1 H\u1ed5 v.v MCS\n- 3 r\u01b0\u01a1ng huy\u1ec1n b\u00ed\n\nTop 4 - 6:\n- H\u1ecfa K\u1ef3 L\u00e2n 2 th\u00e1ng\n- M\u1eb7t N\u1ea1 H\u1ed5 1 th\u00e1ng\n\nTop 6 - 10:\n- H\u1ecfa K\u1ef3 L\u00e2n 1 th\u00e1ng";
    }
}

