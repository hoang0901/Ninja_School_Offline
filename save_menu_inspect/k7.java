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
import java.io.OutputStream;
import javax.microedition.rms.RecordStore;

final class k7 {
    private static final String b = "nso_offline_clone_v1";
    private static final int c = 1314082627;
    private static final int d = 1;
    private static final int e = 9;
    private static final int f = 100000;
    static final int a = 545;
    private static DoHoang091.k0 g;
    private static int h;
    private static boolean i;
    private static boolean j;
    private static boolean k;
    private static boolean l;
    private static boolean m;
    private static int n;
    private static short o;
    private static short p;
    private static int q;
    private static boolean r;

    static {
        j = true;
        m = true;
    }

    private k7() {
    }

    static void a() {
        k7.y();
        g = null;
        h = 0;
        i = false;
        j = true;
        k = false;
        l = false;
        m = true;
        n = 0;
        q = 0;
        r = false;
    }

    static void b() throws Exception {
        q = k7.x();
        k7.h(DoHoang091.z());
    }

    static void c() throws Exception {
        DoHoang091.k0 k02 = DoHoang091.z();
        if (g != null) {
            k7.g.s = k02.s;
            k7.g.t = k02.t;
            k7.g.u = k02.u;
        }
        if (!k7.l()) {
            k = false;
            return;
        }
        k = false;
        o = k02.t;
        p = k02.u;
        k7.t();
    }

    static void d() throws Exception {
        if (!k7.l()) {
            return;
        }
        DoHoang091.k0 k02 = DoHoang091.z();
        o = (short)(k02.t + DoHoang091.g(101) - 50);
        p = k02.u;
        k7.v();
    }

    static void e() {
        try {
            int n;
            DoHoang091.k0 k02 = DoHoang091.z();
            int n2 = k7.x();
            k7.h(k02);
            if (q <= 0) {
                q = n2;
                return;
            }
            if (n2 == q) {
                return;
            }
            int n3 = n2 - q;
            q = n2;
            if (n3 < 0) {
                n3 = 0;
            }
            if (n3 > 5) {
                n3 = 5;
            }
            if ((n = k02.cb[21]) <= 0) {
                return;
            }
            if ((n -= n3) < 0) {
                n = 0;
            }
            k02.cb[21] = n;
            DoHoang091.G();
            if (n == 0) {
                k7.f(k02);
            }
        }
        catch (Throwable throwable) {
            System.out.println("NINJA_SCHOOL_OFFLINE_CLONE_TICK " + throwable.toString());
        }
    }

    static void f() {
        k7.y();
    }

    static boolean g() {
        return l && g != null;
    }

    static DoHoang091.k0 h() {
        return k7.g() ? g : null;
    }

    static boolean i() {
        return i && g != null;
    }

    static int j() {
        return g == null ? 0 : k7.g.r;
    }

    static int k() {
        return -(10000000 + DoHoang091.s());
    }

    static boolean l() {
        return i && g != null && !j && m && !l && k7.g(DoHoang091.z()) > 0;
    }

    static boolean m() {
        return k7.l() && k7.g.aB[1] >= 0;
    }

    static int n() throws Exception {
        if (!k7.m()) {
            return 0;
        }
        int n = k25.c(g);
        if (k7.n > 0) {
            n = n * k7.n / 100;
        }
        return n < 1 ? 1 : n;
    }

    static int o() {
        if (g == null) {
            return 0;
        }
        int n = k7.g.bH & 0xFFFF;
        return n > 127 ? 0 : n;
    }

    static void a(int n, int n2) throws Exception {
        DoHoang091.k0 k02 = DoHoang091.z();
        k02.cb[22] = k7.n = n2 < 0 ? 0 : n2;
        if (DoHoang091.r() == 168) {
            DoHoang091.b("Kh\u00f4ng th\u1ec3 tri\u1ec7u h\u1ed3i ph\u00e2n th\u00e2n trong khu v\u1ef1c n\u00e0y");
            return;
        }
        k7.h(k02);
        if (k02.cb[21] <= 0) {
            if (k16.d(545) <= 0) {
                DoHoang091.b("Kh\u00f4ng \u0111\u1ee7 " + k16.A(545));
                return;
            }
            k16.b(545, 1);
            int n3 = n * 60;
            if (n3 < 0) {
                n3 = 0;
            }
            k02.cb[21] = n3;
        }
        k7.a(k02);
        if (j) {
            k7.d(k02);
            if (!l) {
                k7.t();
            }
        }
        DoHoang091.G();
        r = true;
        k7.y();
    }

    static void p() throws Exception {
        DoHoang091.k0 k02 = DoHoang091.z();
        if (!k7.s()) {
            return;
        }
        if (!i || g == null || !m || j || k7.g(k02) <= 0) {
            return;
        }
        k7.u();
        m = false;
        l = true;
        k7.d(k02);
        k7.a((byte)1);
        r = true;
        k7.y();
    }

    static void q() throws Exception {
        if (!l || g == null) {
            return;
        }
        DoHoang091.k0 k02 = DoHoang091.z();
        l = false;
        m = true;
        k7.e(k02);
        k7.a((byte)0);
        if (!j && k7.g(k02) > 0) {
            k7.t();
        }
        r = true;
        k7.y();
    }

    static boolean r() throws Exception {
        if (!k7.g()) {
            return false;
        }
        j = true;
        k7.g.z = true;
        k7.g.x = 0;
        k7.q();
        return true;
    }

    static void b(int n, int n2) throws Exception {
        int n3;
        if (!k7.m()) {
            return;
        }
        if (n < 0) {
            return;
        }
        int n4 = k7.n();
        if (n4 <= 0) {
            return;
        }
        int n5 = n2;
        if (n5 < 0 || n5 > 127) {
            n5 = k7.o();
        }
        if ((n3 = DoHoang091.d(k7.k(), n, n4, n5)) > 0) {
            DoHoang091.a(g, n3, n);
        }
    }

    static void c(int n, int n2) throws Exception {
        if (!k7.m() || n == 0) {
            return;
        }
        k5.b(n, k7.k(), n2 < 0 || n2 > 127 ? k7.o() : n2, k7.n());
    }

    private static boolean s() {
        return !l;
    }

    private static void a(DoHoang091.k0 k02) throws Exception {
        int n = DoHoang091.s();
        if (g != null && h == n && i) {
            return;
        }
        k7.a(k02, n);
        i = true;
        h = n;
        if (g == null) {
            g = k7.b(k02);
            j = true;
            r = true;
        }
    }

    private static DoHoang091.k0 b(DoHoang091.k0 k02) {
        DoHoang091.k0 k03 = new DoHoang091.k0(k02.a, k02.p, k02.q);
        k7.c(k03);
        k03.bx = 0;
        k03.r = 1;
        k03.v = 0L;
        k03.by = 0;
        k03.bz = 0;
        k03.bA = (short)5;
        k03.bB = (short)5;
        k03.bC = 5;
        k03.bD = 5;
        k03.bG = 0;
        k03.bH = (short)-1;
        int n = 0;
        while (n < k03.bE.length) {
            k03.bE[n] = -1;
            k03.bF[n] = 0;
            ++n;
        }
        k03.c();
        k03.z = true;
        k03.x = 1;
        k03.y = 1;
        return k03;
    }

    private static void c(DoHoang091.k0 k02) {
        int n = 0;
        while (n < k02.K.length) {
            k02.K[n] = -1;
            k02.L[n] = 0;
            k02.M[n] = false;
            k02.N[n] = 0;
            k02.O[n] = 0;
            k02.P[n] = -1L;
            ++n;
        }
        n = 0;
        while (n < k02.af.length) {
            k02.af[n] = -1;
            k02.ag[n] = 0;
            k02.ah[n] = false;
            k02.ai[n] = 0;
            k02.aj[n] = 0;
            k02.ak[n] = -1L;
            ++n;
        }
    }

    private static void d(DoHoang091.k0 k02) throws Exception {
        j = false;
        k7.g.z = false;
        k7.g.a = k02.a;
        k7.g.p = k02.p;
        k7.g.q = k02.q;
        k7.g.s = k02.s;
        k7.g.t = k02.t;
        k7.g.u = k02.u;
        k0.a(g);
        int n = k25.a(g);
        int n2 = k25.b(g);
        k7.g.x = n;
        k7.g.y = n2;
        o = k02.t;
        p = k02.u;
        if (k7.g.bH < 0 && k7.g.bG > 0) {
            k7.g.bH = (short)(k7.g.bE[0] & 0xFF);
        }
    }

    private static void e(DoHoang091.k0 k02) throws Exception {
        k0.a(k02);
        int n = k25.a(k02);
        int n2 = k25.b(k02);
        k02.x = n;
        k02.y = n2;
        k02.z = false;
        DoHoang091.c(k02);
    }

    private static void a(byte by) throws Exception {
        DoHoang091.k0 k02 = DoHoang091.A();
        k25.a("OSkill", k02.cm, by);
        k25.a("KSkill", k02.cl, by);
        k25.a("CSkill", k02.cn, by);
        DoHoang091.p();
        DoHoang091.a();
        DoHoang091.b();
        k25.g();
        k25.h();
    }

    private static void t() throws Exception {
        if (l || j || g == null) {
            return;
        }
        DoHoang091.k0 k02 = DoHoang091.z();
        o = k02.t;
        p = k02.u;
        DoHoang091.a((byte)3, k7.w());
        k = true;
        m = true;
    }

    private static void u() throws Exception {
        if (!k) {
            return;
        }
        byte[] byArray = new byte[4];
        k7.a(byArray, 0, k7.k());
        DoHoang091.a((byte)2, byArray);
        k = false;
    }

    private static void v() throws Exception {
        byte[] byArray = new byte[8];
        k7.a(byArray, 0, k7.k());
        k7.b(byArray, 4, o);
        k7.b(byArray, 6, p);
        DoHoang091.a((byte)1, byArray);
    }

    private static byte[] w() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(100);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(k7.k());
        dataOutputStream.writeUTF("");
        dataOutputStream.writeBoolean(false);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(k7.g.bx);
        dataOutputStream.writeByte(k7.g.p);
        dataOutputStream.writeShort(k16.a(g));
        dataOutputStream.writeUTF(k7.g.a == null ? "" : k7.g.a);
        int n = Math.max(1, k25.a(g));
        int n2 = k7.g.x < 0 ? 0 : k7.g.x;
        dataOutputStream.writeInt(n2);
        dataOutputStream.writeInt(n);
        dataOutputStream.writeByte(k7.g.r);
        dataOutputStream.writeShort(k16.b(g));
        dataOutputStream.writeShort(k16.c(g));
        dataOutputStream.writeShort(k16.d(g));
        dataOutputStream.writeByte(-1);
        dataOutputStream.writeShort(o);
        dataOutputStream.writeShort(p);
        dataOutputStream.writeShort(0);
        dataOutputStream.writeShort(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeBoolean(false);
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeShort(k16.a(g));
        dataOutputStream.writeShort(k16.b(g));
        dataOutputStream.writeShort(k16.c(g));
        dataOutputStream.writeShort(k16.d(g));
        short[] sArray = k16.e(g);
        int n3 = 0;
        while (n3 < 10) {
            dataOutputStream.writeShort(sArray[n3]);
            ++n3;
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private static void f(DoHoang091.k0 k02) throws Exception {
        k02.cb[21] = 0;
        k02.cb[22] = 0;
        if (l) {
            j = true;
            if (g != null) {
                k7.g.z = true;
                k7.g.x = 0;
            }
            k7.q();
            k7.u();
            return;
        }
        if (i && g != null && m && !j) {
            k7.u();
            j = true;
            k7.g.z = true;
        }
        DoHoang091.G();
    }

    private static int g(DoHoang091.k0 k02) {
        if (k02 == null) {
            return 0;
        }
        int n = k02.cb[21];
        if (n > 100000) {
            int n2 = n - k7.x();
            return n2 > 0 ? n2 : 0;
        }
        return n > 0 ? n : 0;
    }

    private static void h(DoHoang091.k0 k02) {
        if (k02 == null) {
            return;
        }
        int n = k02.cb[21];
        if (n > 100000) {
            int n2 = n - k7.x();
            k02.cb[21] = n2 > 0 ? n2 : 0;
            DoHoang091.G();
        }
    }

    private static int x() {
        return (int)(System.currentTimeMillis() / 1000L);
    }

    private static void a(DoHoang091.k0 k02, int n) {
        DataInputStream dataInputStream;
        RecordStore recordStore;
        block10: {
            block9: {
                g = null;
                recordStore = null;
                recordStore = RecordStore.openRecordStore((String)b, (boolean)true);
                if (recordStore.getNumRecords() != 0) break block9;
                k7.a(recordStore);
                return;
            }
            dataInputStream = new DataInputStream(new ByteArrayInputStream(recordStore.getRecord(1)));
            if (dataInputStream.readInt() == 1314082627 && dataInputStream.readUnsignedByte() == 1) break block10;
            dataInputStream.close();
            k7.a(recordStore);
            return;
        }
        try {
            try {
                int n2 = dataInputStream.readUnsignedByte();
                int n3 = 0;
                while (n3 < n2) {
                    int n4 = dataInputStream.readInt();
                    boolean bl = dataInputStream.readBoolean();
                    DoHoang091.k0 k03 = k7.b(k02);
                    k7.a(dataInputStream, k03);
                    if (n4 == n && bl) {
                        g = k03;
                        j = true;
                        k7.g.z = true;
                    }
                    ++n3;
                }
                dataInputStream.close();
            }
            catch (Exception exception) {
                g = null;
            }
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        finally {
            k7.a(recordStore);
        }
    }

    private static void y() {
        if (!r || g == null) {
            return;
        }
        RecordStore recordStore = null;
        try {
            try {
                k0[] k0Array = k7.z();
                int n = h == 0 ? DoHoang091.s() : h;
                k0Array = k7.a(k0Array, n, g);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(1314082627);
                dataOutputStream.writeByte(1);
                dataOutputStream.writeByte(k0Array.length);
                int n2 = 0;
                while (n2 < k0Array.length) {
                    dataOutputStream.writeInt(k0Array[n2].a);
                    dataOutputStream.writeBoolean(true);
                    k7.a(dataOutputStream, k0Array[n2].c);
                    ++n2;
                }
                dataOutputStream.flush();
                byte[] byArray = byteArrayOutputStream.toByteArray();
                recordStore = RecordStore.openRecordStore((String)b, (boolean)true);
                if (recordStore.getNumRecords() == 0) {
                    recordStore.addRecord(byArray, 0, byArray.length);
                } else {
                    recordStore.setRecord(1, byArray, 0, byArray.length);
                }
                r = false;
            }
            catch (Exception exception) {}
        }
        finally {
            k7.a(recordStore);
        }
    }

    private static k0[] z() {
        RecordStore recordStore = null;
        try {
            recordStore = RecordStore.openRecordStore((String)b, (boolean)true);
            if (recordStore.getNumRecords() == 0) {
                k0[] k0Array = new k0[]{};
                return k0Array;
            }
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(recordStore.getRecord(1)));
            if (dataInputStream.readInt() != 1314082627 || dataInputStream.readUnsignedByte() != 1) {
                dataInputStream.close();
                k0[] k0Array = new k0[]{};
                return k0Array;
            }
            int n = dataInputStream.readUnsignedByte();
            if (n < 0 || n > 9) {
                n = 0;
            }
            k0[] k0Array = new k0[n];
            DoHoang091.k0 k02 = DoHoang091.z();
            int n2 = 0;
            while (n2 < n) {
                k0Array[n2] = new k0(null);
                k0Array[n2].a = dataInputStream.readInt();
                k0Array[n2].b = dataInputStream.readBoolean();
                k0Array[n2].c = k7.b(k02);
                k7.a(dataInputStream, k0Array[n2].c);
                ++n2;
            }
            dataInputStream.close();
            k0[] k0Array2 = k0Array;
            return k0Array2;
        }
        catch (Exception exception) {
            k0[] k0Array = new k0[]{};
            return k0Array;
        }
        finally {
            k7.a(recordStore);
        }
    }

    private static k0[] a(k0[] k0Array, int n, DoHoang091.k0 k02) {
        int n2 = 0;
        while (n2 < k0Array.length) {
            if (k0Array[n2].a == n) {
                k0Array[n2].c = k02;
                k0Array[n2].b = true;
                return k0Array;
            }
            ++n2;
        }
        int n3 = k0Array.length + 1;
        if (n3 > 9) {
            n3 = 9;
        }
        k0[] k0Array2 = new k0[n3];
        int n4 = k0Array.length < n3 ? k0Array.length : n3 - 1;
        n2 = 0;
        while (n2 < n4) {
            k0Array2[n2] = k0Array[n2];
            ++n2;
        }
        k0Array2[n3 - 1] = new k0(null);
        k0Array2[n3 - 1].a = n;
        k0Array2[n3 - 1].b = true;
        k0Array2[n3 - 1].c = k02;
        return k0Array2;
    }

    private static void a(DataOutputStream dataOutputStream, DoHoang091.k0 k02) throws Exception {
        dataOutputStream.writeByte(k02.bx);
        dataOutputStream.writeInt(k02.r);
        dataOutputStream.writeLong(k02.v);
        dataOutputStream.writeShort(k02.by);
        dataOutputStream.writeShort(k02.bz);
        dataOutputStream.writeShort(k02.bA);
        dataOutputStream.writeShort(k02.bB);
        dataOutputStream.writeInt(k02.bC);
        dataOutputStream.writeInt(k02.bD);
        dataOutputStream.writeShort(k02.bH);
        dataOutputStream.writeByte(k02.bG);
        int n = 0;
        while (n < k02.bG) {
            dataOutputStream.writeByte(k02.bE[n]);
            dataOutputStream.writeByte(k02.bF[n]);
            ++n;
        }
        ((OutputStream)dataOutputStream).write(k02.cl);
        ((OutputStream)dataOutputStream).write(k02.cm);
        ((OutputStream)dataOutputStream).write(k02.cn);
        k7.a(dataOutputStream, k02.aB, k02.aC, k02.aD, k02.aE, k02.aF, k02.aG, k02.aH, k02.bc, k02.bd, k02.be);
        k7.a(dataOutputStream, k02.aI, k02.aJ, k02.aK, k02.aL, k02.aM, k02.aN, k02.aO, k02.bf, k02.bg, k02.bh);
        k7.a(dataOutputStream, k02.aP, k02.aQ, k02.aR, k02.aS, k02.aT, k02.aU, k02.aV, k02.bi, k02.bj, k02.bk);
        k7.a(dataOutputStream, k02.bl, k02.bm, k02.bn, k02.bo, k02.bp, k02.bq, k02.br, null, null, null);
        dataOutputStream.writeInt(k02.cb[74]);
        dataOutputStream.writeInt(k02.cb[75]);
        dataOutputStream.writeInt(k02.cb[76]);
        dataOutputStream.writeInt(k02.cb[77]);
        dataOutputStream.writeInt(k02.cb[78]);
        dataOutputStream.writeInt(k02.cb[79]);
    }

    private static void a(DataInputStream dataInputStream, DoHoang091.k0 k02) throws Exception {
        k02.bx = dataInputStream.readByte();
        k02.r = dataInputStream.readInt();
        k02.v = dataInputStream.readLong();
        k02.by = dataInputStream.readShort();
        k02.bz = dataInputStream.readShort();
        k02.bA = dataInputStream.readShort();
        k02.bB = dataInputStream.readShort();
        k02.bC = dataInputStream.readInt();
        k02.bD = dataInputStream.readInt();
        k02.bH = dataInputStream.readShort();
        k02.bG = dataInputStream.readUnsignedByte();
        if (k02.bG > k02.bE.length) {
            k02.bG = k02.bE.length;
        }
        int n = 0;
        while (n < k02.bG) {
            k02.bE[n] = dataInputStream.readByte();
            k02.bF[n] = dataInputStream.readByte();
            ++n;
        }
        dataInputStream.readFully(k02.cl);
        dataInputStream.readFully(k02.cm);
        dataInputStream.readFully(k02.cn);
        k7.a(dataInputStream, k02.aB, k02.aC, k02.aD, k02.aE, k02.aF, k02.aG, k02.aH, k02.bc, k02.bd, k02.be);
        k7.a(dataInputStream, k02.aI, k02.aJ, k02.aK, k02.aL, k02.aM, k02.aN, k02.aO, k02.bf, k02.bg, k02.bh);
        k7.a(dataInputStream, k02.aP, k02.aQ, k02.aR, k02.aS, k02.aT, k02.aU, k02.aV, k02.bi, k02.bj, k02.bk);
        k7.a(dataInputStream, k02.bl, k02.bm, k02.bn, k02.bo, k02.bp, k02.bq, k02.br, null, null, null);
        k02.cb[74] = dataInputStream.readInt();
        k02.cb[75] = dataInputStream.readInt();
        k02.cb[76] = dataInputStream.readInt();
        k02.cb[77] = dataInputStream.readInt();
        k02.cb[78] = dataInputStream.readInt();
        k02.cb[79] = dataInputStream.readInt();
        k0.a(k02);
    }

    private static void a(DataOutputStream dataOutputStream, short[] sArray, byte[] byArray, byte[] byArray2, long[] lArray, byte[] byArray3, byte[][] byArray4, int[][] nArray, byte[] byArray5, short[][] sArray2, byte[][] byArray6) throws Exception {
        int n = 0;
        while (n < sArray.length) {
            dataOutputStream.writeShort(sArray[n]);
            dataOutputStream.writeByte(byArray[n]);
            dataOutputStream.writeByte(byArray2[n]);
            dataOutputStream.writeLong(lArray[n]);
            int n2 = byArray3[n] & 0xFF;
            if (n2 > byArray4[n].length) {
                n2 = byArray4[n].length;
            }
            dataOutputStream.writeByte(n2);
            int n3 = 0;
            while (n3 < n2) {
                dataOutputStream.writeByte(byArray4[n][n3]);
                dataOutputStream.writeInt(nArray[n][n3]);
                ++n3;
            }
            if (byArray5 != null) {
                int n4 = byArray5[n] & 0xFF;
                if (n4 > sArray2[n].length) {
                    n4 = sArray2[n].length;
                }
                dataOutputStream.writeByte(n4);
                int n5 = 0;
                while (n5 < n4) {
                    dataOutputStream.writeShort(sArray2[n][n5]);
                    dataOutputStream.writeByte(byArray6[n][n5]);
                    ++n5;
                }
            }
            ++n;
        }
    }

    private static void a(DataInputStream dataInputStream, short[] sArray, byte[] byArray, byte[] byArray2, long[] lArray, byte[] byArray3, byte[][] byArray4, int[][] nArray, byte[] byArray5, short[][] sArray2, byte[][] byArray6) throws Exception {
        int n = 0;
        while (n < sArray.length) {
            sArray[n] = dataInputStream.readShort();
            byArray[n] = dataInputStream.readByte();
            byArray2[n] = dataInputStream.readByte();
            lArray[n] = dataInputStream.readLong();
            int n2 = dataInputStream.readUnsignedByte();
            if (n2 > byArray4[n].length) {
                n2 = byArray4[n].length;
            }
            byArray3[n] = (byte)n2;
            int n3 = 0;
            while (n3 < n2) {
                byArray4[n][n3] = dataInputStream.readByte();
                nArray[n][n3] = dataInputStream.readInt();
                ++n3;
            }
            n3 = n2;
            while (n3 < byArray4[n].length) {
                byArray4[n][n3] = 0;
                nArray[n][n3] = 0;
                ++n3;
            }
            if (byArray5 != null) {
                int n4 = dataInputStream.readUnsignedByte();
                if (n4 > sArray2[n].length) {
                    n4 = sArray2[n].length;
                }
                byArray5[n] = (byte)n4;
                int n5 = 0;
                while (n5 < n4) {
                    sArray2[n][n5] = dataInputStream.readShort();
                    byArray6[n][n5] = dataInputStream.readByte();
                    ++n5;
                }
                n5 = n4;
                while (n5 < sArray2[n].length) {
                    sArray2[n][n5] = -1;
                    byArray6[n][n5] = 0;
                    ++n5;
                }
            }
            ++n;
        }
    }

    private static void a(byte[] byArray, int n, int n2) {
        byArray[n] = (byte)(n2 >> 24);
        byArray[n + 1] = (byte)(n2 >> 16);
        byArray[n + 2] = (byte)(n2 >> 8);
        byArray[n + 3] = (byte)n2;
    }

    private static void b(byte[] byArray, int n, int n2) {
        byArray[n] = (byte)(n2 >> 8);
        byArray[n + 1] = (byte)n2;
    }

    private static void a(RecordStore recordStore) {
        if (recordStore == null) {
            return;
        }
        try {
            recordStore.closeRecordStore();
        }
        catch (Exception exception) {}
    }

    private static final class k0 {
        int a;
        boolean b;
        DoHoang091.k0 c;

        private k0() {
        }

        k0(k0 k02) {
            this();
        }
    }
}

