package android.support.constraint.p042a.p043a;

import android.support.constraint.p042a.C0351c;
import android.support.constraint.p042a.C0358i;
import android.support.constraint.p042a.C0358i.C0359a;

/* renamed from: android.support.constraint.a.a.f */
/* compiled from: ConstraintAnchor */
public class C0330f {

    /* renamed from: a */
    private C0344p f874a = new C0344p(this);

    /* renamed from: b */
    final C0335h f875b;

    /* renamed from: c */
    final C0333c f876c;

    /* renamed from: d */
    C0330f f877d;

    /* renamed from: e */
    public int f878e = 0;

    /* renamed from: f */
    int f879f = -1;

    /* renamed from: g */
    private C0332b f880g = C0332b.NONE;

    /* renamed from: h */
    private C0331a f881h = C0331a.RELAXED;

    /* renamed from: i */
    private int f882i = 0;

    /* renamed from: j */
    C0358i f883j;

    /* renamed from: android.support.constraint.a.a.f$a */
    /* compiled from: ConstraintAnchor */
    public enum C0331a {
        RELAXED,
        STRICT
    }

    /* renamed from: android.support.constraint.a.a.f$b */
    /* compiled from: ConstraintAnchor */
    public enum C0332b {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: android.support.constraint.a.a.f$c */
    /* compiled from: ConstraintAnchor */
    public enum C0333c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0330f(C0335h hVar, C0333c cVar) {
        this.f875b = hVar;
        this.f876c = cVar;
    }

    /* renamed from: a */
    public void mo1115a(C0351c cVar) {
        C0358i iVar = this.f883j;
        if (iVar == null) {
            this.f883j = new C0358i(C0359a.UNRESTRICTED, null);
        } else {
            iVar.mo1314b();
        }
    }

    /* renamed from: b */
    public int mo1119b() {
        if (this.f875b.mo1196r() == 8) {
            return 0;
        }
        if (this.f879f > -1) {
            C0330f fVar = this.f877d;
            if (fVar != null && fVar.f875b.mo1196r() == 8) {
                return this.f879f;
            }
        }
        return this.f878e;
    }

    /* renamed from: c */
    public C0335h mo1120c() {
        return this.f875b;
    }

    /* renamed from: d */
    public C0344p mo1121d() {
        return this.f874a;
    }

    /* renamed from: e */
    public C0358i mo1122e() {
        return this.f883j;
    }

    /* renamed from: f */
    public C0332b mo1123f() {
        return this.f880g;
    }

    /* renamed from: g */
    public C0330f mo1124g() {
        return this.f877d;
    }

    /* renamed from: h */
    public C0333c mo1125h() {
        return this.f876c;
    }

    /* renamed from: i */
    public boolean mo1126i() {
        return this.f877d != null;
    }

    /* renamed from: j */
    public void mo1127j() {
        this.f877d = null;
        this.f878e = 0;
        this.f879f = -1;
        this.f880g = C0332b.STRONG;
        this.f882i = 0;
        this.f881h = C0331a.RELAXED;
        this.f874a.mo1243d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f875b.mo1172f());
        sb.append(":");
        sb.append(this.f876c.toString());
        return sb.toString();
    }

    /* renamed from: a */
    public int mo1114a() {
        return this.f882i;
    }

    /* renamed from: a */
    public boolean mo1118a(C0330f fVar, int i, C0332b bVar, int i2) {
        return mo1117a(fVar, i, -1, bVar, i2, false);
    }

    /* renamed from: a */
    public boolean mo1117a(C0330f fVar, int i, int i2, C0332b bVar, int i3, boolean z) {
        if (fVar == null) {
            this.f877d = null;
            this.f878e = 0;
            this.f879f = -1;
            this.f880g = C0332b.NONE;
            this.f882i = 2;
            return true;
        } else if (!z && !mo1116a(fVar)) {
            return false;
        } else {
            this.f877d = fVar;
            if (i > 0) {
                this.f878e = i;
            } else {
                this.f878e = 0;
            }
            this.f879f = i2;
            this.f880g = bVar;
            this.f882i = i3;
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo1116a(C0330f fVar) {
        boolean z = false;
        if (fVar == null) {
            return false;
        }
        C0333c h = fVar.mo1125h();
        C0333c cVar = this.f876c;
        if (h != cVar) {
            switch (C0329e.f873a[cVar.ordinal()]) {
                case 1:
                    if (!(h == C0333c.BASELINE || h == C0333c.CENTER_X || h == C0333c.CENTER_Y)) {
                        z = true;
                    }
                    return z;
                case 2:
                case 3:
                    boolean z2 = h == C0333c.LEFT || h == C0333c.RIGHT;
                    if (fVar.mo1120c() instanceof C0340l) {
                        z2 = z2 || h == C0333c.CENTER_X;
                    }
                    return z2;
                case 4:
                case 5:
                    boolean z3 = h == C0333c.TOP || h == C0333c.BOTTOM;
                    if (fVar.mo1120c() instanceof C0340l) {
                        z3 = z3 || h == C0333c.CENTER_Y;
                    }
                    return z3;
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f876c.name());
            }
        } else if (cVar != C0333c.BASELINE || (fVar.mo1120c().mo1205x() && mo1120c().mo1205x())) {
            return true;
        } else {
            return false;
        }
    }
}
