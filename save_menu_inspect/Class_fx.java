/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.ChoiceGroup
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 *  javax.microedition.rms.RecordStore
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

public final class Class_fx
implements CommandListener {
    public static boolean a;
    private TextField p;
    private final Form q = new Form("menu dv");
    public static boolean b;
    public static int c;
    public static String d;
    private final Command r;
    private final ChoiceGroup s;
    public static int e;
    private static RecordStore t;
    public static int f;
    public static boolean g;
    private TextField u;
    private TextField v;
    private TextField w;
    public static boolean h;
    public static int i;
    private TextField x;
    public static boolean j;
    private static ByteArrayInputStream y;
    public static boolean k;
    private static int[] z;
    private final ChoiceGroup aa;
    private TextField ab;
    private TextField ac;
    private static DataInputStream ad;
    public static int l;
    private static DataOutputStream ae;
    private static ByteArrayOutputStream af;
    public static boolean m;
    public static int n;
    private final Command ag = new Command("L\u01b0u", z[0], z[1]);
    public static boolean o;

    private static boolean a(int n) {
        return n != 0;
    }

    public Class_fx() {
        this.r = new Command("H\u1ee7y", z[2], z[1]);
        this.p = new TextField("T\u00ean \u0110\u1ed1i Th\u1ee7 + ',': <C\u00e1ch nhau b\u1eb1ng d\u1ea5u ph\u1ea3y ','> ;", d, z[3], z[4]);
        this.ac = new TextField("Map l\u00f4i \u0111\u00e0i", "" + f, z[2], z[5]);
        this.u = new TextField("Khu l\u00f4i \u0111\u00e0i", "" + c, z[2], z[5]);
        this.v = new TextField("Map \u0110\u00e1nh Qu\u00e1i (Ki\u1ebfm Y\u00ean + Nh\u1eb7t \u0110\u00e1)", "" + e, z[2], z[1]);
        this.x = new TextField("Khu \u0110\u00e1nh Qu\u00e1i (Ki\u1ebfm Y\u00ean + Nh\u1eb7t \u0110\u00e1)", "" + n, z[2], z[1]);
        this.w = new TextField("Map C\u1eebu S\u00e1t", "" + i, z[2], z[2]);
        this.ab = new TextField("Khu C\u1eebu S\u00e1t", "" + l, z[2], z[2]);
        String[] stringArray = new String[z[6]];
        stringArray[Class_fx.z[4]] = "\u0110\u00e1nh Tinh Anh";
        stringArray[Class_fx.z[1]] = "\u0110\u00e1nh Th\u1ee7 L\u0129nh";
        stringArray[Class_fx.z[5]] = "N\u00e2ng C\u1ea5p Trang B\u1ecb";
        stringArray[Class_fx.z[2]] = "L\u00f4i \u0110\u00e0i";
        stringArray[Class_fx.z[0]] = "Ki\u1ebfm Y\u00ean";
        stringArray[Class_fx.z[7]] = "C\u1eebu S\u00e1t";
        this.s = new ChoiceGroup("H\u1ee7y NVDV!!", z[5], stringArray, null);
        String[] stringArray2 = new String[z[5]];
        stringArray2[Class_fx.z[4]] = "D\u00f9ng B\u00e0o Hi\u1ec3m N\u00e2ng L\u00ean 7";
        stringArray2[Class_fx.z[1]] = "D\u00f9ng B\u00e0o Hi\u1ec3m N\u00e2ng L\u00ean 8";
        this.aa = new ChoiceGroup("C\u00e0i D\u00f9ng B\u1ea3o Hi\u1ec3m NVDV N\u00e2ng C\u1ea5p!!", z[5], stringArray2, null);
    }

    private static void b() {
        z = new int[10];
        Class_fx.z[0] = 0x91 ^ 0x95;
        Class_fx.z[1] = " ".length();
        Class_fx.z[2] = "   ".length();
        Class_fx.z[3] = -(0xFFFFD8FE & 0x77BF) & (0xFFFFF6BD & 0x5DFF);
        Class_fx.z[4] = (0xC6 ^ 0x99 ^ " ".length()) & (0xD6 ^ 0xAC ^ (0x7E ^ 0x5A) ^ -" ".length());
        Class_fx.z[5] = "  ".length();
        Class_fx.z[6] = 0x14 ^ 0x30 ^ (0x9F ^ 0xBD);
        Class_fx.z[7] = 0x59 ^ 0x5C;
        Class_fx.z[8] = 0x5E ^ 0x4A;
        Class_fx.z[9] = -" ".length();
    }

    public final void a() {
        this.q.append((Item)this.p);
        "".length();
        this.q.append((Item)this.ac);
        "".length();
        this.q.append((Item)this.u);
        "".length();
        this.q.append((Item)this.v);
        "".length();
        this.q.append((Item)this.x);
        "".length();
        this.q.append((Item)this.w);
        "".length();
        this.q.append((Item)this.ab);
        "".length();
        this.q.append((Item)this.s);
        "".length();
        this.q.append((Item)this.aa);
        "".length();
        this.q.addCommand(this.ag);
        this.q.addCommand(this.r);
        this.q.setCommandListener((CommandListener)this);
        this.s.setSelectedIndex(z[4], m);
        this.s.setSelectedIndex(z[1], h);
        this.s.setSelectedIndex(z[5], b);
        this.s.setSelectedIndex(z[2], j);
        this.s.setSelectedIndex(z[0], k);
        this.s.setSelectedIndex(z[7], a);
        this.aa.setSelectedIndex(z[4], o);
        this.aa.setSelectedIndex(z[1], g);
        Class_fx.a((Displayable)this.q);
    }

    private static boolean a(Object object, Object object2) {
        return object == object2;
    }

    private static void a(Displayable displayable) {
        Display.getDisplay((MIDlet)Class_da.b).setCurrent(displayable);
    }

    public final void commandAction(Command object, Displayable displayable) {
        block9: {
            if (!Class_fx.a(object, this.ag)) break block9;
            try {
                d = this.p.getString();
                f = Integer.parseInt(this.ac.getString());
                c = Integer.parseInt(this.u.getString());
                e = Integer.parseInt(this.v.getString());
                n = Integer.parseInt(this.x.getString());
                i = Integer.parseInt(this.w.getString());
                l = Integer.parseInt(this.ab.getString());
                m = this.s.isSelected(z[4]);
                h = this.s.isSelected(z[1]);
                b = this.s.isSelected(z[5]);
                j = this.s.isSelected(z[2]);
                k = this.s.isSelected(z[0]);
                a = this.s.isSelected(z[7]);
                o = this.aa.isSelected(z[4]);
                g = this.aa.isSelected(z[1]);
                af = new ByteArrayOutputStream();
                ae = new DataOutputStream(af);
                try {
                    ae.writeUTF(d);
                    ae.writeInt(f);
                    ae.writeInt(c);
                    ae.writeInt(e);
                    ae.writeInt(n);
                    ae.writeInt(i);
                    ae.writeInt(l);
                    ae.writeBoolean(m);
                    ae.writeBoolean(h);
                    ae.writeBoolean(b);
                    ae.writeBoolean(j);
                    ae.writeBoolean(k);
                    ae.writeBoolean(a);
                    ae.writeBoolean(o);
                    ae.writeBoolean(g);
                    ae.flush();
                    ae.close();
                    af.flush();
                    t = RecordStore.openRecordStore((String)"dvnsoz", (boolean)z[1]);
                    object = af.toByteArray();
                    af.close();
                    if (Class_fx.b(t.getNumRecords())) {
                        t.addRecord((byte[])object, z[4], ((Command)object).length);
                        "".length();
                        "".length();
                        if ((0x47 ^ 0x43) <= 0) {
                            return;
                        }
                    } else {
                        t.setRecord(z[1], (byte[])object, z[4], ((Command)object).length);
                    }
                    t.closeRecordStore();
                    "".length();
                }
                catch (Exception exception) {
                    "".length();
                }
                if (-"  ".length() >= 0) {
                    return;
                }
                Class_ds.b("L\u01b0u c\u00e0i \u0111\u1eb7t th\u00e0nh c\u00f4ng");
            }
            catch (NumberFormatException numberFormatException) {
                "".length();
            }
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        Class_fx.a((Displayable)Class_do.b());
    }

    static {
        Class_fx.b();
        d = "tenclone";
        m = z[4];
        h = z[4];
        b = z[4];
        j = z[4];
        k = z[4];
        a = z[4];
        o = z[4];
        g = z[4];
        f = z[1];
        c = z[8];
        e = z[9];
        n = z[9];
        i = z[5];
        l = z[4];
        try {
            t = RecordStore.openRecordStore((String)"dvnsoz", (boolean)z[1]);
            if (Class_fx.a(t.getNumRecords())) {
                y = new ByteArrayInputStream(t.getRecord(z[1]));
                ad = new DataInputStream(y);
                d = ad.readUTF();
                f = ad.readInt();
                c = ad.readInt();
                e = ad.readInt();
                n = ad.readInt();
                i = ad.readInt();
                l = ad.readInt();
                m = ad.readBoolean();
                h = ad.readBoolean();
                b = ad.readBoolean();
                j = ad.readBoolean();
                k = ad.readBoolean();
                a = ad.readBoolean();
                o = ad.readBoolean();
                g = ad.readBoolean();
            }
            t.closeRecordStore();
        }
        catch (Exception exception) {
            "".length();
        }
    }

    private static boolean b(int n) {
        return n == 0;
    }
}

