package android.support.constraint.p042a.p043a;

import android.support.constraint.p042a.C0353e;
import android.support.constraint.p042a.C0358i;
import android.support.constraint.p042a.p043a.C0330f.C0333c;
import android.support.constraint.p042a.p043a.C0335h.C0336a;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.l */
/* compiled from: Guideline */
public class C0340l extends C0335h {

    /* renamed from: Aa */
    private boolean f1015Aa;

    /* renamed from: Ba */
    private int f1016Ba;

    /* renamed from: Ca */
    private C0343o f1017Ca;

    /* renamed from: Da */
    private int f1018Da;

    /* renamed from: va */
    protected float f1019va = -1.0f;

    /* renamed from: wa */
    protected int f1020wa = -1;

    /* renamed from: xa */
    protected int f1021xa = -1;

    /* renamed from: ya */
    private C0330f f1022ya = this.f972w;

    /* renamed from: za */
    private int f1023za;

    public C0340l() {
        this.f1023za = 0;
        this.f1015Aa = false;
        this.f1016Ba = 0;
        this.f1017Ca = new C0343o();
        this.f1018Da = 8;
        this.f908E.clear();
        this.f908E.add(this.f1022ya);
        int length = this.f907D.length;
        for (int i = 0; i < length; i++) {
            this.f907D[i] = this.f1022ya;
        }
    }

    /* renamed from: J */
    public int mo1229J() {
        return this.f1023za;
    }

    /* renamed from: a */
    public C0330f mo1136a(C0333c cVar) {
        switch (C0339k.f1014a[cVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f1023za == 1) {
                    return this.f1022ya;
                }
                break;
            case 3:
            case 4:
                if (this.f1023za == 0) {
                    return this.f1022ya;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(cVar.name());
    }

    /* renamed from: a */
    public boolean mo1110a() {
        return true;
    }

    /* renamed from: b */
    public ArrayList<C0330f> mo1152b() {
        return this.f908E;
    }

    /* renamed from: c */
    public void mo1164c(C0353e eVar) {
        if (mo1182k() != null) {
            int b = eVar.mo1300b((Object) this.f1022ya);
            if (this.f1023za == 1) {
                mo1197r(b);
                mo1199s(0);
                mo1175g(mo1182k().mo1178i());
                mo1191o(0);
            } else {
                mo1197r(0);
                mo1199s(b);
                mo1191o(mo1182k().mo1198s());
                mo1175g(0);
            }
        }
    }

    /* renamed from: e */
    public void mo1230e(float f) {
        if (f > -1.0f) {
            this.f1019va = f;
            this.f1020wa = -1;
            this.f1021xa = -1;
        }
    }

    /* renamed from: t */
    public void mo1112t(int i) {
        if (i > -1) {
            this.f1019va = -1.0f;
            this.f1020wa = i;
            this.f1021xa = -1;
        }
    }

    /* renamed from: u */
    public void mo1231u(int i) {
        if (i > -1) {
            this.f1019va = -1.0f;
            this.f1020wa = -1;
            this.f1021xa = i;
        }
    }

    /* renamed from: v */
    public void mo1232v(int i) {
        if (this.f1023za != i) {
            this.f1023za = i;
            this.f908E.clear();
            if (this.f1023za == 1) {
                this.f1022ya = this.f971v;
            } else {
                this.f1022ya = this.f972w;
            }
            this.f908E.add(this.f1022ya);
            int length = this.f907D.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f907D[i2] = this.f1022ya;
            }
        }
    }

    /* renamed from: a */
    public void mo1108a(int i) {
        C0335h k = mo1182k();
        if (k != null) {
            if (mo1229J() == 1) {
                this.f972w.mo1121d().mo1235a(1, k.f972w.mo1121d(), 0);
                this.f974y.mo1121d().mo1235a(1, k.f972w.mo1121d(), 0);
                if (this.f1020wa != -1) {
                    this.f971v.mo1121d().mo1235a(1, k.f971v.mo1121d(), this.f1020wa);
                    this.f973x.mo1121d().mo1235a(1, k.f971v.mo1121d(), this.f1020wa);
                } else if (this.f1021xa != -1) {
                    this.f971v.mo1121d().mo1235a(1, k.f973x.mo1121d(), -this.f1021xa);
                    this.f973x.mo1121d().mo1235a(1, k.f973x.mo1121d(), -this.f1021xa);
                } else if (this.f1019va != -1.0f && k.mo1180j() == C0336a.FIXED) {
                    int i2 = (int) (((float) k.f911H) * this.f1019va);
                    this.f971v.mo1121d().mo1235a(1, k.f971v.mo1121d(), i2);
                    this.f973x.mo1121d().mo1235a(1, k.f971v.mo1121d(), i2);
                }
            } else {
                this.f971v.mo1121d().mo1235a(1, k.f971v.mo1121d(), 0);
                this.f973x.mo1121d().mo1235a(1, k.f971v.mo1121d(), 0);
                if (this.f1020wa != -1) {
                    this.f972w.mo1121d().mo1235a(1, k.f972w.mo1121d(), this.f1020wa);
                    this.f974y.mo1121d().mo1235a(1, k.f972w.mo1121d(), this.f1020wa);
                } else if (this.f1021xa != -1) {
                    this.f972w.mo1121d().mo1235a(1, k.f974y.mo1121d(), -this.f1021xa);
                    this.f974y.mo1121d().mo1235a(1, k.f974y.mo1121d(), -this.f1021xa);
                } else if (this.f1019va != -1.0f && k.mo1194q() == C0336a.FIXED) {
                    int i3 = (int) (((float) k.f912I) * this.f1019va);
                    this.f972w.mo1121d().mo1235a(1, k.f972w.mo1121d(), i3);
                    this.f974y.mo1121d().mo1235a(1, k.f972w.mo1121d(), i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1109a(C0353e eVar) {
        C0337i iVar = (C0337i) mo1182k();
        if (iVar != null) {
            C0330f a = iVar.mo1136a(C0333c.LEFT);
            C0330f a2 = iVar.mo1136a(C0333c.RIGHT);
            C0335h hVar = this.f910G;
            boolean z = hVar != null && hVar.f909F[0] == C0336a.WRAP_CONTENT;
            if (this.f1023za == 0) {
                a = iVar.mo1136a(C0333c.TOP);
                a2 = iVar.mo1136a(C0333c.BOTTOM);
                C0335h hVar2 = this.f910G;
                z = hVar2 != null && hVar2.f909F[1] == C0336a.WRAP_CONTENT;
            }
            if (this.f1020wa != -1) {
                C0358i a3 = eVar.mo1291a((Object) this.f1022ya);
                eVar.mo1288a(a3, eVar.mo1291a((Object) a), this.f1020wa, 6);
                if (z) {
                    eVar.mo1302b(eVar.mo1291a((Object) a2), a3, 0, 5);
                }
            } else if (this.f1021xa != -1) {
                C0358i a4 = eVar.mo1291a((Object) this.f1022ya);
                C0358i a5 = eVar.mo1291a((Object) a2);
                eVar.mo1288a(a4, a5, -this.f1021xa, 6);
                if (z) {
                    eVar.mo1302b(a4, eVar.mo1291a((Object) a), 0, 5);
                    eVar.mo1302b(a5, a4, 0, 5);
                }
            } else if (this.f1019va != -1.0f) {
                eVar.mo1293a(C0353e.m1278a(eVar, eVar.mo1291a((Object) this.f1022ya), eVar.mo1291a((Object) a), eVar.mo1291a((Object) a2), this.f1019va, this.f1015Aa));
            }
        }
    }
}
