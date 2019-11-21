package android.support.constraint.p042a;

import android.support.constraint.p042a.C0358i.C0359a;
import android.support.constraint.p042a.p043a.C0330f;
import android.support.constraint.p042a.p043a.C0330f.C0333c;
import android.support.constraint.p042a.p043a.C0335h;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: android.support.constraint.a.e */
/* compiled from: LinearSystem */
public class C0353e {

    /* renamed from: a */
    private static int f1062a = 1000;

    /* renamed from: b */
    public static C0355f f1063b;

    /* renamed from: c */
    int f1064c = 0;

    /* renamed from: d */
    private HashMap<String, C0358i> f1065d = null;

    /* renamed from: e */
    private C0354a f1066e;

    /* renamed from: f */
    private int f1067f = 32;

    /* renamed from: g */
    private int f1068g;

    /* renamed from: h */
    C0350b[] f1069h;

    /* renamed from: i */
    public boolean f1070i;

    /* renamed from: j */
    private boolean[] f1071j;

    /* renamed from: k */
    int f1072k;

    /* renamed from: l */
    int f1073l;

    /* renamed from: m */
    private int f1074m;

    /* renamed from: n */
    final C0351c f1075n;

    /* renamed from: o */
    private C0358i[] f1076o;

    /* renamed from: p */
    private int f1077p;

    /* renamed from: q */
    private C0350b[] f1078q;

    /* renamed from: r */
    private final C0354a f1079r;

    /* renamed from: android.support.constraint.a.e$a */
    /* compiled from: LinearSystem */
    interface C0354a {
        /* renamed from: a */
        C0358i mo1269a(C0353e eVar, boolean[] zArr);

        /* renamed from: a */
        void mo1271a(C0354a aVar);

        /* renamed from: a */
        void mo1272a(C0358i iVar);

        void clear();

        C0358i getKey();
    }

    public C0353e() {
        int i = this.f1067f;
        this.f1068g = i;
        this.f1069h = null;
        this.f1070i = false;
        this.f1071j = new boolean[i];
        this.f1072k = 1;
        this.f1073l = 0;
        this.f1074m = i;
        this.f1076o = new C0358i[f1062a];
        this.f1077p = 0;
        this.f1078q = new C0350b[i];
        this.f1069h = new C0350b[i];
        m1287j();
        this.f1075n = new C0351c();
        this.f1066e = new C0352d(this.f1075n);
        this.f1079r = new C0350b(this.f1075n);
    }

    /* renamed from: d */
    private final void m1283d(C0350b bVar) {
        if (this.f1073l > 0) {
            bVar.f1057d.mo1098a(bVar, this.f1069h);
            if (bVar.f1057d.f842a == 0) {
                bVar.f1058e = true;
            }
        }
    }

    /* renamed from: e */
    public static C0355f m1284e() {
        return f1063b;
    }

    /* renamed from: h */
    private void m1285h() {
        for (int i = 0; i < this.f1073l; i++) {
            C0350b bVar = this.f1069h[i];
            bVar.f1054a.f1114f = bVar.f1055b;
        }
    }

    /* renamed from: i */
    private void m1286i() {
        this.f1067f *= 2;
        this.f1069h = (C0350b[]) Arrays.copyOf(this.f1069h, this.f1067f);
        C0351c cVar = this.f1075n;
        cVar.f1061c = (C0358i[]) Arrays.copyOf(cVar.f1061c, this.f1067f);
        int i = this.f1067f;
        this.f1071j = new boolean[i];
        this.f1068g = i;
        this.f1074m = i;
        C0355f fVar = f1063b;
        if (fVar != null) {
            fVar.f1084d++;
            fVar.f1095o = Math.max(fVar.f1095o, (long) i);
            C0355f fVar2 = f1063b;
            fVar2.f1080A = fVar2.f1095o;
        }
    }

    /* renamed from: j */
    private void m1287j() {
        int i = 0;
        while (true) {
            C0350b[] bVarArr = this.f1069h;
            if (i < bVarArr.length) {
                C0350b bVar = bVarArr[i];
                if (bVar != null) {
                    this.f1075n.f1059a.mo1311a(bVar);
                }
                this.f1069h[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public C0358i mo1291a(Object obj) {
        C0358i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f1072k + 1 >= this.f1068g) {
            m1286i();
        }
        if (obj instanceof C0330f) {
            C0330f fVar = (C0330f) obj;
            iVar = fVar.mo1122e();
            if (iVar == null) {
                fVar.mo1115a(this.f1075n);
                iVar = fVar.mo1122e();
            }
            int i = iVar.f1111c;
            if (i == -1 || i > this.f1064c || this.f1075n.f1061c[i] == null) {
                if (iVar.f1111c != -1) {
                    iVar.mo1314b();
                }
                this.f1064c++;
                this.f1072k++;
                int i2 = this.f1064c;
                iVar.f1111c = i2;
                iVar.f1116h = C0359a.UNRESTRICTED;
                this.f1075n.f1061c[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: b */
    public C0350b mo1301b() {
        C0350b bVar = (C0350b) this.f1075n.f1059a.mo1309a();
        if (bVar == null) {
            bVar = new C0350b(this.f1075n);
        } else {
            bVar.mo1283d();
        }
        C0358i.m1318a();
        return bVar;
    }

    /* renamed from: c */
    public C0358i mo1304c() {
        C0355f fVar = f1063b;
        if (fVar != null) {
            fVar.f1093m++;
        }
        if (this.f1072k + 1 >= this.f1068g) {
            m1286i();
        }
        C0358i a = m1279a(C0359a.SLACK, (String) null);
        this.f1064c++;
        this.f1072k++;
        int i = this.f1064c;
        a.f1111c = i;
        this.f1075n.f1061c[i] = a;
        return a;
    }

    /* renamed from: f */
    public void mo1307f() {
        C0355f fVar = f1063b;
        if (fVar != null) {
            fVar.f1085e++;
        }
        if (this.f1070i) {
            C0355f fVar2 = f1063b;
            if (fVar2 != null) {
                fVar2.f1097q++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f1073l) {
                    z = true;
                    break;
                } else if (!this.f1069h[i].f1058e) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                mo1295a(this.f1066e);
                return;
            }
            C0355f fVar3 = f1063b;
            if (fVar3 != null) {
                fVar3.f1096p++;
            }
            m1285h();
            return;
        }
        mo1295a(this.f1066e);
    }

    /* renamed from: g */
    public void mo1308g() {
        C0351c cVar;
        int i = 0;
        while (true) {
            cVar = this.f1075n;
            C0358i[] iVarArr = cVar.f1061c;
            if (i >= iVarArr.length) {
                break;
            }
            C0358i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo1314b();
            }
            i++;
        }
        cVar.f1060b.mo1310a(this.f1076o, this.f1077p);
        this.f1077p = 0;
        Arrays.fill(this.f1075n.f1061c, null);
        HashMap<String, C0358i> hashMap = this.f1065d;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f1064c = 0;
        this.f1066e.clear();
        this.f1072k = 1;
        for (int i2 = 0; i2 < this.f1073l; i2++) {
            this.f1069h[i2].f1056c = false;
        }
        m1287j();
        this.f1073l = 0;
    }

    /* renamed from: b */
    private void m1281b(C0350b bVar) {
        bVar.mo1262a(this, 0);
    }

    /* renamed from: d */
    public C0351c mo1306d() {
        return this.f1075n;
    }

    /* renamed from: b */
    public int mo1300b(Object obj) {
        C0358i e = ((C0330f) obj).mo1122e();
        if (e != null) {
            return (int) (e.f1114f + 0.5f);
        }
        return 0;
    }

    /* renamed from: b */
    private int m1280b(C0354a aVar) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f1073l) {
                z = false;
                break;
            }
            C0350b[] bVarArr = this.f1069h;
            if (bVarArr[i].f1054a.f1116h != C0359a.UNRESTRICTED && bVarArr[i].f1055b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C0355f fVar = f1063b;
            if (fVar != null) {
                fVar.f1091k++;
            }
            i2++;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            float f2 = Float.MAX_VALUE;
            int i6 = 0;
            while (i3 < this.f1073l) {
                C0350b bVar = this.f1069h[i3];
                if (bVar.f1054a.f1116h != C0359a.UNRESTRICTED && !bVar.f1058e && bVar.f1055b < f) {
                    int i7 = 1;
                    while (i7 < this.f1072k) {
                        C0358i iVar = this.f1075n.f1061c[i7];
                        float b = bVar.f1057d.mo1103b(iVar);
                        if (b > f) {
                            int i8 = i6;
                            float f3 = f2;
                            int i9 = i5;
                            int i10 = i4;
                            for (int i11 = 0; i11 < 7; i11++) {
                                float f4 = iVar.f1115g[i11] / b;
                                if ((f4 < f3 && i11 == i8) || i11 > i8) {
                                    i9 = i7;
                                    i10 = i3;
                                    f3 = f4;
                                    i8 = i11;
                                }
                            }
                            i4 = i10;
                            i5 = i9;
                            f2 = f3;
                            i6 = i8;
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                C0350b bVar2 = this.f1069h[i4];
                bVar2.f1054a.f1112d = -1;
                C0355f fVar2 = f1063b;
                if (fVar2 != null) {
                    fVar2.f1090j++;
                }
                bVar2.mo1284d(this.f1075n.f1061c[i5]);
                C0358i iVar2 = bVar2.f1054a;
                iVar2.f1112d = i4;
                iVar2.mo1316c(bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f1072k / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    /* renamed from: c */
    private final void m1282c(C0350b bVar) {
        C0350b[] bVarArr = this.f1069h;
        int i = this.f1073l;
        if (bVarArr[i] != null) {
            this.f1075n.f1059a.mo1311a(bVarArr[i]);
        }
        C0350b[] bVarArr2 = this.f1069h;
        int i2 = this.f1073l;
        bVarArr2[i2] = bVar;
        C0358i iVar = bVar.f1054a;
        iVar.f1112d = i2;
        this.f1073l = i2 + 1;
        iVar.mo1316c(bVar);
    }

    /* renamed from: a */
    public C0358i mo1289a() {
        C0355f fVar = f1063b;
        if (fVar != null) {
            fVar.f1094n++;
        }
        if (this.f1072k + 1 >= this.f1068g) {
            m1286i();
        }
        C0358i a = m1279a(C0359a.SLACK, (String) null);
        this.f1064c++;
        this.f1072k++;
        int i = this.f1064c;
        a.f1111c = i;
        this.f1075n.f1061c[i] = a;
        return a;
    }

    /* renamed from: c */
    public void mo1305c(C0358i iVar, C0358i iVar2, int i, int i2) {
        C0350b b = mo1301b();
        C0358i c = mo1304c();
        c.f1113e = 0;
        b.mo1275b(iVar, iVar2, c, i);
        if (i2 != 6) {
            mo1294a(b, (int) (b.f1057d.mo1103b(c) * -1.0f), i2);
        }
        mo1293a(b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1294a(C0350b bVar, int i, int i2) {
        bVar.mo1263a(mo1290a(i2, (String) null), i);
    }

    /* renamed from: a */
    public C0358i mo1290a(int i, String str) {
        C0355f fVar = f1063b;
        if (fVar != null) {
            fVar.f1092l++;
        }
        if (this.f1072k + 1 >= this.f1068g) {
            m1286i();
        }
        C0358i a = m1279a(C0359a.ERROR, str);
        this.f1064c++;
        this.f1072k++;
        int i2 = this.f1064c;
        a.f1111c = i2;
        a.f1113e = i;
        this.f1075n.f1061c[i2] = a;
        this.f1066e.mo1272a(a);
        return a;
    }

    /* renamed from: b */
    public void mo1302b(C0358i iVar, C0358i iVar2, int i, int i2) {
        C0350b b = mo1301b();
        C0358i c = mo1304c();
        c.f1113e = 0;
        b.mo1267a(iVar, iVar2, c, i);
        if (i2 != 6) {
            mo1294a(b, (int) (b.f1057d.mo1103b(c) * -1.0f), i2);
        }
        mo1293a(b);
    }

    /* renamed from: a */
    private C0358i m1279a(C0359a aVar, String str) {
        C0358i iVar = (C0358i) this.f1075n.f1060b.mo1309a();
        if (iVar == null) {
            iVar = new C0358i(aVar, str);
            iVar.mo1313a(aVar, str);
        } else {
            iVar.mo1314b();
            iVar.mo1313a(aVar, str);
        }
        int i = this.f1077p;
        int i2 = f1062a;
        if (i >= i2) {
            f1062a = i2 * 2;
            this.f1076o = (C0358i[]) Arrays.copyOf(this.f1076o, f1062a);
        }
        C0358i[] iVarArr = this.f1076o;
        int i3 = this.f1077p;
        this.f1077p = i3 + 1;
        iVarArr[i3] = iVar;
        return iVar;
    }

    /* renamed from: b */
    public void mo1303b(C0358i iVar, C0358i iVar2, boolean z) {
        C0350b b = mo1301b();
        C0358i c = mo1304c();
        c.f1113e = 0;
        b.mo1275b(iVar, iVar2, c, 0);
        if (z) {
            mo1294a(b, (int) (b.f1057d.mo1103b(c) * -1.0f), 1);
        }
        mo1293a(b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1295a(C0354a aVar) {
        C0355f fVar = f1063b;
        if (fVar != null) {
            fVar.f1099s++;
            fVar.f1100t = Math.max(fVar.f1100t, (long) this.f1072k);
            C0355f fVar2 = f1063b;
            fVar2.f1101u = Math.max(fVar2.f1101u, (long) this.f1073l);
        }
        m1283d((C0350b) aVar);
        m1280b(aVar);
        m1277a(aVar, false);
        m1285h();
    }

    /* renamed from: a */
    public void mo1293a(C0350b bVar) {
        if (bVar != null) {
            C0355f fVar = f1063b;
            if (fVar != null) {
                fVar.f1086f++;
                if (bVar.f1058e) {
                    fVar.f1087g++;
                }
            }
            if (this.f1073l + 1 >= this.f1074m || this.f1072k + 1 >= this.f1068g) {
                m1286i();
            }
            boolean z = false;
            if (!bVar.f1058e) {
                m1283d(bVar);
                if (!bVar.mo1281c()) {
                    bVar.mo1270a();
                    if (bVar.mo1273a(this)) {
                        C0358i a = mo1289a();
                        bVar.f1054a = a;
                        m1282c(bVar);
                        this.f1079r.mo1271a((C0354a) bVar);
                        m1277a(this.f1079r, true);
                        if (a.f1112d == -1) {
                            if (bVar.f1054a == a) {
                                C0358i c = bVar.mo1280c(a);
                                if (c != null) {
                                    C0355f fVar2 = f1063b;
                                    if (fVar2 != null) {
                                        fVar2.f1090j++;
                                    }
                                    bVar.mo1284d(c);
                                }
                            }
                            if (!bVar.f1058e) {
                                bVar.f1054a.mo1316c(bVar);
                            }
                            this.f1073l--;
                        }
                        z = true;
                    }
                    if (!bVar.mo1277b()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z) {
                m1282c(bVar);
            }
        }
    }

    /* renamed from: a */
    private final int m1277a(C0354a aVar, boolean z) {
        C0355f fVar = f1063b;
        if (fVar != null) {
            fVar.f1088h++;
        }
        for (int i = 0; i < this.f1072k; i++) {
            this.f1071j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C0355f fVar2 = f1063b;
            if (fVar2 != null) {
                fVar2.f1089i++;
            }
            i2++;
            if (i2 >= this.f1072k * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f1071j[aVar.getKey().f1111c] = true;
            }
            C0358i a = aVar.mo1269a(this, this.f1071j);
            if (a != null) {
                boolean[] zArr = this.f1071j;
                int i3 = a.f1111c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a != null) {
                int i4 = -1;
                float f = Float.MAX_VALUE;
                for (int i5 = 0; i5 < this.f1073l; i5++) {
                    C0350b bVar = this.f1069h[i5];
                    if (bVar.f1054a.f1116h != C0359a.UNRESTRICTED && !bVar.f1058e && bVar.mo1278b(a)) {
                        float b = bVar.f1057d.mo1103b(a);
                        if (b < 0.0f) {
                            float f2 = (-bVar.f1055b) / b;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0350b bVar2 = this.f1069h[i4];
                    bVar2.f1054a.f1112d = -1;
                    C0355f fVar3 = f1063b;
                    if (fVar3 != null) {
                        fVar3.f1090j++;
                    }
                    bVar2.mo1284d(a);
                    C0358i iVar = bVar2.f1054a;
                    iVar.f1112d = i4;
                    iVar.mo1316c(bVar2);
                }
            }
            z2 = true;
        }
        return i2;
    }

    /* renamed from: a */
    public void mo1299a(C0358i iVar, C0358i iVar2, boolean z) {
        C0350b b = mo1301b();
        C0358i c = mo1304c();
        c.f1113e = 0;
        b.mo1267a(iVar, iVar2, c, 0);
        if (z) {
            mo1294a(b, (int) (b.f1057d.mo1103b(c) * -1.0f), 1);
        }
        mo1293a(b);
    }

    /* renamed from: a */
    public void mo1297a(C0358i iVar, C0358i iVar2, int i, float f, C0358i iVar3, C0358i iVar4, int i2, int i3) {
        int i4 = i3;
        C0350b b = mo1301b();
        b.mo1265a(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i4 != 6) {
            b.mo1262a(this, i4);
        }
        mo1293a(b);
    }

    /* renamed from: a */
    public void mo1298a(C0358i iVar, C0358i iVar2, C0358i iVar3, C0358i iVar4, float f, int i) {
        C0350b b = mo1301b();
        b.mo1268a(iVar, iVar2, iVar3, iVar4, f);
        if (i != 6) {
            b.mo1262a(this, i);
        }
        mo1293a(b);
    }

    /* renamed from: a */
    public C0350b mo1288a(C0358i iVar, C0358i iVar2, int i, int i2) {
        C0350b b = mo1301b();
        b.mo1264a(iVar, iVar2, i);
        if (i2 != 6) {
            b.mo1262a(this, i2);
        }
        mo1293a(b);
        return b;
    }

    /* renamed from: a */
    public void mo1296a(C0358i iVar, int i) {
        int i2 = iVar.f1112d;
        if (i2 != -1) {
            C0350b bVar = this.f1069h[i2];
            if (bVar.f1058e) {
                bVar.f1055b = (float) i;
            } else if (bVar.f1057d.f842a == 0) {
                bVar.f1058e = true;
                bVar.f1055b = (float) i;
            } else {
                C0350b b = mo1301b();
                b.mo1279c(iVar, i);
                mo1293a(b);
            }
        } else {
            C0350b b2 = mo1301b();
            b2.mo1274b(iVar, i);
            mo1293a(b2);
        }
    }

    /* renamed from: a */
    public static C0350b m1278a(C0353e eVar, C0358i iVar, C0358i iVar2, C0358i iVar3, float f, boolean z) {
        C0350b b = eVar.mo1301b();
        if (z) {
            eVar.m1281b(b);
        }
        b.mo1266a(iVar, iVar2, iVar3, f);
        return b;
    }

    /* renamed from: a */
    public void mo1292a(C0335h hVar, C0335h hVar2, float f, int i) {
        C0335h hVar3 = hVar;
        C0335h hVar4 = hVar2;
        C0358i a = mo1291a((Object) hVar3.mo1136a(C0333c.LEFT));
        C0358i a2 = mo1291a((Object) hVar3.mo1136a(C0333c.TOP));
        C0358i a3 = mo1291a((Object) hVar3.mo1136a(C0333c.RIGHT));
        C0358i a4 = mo1291a((Object) hVar3.mo1136a(C0333c.BOTTOM));
        C0358i a5 = mo1291a((Object) hVar4.mo1136a(C0333c.LEFT));
        C0358i a6 = mo1291a((Object) hVar4.mo1136a(C0333c.TOP));
        C0358i a7 = mo1291a((Object) hVar4.mo1136a(C0333c.RIGHT));
        C0358i a8 = mo1291a((Object) hVar4.mo1136a(C0333c.BOTTOM));
        C0350b b = mo1301b();
        double d = (double) f;
        C0358i iVar = a3;
        double d2 = (double) i;
        C0358i iVar2 = a7;
        b.mo1276b(a2, a4, a6, a8, (float) (Math.sin(d) * d2));
        mo1293a(b);
        C0350b b2 = mo1301b();
        b2.mo1276b(a, iVar, a5, iVar2, (float) (Math.cos(d) * d2));
        mo1293a(b2);
    }
}
