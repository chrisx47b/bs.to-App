package android.support.constraint.p042a.p043a;

import android.support.constraint.p042a.C0351c;
import android.support.constraint.p042a.C0353e;
import android.support.constraint.p042a.p043a.C0330f.C0332b;
import android.support.constraint.p042a.p043a.C0330f.C0333c;
import java.util.ArrayList;
import p216me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: android.support.constraint.a.a.h */
/* compiled from: ConstraintWidget */
public class C0335h {

    /* renamed from: a */
    public static float f903a = 0.5f;

    /* renamed from: A */
    C0330f f904A = new C0330f(this, C0333c.CENTER_X);

    /* renamed from: B */
    C0330f f905B = new C0330f(this, C0333c.CENTER_Y);

    /* renamed from: C */
    C0330f f906C = new C0330f(this, C0333c.CENTER);

    /* renamed from: D */
    protected C0330f[] f907D = {this.f971v, this.f973x, this.f972w, this.f974y, this.f975z, this.f906C};

    /* renamed from: E */
    protected ArrayList<C0330f> f908E = new ArrayList<>();

    /* renamed from: F */
    protected C0336a[] f909F;

    /* renamed from: G */
    C0335h f910G;

    /* renamed from: H */
    int f911H;

    /* renamed from: I */
    int f912I;

    /* renamed from: J */
    protected float f913J;

    /* renamed from: K */
    protected int f914K;

    /* renamed from: L */
    protected int f915L;

    /* renamed from: M */
    protected int f916M;

    /* renamed from: N */
    int f917N;

    /* renamed from: O */
    int f918O;

    /* renamed from: P */
    private int f919P;

    /* renamed from: Q */
    private int f920Q;

    /* renamed from: R */
    private int f921R;

    /* renamed from: S */
    private int f922S;

    /* renamed from: T */
    protected int f923T;

    /* renamed from: U */
    protected int f924U;

    /* renamed from: V */
    int f925V;

    /* renamed from: W */
    protected int f926W;

    /* renamed from: X */
    protected int f927X;

    /* renamed from: Y */
    private int f928Y;

    /* renamed from: Z */
    private int f929Z;

    /* renamed from: aa */
    float f930aa;

    /* renamed from: b */
    public int f931b = -1;

    /* renamed from: ba */
    float f932ba;

    /* renamed from: c */
    public int f933c = -1;

    /* renamed from: ca */
    private Object f934ca;

    /* renamed from: d */
    C0345q f935d;

    /* renamed from: da */
    private int f936da;

    /* renamed from: e */
    C0345q f937e;

    /* renamed from: ea */
    private int f938ea;

    /* renamed from: f */
    int f939f = 0;

    /* renamed from: fa */
    private String f940fa;

    /* renamed from: g */
    int f941g = 0;

    /* renamed from: ga */
    private String f942ga;

    /* renamed from: h */
    int[] f943h = new int[2];

    /* renamed from: ha */
    boolean f944ha;

    /* renamed from: i */
    int f945i = 0;

    /* renamed from: ia */
    boolean f946ia;

    /* renamed from: j */
    int f947j = 0;

    /* renamed from: ja */
    boolean f948ja;

    /* renamed from: k */
    float f949k = 1.0f;

    /* renamed from: ka */
    boolean f950ka;

    /* renamed from: l */
    int f951l = 0;

    /* renamed from: la */
    boolean f952la;

    /* renamed from: m */
    int f953m = 0;

    /* renamed from: ma */
    int f954ma;

    /* renamed from: n */
    float f955n = 1.0f;

    /* renamed from: na */
    int f956na;

    /* renamed from: o */
    boolean f957o;

    /* renamed from: oa */
    boolean f958oa;

    /* renamed from: p */
    boolean f959p;

    /* renamed from: pa */
    boolean f960pa;

    /* renamed from: q */
    int f961q = -1;

    /* renamed from: qa */
    float[] f962qa;

    /* renamed from: r */
    float f963r = 1.0f;

    /* renamed from: ra */
    protected C0335h[] f964ra;

    /* renamed from: s */
    C0338j f965s = null;

    /* renamed from: sa */
    protected C0335h[] f966sa;

    /* renamed from: t */
    private int[] f967t = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: ta */
    C0335h f968ta;

    /* renamed from: u */
    private float f969u = 0.0f;

    /* renamed from: ua */
    C0335h f970ua;

    /* renamed from: v */
    C0330f f971v = new C0330f(this, C0333c.LEFT);

    /* renamed from: w */
    C0330f f972w = new C0330f(this, C0333c.TOP);

    /* renamed from: x */
    C0330f f973x = new C0330f(this, C0333c.RIGHT);

    /* renamed from: y */
    C0330f f974y = new C0330f(this, C0333c.BOTTOM);

    /* renamed from: z */
    C0330f f975z = new C0330f(this, C0333c.BASELINE);

    /* renamed from: android.support.constraint.a.a.h$a */
    /* compiled from: ConstraintWidget */
    public enum C0336a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C0335h() {
        C0336a aVar = C0336a.FIXED;
        this.f909F = new C0336a[]{aVar, aVar};
        this.f910G = null;
        this.f911H = 0;
        this.f912I = 0;
        this.f913J = 0.0f;
        this.f914K = -1;
        this.f915L = 0;
        this.f916M = 0;
        this.f917N = 0;
        this.f918O = 0;
        this.f919P = 0;
        this.f920Q = 0;
        this.f921R = 0;
        this.f922S = 0;
        this.f923T = 0;
        this.f924U = 0;
        this.f925V = 0;
        float f = f903a;
        this.f930aa = f;
        this.f932ba = f;
        this.f936da = 0;
        this.f938ea = 0;
        this.f940fa = null;
        this.f942ga = null;
        this.f948ja = false;
        this.f950ka = false;
        this.f952la = false;
        this.f954ma = 0;
        this.f956na = 0;
        this.f962qa = new float[]{-1.0f, -1.0f};
        this.f964ra = new C0335h[]{null, null};
        this.f966sa = new C0335h[]{null, null};
        this.f968ta = null;
        this.f970ua = null;
        mo1229J();
    }

    /* renamed from: J */
    private void mo1229J() {
        this.f908E.add(this.f971v);
        this.f908E.add(this.f972w);
        this.f908E.add(this.f973x);
        this.f908E.add(this.f974y);
        this.f908E.add(this.f904A);
        this.f908E.add(this.f905B);
        this.f908E.add(this.f906C);
        this.f908E.add(this.f975z);
    }

    /* renamed from: A */
    public boolean mo1129A() {
        C0330f fVar = this.f972w;
        C0330f fVar2 = fVar.f877d;
        if (fVar2 == null || fVar2.f877d != fVar) {
            C0330f fVar3 = this.f974y;
            C0330f fVar4 = fVar3.f877d;
            if (fVar4 == null || fVar4.f877d != fVar3) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public boolean mo1130B() {
        return this.f941g == 0 && this.f913J == 0.0f && this.f951l == 0 && this.f953m == 0 && this.f909F[1] == C0336a.MATCH_CONSTRAINT;
    }

    /* renamed from: C */
    public boolean mo1131C() {
        return this.f939f == 0 && this.f913J == 0.0f && this.f945i == 0 && this.f947j == 0 && this.f909F[0] == C0336a.MATCH_CONSTRAINT;
    }

    /* renamed from: D */
    public void mo1132D() {
        this.f971v.mo1127j();
        this.f972w.mo1127j();
        this.f973x.mo1127j();
        this.f974y.mo1127j();
        this.f975z.mo1127j();
        this.f904A.mo1127j();
        this.f905B.mo1127j();
        this.f906C.mo1127j();
        this.f910G = null;
        this.f969u = 0.0f;
        this.f911H = 0;
        this.f912I = 0;
        this.f913J = 0.0f;
        this.f914K = -1;
        this.f915L = 0;
        this.f916M = 0;
        this.f919P = 0;
        this.f920Q = 0;
        this.f921R = 0;
        this.f922S = 0;
        this.f923T = 0;
        this.f924U = 0;
        this.f925V = 0;
        this.f926W = 0;
        this.f927X = 0;
        this.f928Y = 0;
        this.f929Z = 0;
        float f = f903a;
        this.f930aa = f;
        this.f932ba = f;
        C0336a[] aVarArr = this.f909F;
        C0336a aVar = C0336a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.f934ca = null;
        this.f936da = 0;
        this.f938ea = 0;
        this.f942ga = null;
        this.f944ha = false;
        this.f946ia = false;
        this.f954ma = 0;
        this.f956na = 0;
        this.f958oa = false;
        this.f960pa = false;
        float[] fArr = this.f962qa;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f931b = -1;
        this.f933c = -1;
        int[] iArr = this.f967t;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f939f = 0;
        this.f941g = 0;
        this.f949k = 1.0f;
        this.f955n = 1.0f;
        this.f947j = Integer.MAX_VALUE;
        this.f953m = Integer.MAX_VALUE;
        this.f945i = 0;
        this.f951l = 0;
        this.f961q = -1;
        this.f963r = 1.0f;
        C0345q qVar = this.f935d;
        if (qVar != null) {
            qVar.mo1243d();
        }
        C0345q qVar2 = this.f937e;
        if (qVar2 != null) {
            qVar2.mo1243d();
        }
        this.f965s = null;
        this.f948ja = false;
        this.f950ka = false;
        this.f952la = false;
    }

    /* renamed from: E */
    public void mo1133E() {
        C0335h k = mo1182k();
        if (k == null || !(k instanceof C0337i) || !((C0337i) mo1182k()).mo1210N()) {
            int size = this.f908E.size();
            for (int i = 0; i < size; i++) {
                ((C0330f) this.f908E.get(i)).mo1127j();
            }
        }
    }

    /* renamed from: F */
    public void mo1106F() {
        for (int i = 0; i < 6; i++) {
            this.f907D[i].mo1121d().mo1243d();
        }
    }

    /* renamed from: G */
    public void mo1107G() {
    }

    /* renamed from: H */
    public void mo1134H() {
        int i = this.f915L;
        int i2 = this.f916M;
        int i3 = this.f911H + i;
        int i4 = this.f912I + i2;
        this.f919P = i;
        this.f920Q = i2;
        this.f921R = i3 - i;
        this.f922S = i4 - i2;
    }

    /* renamed from: I */
    public void mo1135I() {
        for (int i = 0; i < 6; i++) {
            this.f907D[i].mo1121d().mo1246g();
        }
    }

    /* renamed from: a */
    public void mo1108a(int i) {
        C0342n.m1212a(i, this);
    }

    /* renamed from: b */
    public void mo1159b(boolean z) {
        this.f957o = z;
    }

    /* renamed from: c */
    public int mo1160c() {
        return this.f925V;
    }

    /* renamed from: d */
    public int mo1166d(int i) {
        if (i == 0) {
            return mo1198s();
        }
        if (i == 1) {
            return mo1178i();
        }
        return 0;
    }

    /* renamed from: e */
    public Object mo1170e() {
        return this.f934ca;
    }

    /* renamed from: f */
    public String mo1172f() {
        return this.f940fa;
    }

    /* renamed from: g */
    public int mo1174g() {
        return this.f919P + this.f923T;
    }

    /* renamed from: h */
    public int mo1176h() {
        return this.f920Q + this.f924U;
    }

    /* renamed from: i */
    public void mo1179i(int i) {
        this.f967t[1] = i;
    }

    /* renamed from: j */
    public void mo1181j(int i) {
        this.f967t[0] = i;
    }

    /* renamed from: k */
    public C0335h mo1182k() {
        return this.f910G;
    }

    /* renamed from: l */
    public C0345q mo1184l() {
        if (this.f937e == null) {
            this.f937e = new C0345q();
        }
        return this.f937e;
    }

    /* renamed from: m */
    public C0345q mo1186m() {
        if (this.f935d == null) {
            this.f935d = new C0345q();
        }
        return this.f935d;
    }

    /* renamed from: n */
    public void mo1189n(int i) {
        this.f938ea = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public int mo1190o() {
        return this.f915L + this.f923T;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo1192p() {
        return this.f916M + this.f924U;
    }

    /* renamed from: q */
    public void mo1195q(int i) {
        this.f928Y = i;
    }

    /* renamed from: r */
    public int mo1196r() {
        return this.f938ea;
    }

    /* renamed from: s */
    public int mo1198s() {
        if (this.f938ea == 8) {
            return 0;
        }
        return this.f911H;
    }

    /* renamed from: t */
    public int mo1200t() {
        return this.f929Z;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.f942ga;
        String str3 = " ";
        String str4 = BuildConfig.FLAVOR;
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("type: ");
            sb2.append(this.f942ga);
            sb2.append(str3);
            str = sb2.toString();
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.f940fa != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("id: ");
            sb3.append(this.f940fa);
            sb3.append(str3);
            str4 = sb3.toString();
        }
        sb.append(str4);
        sb.append("(");
        sb.append(this.f915L);
        sb.append(", ");
        sb.append(this.f916M);
        sb.append(") - (");
        sb.append(this.f911H);
        String str5 = " x ";
        sb.append(str5);
        sb.append(this.f912I);
        sb.append(") wrap: (");
        sb.append(this.f928Y);
        sb.append(str5);
        sb.append(this.f929Z);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public int mo1202u() {
        return this.f928Y;
    }

    /* renamed from: v */
    public int mo1203v() {
        return this.f915L;
    }

    /* renamed from: w */
    public int mo1204w() {
        return this.f916M;
    }

    /* renamed from: x */
    public boolean mo1205x() {
        return this.f925V > 0;
    }

    /* renamed from: y */
    public boolean mo1206y() {
        if (this.f971v.mo1121d().f1042b == 1 && this.f973x.mo1121d().f1042b == 1 && this.f972w.mo1121d().f1042b == 1 && this.f974y.mo1121d().f1042b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean mo1207z() {
        C0330f fVar = this.f971v;
        C0330f fVar2 = fVar.f877d;
        if (fVar2 == null || fVar2.f877d != fVar) {
            C0330f fVar3 = this.f973x;
            C0330f fVar4 = fVar3.f877d;
            if (fVar4 == null || fVar4.f877d != fVar3) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    private boolean mo1112t(int i) {
        int i2 = i * 2;
        C0330f[] fVarArr = this.f907D;
        if (!(fVarArr[i2].f877d == null || fVarArr[i2].f877d.f877d == fVarArr[i2])) {
            int i3 = i2 + 1;
            if (fVarArr[i3].f877d != null && fVarArr[i3].f877d.f877d == fVarArr[i3]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo1146a(C0351c cVar) {
        this.f971v.mo1115a(cVar);
        this.f972w.mo1115a(cVar);
        this.f973x.mo1115a(cVar);
        this.f974y.mo1115a(cVar);
        this.f975z.mo1115a(cVar);
        this.f906C.mo1115a(cVar);
        this.f904A.mo1115a(cVar);
        this.f905B.mo1115a(cVar);
    }

    /* renamed from: b */
    public void mo1157b(C0353e eVar) {
        eVar.mo1291a((Object) this.f971v);
        eVar.mo1291a((Object) this.f972w);
        eVar.mo1291a((Object) this.f973x);
        eVar.mo1291a((Object) this.f974y);
        if (this.f925V > 0) {
            eVar.mo1291a((Object) this.f975z);
        }
    }

    /* renamed from: c */
    public void mo1163c(int i, int i2) {
        this.f915L = i;
        this.f916M = i2;
    }

    /* renamed from: e */
    public void mo1171e(int i, int i2) {
        this.f916M = i;
        this.f912I = i2 - i;
        int i3 = this.f912I;
        int i4 = this.f927X;
        if (i3 < i4) {
            this.f912I = i4;
        }
    }

    /* renamed from: f */
    public void mo1173f(int i) {
        this.f925V = i;
    }

    /* renamed from: g */
    public void mo1175g(int i) {
        this.f912I = i;
        int i2 = this.f912I;
        int i3 = this.f927X;
        if (i2 < i3) {
            this.f912I = i3;
        }
    }

    /* renamed from: h */
    public void mo1177h(int i) {
        this.f954ma = i;
    }

    /* renamed from: i */
    public int mo1178i() {
        if (this.f938ea == 8) {
            return 0;
        }
        return this.f912I;
    }

    /* renamed from: j */
    public C0336a mo1180j() {
        return this.f909F[0];
    }

    /* renamed from: k */
    public void mo1183k(int i) {
        if (i < 0) {
            this.f927X = 0;
        } else {
            this.f927X = i;
        }
    }

    /* renamed from: n */
    public int mo1188n() {
        return mo1203v() + this.f911H;
    }

    /* renamed from: o */
    public void mo1191o(int i) {
        this.f911H = i;
        int i2 = this.f911H;
        int i3 = this.f926W;
        if (i2 < i3) {
            this.f911H = i3;
        }
    }

    /* renamed from: p */
    public void mo1193p(int i) {
        this.f929Z = i;
    }

    /* renamed from: q */
    public C0336a mo1194q() {
        return this.f909F[1];
    }

    /* renamed from: r */
    public void mo1197r(int i) {
        this.f915L = i;
    }

    /* renamed from: d */
    public int mo1165d() {
        return mo1204w() + this.f912I;
    }

    /* renamed from: s */
    public void mo1199s(int i) {
        this.f916M = i;
    }

    /* renamed from: c */
    public void mo1162c(float f) {
        this.f932ba = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1168d(int i, int i2) {
        if (i2 == 0) {
            this.f917N = i;
        } else if (i2 == 1) {
            this.f918O = i;
        }
    }

    /* renamed from: l */
    public void mo1185l(int i) {
        if (i < 0) {
            this.f926W = 0;
        } else {
            this.f926W = i;
        }
    }

    /* renamed from: m */
    public void mo1187m(int i) {
        this.f956na = i;
    }

    /* renamed from: c */
    public C0336a mo1161c(int i) {
        if (i == 0) {
            return mo1180j();
        }
        if (i == 1) {
            return mo1194q();
        }
        return null;
    }

    /* renamed from: d */
    public void mo1167d(float f) {
        this.f962qa[1] = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo1169e(int i) {
        if (i == 0) {
            return this.f917N;
        }
        if (i == 1) {
            return this.f918O;
        }
        return 0;
    }

    /* renamed from: c */
    public void mo1164c(C0353e eVar) {
        int b = eVar.mo1300b((Object) this.f971v);
        int b2 = eVar.mo1300b((Object) this.f972w);
        int b3 = eVar.mo1300b((Object) this.f973x);
        int b4 = eVar.mo1300b((Object) this.f974y);
        int i = b4 - b2;
        if (b3 - b < 0 || i < 0 || b == Integer.MIN_VALUE || b == Integer.MAX_VALUE || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE) {
            b4 = 0;
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        mo1141a(b, b2, b3, b4);
    }

    /* renamed from: b */
    public float mo1151b(int i) {
        if (i == 0) {
            return this.f930aa;
        }
        if (i == 1) {
            return this.f932ba;
        }
        return -1.0f;
    }

    /* renamed from: a */
    public void mo1144a(C0335h hVar) {
        this.f910G = hVar;
    }

    /* renamed from: b */
    public ArrayList<C0330f> mo1152b() {
        return this.f908E;
    }

    /* renamed from: a */
    public void mo1149a(boolean z) {
        this.f959p = z;
    }

    /* renamed from: b */
    public void mo1154b(int i, int i2) {
        this.f923T = i;
        this.f924U = i2;
    }

    /* renamed from: a */
    public void mo1145a(C0335h hVar, float f, int i) {
        C0333c cVar = C0333c.CENTER;
        mo1142a(cVar, hVar, cVar, i, 0);
        this.f969u = f;
    }

    /* renamed from: b */
    public void mo1155b(int i, int i2, int i3, float f) {
        this.f941g = i;
        this.f951l = i2;
        this.f953m = i3;
        this.f955n = f;
        if (f < 1.0f && this.f941g == 0) {
            this.f941g = 2;
        }
    }

    /* renamed from: a */
    public void mo1148a(String str) {
        this.f940fa = str;
    }

    /* renamed from: a */
    public void mo1140a(int i, int i2, int i3, float f) {
        this.f939f = i;
        this.f945i = i2;
        this.f947j = i3;
        this.f949k = f;
        if (f < 1.0f && this.f939f == 0) {
            this.f939f = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1158b(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.f913J = r9
            r8.f914K = r1
        L_0x008d:
            return
        L_0x008e:
            r8.f913J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p042a.p043a.C0335h.mo1158b(java.lang.String):void");
    }

    /* renamed from: a */
    public void mo1137a(float f) {
        this.f930aa = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r5 < r3) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r4 < r2) goto L_0x0020;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1141a(int r2, int r3, int r4, int r5) {
        /*
            r1 = this;
            int r4 = r4 - r2
            int r5 = r5 - r3
            r1.f915L = r2
            r1.f916M = r3
            int r2 = r1.f938ea
            r3 = 0
            r0 = 8
            if (r2 != r0) goto L_0x0012
            r1.f911H = r3
            r1.f912I = r3
            return
        L_0x0012:
            android.support.constraint.a.a.h$a[] r2 = r1.f909F
            r2 = r2[r3]
            android.support.constraint.a.a.h$a r3 = android.support.constraint.p042a.p043a.C0335h.C0336a.FIXED
            if (r2 != r3) goto L_0x001f
            int r2 = r1.f911H
            if (r4 >= r2) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r2 = r4
        L_0x0020:
            android.support.constraint.a.a.h$a[] r3 = r1.f909F
            r4 = 1
            r3 = r3[r4]
            android.support.constraint.a.a.h$a r0 = android.support.constraint.p042a.p043a.C0335h.C0336a.FIXED
            if (r3 != r0) goto L_0x002e
            int r3 = r1.f912I
            if (r5 >= r3) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r3 = r5
        L_0x002f:
            r1.f911H = r2
            r1.f912I = r3
            int r2 = r1.f912I
            int r3 = r1.f927X
            if (r2 >= r3) goto L_0x003b
            r1.f912I = r3
        L_0x003b:
            int r2 = r1.f911H
            int r3 = r1.f926W
            if (r2 >= r3) goto L_0x0043
            r1.f911H = r3
        L_0x0043:
            r1.f950ka = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p042a.p043a.C0335h.mo1141a(int, int, int, int):void");
    }

    /* renamed from: a */
    public void mo1139a(int i, int i2, int i3) {
        if (i3 == 0) {
            mo1138a(i, i2);
        } else if (i3 == 1) {
            mo1171e(i, i2);
        }
        this.f950ka = true;
    }

    /* renamed from: a */
    public void mo1138a(int i, int i2) {
        this.f915L = i;
        this.f911H = i2 - i;
        int i3 = this.f911H;
        int i4 = this.f926W;
        if (i3 < i4) {
            this.f911H = i4;
        }
    }

    /* renamed from: b */
    public void mo1153b(float f) {
        this.f962qa[0] = f;
    }

    /* renamed from: b */
    public void mo1156b(C0336a aVar) {
        this.f909F[1] = aVar;
        if (aVar == C0336a.WRAP_CONTENT) {
            mo1175g(this.f929Z);
        }
    }

    /* renamed from: a */
    public void mo1147a(Object obj) {
        this.f934ca = obj;
    }

    /* renamed from: a */
    public boolean mo1110a() {
        return this.f938ea != 8;
    }

    /* renamed from: a */
    public void mo1142a(C0333c cVar, C0335h hVar, C0333c cVar2, int i, int i2) {
        mo1136a(cVar).mo1117a(hVar.mo1136a(cVar2), i, i2, C0332b.STRONG, 0, true);
    }

    /* renamed from: a */
    public C0330f mo1136a(C0333c cVar) {
        switch (C0334g.f901a[cVar.ordinal()]) {
            case 1:
                return this.f971v;
            case 2:
                return this.f972w;
            case 3:
                return this.f973x;
            case 4:
                return this.f974y;
            case 5:
                return this.f975z;
            case 6:
                return this.f906C;
            case 7:
                return this.f904A;
            case 8:
                return this.f905B;
            case 9:
                return null;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    /* renamed from: a */
    public void mo1143a(C0336a aVar) {
        this.f909F[0] = aVar;
        if (aVar == C0336a.WRAP_CONTENT) {
            mo1191o(this.f928Y);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01b0, code lost:
        if (r1 == -1) goto L_0x01b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0254 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0337  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1109a(android.support.constraint.p042a.C0353e r39) {
        /*
            r38 = this;
            r15 = r38
            r14 = r39
            android.support.constraint.a.a.f r0 = r15.f971v
            android.support.constraint.a.i r21 = r14.mo1291a(r0)
            android.support.constraint.a.a.f r0 = r15.f973x
            android.support.constraint.a.i r10 = r14.mo1291a(r0)
            android.support.constraint.a.a.f r0 = r15.f972w
            android.support.constraint.a.i r6 = r14.mo1291a(r0)
            android.support.constraint.a.a.f r0 = r15.f974y
            android.support.constraint.a.i r4 = r14.mo1291a(r0)
            android.support.constraint.a.a.f r0 = r15.f975z
            android.support.constraint.a.i r3 = r14.mo1291a(r0)
            android.support.constraint.a.a.h r0 = r15.f910G
            r1 = 8
            r2 = 1
            r13 = 0
            if (r0 == 0) goto L_0x00b0
            if (r0 == 0) goto L_0x0036
            android.support.constraint.a.a.h$a[] r0 = r0.f909F
            r0 = r0[r13]
            android.support.constraint.a.a.h$a r5 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r0 != r5) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            android.support.constraint.a.a.h r5 = r15.f910G
            if (r5 == 0) goto L_0x0045
            android.support.constraint.a.a.h$a[] r5 = r5.f909F
            r5 = r5[r2]
            android.support.constraint.a.a.h$a r7 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r5 != r7) goto L_0x0045
            r5 = 1
            goto L_0x0046
        L_0x0045:
            r5 = 0
        L_0x0046:
            boolean r7 = r15.mo1112t(r13)
            if (r7 == 0) goto L_0x0055
            android.support.constraint.a.a.h r7 = r15.f910G
            android.support.constraint.a.a.i r7 = (android.support.constraint.p042a.p043a.C0337i) r7
            r7.mo1218a(r15, r13)
            r7 = 1
            goto L_0x0059
        L_0x0055:
            boolean r7 = r38.mo1207z()
        L_0x0059:
            boolean r8 = r15.mo1112t(r2)
            if (r8 == 0) goto L_0x0068
            android.support.constraint.a.a.h r8 = r15.f910G
            android.support.constraint.a.a.i r8 = (android.support.constraint.p042a.p043a.C0337i) r8
            r8.mo1218a(r15, r2)
            r8 = 1
            goto L_0x006c
        L_0x0068:
            boolean r8 = r38.mo1129A()
        L_0x006c:
            if (r0 == 0) goto L_0x0089
            int r9 = r15.f938ea
            if (r9 == r1) goto L_0x0089
            android.support.constraint.a.a.f r9 = r15.f971v
            android.support.constraint.a.a.f r9 = r9.f877d
            if (r9 != 0) goto L_0x0089
            android.support.constraint.a.a.f r9 = r15.f973x
            android.support.constraint.a.a.f r9 = r9.f877d
            if (r9 != 0) goto L_0x0089
            android.support.constraint.a.a.h r9 = r15.f910G
            android.support.constraint.a.a.f r9 = r9.f973x
            android.support.constraint.a.i r9 = r14.mo1291a(r9)
            r14.mo1302b(r9, r10, r13, r2)
        L_0x0089:
            if (r5 == 0) goto L_0x00aa
            int r9 = r15.f938ea
            if (r9 == r1) goto L_0x00aa
            android.support.constraint.a.a.f r9 = r15.f972w
            android.support.constraint.a.a.f r9 = r9.f877d
            if (r9 != 0) goto L_0x00aa
            android.support.constraint.a.a.f r9 = r15.f974y
            android.support.constraint.a.a.f r9 = r9.f877d
            if (r9 != 0) goto L_0x00aa
            android.support.constraint.a.a.f r9 = r15.f975z
            if (r9 != 0) goto L_0x00aa
            android.support.constraint.a.a.h r9 = r15.f910G
            android.support.constraint.a.a.f r9 = r9.f974y
            android.support.constraint.a.i r9 = r14.mo1291a(r9)
            r14.mo1302b(r9, r4, r13, r2)
        L_0x00aa:
            r12 = r5
            r16 = r7
            r22 = r8
            goto L_0x00b6
        L_0x00b0:
            r0 = 0
            r12 = 0
            r16 = 0
            r22 = 0
        L_0x00b6:
            int r5 = r15.f911H
            int r7 = r15.f926W
            if (r5 >= r7) goto L_0x00bd
            r5 = r7
        L_0x00bd:
            int r7 = r15.f912I
            int r8 = r15.f927X
            if (r7 >= r8) goto L_0x00c4
            r7 = r8
        L_0x00c4:
            android.support.constraint.a.a.h$a[] r8 = r15.f909F
            r8 = r8[r13]
            android.support.constraint.a.a.h$a r9 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r8 == r9) goto L_0x00ce
            r8 = 1
            goto L_0x00cf
        L_0x00ce:
            r8 = 0
        L_0x00cf:
            android.support.constraint.a.a.h$a[] r9 = r15.f909F
            r9 = r9[r2]
            android.support.constraint.a.a.h$a r11 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r9 == r11) goto L_0x00d9
            r9 = 1
            goto L_0x00da
        L_0x00d9:
            r9 = 0
        L_0x00da:
            int r11 = r15.f914K
            r15.f961q = r11
            float r11 = r15.f913J
            r15.f963r = r11
            int r2 = r15.f939f
            int r13 = r15.f941g
            r18 = 0
            r19 = 4
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 <= 0) goto L_0x0195
            int r11 = r15.f938ea
            r1 = 8
            if (r11 == r1) goto L_0x0195
            android.support.constraint.a.a.h$a[] r1 = r15.f909F
            r11 = 0
            r1 = r1[r11]
            android.support.constraint.a.a.h$a r11 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            r23 = r3
            if (r1 != r11) goto L_0x0102
            if (r2 != 0) goto L_0x0102
            r2 = 3
        L_0x0102:
            android.support.constraint.a.a.h$a[] r1 = r15.f909F
            r11 = 1
            r1 = r1[r11]
            android.support.constraint.a.a.h$a r11 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r1 != r11) goto L_0x010e
            if (r13 != 0) goto L_0x010e
            r13 = 3
        L_0x010e:
            android.support.constraint.a.a.h$a[] r1 = r15.f909F
            r11 = 0
            r3 = r1[r11]
            android.support.constraint.a.a.h$a r11 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r3 != r11) goto L_0x0126
            r3 = 1
            r1 = r1[r3]
            if (r1 != r11) goto L_0x0126
            r1 = 3
            if (r2 != r1) goto L_0x0127
            if (r13 != r1) goto L_0x0127
            r15.mo1150a(r0, r12, r8, r9)
            goto L_0x018a
        L_0x0126:
            r1 = 3
        L_0x0127:
            android.support.constraint.a.a.h$a[] r3 = r15.f909F
            r8 = 0
            r9 = r3[r8]
            android.support.constraint.a.a.h$a r11 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r9 != r11) goto L_0x014f
            if (r2 != r1) goto L_0x014f
            r15.f961q = r8
            float r1 = r15.f963r
            int r5 = r15.f912I
            float r5 = (float) r5
            float r1 = r1 * r5
            int r1 = (int) r1
            r8 = 1
            r3 = r3[r8]
            if (r3 == r11) goto L_0x014a
            r28 = r1
            r29 = r7
            r26 = r13
            r25 = 4
            goto L_0x019f
        L_0x014a:
            r28 = r1
            r25 = r2
            goto L_0x018e
        L_0x014f:
            r8 = 1
            android.support.constraint.a.a.h$a[] r1 = r15.f909F
            r1 = r1[r8]
            android.support.constraint.a.a.h$a r3 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r1 != r3) goto L_0x018a
            r1 = 3
            if (r13 != r1) goto L_0x018a
            r15.f961q = r8
            int r1 = r15.f914K
            r3 = -1
            if (r1 != r3) goto L_0x0169
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r15.f963r
            float r1 = r1 / r3
            r15.f963r = r1
        L_0x0169:
            float r1 = r15.f963r
            int r3 = r15.f911H
            float r3 = (float) r3
            float r1 = r1 * r3
            int r1 = (int) r1
            android.support.constraint.a.a.h$a[] r3 = r15.f909F
            r7 = 0
            r3 = r3[r7]
            android.support.constraint.a.a.h$a r7 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r3 == r7) goto L_0x0183
            r29 = r1
            r25 = r2
            r28 = r5
            r26 = 4
            goto L_0x019f
        L_0x0183:
            r29 = r1
            r25 = r2
            r28 = r5
            goto L_0x0190
        L_0x018a:
            r25 = r2
            r28 = r5
        L_0x018e:
            r29 = r7
        L_0x0190:
            r26 = r13
            r27 = 1
            goto L_0x01a1
        L_0x0195:
            r23 = r3
            r25 = r2
            r28 = r5
            r29 = r7
            r26 = r13
        L_0x019f:
            r27 = 0
        L_0x01a1:
            int[] r1 = r15.f943h
            r2 = 0
            r1[r2] = r25
            r2 = 1
            r1[r2] = r26
            if (r27 == 0) goto L_0x01b7
            int r1 = r15.f961q
            if (r1 == 0) goto L_0x01b3
            r2 = -1
            if (r1 != r2) goto L_0x01b8
            goto L_0x01b4
        L_0x01b3:
            r2 = -1
        L_0x01b4:
            r24 = 1
            goto L_0x01ba
        L_0x01b7:
            r2 = -1
        L_0x01b8:
            r24 = 0
        L_0x01ba:
            android.support.constraint.a.a.h$a[] r1 = r15.f909F
            r3 = 0
            r1 = r1[r3]
            android.support.constraint.a.a.h$a r3 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r1 != r3) goto L_0x01ca
            boolean r1 = r15 instanceof android.support.constraint.p042a.p043a.C0337i
            if (r1 == 0) goto L_0x01ca
            r30 = 1
            goto L_0x01cc
        L_0x01ca:
            r30 = 0
        L_0x01cc:
            android.support.constraint.a.a.f r1 = r15.f906C
            boolean r1 = r1.mo1126i()
            r3 = 1
            r31 = r1 ^ 1
            int r1 = r15.f931b
            r13 = 2
            r32 = 0
            if (r1 == r13) goto L_0x0243
            android.support.constraint.a.a.h r1 = r15.f910G
            if (r1 == 0) goto L_0x01e9
            android.support.constraint.a.a.f r1 = r1.f973x
            android.support.constraint.a.i r1 = r14.mo1291a(r1)
            r20 = r1
            goto L_0x01eb
        L_0x01e9:
            r20 = r32
        L_0x01eb:
            android.support.constraint.a.a.h r1 = r15.f910G
            if (r1 == 0) goto L_0x01f8
            android.support.constraint.a.a.f r1 = r1.f971v
            android.support.constraint.a.i r1 = r14.mo1291a(r1)
            r33 = r1
            goto L_0x01fa
        L_0x01f8:
            r33 = r32
        L_0x01fa:
            android.support.constraint.a.a.h$a[] r1 = r15.f909F
            r17 = 0
            r5 = r1[r17]
            android.support.constraint.a.a.f r7 = r15.f971v
            android.support.constraint.a.a.f r8 = r15.f973x
            int r9 = r15.f915L
            int r11 = r15.f926W
            int[] r1 = r15.f967t
            r1 = r1[r17]
            r34 = r12
            r12 = r1
            float r1 = r15.f930aa
            r13 = r1
            int r1 = r15.f945i
            r17 = r1
            int r1 = r15.f947j
            r18 = r1
            float r1 = r15.f949k
            r19 = r1
            r35 = r0
            r0 = r38
            r1 = r39
            r3 = -1
            r2 = r35
            r36 = r23
            r3 = r33
            r23 = r4
            r4 = r20
            r37 = r6
            r6 = r30
            r30 = r10
            r10 = r28
            r14 = r24
            r15 = r16
            r16 = r25
            r20 = r31
            r0.m1085a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x024d
        L_0x0243:
            r37 = r6
            r30 = r10
            r34 = r12
            r36 = r23
            r23 = r4
        L_0x024d:
            r15 = r38
            int r0 = r15.f933c
            r1 = 2
            if (r0 != r1) goto L_0x0255
            return
        L_0x0255:
            android.support.constraint.a.a.h$a[] r0 = r15.f909F
            r14 = 1
            r0 = r0[r14]
            android.support.constraint.a.a.h$a r1 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r0 != r1) goto L_0x0264
            boolean r0 = r15 instanceof android.support.constraint.p042a.p043a.C0337i
            if (r0 == 0) goto L_0x0264
            r6 = 1
            goto L_0x0265
        L_0x0264:
            r6 = 0
        L_0x0265:
            if (r27 == 0) goto L_0x0271
            int r0 = r15.f961q
            if (r0 == r14) goto L_0x026e
            r1 = -1
            if (r0 != r1) goto L_0x0271
        L_0x026e:
            r16 = 1
            goto L_0x0273
        L_0x0271:
            r16 = 0
        L_0x0273:
            int r0 = r15.f925V
            if (r0 <= 0) goto L_0x02ac
            android.support.constraint.a.a.f r0 = r15.f975z
            android.support.constraint.a.a.p r0 = r0.mo1121d()
            int r0 = r0.f1042b
            if (r0 != r14) goto L_0x028d
            android.support.constraint.a.a.f r0 = r15.f975z
            android.support.constraint.a.a.p r0 = r0.mo1121d()
            r10 = r39
            r0.mo1239a(r10)
            goto L_0x02ae
        L_0x028d:
            r10 = r39
            int r0 = r38.mo1160c()
            r1 = 6
            r2 = r36
            r4 = r37
            r10.mo1288a(r2, r4, r0, r1)
            android.support.constraint.a.a.f r0 = r15.f975z
            android.support.constraint.a.a.f r0 = r0.f877d
            if (r0 == 0) goto L_0x02b0
            android.support.constraint.a.i r0 = r10.mo1291a(r0)
            r3 = 0
            r10.mo1288a(r2, r0, r3, r1)
            r20 = 0
            goto L_0x02b2
        L_0x02ac:
            r10 = r39
        L_0x02ae:
            r4 = r37
        L_0x02b0:
            r20 = r31
        L_0x02b2:
            android.support.constraint.a.a.h r0 = r15.f910G
            if (r0 == 0) goto L_0x02bf
            android.support.constraint.a.a.f r0 = r0.f974y
            android.support.constraint.a.i r0 = r10.mo1291a(r0)
            r24 = r0
            goto L_0x02c1
        L_0x02bf:
            r24 = r32
        L_0x02c1:
            android.support.constraint.a.a.h r0 = r15.f910G
            if (r0 == 0) goto L_0x02cd
            android.support.constraint.a.a.f r0 = r0.f972w
            android.support.constraint.a.i r0 = r10.mo1291a(r0)
            r3 = r0
            goto L_0x02cf
        L_0x02cd:
            r3 = r32
        L_0x02cf:
            android.support.constraint.a.a.h$a[] r0 = r15.f909F
            r5 = r0[r14]
            android.support.constraint.a.a.f r7 = r15.f972w
            android.support.constraint.a.a.f r8 = r15.f974y
            int r9 = r15.f916M
            int r11 = r15.f927X
            int[] r0 = r15.f967t
            r12 = r0[r14]
            float r13 = r15.f932ba
            int r0 = r15.f951l
            r17 = r0
            int r0 = r15.f953m
            r18 = r0
            float r0 = r15.f955n
            r19 = r0
            r0 = r38
            r1 = r39
            r2 = r34
            r25 = r4
            r4 = r24
            r10 = r29
            r14 = r16
            r15 = r22
            r16 = r26
            r0.m1085a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r27 == 0) goto L_0x032d
            r6 = 6
            r7 = r38
            int r0 = r7.f961q
            r1 = 1
            if (r0 != r1) goto L_0x031c
            float r5 = r7.f963r
            r0 = r39
            r1 = r23
            r2 = r25
            r3 = r30
            r4 = r21
            r0.mo1298a(r1, r2, r3, r4, r5, r6)
            goto L_0x032f
        L_0x031c:
            float r5 = r7.f963r
            r6 = 6
            r0 = r39
            r1 = r30
            r2 = r21
            r3 = r23
            r4 = r25
            r0.mo1298a(r1, r2, r3, r4, r5, r6)
            goto L_0x032f
        L_0x032d:
            r7 = r38
        L_0x032f:
            android.support.constraint.a.a.f r0 = r7.f906C
            boolean r0 = r0.mo1126i()
            if (r0 == 0) goto L_0x0357
            android.support.constraint.a.a.f r0 = r7.f906C
            android.support.constraint.a.a.f r0 = r0.mo1124g()
            android.support.constraint.a.a.h r0 = r0.mo1120c()
            float r1 = r7.f969u
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            android.support.constraint.a.a.f r2 = r7.f906C
            int r2 = r2.mo1119b()
            r3 = r39
            r3.mo1292a(r7, r0, r1, r2)
        L_0x0357:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p042a.p043a.C0335h.mo1109a(android.support.constraint.a.e):void");
    }

    /* renamed from: a */
    public void mo1150a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f961q == -1) {
            if (z3 && !z4) {
                this.f961q = 0;
            } else if (!z3 && z4) {
                this.f961q = 1;
                if (this.f914K == -1) {
                    this.f963r = 1.0f / this.f963r;
                }
            }
        }
        if (this.f961q == 0 && (!this.f972w.mo1126i() || !this.f974y.mo1126i())) {
            this.f961q = 1;
        } else if (this.f961q == 1 && (!this.f971v.mo1126i() || !this.f973x.mo1126i())) {
            this.f961q = 0;
        }
        if (this.f961q == -1 && (!this.f972w.mo1126i() || !this.f974y.mo1126i() || !this.f971v.mo1126i() || !this.f973x.mo1126i())) {
            if (this.f972w.mo1126i() && this.f974y.mo1126i()) {
                this.f961q = 0;
            } else if (this.f971v.mo1126i() && this.f973x.mo1126i()) {
                this.f963r = 1.0f / this.f963r;
                this.f961q = 1;
            }
        }
        if (this.f961q == -1) {
            if (z && !z2) {
                this.f961q = 0;
            } else if (!z && z2) {
                this.f963r = 1.0f / this.f963r;
                this.f961q = 1;
            }
        }
        if (this.f961q == -1) {
            if (this.f945i > 0 && this.f951l == 0) {
                this.f961q = 0;
            } else if (this.f945i == 0 && this.f951l > 0) {
                this.f963r = 1.0f / this.f963r;
                this.f961q = 1;
            }
        }
        if (this.f961q == -1 && z && z2) {
            this.f963r = 1.0f / this.f963r;
            this.f961q = 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1085a(android.support.constraint.p042a.C0353e r26, boolean r27, android.support.constraint.p042a.C0358i r28, android.support.constraint.p042a.C0358i r29, android.support.constraint.p042a.p043a.C0335h.C0336a r30, boolean r31, android.support.constraint.p042a.p043a.C0330f r32, android.support.constraint.p042a.p043a.C0330f r33, int r34, int r35, int r36, int r37, float r38, boolean r39, boolean r40, int r41, int r42, int r43, float r44, boolean r45) {
        /*
            r25 = this;
            r0 = r25
            r10 = r26
            r11 = r28
            r12 = r29
            r13 = r32
            r14 = r33
            r1 = r36
            r2 = r37
            android.support.constraint.a.i r15 = r10.mo1291a(r13)
            android.support.constraint.a.i r9 = r10.mo1291a(r14)
            android.support.constraint.a.a.f r3 = r32.mo1124g()
            android.support.constraint.a.i r8 = r10.mo1291a(r3)
            android.support.constraint.a.a.f r3 = r33.mo1124g()
            android.support.constraint.a.i r7 = r10.mo1291a(r3)
            boolean r3 = r10.f1070i
            r6 = 1
            r4 = 6
            r5 = 0
            if (r3 == 0) goto L_0x0066
            android.support.constraint.a.a.p r3 = r32.mo1121d()
            int r3 = r3.f1042b
            if (r3 != r6) goto L_0x0066
            android.support.constraint.a.a.p r3 = r33.mo1121d()
            int r3 = r3.f1042b
            if (r3 != r6) goto L_0x0066
            android.support.constraint.a.f r1 = android.support.constraint.p042a.C0353e.m1284e()
            if (r1 == 0) goto L_0x0050
            android.support.constraint.a.f r1 = android.support.constraint.p042a.C0353e.m1284e()
            long r2 = r1.f1098r
            r6 = 1
            long r2 = r2 + r6
            r1.f1098r = r2
        L_0x0050:
            android.support.constraint.a.a.p r1 = r32.mo1121d()
            r1.mo1239a(r10)
            android.support.constraint.a.a.p r1 = r33.mo1121d()
            r1.mo1239a(r10)
            if (r40 != 0) goto L_0x0065
            if (r27 == 0) goto L_0x0065
            r10.mo1302b(r12, r9, r5, r4)
        L_0x0065:
            return
        L_0x0066:
            android.support.constraint.a.f r3 = android.support.constraint.p042a.C0353e.m1284e()
            if (r3 == 0) goto L_0x0078
            android.support.constraint.a.f r3 = android.support.constraint.p042a.C0353e.m1284e()
            long r4 = r3.f1106z
            r16 = 1
            long r4 = r4 + r16
            r3.f1106z = r4
        L_0x0078:
            boolean r16 = r32.mo1126i()
            boolean r17 = r33.mo1126i()
            android.support.constraint.a.a.f r3 = r0.f906C
            boolean r20 = r3.mo1126i()
            if (r16 == 0) goto L_0x008a
            r3 = 1
            goto L_0x008b
        L_0x008a:
            r3 = 0
        L_0x008b:
            if (r17 == 0) goto L_0x008f
            int r3 = r3 + 1
        L_0x008f:
            if (r20 == 0) goto L_0x0093
            int r3 = r3 + 1
        L_0x0093:
            r5 = r3
            if (r39 == 0) goto L_0x0098
            r3 = 3
            goto L_0x009a
        L_0x0098:
            r3 = r41
        L_0x009a:
            int[] r21 = android.support.constraint.p042a.p043a.C0334g.f902b
            int r22 = r30.ordinal()
            r4 = r21[r22]
            r14 = 2
            r13 = 4
            if (r4 == r6) goto L_0x00ad
            if (r4 == r14) goto L_0x00ad
            r14 = 3
            if (r4 == r14) goto L_0x00ad
            if (r4 == r13) goto L_0x00af
        L_0x00ad:
            r4 = 0
            goto L_0x00b3
        L_0x00af:
            if (r3 != r13) goto L_0x00b2
            goto L_0x00ad
        L_0x00b2:
            r4 = 1
        L_0x00b3:
            int r14 = r0.f938ea
            r13 = 8
            if (r14 != r13) goto L_0x00bc
            r4 = 0
            r13 = 0
            goto L_0x00bf
        L_0x00bc:
            r13 = r4
            r4 = r35
        L_0x00bf:
            if (r45 == 0) goto L_0x00da
            if (r16 != 0) goto L_0x00cd
            if (r17 != 0) goto L_0x00cd
            if (r20 != 0) goto L_0x00cd
            r14 = r34
            r10.mo1296a(r15, r14)
            goto L_0x00da
        L_0x00cd:
            if (r16 == 0) goto L_0x00da
            if (r17 != 0) goto L_0x00da
            int r14 = r32.mo1119b()
            r6 = 6
            r10.mo1288a(r15, r8, r14, r6)
            goto L_0x00db
        L_0x00da:
            r6 = 6
        L_0x00db:
            if (r13 != 0) goto L_0x0109
            if (r31 == 0) goto L_0x00f6
            r6 = 0
            r14 = 3
            r10.mo1288a(r9, r15, r6, r14)
            if (r1 <= 0) goto L_0x00eb
            r4 = 6
            r10.mo1302b(r9, r15, r1, r4)
            goto L_0x00ec
        L_0x00eb:
            r4 = 6
        L_0x00ec:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r6) goto L_0x00f4
            r10.mo1305c(r9, r15, r2, r4)
        L_0x00f4:
            r6 = 6
            goto L_0x00fa
        L_0x00f6:
            r14 = 3
            r10.mo1288a(r9, r15, r4, r6)
        L_0x00fa:
            r14 = r43
            r34 = r3
            r0 = r5
            r24 = r7
            r23 = r8
            r1 = 0
            r2 = 2
            r3 = r42
            goto L_0x01f4
        L_0x0109:
            r14 = 3
            r2 = -2
            r14 = r42
            if (r14 != r2) goto L_0x0113
            r14 = r43
            r6 = r4
            goto L_0x0116
        L_0x0113:
            r6 = r14
            r14 = r43
        L_0x0116:
            if (r14 != r2) goto L_0x0119
            r14 = r4
        L_0x0119:
            if (r6 <= 0) goto L_0x0124
            r2 = 6
            r10.mo1302b(r9, r15, r6, r2)
            int r4 = java.lang.Math.max(r4, r6)
            goto L_0x0125
        L_0x0124:
            r2 = 6
        L_0x0125:
            if (r14 <= 0) goto L_0x012e
            r10.mo1305c(r9, r15, r14, r2)
            int r4 = java.lang.Math.min(r4, r14)
        L_0x012e:
            r2 = 1
            if (r3 != r2) goto L_0x0159
            if (r27 == 0) goto L_0x0145
            r2 = 6
            r10.mo1288a(r9, r15, r4, r2)
            r34 = r3
            r0 = r5
            r24 = r7
            r23 = r8
            r35 = r13
            r1 = 0
            r8 = r4
            r13 = r6
            goto L_0x01d7
        L_0x0145:
            r2 = 6
            if (r40 == 0) goto L_0x0150
            r35 = r13
            r13 = 4
            r10.mo1288a(r9, r15, r4, r13)
            goto L_0x01cd
        L_0x0150:
            r35 = r13
            r2 = 1
            r13 = 4
            r10.mo1288a(r9, r15, r4, r2)
            goto L_0x01cd
        L_0x0159:
            r35 = r13
            r2 = 2
            r13 = 4
            if (r3 != r2) goto L_0x01cd
            android.support.constraint.a.a.f$c r2 = r32.mo1125h()
            android.support.constraint.a.a.f$c r13 = android.support.constraint.p042a.p043a.C0330f.C0333c.TOP
            if (r2 == r13) goto L_0x018b
            android.support.constraint.a.a.f$c r2 = r32.mo1125h()
            android.support.constraint.a.a.f$c r13 = android.support.constraint.p042a.p043a.C0330f.C0333c.BOTTOM
            if (r2 != r13) goto L_0x0170
            goto L_0x018b
        L_0x0170:
            android.support.constraint.a.a.h r2 = r0.f910G
            android.support.constraint.a.a.f$c r13 = android.support.constraint.p042a.p043a.C0330f.C0333c.LEFT
            android.support.constraint.a.a.f r2 = r2.mo1136a(r13)
            android.support.constraint.a.i r2 = r10.mo1291a(r2)
            android.support.constraint.a.a.h r13 = r0.f910G
            r31 = r2
            android.support.constraint.a.a.f$c r2 = android.support.constraint.p042a.p043a.C0330f.C0333c.RIGHT
            android.support.constraint.a.a.f r2 = r13.mo1136a(r2)
            android.support.constraint.a.i r2 = r10.mo1291a(r2)
            goto L_0x01a5
        L_0x018b:
            android.support.constraint.a.a.h r2 = r0.f910G
            android.support.constraint.a.a.f$c r13 = android.support.constraint.p042a.p043a.C0330f.C0333c.TOP
            android.support.constraint.a.a.f r2 = r2.mo1136a(r13)
            android.support.constraint.a.i r2 = r10.mo1291a(r2)
            android.support.constraint.a.a.h r13 = r0.f910G
            r31 = r2
            android.support.constraint.a.a.f$c r2 = android.support.constraint.p042a.p043a.C0330f.C0333c.BOTTOM
            android.support.constraint.a.a.f r2 = r13.mo1136a(r2)
            android.support.constraint.a.i r2 = r10.mo1291a(r2)
        L_0x01a5:
            r22 = r31
            r13 = r2
            android.support.constraint.a.b r2 = r26.mo1301b()
            r31 = r2
            r18 = 1
            r21 = 6
            r0 = r3
            r3 = r9
            r34 = r0
            r23 = r8
            r0 = 6
            r8 = r4
            r4 = r15
            r0 = r5
            r1 = 0
            r5 = r13
            r13 = r6
            r6 = r22
            r24 = r7
            r7 = r44
            r2.mo1268a(r3, r4, r5, r6, r7)
            r10.mo1293a(r2)
            r5 = 0
            goto L_0x01d9
        L_0x01cd:
            r34 = r3
            r0 = r5
            r13 = r6
            r24 = r7
            r23 = r8
            r1 = 0
            r8 = r4
        L_0x01d7:
            r5 = r35
        L_0x01d9:
            if (r5 == 0) goto L_0x01f1
            r2 = 2
            if (r0 == r2) goto L_0x01f2
            if (r39 != 0) goto L_0x01f2
            int r3 = java.lang.Math.max(r13, r8)
            if (r14 <= 0) goto L_0x01ea
            int r3 = java.lang.Math.min(r14, r3)
        L_0x01ea:
            r4 = 6
            r10.mo1288a(r9, r15, r3, r4)
            r3 = r13
            r13 = 0
            goto L_0x01f4
        L_0x01f1:
            r2 = 2
        L_0x01f2:
            r3 = r13
            r13 = r5
        L_0x01f4:
            if (r45 == 0) goto L_0x0332
            if (r40 == 0) goto L_0x01fa
            goto L_0x0332
        L_0x01fa:
            r0 = 5
            if (r16 != 0) goto L_0x0208
            if (r17 != 0) goto L_0x0208
            if (r20 != 0) goto L_0x0208
            if (r27 == 0) goto L_0x0327
            r10.mo1302b(r12, r9, r1, r0)
            goto L_0x0327
        L_0x0208:
            if (r16 == 0) goto L_0x0213
            if (r17 != 0) goto L_0x0213
            if (r27 == 0) goto L_0x0327
            r10.mo1302b(r12, r9, r1, r0)
            goto L_0x0327
        L_0x0213:
            if (r16 != 0) goto L_0x0229
            if (r17 == 0) goto L_0x0229
            int r2 = r33.mo1119b()
            int r2 = -r2
            r8 = r24
            r3 = 6
            r10.mo1288a(r9, r8, r2, r3)
            if (r27 == 0) goto L_0x0327
            r10.mo1302b(r15, r11, r1, r0)
            goto L_0x0327
        L_0x0229:
            r8 = r24
            if (r16 == 0) goto L_0x0327
            if (r17 == 0) goto L_0x0327
            if (r13 == 0) goto L_0x029f
            if (r27 == 0) goto L_0x023b
            r7 = 0
            if (r36 != 0) goto L_0x023c
            r1 = 6
            r10.mo1302b(r9, r15, r7, r1)
            goto L_0x023c
        L_0x023b:
            r7 = 0
        L_0x023c:
            if (r34 != 0) goto L_0x0266
            if (r14 > 0) goto L_0x0246
            if (r3 <= 0) goto L_0x0243
            goto L_0x0246
        L_0x0243:
            r1 = 6
            r6 = 0
            goto L_0x0248
        L_0x0246:
            r1 = 4
            r6 = 1
        L_0x0248:
            int r2 = r32.mo1119b()
            r5 = r23
            r10.mo1288a(r15, r5, r2, r1)
            int r2 = r33.mo1119b()
            int r2 = -r2
            r10.mo1288a(r9, r8, r2, r1)
            if (r14 > 0) goto L_0x0260
            if (r3 <= 0) goto L_0x025e
            goto L_0x0260
        L_0x025e:
            r1 = 0
            goto L_0x0261
        L_0x0260:
            r1 = 1
        L_0x0261:
            r16 = r6
            r6 = 1
            r14 = 5
            goto L_0x0271
        L_0x0266:
            r4 = r34
            r5 = r23
            r6 = 1
            if (r4 != r6) goto L_0x0274
            r1 = 1
            r14 = 6
            r16 = 1
        L_0x0271:
            r4 = r25
            goto L_0x02a9
        L_0x0274:
            r1 = 3
            if (r4 != r1) goto L_0x029b
            if (r39 != 0) goto L_0x0284
            r4 = r25
            int r1 = r4.f961q
            r2 = -1
            if (r1 == r2) goto L_0x0286
            if (r14 > 0) goto L_0x0286
            r1 = 6
            goto L_0x0287
        L_0x0284:
            r4 = r25
        L_0x0286:
            r1 = 4
        L_0x0287:
            int r2 = r32.mo1119b()
            r10.mo1288a(r15, r5, r2, r1)
            int r2 = r33.mo1119b()
            int r2 = -r2
            r10.mo1288a(r9, r8, r2, r1)
            r1 = 1
            r14 = 5
            r16 = 1
            goto L_0x02a9
        L_0x029b:
            r4 = r25
            r1 = 0
            goto L_0x02a6
        L_0x029f:
            r5 = r23
            r6 = 1
            r7 = 0
            r4 = r25
            r1 = 1
        L_0x02a6:
            r14 = 5
            r16 = 0
        L_0x02a9:
            if (r1 == 0) goto L_0x02ee
            int r17 = r32.mo1119b()
            int r18 = r33.mo1119b()
            r1 = r26
            r2 = r15
            r3 = r5
            r4 = r17
            r17 = r5
            r5 = r38
            r19 = 1
            r6 = r8
            r0 = 0
            r7 = r9
            r12 = r8
            r0 = r17
            r8 = r18
            r11 = r9
            r9 = r14
            r1.mo1297a(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r32
            android.support.constraint.a.a.f r2 = r1.f877d
            android.support.constraint.a.a.h r2 = r2.f875b
            boolean r2 = r2 instanceof android.support.constraint.p042a.p043a.C0326b
            r3 = r33
            android.support.constraint.a.a.f r4 = r3.f877d
            android.support.constraint.a.a.h r4 = r4.f875b
            boolean r4 = r4 instanceof android.support.constraint.p042a.p043a.C0326b
            if (r2 == 0) goto L_0x02e6
            if (r4 != 0) goto L_0x02e6
            r19 = r27
            r2 = 1
            r4 = 5
            r5 = 6
            goto L_0x02fb
        L_0x02e6:
            if (r2 != 0) goto L_0x02f5
            if (r4 == 0) goto L_0x02f5
            r2 = r27
            r4 = 6
            goto L_0x02fa
        L_0x02ee:
            r1 = r32
            r3 = r33
            r0 = r5
            r12 = r8
            r11 = r9
        L_0x02f5:
            r2 = r27
            r19 = r2
            r4 = 5
        L_0x02fa:
            r5 = 5
        L_0x02fb:
            if (r16 == 0) goto L_0x02ff
            r4 = 6
            r5 = 6
        L_0x02ff:
            if (r13 != 0) goto L_0x0303
            if (r19 != 0) goto L_0x0305
        L_0x0303:
            if (r16 == 0) goto L_0x030c
        L_0x0305:
            int r1 = r32.mo1119b()
            r10.mo1302b(r15, r0, r1, r4)
        L_0x030c:
            if (r13 != 0) goto L_0x0310
            if (r2 != 0) goto L_0x0312
        L_0x0310:
            if (r16 == 0) goto L_0x031a
        L_0x0312:
            int r0 = r33.mo1119b()
            int r0 = -r0
            r10.mo1305c(r11, r12, r0, r5)
        L_0x031a:
            if (r27 == 0) goto L_0x0325
            r0 = r28
            r1 = r11
            r2 = 6
            r3 = 0
            r10.mo1302b(r15, r0, r3, r2)
            goto L_0x032a
        L_0x0325:
            r1 = r11
            goto L_0x0328
        L_0x0327:
            r1 = r9
        L_0x0328:
            r2 = 6
            r3 = 0
        L_0x032a:
            if (r27 == 0) goto L_0x0331
            r4 = r29
            r10.mo1302b(r4, r1, r3, r2)
        L_0x0331:
            return
        L_0x0332:
            r5 = r0
            r1 = r9
            r0 = r11
            r4 = r12
            r2 = 6
            r3 = 0
            r6 = 2
            if (r5 >= r6) goto L_0x0343
            if (r27 == 0) goto L_0x0343
            r10.mo1302b(r15, r0, r3, r2)
            r10.mo1302b(r4, r1, r3, r2)
        L_0x0343:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p042a.p043a.C0335h.m1085a(android.support.constraint.a.e, boolean, android.support.constraint.a.i, android.support.constraint.a.i, android.support.constraint.a.a.h$a, boolean, android.support.constraint.a.a.f, android.support.constraint.a.a.f, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }
}
