package android.support.constraint.p042a.p043a;

import android.support.constraint.p042a.C0353e;
import android.support.constraint.p042a.p043a.C0330f.C0333c;
import android.support.constraint.p042a.p043a.C0335h.C0336a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: android.support.constraint.a.a.i */
/* compiled from: ConstraintWidgetContainer */
public class C0337i extends C0349t {

    /* renamed from: Aa */
    int f981Aa;

    /* renamed from: Ba */
    int f982Ba;

    /* renamed from: Ca */
    int f983Ca;

    /* renamed from: Da */
    int f984Da = 0;

    /* renamed from: Ea */
    int f985Ea = 0;

    /* renamed from: Fa */
    C0328d[] f986Fa = new C0328d[4];

    /* renamed from: Ga */
    C0328d[] f987Ga = new C0328d[4];

    /* renamed from: Ha */
    public List<C0338j> f988Ha = new ArrayList();

    /* renamed from: Ia */
    public boolean f989Ia = false;

    /* renamed from: Ja */
    public boolean f990Ja = false;

    /* renamed from: Ka */
    public boolean f991Ka = false;

    /* renamed from: La */
    public int f992La = 0;

    /* renamed from: Ma */
    public int f993Ma = 0;

    /* renamed from: Na */
    private int f994Na = 7;

    /* renamed from: Oa */
    public boolean f995Oa = false;

    /* renamed from: Pa */
    private boolean f996Pa = false;

    /* renamed from: Qa */
    private boolean f997Qa = false;

    /* renamed from: Ra */
    int f998Ra = 0;

    /* renamed from: wa */
    private boolean f999wa = false;

    /* renamed from: xa */
    protected C0353e f1000xa = new C0353e();

    /* renamed from: ya */
    private C0347s f1001ya;

    /* renamed from: za */
    int f1002za;

    /* renamed from: V */
    private void m1170V() {
        this.f984Da = 0;
        this.f985Ea = 0;
    }

    /* renamed from: e */
    private void m1172e(C0335h hVar) {
        int i = this.f985Ea + 1;
        C0328d[] dVarArr = this.f986Fa;
        if (i >= dVarArr.length) {
            this.f986Fa = (C0328d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f986Fa[this.f985Ea] = new C0328d(hVar, 1, mo1212P());
        this.f985Ea++;
    }

    /* renamed from: D */
    public void mo1132D() {
        this.f1000xa.mo1308g();
        this.f1002za = 0;
        this.f982Ba = 0;
        this.f981Aa = 0;
        this.f983Ca = 0;
        this.f988Ha.clear();
        this.f995Oa = false;
        super.mo1132D();
    }

    /* JADX WARNING: type inference failed for: r8v15, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r8v48 */
    /* JADX WARNING: type inference failed for: r8v49 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v15, types: [boolean]
      assigns: []
      uses: [?[int, short, byte, char], boolean]
      mth insns count: 342
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01da  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1208K() {
        /*
            r21 = this;
            r1 = r21
            int r2 = r1.f915L
            int r3 = r1.f916M
            int r0 = r21.mo1198s()
            r4 = 0
            int r5 = java.lang.Math.max(r4, r0)
            int r0 = r21.mo1178i()
            int r6 = java.lang.Math.max(r4, r0)
            r1.f996Pa = r4
            r1.f997Qa = r4
            android.support.constraint.a.a.h r0 = r1.f910G
            if (r0 == 0) goto L_0x0046
            android.support.constraint.a.a.s r0 = r1.f1001ya
            if (r0 != 0) goto L_0x002a
            android.support.constraint.a.a.s r0 = new android.support.constraint.a.a.s
            r0.<init>(r1)
            r1.f1001ya = r0
        L_0x002a:
            android.support.constraint.a.a.s r0 = r1.f1001ya
            r0.mo1255b(r1)
            int r0 = r1.f1002za
            r1.mo1197r(r0)
            int r0 = r1.f981Aa
            r1.mo1199s(r0)
            r21.mo1133E()
            android.support.constraint.a.e r0 = r1.f1000xa
            android.support.constraint.a.c r0 = r0.mo1306d()
            r1.mo1146a(r0)
            goto L_0x004a
        L_0x0046:
            r1.f915L = r4
            r1.f916M = r4
        L_0x004a:
            int r0 = r1.f994Na
            r7 = 32
            r8 = 8
            r9 = 1
            if (r0 == 0) goto L_0x006a
            boolean r0 = r1.mo1112t(r8)
            if (r0 != 0) goto L_0x005c
            r21.mo1215S()
        L_0x005c:
            boolean r0 = r1.mo1112t(r7)
            if (r0 != 0) goto L_0x0065
            r21.mo1214R()
        L_0x0065:
            android.support.constraint.a.e r0 = r1.f1000xa
            r0.f1070i = r9
            goto L_0x006e
        L_0x006a:
            android.support.constraint.a.e r0 = r1.f1000xa
            r0.f1070i = r4
        L_0x006e:
            android.support.constraint.a.a.h$a[] r0 = r1.f909F
            r10 = r0[r9]
            r11 = r0[r4]
            r21.m1170V()
            java.util.List<android.support.constraint.a.a.j> r0 = r1.f988Ha
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0090
            java.util.List<android.support.constraint.a.a.j> r0 = r1.f988Ha
            r0.clear()
            java.util.List<android.support.constraint.a.a.j> r0 = r1.f988Ha
            android.support.constraint.a.a.j r12 = new android.support.constraint.a.a.j
            java.util.ArrayList<android.support.constraint.a.a.h> r13 = r1.f1053va
            r12.<init>(r13)
            r0.add(r4, r12)
        L_0x0090:
            java.util.List<android.support.constraint.a.a.j> r0 = r1.f988Ha
            int r12 = r0.size()
            java.util.ArrayList<android.support.constraint.a.a.h> r13 = r1.f1053va
            android.support.constraint.a.a.h$a r0 = r21.mo1180j()
            android.support.constraint.a.a.h$a r14 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r0 == r14) goto L_0x00ab
            android.support.constraint.a.a.h$a r0 = r21.mo1194q()
            android.support.constraint.a.a.h$a r14 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r0 != r14) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r14 = 0
            goto L_0x00ac
        L_0x00ab:
            r14 = 1
        L_0x00ac:
            r0 = 0
            r15 = 0
        L_0x00ae:
            if (r15 >= r12) goto L_0x02f4
            boolean r8 = r1.f995Oa
            if (r8 != 0) goto L_0x02f4
            java.util.List<android.support.constraint.a.a.j> r8 = r1.f988Ha
            java.lang.Object r8 = r8.get(r15)
            android.support.constraint.a.a.j r8 = (android.support.constraint.p042a.p043a.C0338j) r8
            boolean r8 = r8.f1006d
            if (r8 == 0) goto L_0x00c4
            r19 = r12
            goto L_0x02e8
        L_0x00c4:
            boolean r8 = r1.mo1112t(r7)
            if (r8 == 0) goto L_0x00f9
            android.support.constraint.a.a.h$a r8 = r21.mo1180j()
            android.support.constraint.a.a.h$a r7 = android.support.constraint.p042a.p043a.C0335h.C0336a.FIXED
            if (r8 != r7) goto L_0x00eb
            android.support.constraint.a.a.h$a r7 = r21.mo1194q()
            android.support.constraint.a.a.h$a r8 = android.support.constraint.p042a.p043a.C0335h.C0336a.FIXED
            if (r7 != r8) goto L_0x00eb
            java.util.List<android.support.constraint.a.a.j> r7 = r1.f988Ha
            java.lang.Object r7 = r7.get(r15)
            android.support.constraint.a.a.j r7 = (android.support.constraint.p042a.p043a.C0338j) r7
            java.util.List r7 = r7.mo1224a()
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r1.f1053va = r7
            goto L_0x00f9
        L_0x00eb:
            java.util.List<android.support.constraint.a.a.j> r7 = r1.f988Ha
            java.lang.Object r7 = r7.get(r15)
            android.support.constraint.a.a.j r7 = (android.support.constraint.p042a.p043a.C0338j) r7
            java.util.List<android.support.constraint.a.a.h> r7 = r7.f1003a
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r1.f1053va = r7
        L_0x00f9:
            r21.m1170V()
            java.util.ArrayList<android.support.constraint.a.a.h> r7 = r1.f1053va
            int r7 = r7.size()
            r8 = 0
        L_0x0103:
            if (r8 >= r7) goto L_0x011b
            java.util.ArrayList<android.support.constraint.a.a.h> r4 = r1.f1053va
            java.lang.Object r4 = r4.get(r8)
            android.support.constraint.a.a.h r4 = (android.support.constraint.p042a.p043a.C0335h) r4
            boolean r9 = r4 instanceof android.support.constraint.p042a.p043a.C0349t
            if (r9 == 0) goto L_0x0116
            android.support.constraint.a.a.t r4 = (android.support.constraint.p042a.p043a.C0349t) r4
            r4.mo1208K()
        L_0x0116:
            int r8 = r8 + 1
            r4 = 0
            r9 = 1
            goto L_0x0103
        L_0x011b:
            r9 = r0
            r0 = 0
            r4 = 1
        L_0x011e:
            if (r4 == 0) goto L_0x02d7
            r17 = r4
            r8 = 1
            int r4 = r0 + 1
            android.support.constraint.a.e r0 = r1.f1000xa     // Catch:{ Exception -> 0x0162 }
            r0.mo1308g()     // Catch:{ Exception -> 0x0162 }
            r21.m1170V()     // Catch:{ Exception -> 0x0162 }
            android.support.constraint.a.e r0 = r1.f1000xa     // Catch:{ Exception -> 0x0162 }
            r1.mo1157b(r0)     // Catch:{ Exception -> 0x0162 }
            r0 = 0
        L_0x0133:
            if (r0 >= r7) goto L_0x0149
            java.util.ArrayList<android.support.constraint.a.a.h> r8 = r1.f1053va     // Catch:{ Exception -> 0x0162 }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ Exception -> 0x0162 }
            android.support.constraint.a.a.h r8 = (android.support.constraint.p042a.p043a.C0335h) r8     // Catch:{ Exception -> 0x0162 }
            r18 = r9
            android.support.constraint.a.e r9 = r1.f1000xa     // Catch:{ Exception -> 0x0160 }
            r8.mo1157b(r9)     // Catch:{ Exception -> 0x0160 }
            int r0 = r0 + 1
            r9 = r18
            goto L_0x0133
        L_0x0149:
            r18 = r9
            android.support.constraint.a.e r0 = r1.f1000xa     // Catch:{ Exception -> 0x0160 }
            boolean r8 = r1.mo1221d(r0)     // Catch:{ Exception -> 0x0160 }
            if (r8 == 0) goto L_0x015b
            android.support.constraint.a.e r0 = r1.f1000xa     // Catch:{ Exception -> 0x0159 }
            r0.mo1307f()     // Catch:{ Exception -> 0x0159 }
            goto L_0x015b
        L_0x0159:
            r0 = move-exception
            goto L_0x0167
        L_0x015b:
            r17 = r8
            r19 = r12
            goto L_0x0184
        L_0x0160:
            r0 = move-exception
            goto L_0x0165
        L_0x0162:
            r0 = move-exception
            r18 = r9
        L_0x0165:
            r8 = r17
        L_0x0167:
            r0.printStackTrace()
            java.io.PrintStream r9 = java.lang.System.out
            r17 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r19 = r12
            java.lang.String r12 = "EXCEPTION : "
            r8.append(r12)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r9.println(r0)
        L_0x0184:
            if (r17 == 0) goto L_0x018f
            android.support.constraint.a.e r8 = r1.f1000xa
            boolean[] r9 = android.support.constraint.p042a.p043a.C0342n.f1026a
            r1.mo1219a(r8, r9)
        L_0x018d:
            r9 = 2
            goto L_0x01d8
        L_0x018f:
            android.support.constraint.a.e r8 = r1.f1000xa
            r1.mo1164c(r8)
            r8 = 0
        L_0x0195:
            if (r8 >= r7) goto L_0x018d
            java.util.ArrayList<android.support.constraint.a.a.h> r9 = r1.f1053va
            java.lang.Object r9 = r9.get(r8)
            android.support.constraint.a.a.h r9 = (android.support.constraint.p042a.p043a.C0335h) r9
            android.support.constraint.a.a.h$a[] r12 = r9.f909F
            r16 = 0
            r12 = r12[r16]
            android.support.constraint.a.a.h$a r0 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r12 != r0) goto L_0x01ba
            int r0 = r9.mo1198s()
            int r12 = r9.mo1202u()
            if (r0 >= r12) goto L_0x01ba
            boolean[] r0 = android.support.constraint.p042a.p043a.C0342n.f1026a
            r8 = 2
            r12 = 1
            r0[r8] = r12
            goto L_0x018d
        L_0x01ba:
            r12 = 1
            android.support.constraint.a.a.h$a[] r0 = r9.f909F
            r0 = r0[r12]
            android.support.constraint.a.a.h$a r12 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r0 != r12) goto L_0x01d4
            int r0 = r9.mo1178i()
            int r9 = r9.mo1200t()
            if (r0 >= r9) goto L_0x01d4
            boolean[] r0 = android.support.constraint.p042a.p043a.C0342n.f1026a
            r8 = 1
            r9 = 2
            r0[r9] = r8
            goto L_0x01d8
        L_0x01d4:
            r9 = 2
            int r8 = r8 + 1
            goto L_0x0195
        L_0x01d8:
            if (r14 == 0) goto L_0x0252
            r8 = 8
            if (r4 >= r8) goto L_0x0252
            boolean[] r0 = android.support.constraint.p042a.p043a.C0342n.f1026a
            boolean r0 = r0[r9]
            if (r0 == 0) goto L_0x0252
            r0 = 0
            r9 = 0
            r12 = 0
        L_0x01e7:
            if (r0 >= r7) goto L_0x0211
            java.util.ArrayList<android.support.constraint.a.a.h> r8 = r1.f1053va
            java.lang.Object r8 = r8.get(r0)
            android.support.constraint.a.a.h r8 = (android.support.constraint.p042a.p043a.C0335h) r8
            r17 = r4
            int r4 = r8.f915L
            int r20 = r8.mo1198s()
            int r4 = r4 + r20
            int r9 = java.lang.Math.max(r9, r4)
            int r4 = r8.f916M
            int r8 = r8.mo1178i()
            int r4 = r4 + r8
            int r12 = java.lang.Math.max(r12, r4)
            int r0 = r0 + 1
            r4 = r17
            r8 = 8
            goto L_0x01e7
        L_0x0211:
            r17 = r4
            int r0 = r1.f926W
            int r0 = java.lang.Math.max(r0, r9)
            int r4 = r1.f927X
            int r4 = java.lang.Math.max(r4, r12)
            android.support.constraint.a.a.h$a r8 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r11 != r8) goto L_0x0237
            int r8 = r21.mo1198s()
            if (r8 >= r0) goto L_0x0237
            r1.mo1191o(r0)
            android.support.constraint.a.a.h$a[] r0 = r1.f909F
            android.support.constraint.a.a.h$a r8 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            r9 = 0
            r0[r9] = r8
            r0 = 1
            r18 = 1
            goto L_0x0238
        L_0x0237:
            r0 = 0
        L_0x0238:
            android.support.constraint.a.a.h$a r8 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r10 != r8) goto L_0x024f
            int r8 = r21.mo1178i()
            if (r8 >= r4) goto L_0x024f
            r1.mo1175g(r4)
            android.support.constraint.a.a.h$a[] r0 = r1.f909F
            android.support.constraint.a.a.h$a r4 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            r8 = 1
            r0[r8] = r4
            r0 = 1
            r9 = 1
            goto L_0x0257
        L_0x024f:
            r9 = r18
            goto L_0x0257
        L_0x0252:
            r17 = r4
            r9 = r18
            r0 = 0
        L_0x0257:
            int r4 = r1.f926W
            int r8 = r21.mo1198s()
            int r4 = java.lang.Math.max(r4, r8)
            int r8 = r21.mo1198s()
            if (r4 <= r8) goto L_0x0273
            r1.mo1191o(r4)
            android.support.constraint.a.a.h$a[] r0 = r1.f909F
            android.support.constraint.a.a.h$a r4 = android.support.constraint.p042a.p043a.C0335h.C0336a.FIXED
            r8 = 0
            r0[r8] = r4
            r0 = 1
            r9 = 1
        L_0x0273:
            int r4 = r1.f927X
            int r8 = r21.mo1178i()
            int r4 = java.lang.Math.max(r4, r8)
            int r8 = r21.mo1178i()
            if (r4 <= r8) goto L_0x0290
            r1.mo1175g(r4)
            android.support.constraint.a.a.h$a[] r0 = r1.f909F
            android.support.constraint.a.a.h$a r4 = android.support.constraint.p042a.p043a.C0335h.C0336a.FIXED
            r8 = 1
            r0[r8] = r4
            r0 = 1
            r9 = 1
            goto L_0x0291
        L_0x0290:
            r8 = 1
        L_0x0291:
            if (r9 != 0) goto L_0x02d0
            android.support.constraint.a.a.h$a[] r4 = r1.f909F
            r12 = 0
            r4 = r4[r12]
            android.support.constraint.a.a.h$a r12 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r4 != r12) goto L_0x02b2
            if (r5 <= 0) goto L_0x02b2
            int r4 = r21.mo1198s()
            if (r4 <= r5) goto L_0x02b2
            r1.f996Pa = r8
            android.support.constraint.a.a.h$a[] r0 = r1.f909F
            android.support.constraint.a.a.h$a r4 = android.support.constraint.p042a.p043a.C0335h.C0336a.FIXED
            r9 = 0
            r0[r9] = r4
            r1.mo1191o(r5)
            r0 = 1
            r9 = 1
        L_0x02b2:
            android.support.constraint.a.a.h$a[] r4 = r1.f909F
            r4 = r4[r8]
            android.support.constraint.a.a.h$a r12 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r4 != r12) goto L_0x02d0
            if (r6 <= 0) goto L_0x02d0
            int r4 = r21.mo1178i()
            if (r4 <= r6) goto L_0x02d0
            r1.f997Qa = r8
            android.support.constraint.a.a.h$a[] r0 = r1.f909F
            android.support.constraint.a.a.h$a r4 = android.support.constraint.p042a.p043a.C0335h.C0336a.FIXED
            r0[r8] = r4
            r1.mo1175g(r6)
            r4 = 1
            r9 = 1
            goto L_0x02d1
        L_0x02d0:
            r4 = r0
        L_0x02d1:
            r0 = r17
            r12 = r19
            goto L_0x011e
        L_0x02d7:
            r18 = r9
            r19 = r12
            java.util.List<android.support.constraint.a.a.j> r0 = r1.f988Ha
            java.lang.Object r0 = r0.get(r15)
            android.support.constraint.a.a.j r0 = (android.support.constraint.p042a.p043a.C0338j) r0
            r0.mo1228b()
            r0 = r18
        L_0x02e8:
            int r15 = r15 + 1
            r12 = r19
            r4 = 0
            r7 = 32
            r8 = 8
            r9 = 1
            goto L_0x00ae
        L_0x02f4:
            r1.f1053va = r13
            android.support.constraint.a.a.h r4 = r1.f910G
            if (r4 == 0) goto L_0x0326
            int r2 = r1.f926W
            int r3 = r21.mo1198s()
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.f927X
            int r4 = r21.mo1178i()
            int r3 = java.lang.Math.max(r3, r4)
            android.support.constraint.a.a.s r4 = r1.f1001ya
            r4.mo1254a(r1)
            int r4 = r1.f1002za
            int r2 = r2 + r4
            int r4 = r1.f982Ba
            int r2 = r2 + r4
            r1.mo1191o(r2)
            int r2 = r1.f981Aa
            int r3 = r3 + r2
            int r2 = r1.f983Ca
            int r3 = r3 + r2
            r1.mo1175g(r3)
            goto L_0x032a
        L_0x0326:
            r1.f915L = r2
            r1.f916M = r3
        L_0x032a:
            if (r0 == 0) goto L_0x0334
            android.support.constraint.a.a.h$a[] r0 = r1.f909F
            r2 = 0
            r0[r2] = r11
            r2 = 1
            r0[r2] = r10
        L_0x0334:
            android.support.constraint.a.e r0 = r1.f1000xa
            android.support.constraint.a.c r0 = r0.mo1306d()
            r1.mo1146a(r0)
            android.support.constraint.a.a.i r0 = r21.mo1229J()
            if (r1 != r0) goto L_0x0346
            r21.mo1134H()
        L_0x0346:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p042a.p043a.C0337i.mo1208K():void");
    }

    /* renamed from: M */
    public int mo1209M() {
        return this.f994Na;
    }

    /* renamed from: N */
    public boolean mo1210N() {
        return false;
    }

    /* renamed from: O */
    public boolean mo1211O() {
        return this.f997Qa;
    }

    /* renamed from: P */
    public boolean mo1212P() {
        return this.f999wa;
    }

    /* renamed from: Q */
    public boolean mo1213Q() {
        return this.f996Pa;
    }

    /* renamed from: R */
    public void mo1214R() {
        if (!mo1112t(8)) {
            mo1108a(this.f994Na);
        }
        mo1217U();
    }

    /* renamed from: S */
    public void mo1215S() {
        int size = this.f1053va.size();
        mo1106F();
        for (int i = 0; i < size; i++) {
            ((C0335h) this.f1053va.get(i)).mo1106F();
        }
    }

    /* renamed from: T */
    public void mo1216T() {
        mo1215S();
        mo1108a(this.f994Na);
    }

    /* renamed from: U */
    public void mo1217U() {
        C0344p d = mo1136a(C0333c.LEFT).mo1121d();
        C0344p d2 = mo1136a(C0333c.TOP).mo1121d();
        d.mo1236a((C0344p) null, 0.0f);
        d2.mo1236a((C0344p) null, 0.0f);
    }

    /* renamed from: a */
    public void mo1219a(C0353e eVar, boolean[] zArr) {
        zArr[2] = false;
        mo1164c(eVar);
        int size = this.f1053va.size();
        for (int i = 0; i < size; i++) {
            C0335h hVar = (C0335h) this.f1053va.get(i);
            hVar.mo1164c(eVar);
            if (hVar.f909F[0] == C0336a.MATCH_CONSTRAINT && hVar.mo1198s() < hVar.mo1202u()) {
                zArr[2] = true;
            }
            if (hVar.f909F[1] == C0336a.MATCH_CONSTRAINT && hVar.mo1178i() < hVar.mo1200t()) {
                zArr[2] = true;
            }
        }
    }

    /* renamed from: c */
    public void mo1220c(boolean z) {
        this.f999wa = z;
    }

    /* renamed from: d */
    public boolean mo1221d(C0353e eVar) {
        mo1109a(eVar);
        int size = this.f1053va.size();
        for (int i = 0; i < size; i++) {
            C0335h hVar = (C0335h) this.f1053va.get(i);
            if (hVar instanceof C0337i) {
                C0336a[] aVarArr = hVar.f909F;
                C0336a aVar = aVarArr[0];
                C0336a aVar2 = aVarArr[1];
                if (aVar == C0336a.WRAP_CONTENT) {
                    hVar.mo1143a(C0336a.FIXED);
                }
                if (aVar2 == C0336a.WRAP_CONTENT) {
                    hVar.mo1156b(C0336a.FIXED);
                }
                hVar.mo1109a(eVar);
                if (aVar == C0336a.WRAP_CONTENT) {
                    hVar.mo1143a(aVar);
                }
                if (aVar2 == C0336a.WRAP_CONTENT) {
                    hVar.mo1156b(aVar2);
                }
            } else {
                C0342n.m1214a(this, eVar, hVar);
                hVar.mo1109a(eVar);
            }
        }
        if (this.f984Da > 0) {
            C0327c.m1065a(this, eVar, 0);
        }
        if (this.f985Ea > 0) {
            C0327c.m1065a(this, eVar, 1);
        }
        return true;
    }

    /* renamed from: f */
    public void mo1222f(int i, int i2) {
        if (this.f909F[0] != C0336a.WRAP_CONTENT) {
            C0345q qVar = this.f935d;
            if (qVar != null) {
                qVar.mo1248a(i);
            }
        }
        if (this.f909F[1] != C0336a.WRAP_CONTENT) {
            C0345q qVar2 = this.f937e;
            if (qVar2 != null) {
                qVar2.mo1248a(i2);
            }
        }
    }

    /* renamed from: t */
    public boolean mo1112t(int i) {
        return (this.f994Na & i) == i;
    }

    /* renamed from: u */
    public void mo1223u(int i) {
        this.f994Na = i;
    }

    /* renamed from: a */
    public void mo1108a(int i) {
        super.mo1108a(i);
        int size = this.f1053va.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0335h) this.f1053va.get(i2)).mo1108a(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1218a(C0335h hVar, int i) {
        if (i == 0) {
            m1171d(hVar);
        } else if (i == 1) {
            m1172e(hVar);
        }
    }

    /* renamed from: d */
    private void m1171d(C0335h hVar) {
        int i = this.f984Da + 1;
        C0328d[] dVarArr = this.f987Ga;
        if (i >= dVarArr.length) {
            this.f987Ga = (C0328d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f987Ga[this.f984Da] = new C0328d(hVar, 0, mo1212P());
        this.f984Da++;
    }
}
