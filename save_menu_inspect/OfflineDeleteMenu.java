/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Vector;

public final class OfflineDeleteMenu {
    private static boolean active;
    private static int[] map;
    private static final int CLEAR = -1001;
    private static final int DELETE = -1002;

    private OfflineDeleteMenu() {
    }

    private static void reset() {
        active = false;
        map = new int[0];
    }

    public static byte[] extend(byte by, byte[] byArray) {
        if (by != 63 || byArray == null) {
            return byArray;
        }
        OfflineDeleteMenu.reset();
        try {
            Object object;
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
            Vector<String> vector = new Vector<String>();
            int n = -1;
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = false;
            while (dataInputStream.available() > 0) {
                object = dataInputStream.readUTF();
                int n2 = vector.size();
                vector.addElement((String)object);
                if ("Nh\u1eadn v\u1eadt ph\u1ea9m".equals(object)) {
                    n = n2;
                    continue;
                }
                if ("Nh\u1eadn xu".equals(object)) {
                    bl = true;
                    continue;
                }
                if ("Nh\u1eadn l\u01b0\u1ee3ng".equals(object)) {
                    bl2 = true;
                    continue;
                }
                if (!"Nh\u1eadn y\u00ean".equals(object)) continue;
                bl3 = true;
            }
            if (!(n >= 0 && bl && bl2 && bl3)) {
                return byArray;
            }
            object = new Vector();
            Vector<Integer> vector2 = new Vector<Integer>();
            ((Vector)object).addElement("Nh\u1eadn v\u1eadt ph\u1ea9m");
            vector2.addElement(new Integer(n));
            ((Vector)object).addElement("X\u00f3a to\u00e0n b\u1ed9 v\u1eadt ph\u1ea9m trong h\u00e0nh trang");
            vector2.addElement(new Integer(-1001));
            for (int i = 0; i < vector.size(); ++i) {
                if (i == n) continue;
                ((Vector)object).addElement(vector.elementAt(i));
                vector2.addElement(new Integer(i));
            }
            ((Vector)object).addElement("X\u00f3a nh\u00e2n v\u1eadt \u0111ang ch\u01a1i");
            vector2.addElement(new Integer(-1002));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(byArray.length + 160);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            map = new int[((Vector)object).size()];
            for (int i = 0; i < ((Vector)object).size(); ++i) {
                dataOutputStream.writeUTF((String)((Vector)object).elementAt(i));
                OfflineDeleteMenu.map[i] = (Integer)vector2.elementAt(i);
            }
            dataOutputStream.flush();
            active = true;
            return byteArrayOutputStream.toByteArray();
        }
        catch (Throwable throwable) {
            OfflineDeleteMenu.reset();
            return byArray;
        }
    }

    private static int[] decode(byte[] byArray) {
        int n;
        int n2;
        int n3;
        if (byArray == null || byArray.length < 2) {
            return null;
        }
        if (byArray.length >= 4) {
            n3 = byArray[1] & 0xFF;
            n2 = byArray[2] & 0xFF;
            n = 2;
        } else if (byArray.length == 2) {
            n3 = byArray[0] & 0xFF;
            n2 = byArray[1] & 0xFF;
            n = 1;
        } else {
            int n4 = byArray[0] & 0xFF;
            int n5 = byArray[1] & 0xFF;
            if (n4 == 37) {
                n3 = n4;
                n2 = n5;
                n = 1;
            } else if (n5 == 37) {
                n3 = n5;
                n2 = byArray[2] & 0xFF;
                n = 2;
            } else {
                n3 = n4;
                n2 = n5;
                n = 1;
            }
        }
        return new int[]{n3, n2, n};
    }

    public static boolean consume(byte by, byte[] byArray) {
        if (by != 29 || !active) {
            return false;
        }
        int[] nArray = OfflineDeleteMenu.decode(byArray);
        if (nArray == null) {
            OfflineDeleteMenu.reset();
            return false;
        }
        int n = nArray[0];
        int n2 = nArray[1];
        int n3 = nArray[2];
        int[] nArray2 = map;
        OfflineDeleteMenu.reset();
        if (n != 37 || n2 < 0 || n2 >= nArray2.length) {
            return false;
        }
        int n4 = nArray2[n2];
        if (n4 == -1001) {
            try {
                InventoryClear.clearCurrentBag();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            return true;
        }
        if (n4 == -1002) {
            try {
                CharacterDelete.deleteCurrent();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            return true;
        }
        byArray[n3] = (byte)n4;
        return false;
    }

    static {
        map = new int[0];
    }
}

