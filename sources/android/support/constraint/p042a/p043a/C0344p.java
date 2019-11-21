package android.support.constraint.p042a.p043a;

import android.support.constraint.p042a.C0353e;
import android.support.constraint.p042a.C0355f;
import android.support.constraint.p042a.C0358i;
import android.support.constraint.p042a.p043a.C0330f.C0333c;

/* renamed from: android.support.constraint.a.a.p */
/* compiled from: ResolutionAnchor */
public class C0344p extends C0346r {

    /* renamed from: c */
    C0330f f1027c;

    /* renamed from: d */
    float f1028d;

    /* renamed from: e */
    C0344p f1029e;

    /* renamed from: f */
    float f1030f;

    /* renamed from: g */
    C0344p f1031g;

    /* renamed from: h */
    float f1032h;

    /* renamed from: i */
    int f1033i = 0;

    /* renamed from: j */
    private C0344p f1034j;

    /* renamed from: k */
    private float f1035k;

    /* renamed from: l */
    private C0345q f1036l = null;

    /* renamed from: m */
    private int f1037m = 1;

    /* renamed from: n */
    private C0345q f1038n = null;

    /* renamed from: o */
    private int f1039o = 1;

    public C0344p(C0330f fVar) {
        this.f1027c = fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo1234a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: a */
    public void mo1236a(C0344p pVar, float f) {
        if (this.f1042b == 0 || !(this.f1031g == pVar || this.f1032h == f)) {
            this.f1031g = pVar;
            this.f1032h = f;
            if (this.f1042b == 1) {
                mo1252b();
            }
            mo1250a();
        }
    }

    /* renamed from: b */
    public void mo1240b(int i) {
        this.f1033i = i;
    }

    /* renamed from: d */
    public void mo1243d() {
        super.mo1243d();
        this.f1029e = null;
        this.f1030f = 0.0f;
        this.f1036l = null;
        this.f1037m = 1;
        this.f1038n = null;
        this.f1039o = 1;
        this.f1031g = null;
        this.f1032h = 0.0f;
        this.f1028d = 0.0f;
        this.f1034j = null;
        this.f1035k = 0.0f;
        this.f1033i = 0;
    }

    /* renamed from: e */
    public void mo1244e() {
        float f;
        float f2;
        float f3;
        float f4;
        boolean z = true;
        if (this.f1042b != 1 && this.f1033i != 4) {
            C0345q qVar = this.f1036l;
            if (qVar != null) {
                if (qVar.f1042b == 1) {
                    this.f1030f = ((float) this.f1037m) * qVar.f1040c;
                } else {
                    return;
                }
            }
            C0345q qVar2 = this.f1038n;
            if (qVar2 != null) {
                if (qVar2.f1042b == 1) {
                    this.f1035k = ((float) this.f1039o) * qVar2.f1040c;
                } else {
                    return;
                }
            }
            if (this.f1033i == 1) {
                C0344p pVar = this.f1029e;
                if (pVar == null || pVar.f1042b == 1) {
                    C0344p pVar2 = this.f1029e;
                    if (pVar2 == null) {
                        this.f1031g = this;
                        this.f1032h = this.f1030f;
                    } else {
                        this.f1031g = pVar2.f1031g;
                        this.f1032h = pVar2.f1032h + this.f1030f;
                    }
                    mo1250a();
                }
            }
            if (this.f1033i == 2) {
                C0344p pVar3 = this.f1029e;
                if (pVar3 != null && pVar3.f1042b == 1) {
                    C0344p pVar4 = this.f1034j;
                    if (pVar4 != null) {
                        C0344p pVar5 = pVar4.f1029e;
                        if (pVar5 != null && pVar5.f1042b == 1) {
                            if (C0353e.m1284e() != null) {
                                C0355f e = C0353e.m1284e();
                                e.f1102v++;
                            }
                            this.f1031g = this.f1029e.f1031g;
                            C0344p pVar6 = this.f1034j;
                            pVar6.f1031g = pVar6.f1029e.f1031g;
                            C0333c cVar = this.f1027c.f876c;
                            int i = 0;
                            if (!(cVar == C0333c.RIGHT || cVar == C0333c.BOTTOM)) {
                                z = false;
                            }
                            if (z) {
                                f2 = this.f1029e.f1032h;
                                f = this.f1034j.f1029e.f1032h;
                            } else {
                                f2 = this.f1034j.f1029e.f1032h;
                                f = this.f1029e.f1032h;
                            }
                            float f5 = f2 - f;
                            C0330f fVar = this.f1027c;
                            C0333c cVar2 = fVar.f876c;
                            if (cVar2 == C0333c.LEFT || cVar2 == C0333c.RIGHT) {
                                f4 = f5 - ((float) this.f1027c.f875b.mo1198s());
                                f3 = this.f1027c.f875b.f930aa;
                            } else {
                                f4 = f5 - ((float) fVar.f875b.mo1178i());
                                f3 = this.f1027c.f875b.f932ba;
                            }
                            int b = this.f1027c.mo1119b();
                            int b2 = this.f1034j.f1027c.mo1119b();
                            if (this.f1027c.mo1124g() == this.f1034j.f1027c.mo1124g()) {
                                f3 = 0.5f;
                                b2 = 0;
                            } else {
                                i = b;
                            }
                            float f6 = (float) i;
                            float f7 = (float) b2;
                            float f8 = (f4 - f6) - f7;
                            if (z) {
                                C0344p pVar7 = this.f1034j;
                                pVar7.f1032h = pVar7.f1029e.f1032h + f7 + (f8 * f3);
                                this.f1032h = (this.f1029e.f1032h - f6) - (f8 * (1.0f - f3));
                            } else {
                                this.f1032h = this.f1029e.f1032h + f6 + (f8 * f3);
                                C0344p pVar8 = this.f1034j;
                                pVar8.f1032h = (pVar8.f1029e.f1032h - f7) - (f8 * (1.0f - f3));
                            }
                            mo1250a();
                            this.f1034j.mo1250a();
                        }
                    }
                }
            }
            if (this.f1033i == 3) {
                C0344p pVar9 = this.f1029e;
                if (pVar9 != null && pVar9.f1042b == 1) {
                    C0344p pVar10 = this.f1034j;
                    if (pVar10 != null) {
                        C0344p pVar11 = pVar10.f1029e;
                        if (pVar11 != null && pVar11.f1042b == 1) {
                            if (C0353e.m1284e() != null) {
                                C0355f e2 = C0353e.m1284e();
                                e2.f1103w++;
                            }
                            C0344p pVar12 = this.f1029e;
                            this.f1031g = pVar12.f1031g;
                            C0344p pVar13 = this.f1034j;
                            C0344p pVar14 = pVar13.f1029e;
                            pVar13.f1031g = pVar14.f1031g;
                            this.f1032h = pVar12.f1032h + this.f1030f;
                            pVar13.f1032h = pVar14.f1032h + pVar13.f1030f;
                            mo1250a();
                            this.f1034j.mo1250a();
                        }
                    }
                }
            }
            if (this.f1033i == 5) {
                this.f1027c.f875b.mo1107G();
            }
        }
    }

    /* renamed from: f */
    public float mo1245f() {
        return this.f1032h;
    }

    /* renamed from: g */
    public void mo1246g() {
        C0330f g = this.f1027c.mo1124g();
        if (g != null) {
            if (g.mo1124g() == this.f1027c) {
                this.f1033i = 4;
                g.mo1121d().f1033i = 4;
            }
            int b = this.f1027c.mo1119b();
            C0333c cVar = this.f1027c.f876c;
            if (cVar == C0333c.RIGHT || cVar == C0333c.BOTTOM) {
                b = -b;
            }
            mo1237a(g.mo1121d(), b);
        }
    }

    public String toString() {
        if (this.f1042b == 1) {
            String str = ", RESOLVED: ";
            String str2 = "[";
            if (this.f1031g == this) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f1027c);
                sb.append(str);
                sb.append(this.f1032h);
                sb.append("]  type: ");
                sb.append(mo1234a(this.f1033i));
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(this.f1027c);
            sb2.append(str);
            sb2.append(this.f1031g);
            sb2.append(":");
            sb2.append(this.f1032h);
            sb2.append("] type: ");
            sb2.append(mo1234a(this.f1033i));
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("{ ");
        sb3.append(this.f1027c);
        sb3.append(" UNRESOLVED} type: ");
        sb3.append(mo1234a(this.f1033i));
        return sb3.toString();
    }

    /* renamed from: b */
    public void mo1241b(C0344p pVar, float f) {
        this.f1034j = pVar;
        this.f1035k = f;
    }

    /* renamed from: b */
    public void mo1242b(C0344p pVar, int i, C0345q qVar) {
        this.f1034j = pVar;
        this.f1038n = qVar;
        this.f1039o = i;
    }

    /* renamed from: a */
    public void mo1235a(int i, C0344p pVar, int i2) {
        this.f1033i = i;
        this.f1029e = pVar;
        this.f1030f = (float) i2;
        this.f1029e.mo1251a(this);
    }

    /* renamed from: a */
    public void mo1237a(C0344p pVar, int i) {
        this.f1029e = pVar;
        this.f1030f = (float) i;
        this.f1029e.mo1251a(this);
    }

    /* renamed from: a */
    public void mo1238a(C0344p pVar, int i, C0345q qVar) {
        this.f1029e = pVar;
        this.f1029e.mo1251a(this);
        this.f1036l = qVar;
        this.f1037m = i;
        this.f1036l.mo1251a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1239a(C0353e eVar) {
        C0358i e = this.f1027c.mo1122e();
        C0344p pVar = this.f1031g;
        if (pVar == null) {
            eVar.mo1296a(e, (int) (this.f1032h + 0.5f));
        } else {
            eVar.mo1288a(e, eVar.mo1291a((Object) pVar.f1027c), (int) (this.f1032h + 0.5f), 6);
        }
    }
}
