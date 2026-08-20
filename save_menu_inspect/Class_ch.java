/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 */
import javax.microedition.rms.RecordStore;

public final class Class_ch {
    public String a;
    public int b;
    public int c;
    private static int[] i;
    public Class_fe d;
    public int e;
    public int f;
    public int g;
    public int h;

    public static String a(String object) {
        byte[] byArray = Class_ch.d((String)object);
        object = byArray;
        if (Class_ch.a(byArray)) {
            return null;
        }
        try {
            return new String((byte[])object, "UTF-8");
        }
        catch (Exception exception) {
            "".length();
            return new String((byte[])object);
        }
    }

    static {
        Class_ch.f();
    }

    public final boolean a() {
        if (Class_ch.a(this.g) && Class_ch.b(Class_cy.i(this.d.e), this.c)) {
            return i[0];
        }
        return i[1];
    }

    public static int b(String object) {
        byte[] byArray = Class_ch.d((String)object);
        object = byArray;
        if (Class_ch.a(byArray)) {
            return i[2];
        }
        return (int)object[i[1]];
    }

    public static void a(String object, byte[] byArray) {
        try {
            object = RecordStore.openRecordStore((String)("vj" + (String)object), (boolean)i[0]);
            if (Class_ch.a(object.getNumRecords())) {
                object.setRecord(i[0], byArray, i[1], byArray.length);
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return;
                }
            } else {
                object.addRecord(byArray, i[1], byArray.length);
                "".length();
            }
            object.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            return;
        }
    }

    private static boolean a(Object object) {
        return object == null;
    }

    public final boolean b() {
        if (Class_ch.a(this.h) && Class_ch.a(Class_cy.i(this.d.e), this.b)) {
            return i[0];
        }
        return i[1];
    }

    public static void b(String string, byte[] byArray) {
        try {
            string = RecordStore.openRecordStore((String)("vj" + string), (boolean)i[0]);
            if (Class_ch.a(string.getNumRecords())) {
                string.setRecord(i[0], byArray, i[1], byArray.length);
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            } else {
                string.addRecord(byArray, i[1], byArray.length);
                "".length();
            }
            string.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            "".length();
            return;
        }
    }

    private static boolean a(int n, int n2) {
        return n > n2;
    }

    public static void c(String string) {
        try {
            RecordStore.deleteRecordStore((String)("vj" + string));
            return;
        }
        catch (Exception exception) {
            "".length();
            return;
        }
    }

    public static byte[] d(String string) {
        try {
            string = RecordStore.openRecordStore((String)("vj" + string), (boolean)i[1]);
            byte[] byArray = string.getRecord(i[0]);
            string.closeRecordStore();
            return byArray;
        }
        catch (Exception exception) {
            "".length();
            return null;
        }
    }

    public final String c() {
        return this.a + " " + this.f + " " + this.h + " " + this.b + " " + this.e + " " + this.g + " " + this.c;
    }

    private static boolean b(int n, int n2) {
        return n < n2;
    }

    public final int d() {
        if (Class_ch.a(this.h) && Class_ch.a(Class_cy.i(this.d.e), this.b)) {
            return Class_cy.i(this.d.e) - this.b;
        }
        return i[1];
    }

    private static boolean a(int n) {
        return n > 0;
    }

    public static Class_ch a(Class_fe stringArray, String string) {
        Class_ch class_ch = new Class_ch();
        new Class_ch().d = stringArray;
        stringArray = Class_dt.c(string, " ");
        class_ch.a = stringArray[i[1]];
        try {
            class_ch.f = Integer.parseInt(stringArray[i[0]]);
            class_ch.h = Integer.parseInt(stringArray[i[3]]);
            class_ch.b = Integer.parseInt(stringArray[i[4]]);
            "".length();
        }
        catch (Exception exception) {
            "".length();
            class_ch.e = i[1];
            class_ch.g = i[1];
        }
        if (null != null) {
            return null;
        }
        try {
            class_ch.e = Integer.parseInt(stringArray[i[5]]);
            class_ch.g = Integer.parseInt(stringArray[i[6]]);
            class_ch.c = Integer.parseInt(stringArray[i[7]]);
            "".length();
        }
        catch (Exception exception) {
            "".length();
            class_ch.e = i[1];
            class_ch.g = i[1];
        }
        if (((214 + 102 - 271 + 189 ^ 149 + 139 - 215 + 120) & (0x8C ^ 0x88 ^ (0x7F ^ 0x50) ^ -" ".length())) < ((0xBD ^ 0x80 ^ (0x47 ^ 0x62)) & (146 + 140 - 239 + 110 ^ 128 + 113 - 158 + 50 ^ -" ".length()))) {
            return null;
        }
        if (Class_ch.b(class_ch.h) && Class_ch.b(class_ch.g)) {
            return null;
        }
        return class_ch;
    }

    private static boolean b(int n) {
        return n == 0;
    }

    private static void f() {
        i = new int[8];
        Class_ch.i[0] = " ".length();
        Class_ch.i[1] = (0x5E ^ 0x7D ^ (0x14 ^ 0x28)) & (0xF8 ^ 0xB1 ^ (0x77 ^ 0x21) ^ -" ".length());
        Class_ch.i[2] = -" ".length();
        Class_ch.i[3] = "  ".length();
        Class_ch.i[4] = "   ".length();
        Class_ch.i[5] = 0x54 ^ 0x50;
        Class_ch.i[6] = 0x24 ^ 0x42 ^ (0x69 ^ 0xA);
        Class_ch.i[7] = 0xA4 ^ 0xA2;
    }

    public static void e() {
        Class_ch.c("nj_arrow");
        Class_ch.c("nj_effect");
        Class_ch.c("nj_image");
        Class_ch.c("nj_part");
        Class_ch.c("nj_skill");
        Class_ch.c("data");
        Class_ch.c("dataVersion");
        Class_ch.c("map");
        Class_ch.c("mapVersion");
        Class_ch.c("skill");
        Class_ch.c("killVersion");
        Class_ch.c("item");
        Class_ch.c("itemVersion");
    }

    public static void a(String string, int n) {
        try {
            byte[] byArray = new byte[i[0]];
            byArray[Class_ch.i[1]] = (byte)n;
            Class_ch.b(string, byArray);
            return;
        }
        catch (Exception exception) {
            "".length();
            return;
        }
    }

    public static void a(String object, String string) {
        try {
            Class_ch.b((String)object, string.getBytes("UTF-8"));
            return;
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            return;
        }
    }
}

