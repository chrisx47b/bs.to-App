package android.support.constraint.p042a.p043a;

import android.support.constraint.p042a.p043a.C0335h.C0336a;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.d */
/* compiled from: ChainHead */
public class C0328d {

    /* renamed from: a */
    protected C0335h f856a;

    /* renamed from: b */
    protected C0335h f857b;

    /* renamed from: c */
    protected C0335h f858c;

    /* renamed from: d */
    protected C0335h f859d;

    /* renamed from: e */
    protected C0335h f860e;

    /* renamed from: f */
    protected C0335h f861f;

    /* renamed from: g */
    protected C0335h f862g;

    /* renamed from: h */
    protected ArrayList<C0335h> f863h;

    /* renamed from: i */
    protected int f864i;

    /* renamed from: j */
    protected int f865j;

    /* renamed from: k */
    protected float f866k = 0.0f;

    /* renamed from: l */
    private int f867l;

    /* renamed from: m */
    private boolean f868m = false;

    /* renamed from: n */
    protected boolean f869n;

    /* renamed from: o */
    protected boolean f870o;

    /* renamed from: p */
    protected boolean f871p;

    /* renamed from: q */
    private boolean f872q;

    public C0328d(C0335h hVar, int i, boolean z) {
        this.f856a = hVar;
        this.f867l = i;
        this.f868m = z;
    }

    /* renamed from: a */
    private static boolean m1067a(C0335h hVar, int i) {
        if (hVar.mo1196r() != 8 && hVar.f909F[i] == C0336a.MATCH_CONSTRAINT) {
            int[] iArr = hVar.f943h;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m1068b() {
        int i = this.f867l * 2;
        boolean z = false;
        C0335h hVar = this.f856a;
        C0335h hVar2 = hVar;
        boolean z2 = false;
        while (!z2) {
            this.f864i++;
            C0335h[] hVarArr = hVar.f966sa;
            int i2 = this.f867l;
            C0335h hVar3 = null;
            hVarArr[i2] = null;
            hVar.f964ra[i2] = null;
            if (hVar.mo1196r() != 8) {
                if (this.f857b == null) {
                    this.f857b = hVar;
                }
                this.f859d = hVar;
                C0336a[] aVarArr = hVar.f909F;
                int i3 = this.f867l;
                if (aVarArr[i3] == C0336a.MATCH_CONSTRAINT) {
                    int[] iArr = hVar.f943h;
                    if (iArr[i3] == 0 || iArr[i3] == 3 || iArr[i3] == 2) {
                        this.f865j++;
                        float[] fArr = hVar.f962qa;
                        int i4 = this.f867l;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.f866k += fArr[i4];
                        }
                        if (m1067a(hVar, this.f867l)) {
                            if (f < 0.0f) {
                                this.f869n = true;
                            } else {
                                this.f870o = true;
                            }
                            if (this.f863h == null) {
                                this.f863h = new ArrayList<>();
                            }
                            this.f863h.add(hVar);
                        }
                        if (this.f861f == null) {
                            this.f861f = hVar;
                        }
                        C0335h hVar4 = this.f862g;
                        if (hVar4 != null) {
                            hVar4.f964ra[this.f867l] = hVar;
                        }
                        this.f862g = hVar;
                    }
                }
            }
            if (hVar2 != hVar) {
                hVar2.f966sa[this.f867l] = hVar;
            }
            C0330f fVar = hVar.f907D[i + 1].f877d;
            if (fVar != null) {
                C0335h hVar5 = fVar.f875b;
                C0330f[] fVarArr = hVar5.f907D;
                if (fVarArr[i].f877d != null && fVarArr[i].f877d.f875b == hVar) {
                    hVar3 = hVar5;
                }
            }
            if (hVar3 == null) {
                hVar3 = hVar;
                z2 = true;
            }
            hVar2 = hVar;
            hVar = hVar3;
        }
        this.f858c = hVar;
        if (this.f867l != 0 || !this.f868m) {
            this.f860e = this.f856a;
        } else {
            this.f860e = this.f858c;
        }
        if (this.f870o && this.f869n) {
            z = true;
        }
        this.f871p = z;
    }

    /* renamed from: a */
    public void mo1113a() {
        if (!this.f872q) {
            m1068b();
        }
        this.f872q = true;
    }
}
