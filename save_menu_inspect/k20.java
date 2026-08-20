/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.InvalidRecordIDException
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreNotFoundException
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreNotFoundException;

final class k20 {
    static final String a = "nso_offline_backup_v1";
    static final String b = "nso_offline_restore_v1";
    private static final int c = 1314082643;
    private static final int d = 1;
    private static final int e = 1024;
    private static final int f = 0x100000;
    private static final int g = 0x200000;
    private static final byte[] h = new byte[0];
    private static final String[] i = new String[]{"ninja_school_offline_v3", "nso_offline_e72_v2", "nso_offline_bots_v1", "nso_offline_cohon_v1", "nso_offline_halloween_v1", "nso_offline_koro_king_v1", "nso_offline_mid_autumn_v1", "nso_offline_noel_v1", "nso_offline_summer_v1", "nso_offline_womens_day_v1", "nso_offline_clone_v1"};

    private k20() {
    }

    static boolean a() {
        return DoHoang091SaveState.hasSaveData();
    }

    static int b() throws Exception {
        if (!k20.a()) {
            throw new Exception("NO_SAVE");
        }
        k0 k02 = k20.d();
        byte[] byArray = k20.a(k02);
        k20.a(a, byArray);
        byte[] byArray2 = k20.b(a);
        k0 k03 = k20.a(byArray2);
        if (!k20.a(k02, k03)) {
            throw new Exception("BACKUP_VERIFY");
        }
        return k02.b;
    }

    static int c() throws Exception {
        byte[] byArray = k20.b(a);
        if (byArray == null) {
            throw new Exception("NO_BACKUP");
        }
        k0 k02 = k20.a(byArray);
        k0 k03 = k20.d();
        k20.a(b, k20.a(k03));
        try {
            k20.b(k02);
            k0 k04 = k20.d();
            if (!k20.a(k02, k04)) {
                throw new Exception("RESTORE_VERIFY");
            }
            k20.d(b);
            return k02.b;
        }
        catch (Throwable throwable) {
            try {
                byte[] byArray2 = k20.b(b);
                if (byArray2 != null) {
                    k20.b(k20.a(byArray2));
                }
            }
            catch (Throwable throwable2) {
                k20.d(b);
                throw new Exception("RESTORE_ROLLBACK " + throwable2.toString());
            }
            k20.d(b);
            if (throwable instanceof Exception) {
                throw (Exception)throwable;
            }
            throw new Exception(throwable.toString());
        }
    }

    private static k0 d() throws Exception {
        Object object;
        k1[] k1Array = new k1[i.length];
        int n = 0;
        int n2 = 0;
        while (n2 < i.length) {
            object = k20.a(i[n2]);
            if (object != null) {
                k1Array[n++] = object;
            }
            ++n2;
        }
        object = new k1[n];
        if (n > 0) {
            System.arraycopy(k1Array, 0, object, 0, n);
        }
        return new k0((k1[])object, n);
    }

    private static k1 a(String string) throws Exception {
        RecordStore recordStore = null;
        try {
            recordStore = RecordStore.openRecordStore((String)string, (boolean)false);
            int n = recordStore.getNextRecordID();
            if (n < 1 || n > 1024) {
                throw new Exception("RECORD_COUNT " + string);
            }
            byte[][] byArrayArray = new byte[n][];
            int n2 = 1;
            while (n2 < n) {
                try {
                    byte[] byArray = recordStore.getRecord(n2);
                    if (byArray == null || byArray.length > 0x100000) {
                        throw new Exception("RECORD_SIZE " + string + "#" + n2);
                    }
                    byArrayArray[n2] = byArray;
                }
                catch (InvalidRecordIDException invalidRecordIDException) {
                    byArrayArray[n2] = null;
                }
                ++n2;
            }
            k1 k110 = new k1(string, n, byArrayArray);
            return k110;
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {
            return null;
        }
        finally {
            k20.a(recordStore);
        }
    }

    private static byte[] a(k0 k02) throws Exception {
        Object object;
        Object object2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeLong(System.currentTimeMillis());
        dataOutputStream.writeShort(k02.b);
        int n = 0;
        while (n < k02.b) {
            object2 = k02.a[n];
            dataOutputStream.writeUTF(object2.a);
            dataOutputStream.writeShort(object2.b);
            int n2 = 1;
            while (n2 < object2.b) {
                object = object2.c[n2];
                dataOutputStream.writeBoolean(object != null);
                if (object != null) {
                    dataOutputStream.writeInt(((Object)object).length);
                    ((OutputStream)dataOutputStream).write((byte[])object);
                }
                ++n2;
            }
            ++n;
        }
        dataOutputStream.flush();
        object2 = byteArrayOutputStream.toByteArray();
        if (((byte[])object2).length > 0x200000) {
            throw new Exception("SNAPSHOT_SIZE");
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(((byte[])object2).length + 13);
        object = new DataOutputStream(byteArrayOutputStream2);
        ((DataOutputStream)object).writeInt(1314082643);
        ((DataOutputStream)object).writeByte(1);
        ((DataOutputStream)object).writeInt(((byte[])object2).length);
        ((DataOutputStream)object).writeInt(k20.b(object2));
        ((OutputStream)object).write((byte[])object2);
        ((DataOutputStream)object).flush();
        return byteArrayOutputStream2.toByteArray();
    }

    private static k0 a(byte[] byArray) throws Exception {
        if (byArray == null || byArray.length < 23 || byArray.length > 0x20000D) {
            throw new Exception("BACKUP_FORMAT");
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
        if (dataInputStream.readInt() != 1314082643 || dataInputStream.readUnsignedByte() != 1) {
            throw new Exception("BACKUP_FORMAT");
        }
        int n = dataInputStream.readInt();
        int n2 = dataInputStream.readInt();
        if (n < 10 || n > 0x200000 || n != dataInputStream.available()) {
            throw new Exception("BACKUP_LENGTH");
        }
        byte[] byArray2 = new byte[n];
        dataInputStream.readFully(byArray2);
        if (k20.b(byArray2) != n2) {
            throw new Exception("BACKUP_CHECKSUM");
        }
        DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(byArray2));
        dataInputStream2.readLong();
        int n3 = dataInputStream2.readUnsignedShort();
        if (n3 < 0 || n3 > i.length) {
            throw new Exception("BACKUP_STORES");
        }
        k1[] k1Array = new k1[n3];
        int n4 = 0;
        while (n4 < n3) {
            String string = dataInputStream2.readUTF();
            if (!k20.c(string) || k20.a(k1Array, n4, string)) {
                throw new Exception("BACKUP_STORE " + string);
            }
            int n5 = dataInputStream2.readUnsignedShort();
            if (n5 < 1 || n5 > 1024) {
                throw new Exception("BACKUP_RECORD_COUNT");
            }
            byte[][] byArrayArray = new byte[n5][];
            int n6 = 1;
            while (n6 < n5) {
                if (dataInputStream2.readBoolean()) {
                    int n7 = dataInputStream2.readInt();
                    if (n7 < 0 || n7 > 0x100000 || n7 > dataInputStream2.available()) {
                        throw new Exception("BACKUP_RECORD_SIZE");
                    }
                    byte[] byArray3 = new byte[n7];
                    dataInputStream2.readFully(byArray3);
                    byArrayArray[n6] = byArray3;
                }
                ++n6;
            }
            k1Array[n4] = new k1(string, n5, byArrayArray);
            ++n4;
        }
        if (dataInputStream2.available() != 0) {
            throw new Exception("BACKUP_TRAILING_DATA");
        }
        return new k0(k1Array, n3);
    }

    private static void b(k0 k02) throws Exception {
        int n = 0;
        while (n < i.length) {
            k20.d(i[n]);
            ++n;
        }
        n = 0;
        while (n < k02.b) {
            k1 k110 = k02.a[n];
            RecordStore recordStore = null;
            try {
                recordStore = RecordStore.openRecordStore((String)k110.a, (boolean)true);
                int n2 = 1;
                while (n2 < k110.b) {
                    byte[] byArray = k110.c[n2];
                    int n3 = recordStore.addRecord(byArray == null ? h : byArray, 0, byArray == null ? 0 : byArray.length);
                    if (n3 != n2) {
                        throw new Exception("RESTORE_RECORD_ID");
                    }
                    if (byArray == null) {
                        recordStore.deleteRecord(n2);
                    }
                    ++n2;
                }
            }
            catch (Throwable throwable) {
                k20.a(recordStore);
                throw throwable;
            }
            k20.a(recordStore);
            ++n;
        }
    }

    private static void a(String string, byte[] byArray) throws Exception {
        block8: {
            RecordStore recordStore = null;
            try {
                recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
                if (recordStore.getNumRecords() == 0) {
                    int n = recordStore.addRecord(byArray, 0, byArray.length);
                    if (n != 1) {
                        throw new Exception("BACKUP_RECORD_ID");
                    }
                    break block8;
                }
                try {
                    recordStore.setRecord(1, byArray, 0, byArray.length);
                }
                catch (InvalidRecordIDException invalidRecordIDException) {
                    k20.a(recordStore);
                    recordStore = null;
                    k20.d(string);
                    recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
                    int n = recordStore.addRecord(byArray, 0, byArray.length);
                    if (n != 1) {
                        throw new Exception("BACKUP_RECORD_ID");
                    }
                }
            }
            finally {
                k20.a(recordStore);
            }
        }
    }

    private static byte[] b(String string) throws Exception {
        RecordStore recordStore = null;
        try {
            recordStore = RecordStore.openRecordStore((String)string, (boolean)false);
            byte[] byArray = recordStore.getRecord(1);
            return byArray;
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {
            return null;
        }
        catch (InvalidRecordIDException invalidRecordIDException) {
            return null;
        }
        finally {
            k20.a(recordStore);
        }
    }

    private static int b(byte[] byArray) {
        int n = -2128831035;
        int n2 = 0;
        while (n2 < byArray.length) {
            n ^= byArray[n2] & 0xFF;
            n *= 16777619;
            ++n2;
        }
        return n;
    }

    private static boolean a(k0 k02, k0 k03) {
        if (k02 == null || k03 == null || k02.b != k03.b) {
            return false;
        }
        int n = 0;
        while (n < k02.b) {
            k1 k110 = k02.a[n];
            k1 k111 = k03.a[n];
            if (!k110.a.equals(k111.a) || k110.b != k111.b) {
                return false;
            }
            int n2 = 1;
            while (n2 < k110.b) {
                if (!k20.a(k110.c[n2], k111.c[n2])) {
                    return false;
                }
                ++n2;
            }
            ++n;
        }
        return true;
    }

    private static boolean a(byte[] byArray, byte[] byArray2) {
        if (byArray == byArray2) {
            return true;
        }
        if (byArray == null || byArray2 == null || byArray.length != byArray2.length) {
            return false;
        }
        int n = 0;
        while (n < byArray.length) {
            if (byArray[n] != byArray2[n]) {
                return false;
            }
            ++n;
        }
        return true;
    }

    private static boolean c(String string) {
        int n = 0;
        while (n < i.length) {
            if (i[n].equals(string)) {
                return true;
            }
            ++n;
        }
        return false;
    }

    private static boolean a(k1[] k1Array, int n, String string) {
        int n2 = 0;
        while (n2 < n) {
            if (k1Array[n2] != null && k1Array[n2].a.equals(string)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private static void d(String string) {
        try {
            RecordStore.deleteRecordStore((String)string);
        }
        catch (Throwable throwable) {}
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

    private static final class k0 {
        final k1[] a;
        final int b;

        k0(k1[] k1Array, int n) {
            this.a = k1Array;
            this.b = n;
        }
    }

    private static final class k1 {
        final String a;
        final int b;
        final byte[][] c;

        k1(String string, int n, byte[][] byArray) {
            this.a = string;
            this.b = n;
            this.c = byArray;
        }
    }
}

