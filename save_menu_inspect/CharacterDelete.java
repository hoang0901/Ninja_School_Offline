/*
 * Decompiled with CFR 0.152.
 */
public final class CharacterDelete {
    private CharacterDelete() {
    }

    public static boolean deleteCurrent() throws Exception {
        DoHoang091.k0[] k0Array = DoHoang091.aj;
        int n = DoHoang091.ak;
        if (k0Array == null || k0Array.length == 0 || n < 0 || n >= k0Array.length) {
            return false;
        }
        DoHoang091.k0[] k0Array2 = new DoHoang091.k0[k0Array.length - 1];
        if (n > 0) {
            System.arraycopy(k0Array, 0, k0Array2, 0, n);
        }
        if (n < k0Array.length - 1) {
            System.arraycopy(k0Array, n + 1, k0Array2, n, k0Array.length - n - 1);
        }
        DoHoang091.aj = k0Array2;
        DoHoang091.ak = k0Array2.length == 0 ? 0 : (n >= k0Array2.length ? k0Array2.length - 1 : n);
        DoHoang091.an = true;
        DoHoang091.as();
        DoHoang091.U();
        return true;
    }
}

