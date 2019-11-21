package android.support.constraint.p042a;

import android.support.constraint.p042a.C0358i.C0359a;

/* renamed from: android.support.constraint.a.b */
/* compiled from: ArrayRow */
public class C0350b implements C0354a {

    /* renamed from: a */
    C0358i f1054a = null;

    /* renamed from: b */
    float f1055b = 0.0f;

    /* renamed from: c */
    boolean f1056c = false;

    /* renamed from: d */
    public final C0324a f1057d;

    /* renamed from: e */
    boolean f1058e = false;

    public C0350b(C0351c cVar) {
        this.f1057d = new C0324a(this, cVar);
    }

    /* renamed from: a */
    public C0350b mo1264a(C0358i iVar, C0358i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1055b = (float) i;
        }
        if (!z) {
            this.f1057d.mo1099a(iVar, -1.0f);
            this.f1057d.mo1099a(iVar2, 1.0f);
        } else {
            this.f1057d.mo1099a(iVar, 1.0f);
            this.f1057d.mo1099a(iVar2, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo1277b() {
        C0358i iVar = this.f1054a;
        return iVar != null && (iVar.f1116h == C0359a.UNRESTRICTED || this.f1055b >= 0.0f);
    }

    /* renamed from: c */
    public C0350b mo1279c(C0358i iVar, int i) {
        if (i < 0) {
            this.f1055b = (float) (i * -1);
            this.f1057d.mo1099a(iVar, 1.0f);
        } else {
            this.f1055b = (float) i;
            this.f1057d.mo1099a(iVar, -1.0f);
        }
        return this;
    }

    public void clear() {
        this.f1057d.mo1095a();
        this.f1054a = null;
        this.f1055b = 0.0f;
    }

    /* renamed from: d */
    public void mo1283d() {
        this.f1054a = null;
        this.f1057d.mo1095a();
        this.f1055b = 0.0f;
        this.f1058e = false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo1285e() {
        /*
            r10 = this;
            android.support.constraint.a.i r0 = r10.f1054a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            android.support.constraint.a.i r1 = r10.f1054a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f1055b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f1055b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            android.support.constraint.a.a r5 = r10.f1057d
            int r5 = r5.f842a
        L_0x005b:
            if (r2 >= r5) goto L_0x00ea
            android.support.constraint.a.a r6 = r10.f1057d
            android.support.constraint.a.i r6 = r6.mo1092a(r2)
            if (r6 != 0) goto L_0x0067
            goto L_0x00e6
        L_0x0067:
            android.support.constraint.a.a r7 = r10.f1057d
            float r7 = r7.mo1102b(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0073
            goto L_0x00e6
        L_0x0073:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0091
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b6
        L_0x0091:
            if (r8 <= 0) goto L_0x00a5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b8
        L_0x00a5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00b6:
            float r7 = r7 * r9
        L_0x00b8:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00ce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e5
        L_0x00ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e5:
            r1 = 1
        L_0x00e6:
            int r2 = r2 + 1
            goto L_0x005b
        L_0x00ea:
            if (r1 != 0) goto L_0x00fd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00fd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p042a.C0350b.mo1285e():java.lang.String");
    }

    public C0358i getKey() {
        return this.f1054a;
    }

    public String toString() {
        return mo1285e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo1278b(C0358i iVar) {
        return this.f1057d.mo1101a(iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0350b mo1274b(C0358i iVar, int i) {
        this.f1054a = iVar;
        float f = (float) i;
        iVar.f1114f = f;
        this.f1055b = f;
        this.f1058e = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0358i mo1280c(C0358i iVar) {
        return this.f1057d.mo1094a((boolean[]) null, iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1284d(C0358i iVar) {
        C0358i iVar2 = this.f1054a;
        if (iVar2 != null) {
            this.f1057d.mo1099a(iVar2, -1.0f);
            this.f1054a = null;
        }
        float a = this.f1057d.mo1091a(iVar, true) * -1.0f;
        this.f1054a = iVar;
        if (a != 1.0f) {
            this.f1055b /= a;
            this.f1057d.mo1096a(a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0350b mo1263a(C0358i iVar, int i) {
        this.f1057d.mo1099a(iVar, (float) i);
        return this;
    }

    /* renamed from: c */
    public boolean mo1281c() {
        return this.f1054a == null && this.f1055b == 0.0f && this.f1057d.f842a == 0;
    }

    /* renamed from: a */
    public C0350b mo1267a(C0358i iVar, C0358i iVar2, C0358i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1055b = (float) i;
        }
        if (!z) {
            this.f1057d.mo1099a(iVar, -1.0f);
            this.f1057d.mo1099a(iVar2, 1.0f);
            this.f1057d.mo1099a(iVar3, 1.0f);
        } else {
            this.f1057d.mo1099a(iVar, 1.0f);
            this.f1057d.mo1099a(iVar2, -1.0f);
            this.f1057d.mo1099a(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C0350b mo1275b(C0358i iVar, C0358i iVar2, C0358i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1055b = (float) i;
        }
        if (!z) {
            this.f1057d.mo1099a(iVar, -1.0f);
            this.f1057d.mo1099a(iVar2, 1.0f);
            this.f1057d.mo1099a(iVar3, -1.0f);
        } else {
            this.f1057d.mo1099a(iVar, 1.0f);
            this.f1057d.mo1099a(iVar2, -1.0f);
            this.f1057d.mo1099a(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C0350b mo1261a(float f, float f2, float f3, C0358i iVar, C0358i iVar2, C0358i iVar3, C0358i iVar4) {
        this.f1055b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f1057d.mo1099a(iVar, 1.0f);
            this.f1057d.mo1099a(iVar2, -1.0f);
            this.f1057d.mo1099a(iVar4, 1.0f);
            this.f1057d.mo1099a(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f1057d.mo1099a(iVar, 1.0f);
            this.f1057d.mo1099a(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f1057d.mo1099a(iVar3, 1.0f);
            this.f1057d.mo1099a(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f1057d.mo1099a(iVar, 1.0f);
            this.f1057d.mo1099a(iVar2, -1.0f);
            this.f1057d.mo1099a(iVar4, f4);
            this.f1057d.mo1099a(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: b */
    public C0350b mo1276b(C0358i iVar, C0358i iVar2, C0358i iVar3, C0358i iVar4, float f) {
        this.f1057d.mo1099a(iVar3, 0.5f);
        this.f1057d.mo1099a(iVar4, 0.5f);
        this.f1057d.mo1099a(iVar, -0.5f);
        this.f1057d.mo1099a(iVar2, -0.5f);
        this.f1055b = -f;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0350b mo1265a(C0358i iVar, C0358i iVar2, int i, float f, C0358i iVar3, C0358i iVar4, int i2) {
        if (iVar2 == iVar3) {
            this.f1057d.mo1099a(iVar, 1.0f);
            this.f1057d.mo1099a(iVar4, 1.0f);
            this.f1057d.mo1099a(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f1057d.mo1099a(iVar, 1.0f);
            this.f1057d.mo1099a(iVar2, -1.0f);
            this.f1057d.mo1099a(iVar3, -1.0f);
            this.f1057d.mo1099a(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f1055b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f1057d.mo1099a(iVar, -1.0f);
            this.f1057d.mo1099a(iVar2, 1.0f);
            this.f1055b = (float) i;
        } else if (f >= 1.0f) {
            this.f1057d.mo1099a(iVar3, -1.0f);
            this.f1057d.mo1099a(iVar4, 1.0f);
            this.f1055b = (float) i2;
        } else {
            float f2 = 1.0f - f;
            this.f1057d.mo1099a(iVar, f2 * 1.0f);
            this.f1057d.mo1099a(iVar2, f2 * -1.0f);
            this.f1057d.mo1099a(iVar3, -1.0f * f);
            this.f1057d.mo1099a(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f1055b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C0350b mo1262a(C0353e eVar, int i) {
        this.f1057d.mo1099a(eVar.mo1290a(i, "ep"), 1.0f);
        this.f1057d.mo1099a(eVar.mo1290a(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0350b mo1266a(C0358i iVar, C0358i iVar2, C0358i iVar3, float f) {
        this.f1057d.mo1099a(iVar, -1.0f);
        this.f1057d.mo1099a(iVar2, 1.0f - f);
        this.f1057d.mo1099a(iVar3, f);
        return this;
    }

    /* renamed from: a */
    public C0350b mo1268a(C0358i iVar, C0358i iVar2, C0358i iVar3, C0358i iVar4, float f) {
        this.f1057d.mo1099a(iVar, -1.0f);
        this.f1057d.mo1099a(iVar2, 1.0f);
        this.f1057d.mo1099a(iVar3, f);
        this.f1057d.mo1099a(iVar4, -f);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1270a() {
        float f = this.f1055b;
        if (f < 0.0f) {
            this.f1055b = f * -1.0f;
            this.f1057d.mo1104b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1273a(C0353e eVar) {
        boolean z;
        C0358i a = this.f1057d.mo1093a(eVar);
        if (a == null) {
            z = true;
        } else {
            mo1284d(a);
            z = false;
        }
        if (this.f1057d.f842a == 0) {
            this.f1058e = true;
        }
        return z;
    }

    /* renamed from: a */
    public C0358i mo1269a(C0353e eVar, boolean[] zArr) {
        return this.f1057d.mo1094a(zArr, (C0358i) null);
    }

    /* renamed from: a */
    public void mo1271a(C0354a aVar) {
        if (aVar instanceof C0350b) {
            C0350b bVar = (C0350b) aVar;
            this.f1054a = null;
            this.f1057d.mo1095a();
            int i = 0;
            while (true) {
                C0324a aVar2 = bVar.f1057d;
                if (i < aVar2.f842a) {
                    this.f1057d.mo1100a(aVar2.mo1092a(i), bVar.f1057d.mo1102b(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1272a(C0358i iVar) {
        int i = iVar.f1113e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f1057d.mo1099a(iVar, f);
    }
}
